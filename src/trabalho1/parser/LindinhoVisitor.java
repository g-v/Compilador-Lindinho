// Generated from /home/akari/Projects/Lindinho/Compilador-Lindinho/src/main/antlr/Lindinho.g4 by ANTLR 4.2.2
package trabalho1.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LindinhoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LindinhoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LindinhoParser#clave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClave(@NotNull LindinhoParser.ClaveContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(@NotNull LindinhoParser.CorpoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#termo_nota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_nota(@NotNull LindinhoParser.Termo_notaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#pontuacao_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPontuacao_opcional(@NotNull LindinhoParser.Pontuacao_opcionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#nota_oitava}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNota_oitava(@NotNull LindinhoParser.Nota_oitavaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#acidente_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcidente_opcional(@NotNull LindinhoParser.Acidente_opcionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#figura_ritmica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigura_ritmica(@NotNull LindinhoParser.Figura_ritmicaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#geral_compasso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeral_compasso(@NotNull LindinhoParser.Geral_compassoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#nota_figura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNota_figura(@NotNull LindinhoParser.Nota_figuraContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(@NotNull LindinhoParser.FormulaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#musica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMusica(@NotNull LindinhoParser.MusicaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#informacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformacoes(@NotNull LindinhoParser.InformacoesContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#compasso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompasso(@NotNull LindinhoParser.CompassoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#escala}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscala(@NotNull LindinhoParser.EscalaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#nota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNota(@NotNull LindinhoParser.NotaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LindinhoParser#sustenido_bmol_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSustenido_bmol_opcional(@NotNull LindinhoParser.Sustenido_bmol_opcionalContext ctx);
}