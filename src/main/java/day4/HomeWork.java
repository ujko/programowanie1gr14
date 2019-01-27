package day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork {
    Integer a = 0;
    final Object o = new Object();
    List<Integer> list = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    public void count(String name) {
        try {

            while (true) {
                synchronized (o) {
                    a++;
                    list.add(a);
                    set.add(a);
                    System.out.print(name + ":" + a + " ");
                    Thread.sleep(3);
                }
            }
        } catch (InterruptedException e) {
            System.err.println("Konieć wątku " + name);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HomeWork hm = new HomeWork();
        Thread t1 = new Thread(() -> hm.count("A"));
        Thread t2 = new Thread(() -> hm.count("B"));
        t1.start();
        t2.start();
        Thread.sleep(7000);
        t1.interrupt();
        t2.interrupt();
        t1.join();
        t2.join();
        System.out.println("Wielkość listy: " + hm.list.size());
        System.out.println("Wielkość seta: " + hm.set.size());
        System.out.println();
        System.out.println("Koniec programu");
    }
}
