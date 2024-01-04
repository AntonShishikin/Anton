// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        MathCalculable mc1 = new MathFunc();

        System.out.println("Choose an option:"+
                "\n1. Pow of numbers" +
                "\n2. Module of numbers" +
                "\n3. Circle" +
                "\n Another - exit");

        int choose = scanner.nextInt();

        switch (choose){
            case 1:
                System.out.println("Enter first num");
                num1 = scanner.nextInt();
                System.out.println("Enter second num");
                num2 = scanner.nextInt();
                System.out.println(num1 + "^" + num2 + "=" + mc1.power(num1, num2));
                break;
            case 2:
                System.out.println("Enter first num");
                num1 = scanner.nextInt();
                System.out.println("Enter second num");
                num2 = scanner.nextInt();
                System.out.println("Modulus of"+ num1+ " + "+ num2 + " = " + mc1.modulusOfComplexNumber(num1, num2));
                break;
            case 3:
                System.out.println("Enter radius");
                num1 = scanner.nextInt();
                MathFunc mathFuncInstance = (MathFunc) mc1;
                System.out.println("Circumference of circle with radius "+ num1 + " = " + mathFuncInstance.circumference(num1));
                break;
            default:
                System.exit(0);
        }
    }
}