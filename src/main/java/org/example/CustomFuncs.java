package org.example;

public class CustomFuncs {

    @FunctionalInterface
    interface StringOp {
        String operate(String s);
    }

    public static void main(String[] args) {
        StringOp toUpperCase = s -> s.toUpperCase();
        StringOp toLowerCase = s -> s.toLowerCase();
        StringOp reverse = s -> new StringBuilder(s).reverse().toString();

        String testString = "Lambda Expressions";
        System.out.println(); // space for readability :)
        System.out.println("Original: " + testString);
        System.out.println("To Upper Case: " + toUpperCase.operate(testString));
        System.out.println("To Lower Case: " + toLowerCase.operate(testString));
        System.out.println("Reversed: " + reverse.operate(testString));
    }
}
