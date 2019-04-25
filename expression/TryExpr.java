package expression;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import grammar.ArrayInitLexer;
import grammar.ArrayInitParser;
import machine.IIExpression;
import machine.Try;
import regular.ShortConvert;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.runtime.tree.*;

public class TryExpr {
	
	 public static void main(String[] args) throws Exception {
		 //genClass();
		 simple();
	 }
	
	@SuppressWarnings("deprecation")
    public static void genClass() {
        String[] arg0 = { "-visitor", "C:\\_java\\mywork\\codeseq\\compiler\\expression\\Lisp.g4", "-package", "expression" };
        org.antlr.v4.Tool.main(arg0);
        
    }
	
	
    private static void simple()  throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("C:\\_java\\mywork\\codeseq\\compiler\\expression\\test.scm")); // we'll
        // parse
        LispLexer lexer = new LispLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LispParser parser = new LispParser(tokens);
		ParseTree tree = parser.file(); 
		
		System.out.println(tree.toStringTree(parser));
		int len = tree.getChildCount();
		for(int i=0;i<len;i++) {
			GenExpression<IIExpression> gen = new GenExpression<IIExpression>();
			IIExpression exp = (IIExpression) gen.visit(tree.getChild(i));
			//ParseTreeWalker walker = new ParseTreeWalker();
			//walker.walk(new ShortConvert(), tree);
			Object o =Try.interpret(exp);
			System.out.println("next expression");
		}
		

    }

}
