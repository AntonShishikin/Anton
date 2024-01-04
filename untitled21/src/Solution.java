import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution<T, K, V> {
    private T t;
    private K k;
    private V v;

    public Solution(T t, K k, V v) {
        this.t = t;
        this.k = k;
        this.v = v;
    }

    // Вспомогательный метод для создания ArrayList
    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    // Вспомогательный метод для создания HashSet
    public static <T> Set<T> newHashSet() {
        return new HashSet<>();
    }

    // Вспомогательный метод для создания HashMap
    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap<>();
    }

    // Геттеры
    public T getT() {
        return t;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }

    // Сеттеры
    public void setT(T t) {
        this.t = t;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }
}
