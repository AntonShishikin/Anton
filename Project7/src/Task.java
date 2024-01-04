import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        processSequence();
    }

    public static void processSequence() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            return;
        }

        System.out.println(number);

        number = scanner.nextInt();
        if (number != 0) {
            processSequence();
        }
    }
}
