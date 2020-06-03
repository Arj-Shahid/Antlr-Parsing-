public class ModifiedBaseListener extends ModifiedCPP14GrammarBaseListener {


    @Override
    public void enterIdentifierNames(ModifiedCPP14GrammarParser.IdentifierNamesContext ctx) {
        super.enterIdentifierNames(ctx);
        System.out.println(ctx.getText());
    }
}
