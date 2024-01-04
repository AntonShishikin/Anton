import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PerformanceComparison {

    private static final int NUM_TESTS = 5;
    private static final int NUM_ELEMENTS = 100000;
    private static final Random random = new Random();

    private static void testListPerformance(List<Integer> list) {
        // Тесты для добавления
        long totalTimeAddEnd = 0, totalTimeAddStart = 0, totalTimeAddMiddle = 0;
        long totalTimeSearch = 0, totalTimeRemove = 0;

        for (int i = 0; i < NUM_TESTS; i++) {
            // Добавление в конец
            long startTime = System.nanoTime();
            for (int j = 0; j < NUM_ELEMENTS; j++) {
                list.add(j);
            }
            long endTime = System.nanoTime();
            totalTimeAddEnd += (endTime - startTime);

            // Добавление в начало
            startTime = System.nanoTime();
            for (int j = 0; j < 100; j++) {
                list.add(0, -j);
            }
            endTime = System.nanoTime();
            totalTimeAddStart += (endTime - startTime);

            // Добавление в середину
            startTime = System.nanoTime();
            for (int j = 0; j < 100; j++) {
                list.add(list.size() / 2, -j);
            }
            endTime = System.nanoTime();
            totalTimeAddMiddle += (endTime - startTime);

            // Поиск
            int searchFor = random.nextInt(NUM_ELEMENTS);
            startTime = System.nanoTime();
            list.contains(searchFor);
            endTime = System.nanoTime();
            totalTimeSearch += (endTime - startTime);

            // Удаление
            startTime = System.nanoTime();
            list.remove(0);
            endTime = System.nanoTime();
            totalTimeRemove += (endTime - startTime);

            list.clear(); // Очистка списка после теста
        }

        // Вывод результатов
        System.out.println("Среднее время добавления в конец: " + (totalTimeAddEnd / NUM_TESTS) + " нс");
        System.out.println("Среднее время добавления в начало: " + (totalTimeAddStart / NUM_TESTS) + " нс");
        System.out.println("Среднее время добавления в середину: " + (totalTimeAddMiddle / NUM_TESTS) + " нс");
        System.out.println("Среднее время поиска: " + (totalTimeSearch / NUM_TESTS) + " нс");
        System.out.println("Среднее время удаления с начала: " + (totalTimeRemove / NUM_TESTS) + " нс");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Тестирование ArrayList:");
        testListPerformance(arrayList);

        System.out.println("\nТестирование LinkedList:");
        testListPerformance(linkedList);
    }
}
