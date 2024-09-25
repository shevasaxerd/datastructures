package models;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSet<T> {private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomSet() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        boolean found = contains(element);
        if (!found) {
            ensureCapacity();
            elements[size++] = element;
        } else {System.out.println("Element already exists!!!");}
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return (T) elements[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort((T[]) elements, 0, size, comparator);
    }

}