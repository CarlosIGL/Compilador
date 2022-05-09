// Generated from Saludos.g4 by ANTLR 4.9.1
package carlos.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SaludosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SaludosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SaludosParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(SaludosParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(SaludosParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#cor_abierto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor_abierto(SaludosParser.Cor_abiertoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#cor_cerrado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor_cerrado(SaludosParser.Cor_cerradoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(SaludosParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(SaludosParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impreso}
	 * labeled alternative in {@link SaludosParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpreso(SaludosParser.ImpresoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code guardar}
	 * labeled alternative in {@link SaludosParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardar(SaludosParser.GuardarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code guardar2}
	 * labeled alternative in {@link SaludosParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardar2(SaludosParser.Guardar2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code asignar}
	 * labeled alternative in {@link SaludosParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(SaludosParser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(SaludosParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(SaludosParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#bloque_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_if(SaludosParser.Bloque_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(SaludosParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprmirResu}
	 * labeled alternative in {@link SaludosParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprmirResu(SaludosParser.ImprmirResuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(SaludosParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumRes}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(SaludosParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(SaludosParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falso}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalso(SaludosParser.FalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicional}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(SaludosParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(SaludosParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SaludosParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadero(SaludosParser.VerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicional2}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional2(SaludosParser.Condicional2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(SaludosParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SaludosParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(SaludosParser.AndExprContext ctx);
}