import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ModifiedBaseListener extends ModifiedCPP14GrammarBaseListener {
    //For writing parsed output to a file
    BufferedWriter bufferedWriter;
    public ModifiedBaseListener(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    public ModifiedBaseListener() {
        
    }

    @Override
    public void enterSimpleProgram(ModifiedCPP14GrammarParser.SimpleProgramContext ctx){
        super.enterSimpleProgram(ctx);
        ArrayList<String> identifierNamesFromContext = new ArrayList<String>();
        //bufferedWriter.write("[");
        for (ParseTree parseTree : ctx.children) {

            if(!identifierNamesFromContext.contains(parseTree.getText())) {
          //      bufferedWriter.write(" " + parseTree.getText() + ",");
                identifierNamesFromContext.add(parseTree.getText());
            }
        }
        //bufferedWriter.write("]");
        //bufferedWriter.flush();
    }

    /*@Override
    public void enterProgramDefinition(ModifiedCPP14GrammarParser.ProgramDefinitionContext ctx) {
        super.enterProgramDefinition(ctx);
       // System.out.println(ctx.getText());
    }

    @Override
    public void enterFunctionDefinition(ModifiedCPP14GrammarParser.FunctionDefinitionContext ctx) {
        super.enterFunctionDefinition(ctx);
      //  System.out.println(ctx.getText());
    }

    @Override
    public void enterMethodName(ModifiedCPP14GrammarParser.MethodNameContext ctx) {
        super.enterMethodName(ctx);
        System.out.println(ctx.getText());

    }

    @Override
    public void enterArgumentType(ModifiedCPP14GrammarParser.ArgumentTypeContext ctx) {
        super.enterArgumentType(ctx);
        System.out.println(ctx.getText());
    }*/

}
