package expression;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import expression.LispParser.ArgsContext;
import expression.LispParser.BeginContext;
import expression.LispParser.Begin_exprContext;
import expression.LispParser.CompoundContext;
import expression.LispParser.Compound_exprContext;
import expression.LispParser.DefineContext;
import expression.LispParser.Define_exprContext;
import expression.LispParser.If_exprContext;
import expression.LispParser.IfexprContext;
import expression.LispParser.LambdaContext;
import expression.LispParser.Lambda_exprContext;
import expression.LispParser.OpContext;
import expression.LispParser.Self_exprContext;
import expression.LispParser.Self_idContext;
import expression.LispParser.Self_intContext;
import expression.LispParser.Set_exprContext;
import expression.LispParser.SetexprContext;
import machine.*;

public class GenExpression<IIExpression> extends LispBaseVisitor<IIExpression>{

	public IIExpression visitDefine_expr(Define_exprContext ctx) {
		DefineExpression dexp = new DefineExpression();
		String name = ctx.define().getChild(2).getText();
		machine.IIExpression val = (machine.IIExpression) visit(ctx.define().getChild(3));
		dexp.setName(name);
		dexp.setVal(val);
		return  (IIExpression) dexp;
	}

	@Override
	public IIExpression visitIf_expr(If_exprContext ctx) {
		// TODO Auto-generated method stub
		String predicate = ctx.ifexpr().getChild(2).getClass().getSimpleName();		
		String result = ctx.ifexpr().getChild(3).getClass().getSimpleName();
		String alt = ctx.ifexpr().getChild(5).getClass().getSimpleName();
		
		machine.IIExpression pexp = (machine.IIExpression) visit(ctx.ifexpr().getChild(2));
		machine.IIExpression rexp = (machine.IIExpression) visit(ctx.ifexpr().getChild(3));
		machine.IIExpression aexp = (machine.IIExpression) visit(ctx.ifexpr().getChild(5));
		return  (IIExpression)new IfExpression(pexp,rexp,aexp);
		//return super.visitIf_expr(ctx);
	}

	@Override
	public IIExpression visitSet_expr(Set_exprContext ctx) {
		SetExpression dexp = new SetExpression();
		String name = ctx.setexpr().getChild(0).getText();
		machine.IIExpression val = (machine.IIExpression) visit(ctx.setexpr().getChild(0));
		dexp.setName(name);
		dexp.setVal(val);
		return  (IIExpression) dexp;
		
	}

	@Override
	public IIExpression visitSetexpr(SetexprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSetexpr(ctx);
	}

	@Override
	public IIExpression visitLambda_expr(Lambda_exprContext ctx) {
		machine.IIExpression parafrom = (machine.IIExpression) visit(ctx.lambda().getChild(0));
		List<String> para = new LinkedList<String>();
		List<machine.IIExpression> body = new LinkedList<machine.IIExpression>();
		//(IIExpression) visit(ctx.lambda().getChild(0));
		int size = ctx.lambda().getChildCount();
		for(int i=0;i<size;i++) {
			body.add((machine.IIExpression) visit(ctx.lambda().getChild(i)));
		}
		IIExpression result =  (IIExpression) new LambdaExpression(para,body);
		return result;
	}

	@Override
	public IIExpression visitBegin_expr(Begin_exprContext ctx) {
		
		List<machine.IIExpression> seq = new LinkedList<machine.IIExpression>(); //
		int size = ctx.begin().getChildCount();
		for(int i=0;i< size;i++) {
			seq.add((machine.IIExpression) visit(ctx.begin().getChild(i)));
		}
		IIExpression result = (IIExpression) new SequenceExpression(seq);
		
		return result;
	}

	@Override
	public IIExpression visitSelf_expr(Self_exprContext ctx) {
		// TODO Auto-generated method stub		
		return  visit(ctx.getChild(0));
	}

	@Override
	public IIExpression visitCompound_expr(Compound_exprContext ctx) {
		// TODO Auto-generated method stub
		machine.IIExpression op =  (machine.IIExpression) visit(ctx.compound().getChild(0));
		List<machine.IIExpression>  plist = new LinkedList<machine.IIExpression>();//
		for(int i=0;i< ctx.compound().getChildCount();i++) {
			plist.add((machine.IIExpression) visit(ctx.compound().getChild(1)));
		}
		IIExpression result = (IIExpression) new CompoundExpression(op,plist);
		return result;
	}

	@Override
	public IIExpression visitDefine(DefineContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDefine(ctx);
	}

	@Override
	public IIExpression visitIfexpr(IfexprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfexpr(ctx);
	}

	@Override
	public IIExpression visitLambda(LambdaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLambda(ctx);
	}

	@Override
	public IIExpression visitBegin(BeginContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBegin(ctx);
	}

	@Override
	public IIExpression visitSelf_id(Self_idContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSelf_id(ctx);
	}

	@Override
	public IIExpression visitSelf_int(Self_intContext ctx) {
		// TODO Auto-generated method stub
		
		return (IIExpression) new SelfExpression(Integer.valueOf(ctx.getChild(0).getText()));
	}

	@Override
	public IIExpression visitCompound(CompoundContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCompound(ctx);
	}

	@Override
	public IIExpression visitOp(OpContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOp(ctx);
	}

	@Override
	public IIExpression visitArgs(ArgsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArgs(ctx);
	}

	@Override
	public IIExpression visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public IIExpression visitChildren(RuleNode node) {
		// TODO Auto-generated method stub
		return super.visitChildren(node);
	}

	@Override
	public IIExpression visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	public IIExpression visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	protected IIExpression defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected IIExpression aggregateResult(IIExpression aggregate, IIExpression nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, IIExpression currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	

}
