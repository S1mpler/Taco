package com.company;

/**
 * Created by Kris on 08-Mar-17.
 */
public enum DataType {
    INT("int"), STRING("string"), BOOLEAN("bool");

    String name;
    DataType (String name) {

    }

    public String getName() {
        return name;
    }
}
