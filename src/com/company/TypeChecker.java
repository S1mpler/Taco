package com.company;

/**
 * Created by Kris on 02-Mar-17.
 */
public class TypeChecker extends tacoBaseVisitor<DataType>{
    @Override
    public DataType visitMathExpression(tacoParser.MathExpressionContext tree) {
        //TODO: Visit the tree..

        DataType leftType = (DataType) visit(tree.leftExpr);
        DataType rightType = (DataType) visit(tree.rightExpr);

        if (leftType == rightType) {
            return leftType;
        } else {
        }
        return null;
    }

    @Override
    public DataType visitBrackets(tacoParser.BracketsContext ctx) {
        return super.visitBrackets(ctx);
    }
    @Override
    public DataType visitLiteralIntExpr(tacoParser.LiteralIntExprContext tree){
        return DataType.INT;
    }
    @Override
    public DataType visitLogExpression(tacoParser.LogExpressionContext ctx) {
        return DataType.BOOL;
    }
}
