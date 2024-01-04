import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DeveloperInfoPrinter infoPrinter = new DeveloperInfoPrinter("Ivanov");
        infoPrinter.printInfo();

        DateComparator dateComparator = new DateComparator();
        dateComparator.compareDates();

        Student student = new Student("Ivanov", "Ivan", new Date());
        System.out.println(student);

        DateTimeCreator dateTimeCreator = new DateTimeCreator();
        dateTimeCreator.createDateTime();

        ListPerformanceComparator performanceComparator = new ListPerformanceComparator();
        performanceComparator.comparePerformance();
    }
}
