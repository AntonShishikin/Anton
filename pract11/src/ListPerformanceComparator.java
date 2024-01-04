import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceComparator {
    public void comparePerformance() {
        // ArrayList operations
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTimeArrayList = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endTimeArrayList = System.nanoTime();
        long durationArrayList = endTimeArrayList - startTimeArrayList;

        System.out.println("ArrayList operations time: " + durationArrayList + " nanoseconds");

        // LinkedList operations
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTimeLinkedList = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long endTimeLinkedList = System.nanoTime();
        long durationLinkedList = endTimeLinkedList - startTimeLinkedList;

        System.out.println("LinkedList operations time: " + durationLinkedList + " nanoseconds");
    }
}
