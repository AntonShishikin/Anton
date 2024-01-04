public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", 50000.0),
                new Employee("Jane Doe", 55000.0),
                new Employee("Jim Smith", 45000.0)
        };

        Report.generateReport(employees);
    }
}
