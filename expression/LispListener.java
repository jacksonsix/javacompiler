// Generated from C:\_java\mywork\codeseq\compiler\expression\Lisp.g4 by ANTLR 4.7.1
package expression;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(LispParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(LispParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code define_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDefine_expr(LispParser.Define_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code define_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDefine_expr(LispParser.Define_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(LispParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(LispParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expr(LispParser.Lambda_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expr(LispParser.Lambda_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code begin_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBegin_expr(LispParser.Begin_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code begin_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBegin_expr(LispParser.Begin_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelf_expr(LispParser.Self_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelf_expr(LispParser.Self_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expr(LispParser.Compound_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expr(LispParser.Compound_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(LispParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(LispParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void enterIfexpr(LispParser.IfexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void exitIfexpr(LispParser.IfexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(LispParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(LispParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(LispParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(LispParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_id}
	 * labeled alternative in {@link LispParser#self}.
	 * @param ctx the parse tree
	 */
	void enterSelf_id(LispParser.Self_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_id}
	 * labeled alternative in {@link LispParser#self}.
	 * @param ctx the parse tree
	 */
	void exitSelf_id(LispParser.Self_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_int}
	 * labeled alternative in {@link LispParser#self}.
	 * @param ctx the parse tree
	 */
	void enterSelf_int(LispParser.Self_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_int}
	 * labeled alternative in {@link LispParser#self}.
	 * @param ctx the parse tree
	 */
	void exitSelf_int(LispParser.Self_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(LispParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(LispParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(LispParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(LispParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LispParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LispParser.ArgsContext ctx);
}