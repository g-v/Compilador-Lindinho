package trabalho1;

import trabalho1.parser.LindinhoLexer;
import trabalho1.parser.LindinhoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Vector;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ParserFacade {
    
    PrintWriter writer;

    public class SintaxErrorListener extends BaseErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                int line, int charPositionInLine,
                String msg, RecognitionException e) {
            
            String tokenName = ((org.antlr.v4.runtime.CommonToken) offendingSymbol).getText();
            
            if (tokenName.matches("(.)*EOF(.)*")) {
                tokenName = "EOF";
            }
            if (Example.modo == 1 || Example.modo == 4) {
                writer.println("Linha " + line + ": erro sintatico proximo a " + tokenName);
                writer.println("Fim da compilacao");
                writer.close();
                throw new RuntimeException(e);
            }
        }

    }

    public class LexerErrorListener extends BaseErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                int line, int charPositionInLine,
                String msg, RecognitionException e) {
           
            msg = msg.replaceAll("token recognition error at: ", "");
            msg = msg.replaceAll("'", "");
            
            if (msg.charAt(0) == '/' && msg.charAt(1) == '*') {
                msg = "comentario nao fechado";
                line += 1;
            } else {
                msg += " - simbolo nao identificado";
            }

            if (Example.modo == 1 || Example.modo == 4) {

                writer.println("Linha " + line + ": " + msg);
                System.err.println("Linha " + line + ": " + msg);
                System.err.println("Fim da compilacao");
                writer.println("Fim da compilacao");
                writer.close();
                throw new RuntimeException(e);
            }
        }

    }

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public LindinhoParser.MusicaContext parse(String file, String saida) throws IOException {
        String code = readFile(new File (file), Charset.forName("UTF-8"));
        LindinhoLexer lexer = new LindinhoLexer(new ANTLRInputStream(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        writer = new PrintWriter(new File(saida), "UTF-8");
        LindinhoParser parser = new LindinhoParser(tokens);

        LexerErrorListener lexerListener = new LexerErrorListener();

        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerListener);

        SintaxErrorListener sintaxListener = new SintaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(sintaxListener);

        

        LindinhoParser.MusicaContext context = parser.musica();
        
        int division = 1;

        if (Example.modo == 2) {
            AnalisadorSemantico analisadorSemantico = new AnalisadorSemantico(new PrintWriter(saida, "UTF-8"));
            System.out.println("Iniciando analise semantica");
            analisadorSemantico.visit(context);
            division = analisadorSemantico.getDivision();
            analisadorSemantico.close();
        }

        

        if (Example.modo == 2) {
            System.out.println("Iniciando geração de codigo\n\n");
            GeradorCodigo geradorCodigo = new GeradorCodigo(new PrintWriter(saida, "UTF-8"), division);
            geradorCodigo.visit(context);
        }

        System.err.flush();

        writer.close();
        return context;
    }
}
