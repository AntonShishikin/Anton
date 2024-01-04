import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        numProcessing(num);
    }

    public static int numProcessing(int num){
        if (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
            return numProcessing(num);
        }else{
            return num;
        }
    }
}