package org.example;

import java.util.function.*;

public class BuiltInFuncs {

    public static void main(String[] args) {
        // Predicate: Tests if a number is positive
        Predicate<Integer> isPositive = x -> x > 0;

        // Function: Converts a string to its length
        Function<String, Integer> stringLength = String::length;

        // Consumer: Prints a string to the console
        Consumer<String> printString = System.out::println;

        // Supplier: Supplies a constant string
        Supplier<String> getString = () -> "Hello, Lambda!";

        // Test Predicate
        int number = 10;
        System.out.println("Is " + number + " positive? " + isPositive.test(number));

        // Test Function
        String testString = "Lambda Expressions";
        System.out.println("Length of \"" + testString + "\": " + stringLength.apply(testString));

        // Test Consumer
        printString.accept("This is a lambda expression using Consumer!");

        // Test Supplier
        System.out.println(getString.get());
    }
}
