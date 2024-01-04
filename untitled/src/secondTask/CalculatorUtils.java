package secondTask;

import java.math.BigDecimal;

public class CalculatorUtils {

    public static boolean isNumeric(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isOperator(String input) {
        return "+-*/".contains(input);
    }

    public static double calculateResult(String operator, double firstOperand, double secondOperand) {
        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }

    public static String getPrettyNumber(String number) {
        return BigDecimal.valueOf(Double.parseDouble(number))
                .stripTrailingZeros().toPlainString();
    }
}
