/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.math.*;
import trabalho1.parser.LindinhoBaseVisitor;
import trabalho1.parser.LindinhoParser;

/**
 *
 * @author Esquilo
 */
public class AnalisadorSemantico extends LindinhoBaseVisitor<Void> {
    
    int division = 1;
    
    PrintWriter writer;
    
    int baseA;
    int baseB;
    
    float durCompasso = 0;
    int nCompasso = 0;
    
    int nNota = 0;
    
    boolean noteExceedWarning = false;
    
    public AnalisadorSemantico(PrintWriter out) {
        writer = out;
    }

    @Override
    public Void visitCorpo(LindinhoParser.CorpoContext ctx) {
        nCompasso = 0;
        visitChildren(ctx);
        return null;
    }
    
    public int getDivision(){
        return division;
    }

    @Override
    public Void visitFormula(LindinhoParser.FormulaContext ctx) {
        int base = Integer.parseInt(ctx.base2.getText());
        baseA = Integer.parseInt(ctx.base.getText());
        baseB = base;
        
        if(baseA < 0 || base <= 0)
            writer.println("Linha " + ctx.start.getLine() + ": Formula do compasso deve ser maior que zero");
        else if(base != 0 && ((base & (base - 1)) != 0))
            writer.println("Linha " + ctx.start.getLine() + ": Base da formula do compasso deve ser potencia de 2(2, 4, 8, 16...");
        
        visitChildren(ctx);
        
        return null;
    }

    @Override
    public Void visitCompasso(LindinhoParser.CompassoContext ctx) {
        durCompasso = 0;
        
        noteExceedWarning = false;
        
        nCompasso++;
        
        nNota = 0;
        
        visitChildren(ctx);
        
        double base = baseA / baseB;
        if(durCompasso > base)
            writer.println("Linha " + ctx.start.getLine() + ": Compasso " + nCompasso + ": duração ultrapassa o "
                    + "limite superior definido pela formula: " + baseA + "*" + baseB);
        else if(durCompasso < base)
            writer.println("Linha " + ctx.start.getLine() + ": Compasso " + nCompasso + ": duração insuficiente "
                    + "do compasso, deve seguir a formula: " + baseA + "*" + baseB);
        
        return null;
    }
    
    

    @Override
    public Void visitNota_figura(LindinhoParser.Nota_figuraContext ctx) {
        double dur = 0;
        
        nNota++;
        
        switch(ctx.figura_ritmica().getText())
        {
            case "semibreve" : 
                dur = 4;
                
                break;
            case "minima" : 
                dur = 2;
                
                break;
            case "seminima" : 
                dur = 1;
                
                break;
            case "colcheia" : 
                dur = 0.5;
                division = 8/baseB;
                break;
            case "semicolcheia" : 
                dur = 0.250;
                division = 16/baseB;
                break;
            case "fusa" : 
                dur = 0.125;
                division = 32/baseB;
                break;
            case "semifusa" : 
                division = 64/baseB;
                dur= 0.0625;
                
                break;
        }
        
   
        else if(ctx.p1 != null && ctx.p1.getText().isEmpty() == false){
            dur *= 1.5;
            division *= 2;
        }
        
        if(ctx.repeticao != null && ctx.repeticao.getText().isEmpty() == false)
        {
            int x = Integer.parseInt(ctx.NUMERO().getText());
            if(x <= 0)
            {
                writer.println("Linha " + ctx.start.getLine() + ": O número de repetições de uma figura rítmica "
                        + "deve ser maior que zero");
                writer.println("Repetição será ignorada");
            }else
                dur *= Integer.parseInt(ctx.NUMERO().getText());
        }

        durCompasso += dur;
        
        double base = baseA / baseB;
        if(noteExceedWarning == false && base > durCompasso)
        {
            writer.println("Linha " + ctx.start.getLine() + ": Compasso " + 
                    nCompasso + ": Nota " + nNota + ": quebra do limite de "
                    + "duração do compasso, formula define: " 
                    + baseA + "*" + baseB);
            noteExceedWarning = true;
        }
        return null;
    }
    
    @Override
    public Void visitNota_oitava(LindinhoParser.Nota_oitavaContext ctx) {
        int x = Integer.parseInt(ctx.oitava.getText());
        if(x > 8)
            writer.println("Linha " + ctx.start.getLine() + ": Limite superior "
                    + "de oitava excedido(MAX 8)");
        else if(x < -8)
            writer.println("Linha " + ctx.start.getLine() + ": Limite inferior "
                    + "de oitava excedido(MIN 8)");
        
        visitChildren(ctx);
        return null;
    }

    
    
    public void close()
    {
        writer.close();
    }
}
