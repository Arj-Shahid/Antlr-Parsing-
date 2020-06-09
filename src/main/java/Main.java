import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static  void main(String[] args) throws IOException {
        //For reading CPP files from directory
        String source = "Y:\\Thesis\\de.ivu.grt.main.git";
        File directory = new File (source);
        File[] listOfFiles = directory.listFiles();

        //For writing the output of a parser
        FileWriter writeToFile = new FileWriter("Y:\\Thesis\\Output\\Output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writeToFile);

        int countNumberOfFiles = 0;

        for(File file : listOfFiles) {
            countNumberOfFiles++;
            bufferedWriter.write(countNumberOfFiles+" "+"File name is " + file.getName());

            CharStream characterStream = CharStreams.fromFileName(file.getAbsolutePath());
            ModifiedCPP14GrammarLexer lexer = new ModifiedCPP14GrammarLexer(characterStream);
            ModifiedCPP14GrammarParser parser = new ModifiedCPP14GrammarParser(new org.antlr.v4.runtime.CommonTokenStream(lexer));

            ModifiedCPP14GrammarParser.SimpleProgramContext  context = parser.simpleProgram();
            ModifiedBaseListener modifiedBaseListener = new ModifiedBaseListener(bufferedWriter);
            ParseTreeWalker.DEFAULT.walk(modifiedBaseListener, context);

            bufferedWriter.write(System.getProperty("line.separator"));
            bufferedWriter.write(System.getProperty("line.separator"));

        }
    }
}
