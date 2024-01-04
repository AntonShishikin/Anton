public class Report {
    public static void generateReport(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            System.out.print(employees[i].getFullname());
            System.out.printf("%-15s %15s %n" , employees[i].getFullname());
        }
    }
}
