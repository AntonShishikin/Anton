import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); // Сортировка по убыванию
    }

    public void quickSort(Student[] students, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(students, begin, end);

            quickSort(students, begin, partitionIndex - 1);
            quickSort(students, partitionIndex + 1, end);
        }
    }

    private int partition(Student[] students, int begin, int end) {
        double pivot = students[end].getGpa();
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (students[j].getGpa() > pivot) {
                i++;

                Student swapTemp = students[i];
                students[i] = students[j];
                students[j] = swapTemp;
            }
        }

        Student swapTemp = students[i + 1];
        students[i + 1] = students[end];
        students[end] = swapTemp;

        return i + 1;
    }
}
