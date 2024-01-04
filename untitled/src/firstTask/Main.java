package firstTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter expression in Reverse Polish Notation: ");
        String userInput = userInputScanner.nextLine();
        userInputScanner.close();

        String[] rpnTokens = userInput.split(" ");
        double evaluationResult = RPNCalculator.evaluateRPN(rpnTokens);
        System.out.println("Result: " + evaluationResult);
    }
}
