import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {
    public static List<Student> mergeSort(List<Student> whole) {
        List<Student> left = new ArrayList<>();
        List<Student> right = new ArrayList<>();
        int center;

        if (whole.size() == 1) {
            return whole;
        } else {
            center = whole.size() / 2;
            // копирование левой части
            for (int i = 0; i < center; i++) {
                left.add(whole.get(i));
            }

            // копирование правой части
            for (int i = center; i < whole.size(); i++) {
                right.add(whole.get(i));
            }

            left = mergeSort(left);
            right = mergeSort(right);

            // Слияние
            merge(left, right, whole);
        }
        return whole;
    }

    private static void merge(List<Student> left, List<Student> right, List<Student> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        // Сравнение элементов и слияние
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getIDNumber() < right.get(rightIndex).getIDNumber()) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }

        List<Student> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }

        // Копирование оставшихся элементов
        for (int i = restIndex; i < rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }
}
