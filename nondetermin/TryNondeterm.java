package nondetermin;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compileMachine.CompileEval;
import compileMachine.TryCompile;
import environment.Env;
import expression.GenExpression;
import expression.LispLexer;
import expression.LispParser;
import machine.IIExpression;


public class TryNondeterm {
	public static void main(String[] args) throws Exception{

		simple();
		
	}
	public static Object interpret(IIExpression exp, Env global) throws Exception {
		NonDeterEval evmachine = new NonDeterEval();
		Object o = evmachine.eval(exp, global);
		//EV.writefile("3.txt", evmachine.getHistory());
		return o;
	}
	
    private static void simple()  throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("/Users/bigtree/code/try/javacompiler/expression/test.scm")); // we'll
        // parse
        LispLexer lexer = new LispLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LispParser parser = new LispParser(tokens);
		ParseTree tree = parser.file(); 
		
		System.out.println(tree.toStringTree(parser));
		Env global = new Env();  

		int len = tree.getChildCount();
		for(int i=0;i<len;i++) {
			GenExpression<IIExpression> gen = new GenExpression<IIExpression>();
			IIExpression exp = (IIExpression) gen.visit(tree.getChild(i));
			
			Object o =TryNondeterm.interpret(exp,global);
			System.out.println(o);
			System.out.println("next expression!");
		}
    }

}
