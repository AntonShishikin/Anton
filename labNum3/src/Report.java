public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-20s %10s\n", "Full Name", "Salary");
        for (Employee employee : employees) {
            System.out.printf("%-20s %10.2f\n", employee.fullname, employee.salary);
        }
    }
}
