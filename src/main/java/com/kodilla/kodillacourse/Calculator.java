package com.kodilla.kodillacourse;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }

    public static void main(String args[])  {
        int firstNumber = 4;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int addResult = calculator.add(firstNumber, secondNumber);
        int subtractResult = calculator.subtract(firstNumber, secondNumber);
        System.out.println(addResult);
        System.out.println(subtractResult);
    }
}
