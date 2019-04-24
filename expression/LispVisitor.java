// Generated from C:\_java\mywork\codeseq\compiler\expression\Lisp.g4 by ANTLR 4.7.1
package expression;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(LispParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code define_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_expr(LispParser.Define_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expr(LispParser.If_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expr(LispParser.Lambda_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code begin_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_expr(LispParser.Begin_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_expr(LispParser.Self_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compound_expr}
	 * labeled alternative in {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_expr(LispParser.Compound_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(LispParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(LispParser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(LispParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(LispParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_id}
	 * labeled alternative in {@link LispParser#self}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_id(LispParser.Self_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_int}
	 * labeled alternative in {@link LispParser#self}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_int(LispParser.Self_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(LispParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(LispParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LispParser.ArgsContext ctx);
}