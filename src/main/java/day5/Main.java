package day5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void addElement(List<String> list) {
        list.add("Element");
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> l = new ArrayList<>();
        l.add("Old element");
        addElement(l);
        System.out.println(l);
    }
}
