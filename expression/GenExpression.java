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
import expression.LispParser.FileContext;
import expression.LispParser.FormalParaContext;
import expression.LispParser.FormalParasContext;
import expression.LispParser.If_exprContext;
import expression.LispParser.IfexprContext;
import expression.LispParser.LambdaContext;
import expression.LispParser.Lambda_compContext;
import expression.LispParser.Lambda_exprContext;
import expression.LispParser.OpContext;
import expression.LispParser.Proc_name_compContext;
import expression.LispParser.Proc_num_compContext;
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
		String name = ctx.setexpr().getChild(2).getText();
		machine.IIExpression val = (machine.IIExpression) visit(ctx.setexpr().getChild(3));
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
		//machine.IIExpression parafrom = (machine.IIExpression) visit(ctx.lambda().getChild(3));
		List<String> para = new LinkedList<String>();
		ParseTree pas = ctx.lambda().getChild(3);
		for(int i=0;i< pas.getChildCount();i++) {
			para.add(pas.getChild(i).getText());
		}
		List<machine.IIExpression> body = new LinkedList<machine.IIExpression>();
		//(IIExpression) visit(ctx.lambda().getChild(0));
		
		for(int i=0;i<ctx.lambda().getChildCount()-6;i++) {
			ParseTree node = ctx.lambda().getChild(5+i);
			machine.IIExpression bo = (machine.IIExpression) visit(node);
			body.add(bo);
		}
		IIExpression result =  (IIExpression) new LambdaExpression(para,body);
		return result;
	}

	@Override
	public IIExpression visitBegin_expr(Begin_exprContext ctx) {
		
		List<machine.IIExpression> seq = new LinkedList<machine.IIExpression>(); //
		
		ParseTree node = ctx.begin().getChild(2);
		for(int i=0;i< node.getChildCount();i++) {
			seq.add((machine.IIExpression) visit(node.getChild(i)));
		}
		IIExpression result = (IIExpression) new BeginExpression(seq);
		
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
		machine.IIExpression op =  (machine.IIExpression) visit(ctx.compound().getChild(1));
		List<machine.IIExpression>  plist = new LinkedList<machine.IIExpression>();//
		ParseTree node = ctx.compound().getChild(2);
		for(int i=0;i< node.getChildCount();i++) {
			plist.add((machine.IIExpression) visit(node.getChild(i)));
		}
		IIExpression result = (IIExpression) new CompoundExpression(op,plist);
		return result;
	}

	@Override
	public IIExpression visitDefine(DefineContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("visitDefine");
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
		SymbolExpression s = new SymbolExpression(ctx.getChild(0).getText());
		return (IIExpression) s;
	}

	@Override
	public IIExpression visitSelf_int(Self_intContext ctx) {
		// TODO Auto-generated method stub
		
		return (IIExpression) new SelfExpression(Integer.valueOf(ctx.getChild(0).getText()));
	}

	@Override
	public IIExpression visitCompound(CompoundContext ctx) {
		// TODO Auto-generated method stub
		
		machine.IIExpression op =  (machine.IIExpression) visit(ctx.getChild(1));
		List<machine.IIExpression>  plist = new LinkedList<machine.IIExpression>();//
		ParseTree node = ctx.getChild(2);
		for(int i=0;i< node.getChildCount();i++) {
			plist.add((machine.IIExpression) visit(node.getChild(i)));
		}
		IIExpression result = (IIExpression) new CompoundExpression(op,plist);
		return result;
		
	}



	@Override
	public IIExpression visitFile(FileContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFile(ctx);
	}

	@Override
	public IIExpression visitLambda_comp(Lambda_compContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLambda_comp(ctx);
	}

	@Override
	public IIExpression visitProc_name_comp(Proc_name_compContext ctx) {
		// TODO Auto-generated method stub

		String name = ctx.getChild(0).getText();
		SymbolExpression v = new SymbolExpression(name);
		return (IIExpression) v;
	}

	@Override
	public IIExpression visitProc_num_comp(Proc_num_compContext ctx) {
		// TODO Auto-generated method stub
		String name = ctx.getChild(0).getText();
		SymbolExpression v = new SymbolExpression(name);
		return (IIExpression)v;
	}

	@Override
	public IIExpression visitFormalParas(FormalParasContext ctx) {
		// TODO Auto-generated method stub
		SequenceExpression seq = new SequenceExpression();
		int size = ctx.getChildCount();
		List<IIExpression> s = new LinkedList<IIExpression>();
		
		for(int i=0;i<size;i++) {
			IIExpression  sef = visit(ctx.getChild(i));
			s.add((IIExpression) sef);
		}
		return (IIExpression) seq;
	}

	@Override
	public IIExpression visitFormalPara(FormalParaContext ctx) {
		// TODO Auto-generated method stub
		return (IIExpression) new SelfExpression(ctx.getChild(0).getText());
	}

	@Override
	public IIExpression visitArgs(ArgsContext ctx) {
		// TODO Auto-generated method stub
		
		SequenceExpression seq = new SequenceExpression();
		int size = ctx.getChildCount();
		List<IIExpression> s = new LinkedList<IIExpression>();
		
		for(int i=0;i<size;i++) {
			IIExpression  sef = (IIExpression) visit(ctx.getChild(i));
			s.add(sef);
		}
		return (IIExpression) seq;
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
