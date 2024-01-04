import java.util.Date;

public class DeveloperInfoPrinter {
    private String developerSurname;
    private Date taskReceivedDate;
    private Date taskCompletionDate;

    public DeveloperInfoPrinter(String surname) {
        this.developerSurname = surname;
        this.taskReceivedDate = new Date();
        this.taskCompletionDate = new Date();
    }

    public void printInfo() {
        System.out.println("Developer Surname: " + developerSurname);
        System.out.println("Task Received Date: " + taskReceivedDate);
        System.out.println("Task Completion Date: " + taskCompletionDate);
    }
}

