import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zeros = scanner.nextInt();
        int ones = scanner.nextInt();
        func(zeros, ones, true, 0);
    }

    public static int func(int zeros, int ones, boolean zero, int counter){
        if (zeros>0 && ones>0) {
            if (zero) {
                return func(zeros, ones - 1, !zero, counter + 1);
            } else {
                return func(zeros - 1, ones, !zero, counter + 1);
            }
        }else{
            System.out.println(counter);
        }
    }
}