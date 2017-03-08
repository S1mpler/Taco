// Generated from C:/Users/Kris/School/CompilersOperatingSystes/Taco/src\taco.g4 by ANTLR 4.6
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tacoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tacoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tacoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tacoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(tacoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(tacoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(tacoParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExpression}
	 * labeled alternative in {@link tacoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(tacoParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogExpression}
	 * labeled alternative in {@link tacoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogExpression(tacoParser.LogExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link tacoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(tacoParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralIntExpr}
	 * labeled alternative in {@link tacoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralIntExpr(tacoParser.LiteralIntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralStringExpr}
	 * labeled alternative in {@link tacoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralStringExpr(tacoParser.LiteralStringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacoParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(tacoParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacoParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(tacoParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacoParser#ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss(tacoParser.AssContext ctx);
	/**
	 * Visit a parse tree produced by {@link tacoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(tacoParser.TypeContext ctx);
}