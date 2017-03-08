package com.company;

/**
 * Created by Kris on 02-Mar-17.
 */
public class TypeChecker extends tacoBaseVisitor{
    public Object visitMathExpression(tacoParser.MathExpressionContext tree) {
        //TODO: Visit the tree..

        Object leftType = visit(tree.leftExpr);
        DataType rightType = (DataType) visit(tree.rightExpr);

        System.out.println("Test");

        return null;
    }
}
