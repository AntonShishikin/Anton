import java.util.Date;

public class DeveloperInfo {
    public static void main(String[] args) {
        String developerName = "Шишикин Антон";
        Date assignmentReceived = new Date(1234567890000L);  // пример даты получения задания
        Date assignmentSubmitted = new Date();  // текущая дата и время

        System.out.println("Разработчик: " + developerName);
        System.out.println("Дата и время получения задания: " + assignmentReceived);
        System.out.println("Дата и время сдачи задания: " + assignmentSubmitted);
    }
}
