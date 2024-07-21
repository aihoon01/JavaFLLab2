package com.example.exercise3;

import java.util.Stack;

public class Calculator {

    private Stack<Double> operandStack; // Stack to store operands
    private Stack<Character> operatorStack; // Stack to store operators

    public Calculator() {
        operandStack = new Stack<>();
        operatorStack = new Stack<>();
    }

    // Push an operand onto the operand stack
    public void pushOperand(double operand) {
        operandStack.push(operand);
    }

    // Push an operator onto the operator stack
    public void pushOperator(char operator) {
        operatorStack.push(operator);
    }

    // Pop an operand from the operand stack
    public double popOperand() {
        if (operandStack.isEmpty()) {
            throw new IllegalStateException("Operand stack is empty");
        }
        return operandStack.pop();
    }

    // Pop an operator from the operator stack
    public char popOperator() {
        if (operatorStack.isEmpty()) {
            throw new IllegalStateException("Operator stack is empty");
        }
        return operatorStack.pop();
    }

    // Perform arithmetic operations based on the operator
    public void performOperation() {
        if (operatorStack.isEmpty()) {
            throw new IllegalStateException("No operator to perform");
        }
        char operator = popOperator();
        double operand2 = popOperand();
        double operand1 = popOperand();
        double result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
        pushOperand(result); // Push the result back onto the operand stack
    }

    // Evaluate the expression based on the current stacks
    public double evaluate() {
        if (operandStack.size() != 1) {
            throw new IllegalStateException("Invalid expression");
        }
        return operandStack.peek(); // The result is the only element left in the operand stack
    }

}
