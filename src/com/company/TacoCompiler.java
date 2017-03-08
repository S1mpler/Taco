package com.company;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class TacoCompiler{
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
        System.out.println("No errors.");
    }
}