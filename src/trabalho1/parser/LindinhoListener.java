// Generated from /home/akari/Projects/Lindinho/Compilador-Lindinho/src/main/antlr/Lindinho.g4 by ANTLR 4.2.2
package trabalho1.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LindinhoParser}.
 */
public interface LindinhoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LindinhoParser#clave}.
	 * @param ctx the parse tree
	 */
	void enterClave(@NotNull LindinhoParser.ClaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#clave}.
	 * @param ctx the parse tree
	 */
	void exitClave(@NotNull LindinhoParser.ClaveContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LindinhoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LindinhoParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#termo_nota}.
	 * @param ctx the parse tree
	 */
	void enterTermo_nota(@NotNull LindinhoParser.Termo_notaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#termo_nota}.
	 * @param ctx the parse tree
	 */
	void exitTermo_nota(@NotNull LindinhoParser.Termo_notaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#pontuacao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterPontuacao_opcional(@NotNull LindinhoParser.Pontuacao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#pontuacao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitPontuacao_opcional(@NotNull LindinhoParser.Pontuacao_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#nota_oitava}.
	 * @param ctx the parse tree
	 */
	void enterNota_oitava(@NotNull LindinhoParser.Nota_oitavaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#nota_oitava}.
	 * @param ctx the parse tree
	 */
	void exitNota_oitava(@NotNull LindinhoParser.Nota_oitavaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#acidente_opcional}.
	 * @param ctx the parse tree
	 */
	void enterAcidente_opcional(@NotNull LindinhoParser.Acidente_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#acidente_opcional}.
	 * @param ctx the parse tree
	 */
	void exitAcidente_opcional(@NotNull LindinhoParser.Acidente_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#figura_ritmica}.
	 * @param ctx the parse tree
	 */
	void enterFigura_ritmica(@NotNull LindinhoParser.Figura_ritmicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#figura_ritmica}.
	 * @param ctx the parse tree
	 */
	void exitFigura_ritmica(@NotNull LindinhoParser.Figura_ritmicaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#geral_compasso}.
	 * @param ctx the parse tree
	 */
	void enterGeral_compasso(@NotNull LindinhoParser.Geral_compassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#geral_compasso}.
	 * @param ctx the parse tree
	 */
	void exitGeral_compasso(@NotNull LindinhoParser.Geral_compassoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#nota_figura}.
	 * @param ctx the parse tree
	 */
	void enterNota_figura(@NotNull LindinhoParser.Nota_figuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#nota_figura}.
	 * @param ctx the parse tree
	 */
	void exitNota_figura(@NotNull LindinhoParser.Nota_figuraContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull LindinhoParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull LindinhoParser.FormulaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#musica}.
	 * @param ctx the parse tree
	 */
	void enterMusica(@NotNull LindinhoParser.MusicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#musica}.
	 * @param ctx the parse tree
	 */
	void exitMusica(@NotNull LindinhoParser.MusicaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#informacoes}.
	 * @param ctx the parse tree
	 */
	void enterInformacoes(@NotNull LindinhoParser.InformacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#informacoes}.
	 * @param ctx the parse tree
	 */
	void exitInformacoes(@NotNull LindinhoParser.InformacoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#compasso}.
	 * @param ctx the parse tree
	 */
	void enterCompasso(@NotNull LindinhoParser.CompassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#compasso}.
	 * @param ctx the parse tree
	 */
	void exitCompasso(@NotNull LindinhoParser.CompassoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#escala}.
	 * @param ctx the parse tree
	 */
	void enterEscala(@NotNull LindinhoParser.EscalaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#escala}.
	 * @param ctx the parse tree
	 */
	void exitEscala(@NotNull LindinhoParser.EscalaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#nota}.
	 * @param ctx the parse tree
	 */
	void enterNota(@NotNull LindinhoParser.NotaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#nota}.
	 * @param ctx the parse tree
	 */
	void exitNota(@NotNull LindinhoParser.NotaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LindinhoParser#sustenido_bmol_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSustenido_bmol_opcional(@NotNull LindinhoParser.Sustenido_bmol_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LindinhoParser#sustenido_bmol_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSustenido_bmol_opcional(@NotNull LindinhoParser.Sustenido_bmol_opcionalContext ctx);
}