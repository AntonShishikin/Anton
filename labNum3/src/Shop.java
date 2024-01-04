import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(0.85); // USD to EUR
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость товара в USD:");
        double price = scanner.nextDouble();

        System.out.println("Выберите валюту: 1 - EUR, 2 - USD");
        int choice = scanner.nextInt();

        if (choice == 1) {
            price = converter.convert(price);
            System.out.printf("Стоимость товара: %.2f EUR\n", price);
        } else {
            System.out.printf("Стоимость товара: %.2f USD\n", price);
        }
    }
}
