public class Student implements Comparable<Student> {
    private int iDNumber;
    private double gpa;
    private String name;

    // Конструктор
    public Student(int iDNumber, double gpa, String name) {
        this.iDNumber = iDNumber;
        this.gpa = gpa;
        this.name = name;
    }

    // Геттеры и сеттеры
    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return Integer.compare(this.iDNumber, anotherStudent.iDNumber);
    }
}
