import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparator {
    public void compareDates() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd HH:mm): ");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date userDate = dateFormat.parse(userInput);
            Date currentDate = new Date();

            if (userDate.before(currentDate)) {
                System.out.println("Entered date is earlier than current date.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Entered date is later than current date.");
            } else {
                System.out.println("Entered date is the same as the current date.");
            }
        } catch (Exception e) {
            System.out.println("Date parsing error: " + e.getMessage());
        }
    }
}
