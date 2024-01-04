package firstTask;

import java.util.Stack;

public class RPNCalculator {
    public static double evaluateRPN(String[] expressionTokens) {
        Stack<Double> computationStack = new Stack<>();

        for (String token : expressionTokens) {
            if (isNumeric(token)) {
                computationStack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (computationStack.size() < 2) {
                    throw new IllegalArgumentException("Insufficient operands for operator: " + token);
                }
                double secondOperand = computationStack.pop();
                double firstOperand = computationStack.pop();
                double operationResult = performOperation(token, firstOperand, secondOperand);
                computationStack.push(operationResult);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        if (computationStack.size() != 1) {
            throw new IllegalArgumentException("Insufficient operators in expression");
        }
        return computationStack.pop();
    }

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    private static double performOperation(String operator, double firstOperand, double secondOperand) {
        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if (secondOperand == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return firstOperand / secondOperand;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

