public class UniversalArray<T> {
    private T[] array;

    public UniversalArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElementAtIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + array.length);
        }
        return array[index];
    }
}
