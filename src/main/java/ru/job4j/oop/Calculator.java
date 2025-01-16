package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int devide(int y) {
        return x / y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + devide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = Calculator.minus(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.devide(10);
        System.out.println(result);
        result = calculator.multiply(10);
        System.out.println(result);
        result = calculator.sumAllOperation(10);
        System.out.println(result);
    }
}