package com.company;

/**
 * Created by Kris on 13-May-17.
 */
public class MethodHelper {
    public static DataType getTypeByString(String typeName) {
        if (typeName.contains("int")) {
            return DataType.INT;
        } else if (typeName.contains("boolean")) {
            return DataType.BOOL;
        } else if (typeName.contains("Text")) {
            return DataType.STRING;
        } else {
            throw new TacoException("That was an invalid dataType");
        }
    }
}
