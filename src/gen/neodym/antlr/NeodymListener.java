// Generated from ../neodym/antlr/Neodym.g4 by ANTLR 4.13.1
package neodym.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NeodymParser}.
 */
public interface NeodymListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NeodymParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(NeodymParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(NeodymParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(NeodymParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(NeodymParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(NeodymParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(NeodymParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(NeodymParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(NeodymParser.AtomExpContext ctx);
}