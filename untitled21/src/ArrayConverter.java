import java.util.Arrays;
import java.util.List;

public class ArrayConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
