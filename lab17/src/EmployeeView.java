public class EmployeeView {
    // Метод для отображения деталей сотрудника
    public void printEmployeeDetails(String employeeName, String employeeId, double employeeSalary) {
        System.out.println("Employee Details: ");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}
