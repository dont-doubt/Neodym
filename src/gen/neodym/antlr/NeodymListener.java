// Generated from ../neodym/antlr/Neodym.g4 by ANTLR 4.13.1
package neodym.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NeodymParser}.
 */
public interface NeodymListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NeodymParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(NeodymParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(NeodymParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(NeodymParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(NeodymParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(NeodymParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(NeodymParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#mainFunc}.
	 * @param ctx the parse tree
	 */
	void enterMainFunc(NeodymParser.MainFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#mainFunc}.
	 * @param ctx the parse tree
	 */
	void exitMainFunc(NeodymParser.MainFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(NeodymParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(NeodymParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(NeodymParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(NeodymParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(NeodymParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(NeodymParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#typedParam}.
	 * @param ctx the parse tree
	 */
	void enterTypedParam(NeodymParser.TypedParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#typedParam}.
	 * @param ctx the parse tree
	 */
	void exitTypedParam(NeodymParser.TypedParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NeodymParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NeodymParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(NeodymParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(NeodymParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#uniform}.
	 * @param ctx the parse tree
	 */
	void enterUniform(NeodymParser.UniformContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#uniform}.
	 * @param ctx the parse tree
	 */
	void exitUniform(NeodymParser.UniformContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#optSeparator}.
	 * @param ctx the parse tree
	 */
	void enterOptSeparator(NeodymParser.OptSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#optSeparator}.
	 * @param ctx the parse tree
	 */
	void exitOptSeparator(NeodymParser.OptSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NeodymParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NeodymParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NeodymParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NeodymParser.TypeContext ctx);
}