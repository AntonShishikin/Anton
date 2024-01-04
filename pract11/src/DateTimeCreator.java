import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTimeCreator {
    public void createDateTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year, month, and day (yyyyMMdd): ");
        String dateInput = scanner.nextLine();

        System.out.print("Enter hours and minutes (HHmm): ");
        String timeInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd HHmm");
        try {
            Date date = dateFormat.parse(dateInput + " " + timeInput);
            System.out.println("Created date and time: " + date);
        } catch (Exception e) {
            System.out.println("Date and time parsing error: " + e.getMessage());
        }
    }
}
