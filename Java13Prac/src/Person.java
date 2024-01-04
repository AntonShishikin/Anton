public class Person {

    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Person(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public Person(String lastName) {
        this(lastName, null, null);
    }

    public String getShortName() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            sb.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            sb.append(" ").append(middleName.charAt(0)).append(".");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр");
        Person person3 = new Person("Сидоров");

        System.out.println(person1.getShortName());
        System.out.println(person2.getShortName());
        System.out.println(person3.getShortName());
    }
}
