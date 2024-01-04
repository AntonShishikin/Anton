import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalendarCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год, месяц и число:");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("Введите час и минуты:");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);
        Date date = calendar.getTime();

        System.out.println("Сформированная дата и время: " + date);
    }
}

