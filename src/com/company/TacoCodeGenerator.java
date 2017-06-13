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

//        for (ParseTree statement: ctx.()) {
//            Visiting the childs should result in some strings, return that stuff
//            bytecode.addAll(visit(statement));
//        }
        bytecode.addAll(visit(ctx.block()));
        System.out.println("Test");
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
    public List<String> visitFunctionDeclare(tacoParser.FunctionDeclareContext ctx) {
        //TODO: Determine size of the stack / heap in this function
        ArrayList<String> bytecode = new ArrayList<>();
        //TODO: Determine functionvariables
        bytecode.add(".method public " + ctx.NAME() + "(" + ")");
        return super.visitFunctionDeclare(ctx);
    }

    @Override
    public List<String> visitFunctionvariable(tacoParser.FunctionvariableContext ctx) {
        ArrayList<String> bytecode = new ArrayList<>();
        return bytecode;
    }

    @Override
    public List<String> visitFunction(tacoParser.FunctionContext ctx) {

        return super.visitFunction(ctx);
    }

    @Override
    public List<String> visitArguments(tacoParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx);
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
        ArrayList<String> bytecode = new ArrayList<>();
        System.out.println("visiting block");

        for (ParseTree statement: ctx.statement()) {
//            Visiting the childs should result in some strings, return that stuff
            bytecode.addAll(visit(statement));
        }
        return bytecode;
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
        System.out.println("Visiting loop");
        //Load INT onto the stack
        //Load counter onto the stack

        String labelName = "begin"+(labelCount++);

        ArrayList<String> bytecode = new ArrayList<>();
        bytecode.add("iconst_0 ; Starting at 0");
        bytecode.add("istore " + (vars.getVars().size() ));

        bytecode.add(labelName + ":"); //Defines the label
        bytecode.addAll(visit(ctx.block())); //This executes the code within the loop

        //Start at 0

        bytecode.add("iinc "+(vars.getVars().size())+" 1");
        bytecode.add("iload  "+(vars.getVars().size()));
        bytecode.add("bipush " + ctx.INT().getText());
        bytecode.add("if_icmple " + labelName );//Jump to the label, but we need a way to end the loop
        //if_icmpLE

        return bytecode;
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
