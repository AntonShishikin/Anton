import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Тестирование сортировки вставками по iDNumber
        Student[] students = {
                new Student(4, 3.9, "Vladislav"),
                new Student(1, 3.6, "Anton"),
                new Student(2, 4.5, "Igor"),
                new Student(3, 4.4, "Alexandra")
        };

        // Сортировка вставками
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > current.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }

        System.out.println("Сортировка по ID:");
        for (Student student : students) {
            System.out.println(student.getIDNumber() + " " + student.getName());
        }

        // Тестирование сортировки по GPA
        SortingStudentsByGPA gpaComparator = new SortingStudentsByGPA();
        gpaComparator.quickSort(students, 0, students.length - 1);

        System.out.println("\nСортировка по GPA:");
        for (Student student : students) {
            System.out.println(student.getGpa() + " " + student.getName());
        }

        // Тестирование сортировки слиянием
        List<Student> studentsList1 = new ArrayList<>(Arrays.asList(
                new Student(5, 3.8, "Maria"),
                new Student(6, 3.2, "Nikolay")
        ));

        List<Student> studentsList2 = new ArrayList<>(Arrays.asList(
                new Student(7, 4.1, "Olga"),
                new Student(8, 2.9, "Petr")
        ));

        studentsList1.addAll(studentsList2);
        MergeSortStudents.mergeSort(studentsList1);

        System.out.println("\nСортировка слиянием:");
        for (Student student : studentsList1) {
            System.out.println(student.getIDNumber() + " " + student.getName());
        }
    }
}
