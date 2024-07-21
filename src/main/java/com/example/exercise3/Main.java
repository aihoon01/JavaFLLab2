package com.example.exercise3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example: (3 + 5) * 2

        // Push operands
        calculator.pushOperand(3);
        calculator.pushOperand(5);

        // Push operator
        calculator.pushOperator('+');

        // Perform addition
        calculator.performOperation();

        // Push the result and another operand
        calculator.pushOperand(calculator.evaluate()); // 8
        calculator.pushOperand(2);

        // Push the final operator
        calculator.pushOperator('*');

        // Perform multiplication
        calculator.performOperation();

        // Evaluate final result
        double result = calculator.evaluate();
        System.out.println("Result: " + result); // Output: Result: 16.0
    }

}
