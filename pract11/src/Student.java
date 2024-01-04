import java.util.Date;

public class Student {
    private String lastName;
    private String firstName;
    private Date birthDate;

    public Student(String lastName, String firstName, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student: " + lastName + " " + firstName + ", Birth Date: " + birthDate;
    }
}
