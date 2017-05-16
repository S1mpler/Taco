package com.company;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TacoCompiler {
    public static void main(String[] args) throws IOException {
        evaluate("tests/sum.taco");
    }

    private static void evaluate(String filename) throws IOException {
        // Create input stream
        ANTLRInputStream inputStream = new ANTLRFileStream(filename);
        // Create lexer
        tacoLexer lexer = new tacoLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        tacoParser parser = new tacoParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at expression rule

        // Type check
        // FIXME: Add a type checker!!
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(tree);

        TacoCodeGenerator generator = new TacoCodeGenerator();
        //If no errors after type-checking, parse to bytecode..

        List<String> list = generator.visit(tree);
        BufferedWriter bw = null;
        FileWriter writer = null;

        try {
            writer = new FileWriter("text.jasmin");
            bw = new BufferedWriter(writer);

            bw.write(".class public Template\r\n" +
                    ".super java/lang/Object \r\n");
            //TODO: If there is no function declared, make a main function
            bw.write("; Standard initializer (calls java.lang.Object's initializer), in other words: the empty constructor\n" +
                    ".method public <init>()V\n" +
                    "\taload_0 \t\t\t\t\t\t\t\t\t\t; Push reference to \"this\" object on the stack\n" +
                    "\tinvokenonvirtual java/lang/Object/<init>()V \t; Call super constructor\n" +
                    "\treturn\n" +
                    ".end method \r\n");

            bw.write(".method public static main([Ljava/lang/String;)V\n");
            bw.write(".limit stack " + (Variables.getInstance().getVars().size() + Variables.getInstance().getImportCount() +1 ) +"\r\n");
            bw.write(".limit locals " + (Variables.getInstance().getVars().size() + 2 )+"\r\n");
            for (String aList : list) {
                bw.write(aList + "\r\n");
            }

            bw.write("return \r\n");
            bw.write(".end method");
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            if (bw != null){
                bw.close();
                writer.close();
            }
        }
    }
}