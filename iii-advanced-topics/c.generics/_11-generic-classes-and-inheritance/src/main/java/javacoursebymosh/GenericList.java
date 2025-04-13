package javacoursebymosh;

import java.lang.reflect.Array;

public class GenericList<T extends User> {
    private final T[] items;
    private int count;

    @SuppressWarnings("unchecked")
    public GenericList(Class<T> clazz, int size) {
        items = (T[]) Array.newInstance(clazz, size);
    }

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
