import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringProcessor sp = new ProcessStrings();

        String testString = scanner.nextLine();
        System.out.println("Character count in \"" + testString + "\": " + sp.countCharacters(testString));

        System.out.println("Odd characters in \"" + testString + "\": " + sp.getOddCharacters(testString));

        System.out.println("Reversed string of \"" + testString + "\": " + sp.reverseString(testString));
    }
}