// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/JulesVerne.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JulesVerneParser}.
 */
public interface JulesVerneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JulesVerneParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JulesVerneParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JulesVerneParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JulesVerneParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JulesVerneParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JulesVerneParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JulesVerneParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JulesVerneParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(JulesVerneParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(JulesVerneParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(JulesVerneParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(JulesVerneParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(JulesVerneParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(JulesVerneParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(JulesVerneParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(JulesVerneParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JulesVerneParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JulesVerneParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JulesVerneParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JulesVerneParser.FunctionContext ctx);
}