package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class TacoCompiler{
    public static void main(String[] args) {
        evaluate("test1.g4");
    }

    private static void evaluate(String filename){
        // Create input stream
        ANTLRInputStream inputStream = new ANTLRFileStream(filename);
        // Create lexer
        SimpleLangLexer lexer = new SimpleLangLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        SimpleLangParser parser = new SimpleLangParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at expression rule

        // Type check
        // FIXME: Add a type checker!!
        //    try {
        //       TypeChecker typeChecker = new TypeChecker();
        //       typeChecker.visit(tree);
        //       System.out.println("No errors.");
        //    } catch( CompileException ce ) {
        //       System.err.println( "ERROR: " + ce.getMessage() );
        //    }
    }
}