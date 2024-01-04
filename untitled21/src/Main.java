import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Тестирование ArrayConverter
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        List<String> stringList = ArrayConverter.convertArrayToList(stringArray);
        System.out.println("Converted List from String Array: " + stringList);

        Integer[] integerArray = {1, 2, 3};
        List<Integer> integerList = ArrayConverter.convertArrayToList(integerArray);
        System.out.println("Converted List from Integer Array: " + integerList);

        // Тестирование UniversalArray
        UniversalArray<Integer> universalArray = new UniversalArray<>(new Integer[]{10, 20, 30});
        System.out.println("Element at index 1: " + universalArray.getElementAtIndex(1));

        // Тестирование DirectoryReader (замените "your_directory_path" на путь к реальной директории)
        List<String> files = DirectoryReader.getFirstFiveFiles("your_directory_path");
        System.out.println("First five files in directory: " + files);

        // Тестирование Solution и вспомогательных методов
        Solution<Integer, String, Double> solution = new Solution<>(123, "Key", 45.67);
        List<Integer> arrayList = Solution.newArrayList();
        Set<String> hashSet = Solution.newHashSet();
        Map<String, Double> hashMap = Solution.newHashMap();

        arrayList.add(100);
        hashSet.add("Hello");
        hashMap.put("Key1", 1.1);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("HashMap: " + hashMap);
    }
}
