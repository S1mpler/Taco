package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kris on 08-May-17.
 */
public class Variables {
    private static Variables ourInstance = new Variables();
    public static Variables getInstance() {
        return ourInstance;
    }

    private HashMap<String, DataType[]> functions = new HashMap<>();
    private ArrayList<String> vars = new ArrayList<>();
    private HashMap<String, Integer> numberVars = new HashMap<>();
    private HashMap<String, Boolean> boolVars = new HashMap<>();
    private HashMap<String, String> nameVars = new HashMap<>();
    private ArrayList<String> imports = new ArrayList<>();
    private Variables(){}

    public HashMap<String, DataType[]> getFunctions() {
        return functions;
    }

    public void addFunction(String name, DataType[] functions) {
        this.functions.put(name, functions);
    }
    public void addVariable(String name, String type, String value){
        switch(type){
            case "boolean":
                vars.add(name);
                boolVars.put(name, Boolean.parseBoolean(value));
                break;
            case "int":
                vars.add(name);
                numberVars.put(name, Integer.parseInt(value));
                break;
            case "string":
                vars.add(name);
                nameVars.put(name, value);
                break;
        }
    }
    public ArrayList<String> getVars() {
        return vars;
    }
    public HashMap<String, Integer> getNumberVars() {
        return numberVars;
    }
    public HashMap<String, Boolean> getBoolVars() {
        return boolVars;
    }
    public HashMap<String, String> getNameVars() {
        return nameVars;
    }
    public int getKeyPosition(String key){
        for (int i = 0; i < vars.size(); i++) {
            if (vars.get(i).equals(key)){
                return i;
            }
        }
        return -1;
    }
    public void addImport(String name){
        imports.add(name);
    }
    public int getImportCount(){
        return imports.size();
    }
}
