import org.antlr.v4.runtime.tree.ParseTree;

public class ModifiedBaseListener extends ModifiedCPP14GrammarBaseListener {
    @Override
    public void enterSimpleProgram(ModifiedCPP14GrammarParser.SimpleProgramContext ctx) {
        super.enterSimpleProgram(ctx);
        for (ParseTree parseTree : ctx.children) {
            if(!ctx.children.contains(parseTree.getText())) {
                System.out.println(parseTree.getText());
            }
        }
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