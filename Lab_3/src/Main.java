import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee employees[] = new Employee[5];
        employees[0] = new Employee("Anatoly", 100000);
        employees[1] = new Employee("Boris", 90000);
        employees[2] = new Employee("Vladimir", 80000);
        employees[3] = new Employee("Alexey", 95000);
        employees[4] = new Employee("Igor", 85000);


        JFrame frame = new JFrame();
        frame.setTitle("Table Products");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Scanner in = new Scanner(System.in);
        String apiUrl = "https://www.cbr.ru/scripts/XML_daily.asp?date_req=29/09/2023";

        Object[][] items = {
                {"GAZ3110", 1},
                {"LadaPriora", 2},
                {"GrantaSport", 3}
        };

        String[] columnNames = {"Name", "Code"};
        CbrCurrencyConverter converter = new CbrCurrencyConverter(apiUrl);

        while(true) {
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Введите код валюты относительно рубля курс которой хотите узнать Пример: \"USD\"");
                    String targetCurrency = in.next();


                    double exchangeRate = converter.convertCurrency(targetCurrency, 1);
                    System.out.println("Курс валюты " + targetCurrency + ": " + exchangeRate + "₽");
                    break;
                case 2:
                    JTable table = new JTable(items, columnNames);
                    JScrollPane scrollPane = new JScrollPane(table);

                    frame.add(scrollPane);

                    frame.setSize(300, 200);
                    frame.setVisible(true);

                    System.out.println("Choose code of your item:");
                    int itemChoice = in.nextInt();

                    System.out.println("Выберите валюту, в которой хотите приобрести выбранный вами товар:");
                    String currency = in.next();
                    int priceInP;
                    double price;
                    switch(itemChoice){
                        case 1:
                            priceInP = 100000;
                            price = converter.convertCurrency(currency, priceInP);
                            System.out.println("Your price: " + price + currency);
                            break;
                        case 2:
                            priceInP = 400000;
                            price = converter.convertCurrency(currency, priceInP);
                            System.out.println("Your price: " + price + currency);
                            break;
                        case 3:
                            priceInP = 150000;
                            price = converter.convertCurrency(currency, priceInP);
                            System.out.println("Your price: " + price + currency);
                            break;
                        default:
                            break;

                    }
                    break;
                case 3:
                    Report report = new Report();
                    report.generateReport(employees);
                default:
                    break;
            }
        }
    }
}