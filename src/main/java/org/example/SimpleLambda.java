package org.example;

public class SimpleLambda {

    interface MathOp {
        double operate(double a, double b);
    }

    public static void main(String[] args) {
        MathOp add = (a, b) -> a + b;
        MathOp subtract = (a, b) -> a - b;
        MathOp multiply = (a, b) -> a * b;
        MathOp divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        };

        double num1 = 10;
        double num2 = 5;

        System.out.println(); // space for readability :)
        System.out.println("Addition: " + add.operate(num1, num2));
        System.out.println("Subtraction: " + subtract.operate(num1, num2));
        System.out.println("Multiplication: " + multiply.operate(num1, num2));
        System.out.println("Division: " + divide.operate(num1, num2));
    }
}
