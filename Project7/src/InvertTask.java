import java.util.Scanner;

import static java.lang.Math.pow;

public class InvertTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        numProcessing(num);
    }

    public static int numProcessing(int num){
        int numbers;
        numbers = (int) Math.log10(num) + 1;
        if (num != 0) {
            int output = (int) (num / pow(10,numbers - 1));
            System.out.println(output);
            num = (int) (num % (pow(10,numbers - 1)));
            return numProcessing(num);
        }else{
            return num;
        }
    }
}
