import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static  void main(String[] args) throws IOException {
        String source = "Y:\\Thesis\\de.ivu.grt.main.git\\AlphaNumListControlClientFactory.cpp";

        CharStream characterStream = CharStreams.fromFileName(source);
        ModifiedCPP14GrammarLexer lexer = new ModifiedCPP14GrammarLexer(characterStream);
        ModifiedCPP14GrammarParser parser = new ModifiedCPP14GrammarParser(new org.antlr.v4.runtime.CommonTokenStream(lexer));

        ModifiedCPP14GrammarParser.SimpleProgramContext  context = parser.simpleProgram();
        ModifiedBaseListener modifiedBaseListener = new ModifiedBaseListener();
        ParseTreeWalker.DEFAULT.walk(modifiedBaseListener, context);
    }
}
