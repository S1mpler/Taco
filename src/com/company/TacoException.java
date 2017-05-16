package com.company;

/**
 * Created by S1mpler on 3/9/2017.
 */
public class TacoException extends RuntimeException {
    public TacoException(){super(); }
    public TacoException(String message) {
        super(message);
    }
}
