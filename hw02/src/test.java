import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class test {

	public static void main(String[] args) throws Exception  {
		MiniCLexer lexer = new MiniCLexer(new ANTLRFileStream("input"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniCParser parser = new MiniCParser(tokens);
		ParseTree tree = parser.program();
		
		new MiniCPrintVisitor().visit(tree);	

	}
}
