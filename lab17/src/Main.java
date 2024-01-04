
public class Main {
    public static void main(String[] args) {
        Employee model = new Employee("E01", "John Doe", 1000.00);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        // Update the data
        controller.setEmployeeName("Jane Doe");
        controller.setEmployeeSalary(1200.00);

        controller.updateView();
    }
}
