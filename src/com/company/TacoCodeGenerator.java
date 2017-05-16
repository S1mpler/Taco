package com.company;

import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by Kris on 09-May-17.
 */
public class TacoCodeGenerator extends tacoBaseVisitor<List<String>>{
    Variables vars = Variables.getInstance();
    private int labelCount = 0;

    @Override
    public List<String> visitProgram(tacoParser.ProgramContext ctx) {
        System.out.println("Prog");
        List<String> bytecode = new ArrayList<>();

        for (ParseTree statement: ctx.statement()) {
            //Visiting the childs should result in some strings, return that stuff
            bytecode.addAll(visit(statement));
            System.out.println("Test");
        }
        return bytecode;
    }

    @Override
    public List<String> visitIfStatement(tacoParser.IfStatementContext ctx) {
        //First add	the	boolean	condition
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.condition()));
        //Make unique code
        String label = "endif_" + (labelCount++);

        code.add("ifeq "+label);
        code.addAll(visit(ctx.block()));

        code.add(label +":");
        return code;
    }

    @Override
    public List<String> visitMathExpression(tacoParser.MathExpressionContext ctx){
        //TODO: Return bytecode for calculating the expression
        System.out.println("Visiting mathexpression");
        //leftExpr=expression op=MATHOP rightExpr=expression
        //TODO: Visit left expression first, then right
        List<String> bytecode = new ArrayList<>();
        bytecode.addAll(visit(ctx.leftExpr));
        bytecode.addAll(visit(ctx.rightExpr));

        switch (ctx.op.getText()){
            case "+":
                bytecode.add("iadd");
                break;
            case "-":
                bytecode.add("isub");
                break;
            case "*":
                bytecode.add("imul");
                break;
            case "/":
                bytecode.add("idiv");
                break;
            case "%":
                bytecode.add("irem");
                break;
            default:
                //TODO: Default case..
                throw new TacoException("Invalid operator");
        }
        return bytecode;
    }

    @Override
    public List<String> visitPrintStatement(tacoParser.PrintStatementContext ctx){
        //TODO: A static variable is loaded, so we need to take that into account for the stack size
        List<String> bytecode = new ArrayList<>();
        bytecode.add("getstatic java/lang/System/out Ljava/io/PrintStream; \n\r");
        vars.addImport("printstream");
        bytecode.addAll(visit(ctx.expression()));
        bytecode.add("invokevirtual java/io/PrintStream/println(I)V");

        return bytecode;
    }

    @Override
    public List<String> visitBlock(tacoParser.BlockContext ctx) {
        //TODO: How would a block work?
        return new ArrayList<>();
    }

    @Override
    public List<String> visitLogExpression(tacoParser.LogExpressionContext ctx) {
        return new ArrayList<>();
    }

    @Override
    public List<String> visitBrackets(tacoParser.BracketsContext ctx) {
        return new ArrayList<>();
    }

    /**
     * Returns bytecode that pushes an integer onto memory
     */
    @Override
    public List<String> visitLiteralIntExpr(tacoParser.LiteralIntExprContext ctx) {
        List<String> bytecode = new ArrayList<>();
        bytecode.add("ldc "+ctx.INT().getText());
        return bytecode;
    }

    @Override
    public List<String> visitLiteralBoolExpr(tacoParser.LiteralBoolExprContext ctx) {
        return new ArrayList<>();
    }

    @Override
    public List<String> visitAndOrExpression(tacoParser.AndOrExpressionContext ctx) {
        return new ArrayList<>();
    }

    @Override
    public List<String> visitLoop(tacoParser.LoopContext ctx) {
        return new ArrayList<>();
    }

    @Override
    public List<String> visitDcl(tacoParser.DclContext ctx) {
        vars.addVariable(ctx.NAME().getText(), ctx.type().getText(), ctx.expression().getText());

        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.expression())); //Do i really need to visit here? Or is it safe to get the value by getter
        code.add("istore "+vars.getKeyPosition(ctx.NAME().getText()));

        return code;
    }

    @Override
    public List<String> visitLoadValue(tacoParser.LoadValueContext ctx) {
        System.out.println("Loading value");
        ArrayList<String> bytecode = new ArrayList<>();
        bytecode.add("iload " + vars.getKeyPosition(ctx.getText()));
        return bytecode;
    }

    @Override
    public List<String> visitAss(tacoParser.AssContext ctx) {
        //TODO: Load variable with name
        //TODO: Check if types are OK?
        //TODO: Overwrite value
        //TODO: Store it again, same position
        ArrayList<String> code = new ArrayList<>();
        code.add("iload "+vars.getKeyPosition(ctx.NAME().getText()));
        code.addAll(visit(ctx.expression()));
        code.add("istore "+vars.getKeyPosition(ctx.NAME().getText()));

        return code;
    }

    @Override
    public List<String> visitType(tacoParser.TypeContext ctx) {
        return new ArrayList<>();
    }
}
