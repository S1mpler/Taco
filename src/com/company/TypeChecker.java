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

        //TODO: Check if types are the same
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
}
