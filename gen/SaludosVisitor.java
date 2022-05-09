// Generated from C:/Users/ACER/Desktop/Carpetas/Escuela/Lenguajes y automatas II/Compilador/gramatica\Saludos.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link SaludosParser#superimprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperimprimir(SaludosParser.SuperimprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compila}
	 * labeled alternative in {@link SaludosParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompila(SaludosParser.CompilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaludosParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(SaludosParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprime}
	 * labeled alternative in {@link SaludosParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(SaludosParser.ImprimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link SaludosParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SaludosParser.VariableContext ctx);
}