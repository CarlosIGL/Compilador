// Generated from C:/Users/ACER/Desktop/Carpetas/Escuela/Lenguajes y automatas II/Compilador/gramatica\Saludos.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SaludosParser}.
 */
public interface SaludosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SaludosParser#superimprimir}.
	 * @param ctx the parse tree
	 */
	void enterSuperimprimir(SaludosParser.SuperimprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaludosParser#superimprimir}.
	 * @param ctx the parse tree
	 */
	void exitSuperimprimir(SaludosParser.SuperimprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compila}
	 * labeled alternative in {@link SaludosParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterCompila(SaludosParser.CompilaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compila}
	 * labeled alternative in {@link SaludosParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitCompila(SaludosParser.CompilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaludosParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(SaludosParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaludosParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(SaludosParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imprime}
	 * labeled alternative in {@link SaludosParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImprime(SaludosParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imprime}
	 * labeled alternative in {@link SaludosParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImprime(SaludosParser.ImprimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link SaludosParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SaludosParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link SaludosParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SaludosParser.VariableContext ctx);
}