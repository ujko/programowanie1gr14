package day2.generic;

import java.util.Arrays;

public class Lista<T> {

    private Object[] objects = new Object[0];

    public void addElement(T element) {

        Object[] temporaryTable = Arrays.copyOf(objects, objects.length + 1);
        temporaryTable[temporaryTable.length - 1] = element;
        objects = temporaryTable;
    }

    public T getElement(int index) {
        return (T) objects[index];
    }
}
