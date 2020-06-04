// Generated from ModifiedCPP14Grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModifiedCPP14GrammarParser}.
 */
public interface ModifiedCPP14GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModifiedCPP14GrammarParser#simpleProgram}.
	 * @param ctx the parse tree
	 */
	void enterSimpleProgram(ModifiedCPP14GrammarParser.SimpleProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedCPP14GrammarParser#simpleProgram}.
	 * @param ctx the parse tree
	 */
	void exitSimpleProgram(ModifiedCPP14GrammarParser.SimpleProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModifiedCPP14GrammarParser#identifierdigit}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierdigit(ModifiedCPP14GrammarParser.IdentifierdigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModifiedCPP14GrammarParser#identifierdigit}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierdigit(ModifiedCPP14GrammarParser.IdentifierdigitContext ctx);
}