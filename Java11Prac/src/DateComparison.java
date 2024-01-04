import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Получение текущей даты
        Date currentDate = new Date();
        System.out.println("Текущая дата и время: " + dateFormat.format(currentDate));

        // Получение даты от пользователя
        System.out.println("Введите дату в формате 'гггг-мм-дд чч:мм:сс' (например, 2023-03-15 12:00:00):");
        String userInput = scanner.nextLine();
        Date userDate;
        try {
            userDate = dateFormat.parse(userInput);
        } catch (ParseException e) {
            System.out.println("Ошибка в формате даты. Пожалуйста, введите дату в правильном формате.");
            return;
        }

        // Сравнение дат
        System.out.println("Введенная дата: " + dateFormat.format(userDate));
        int comparisonResult = currentDate.compareTo(userDate);
        if (comparisonResult > 0) {
            System.out.println("Введенная дата раньше текущей даты.");
        } else if (comparisonResult < 0) {
            System.out.println("Введенная дата позже текущей даты.");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой.");
        }
    }
}
