package day3.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void method(int size) {
        Set<String> set = new TreeSet<>();
//        Set<String> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            String b = random.nextInt(12 ) + "Dom";
            set.add(b);
            System.out.print(b + " ");
        }
        System.out.println();
        set.forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        method(10);
    }
}
