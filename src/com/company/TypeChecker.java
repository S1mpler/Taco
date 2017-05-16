package com.company;

import javax.xml.crypto.Data;

/**
 * Created by Kris on 02-Mar-17.
 */
public class TypeChecker extends tacoBaseVisitor<DataType>{

    Variables vars = Variables.getInstance();
    @Override
    public DataType visitMathExpression(tacoParser.MathExpressionContext tree) {
        //TODO: Visit the tree..

        DataType leftType = visit(tree.leftExpr);
        DataType rightType = visit(tree.rightExpr);
        String operation = tree.op.getText();

        if (leftType == rightType) {
//            System.out.println(leftType + rightType);
            return leftType;
        } else {
//            Throw an error
            throw new TacoException("Not a number");
        }
    }

    @Override
    public DataType visitBrackets(tacoParser.BracketsContext ctx) {
        return super.visitBrackets(ctx);
    }

    @Override
    public DataType visitLogExpression(tacoParser.LogExpressionContext ctx) {
        DataType leftType = visit(ctx.leftExpr);
        DataType rightType = visit(ctx.rightExpr);

        if (leftType == rightType){
            return DataType.BOOL;
        } else {
            throw new TacoException("Compared types are not the same");
        }
    }

    @Override
    public DataType visitAndOrExpression(tacoParser.AndOrExpressionContext ctx){
        if(visit(ctx.leftExpr) == visit(ctx.rightExpr) && visit(ctx.leftExpr) == DataType.BOOL){
            return DataType.BOOL;
        } else {
            throw new TacoException("Not boolean types");
        }
    }

    @Override
    public DataType visitLiteralBoolExpr(tacoParser.LiteralBoolExprContext ctx) {
        return DataType.BOOL;
    }

    @Override
    public DataType visitLiteralIntExpr(tacoParser.LiteralIntExprContext tree){
        return DataType.INT;
    }

    @Override
    public DataType visitProgram(tacoParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public DataType visitStatement(tacoParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public DataType visitBlock(tacoParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public DataType visitPrintStatement(tacoParser.PrintStatementContext ctx) {
        return super.visitPrintStatement(ctx);
    }

//    @Override
//    public DataType visitLiteralStringExpr(tacoParser.LiteralStringExprContext ctx) {
//        return DataType.STRING;
//    }

    @Override
    public DataType visitLoop(tacoParser.LoopContext ctx) {
        //TODO: Find out what to do here

        return super.visitLoop(ctx);
    }

    @Override
    public DataType visitDcl(tacoParser.DclContext ctx) {
        //TODO: Check if variable doesn't exist yet
        //TODO: If it doesn't exist, add it to the list of variables

        return super.visitDcl(ctx);
    }

    @Override
    public DataType visitAss(tacoParser.AssContext ctx) {
        //TODO: Check if variable exists and check if the assigned value corresponds with the initialized type
        return super.visitAss(ctx);
    }

    @Override
    public DataType visitType(tacoParser.TypeContext ctx) {
        return super.visitType(ctx);
    }
}
