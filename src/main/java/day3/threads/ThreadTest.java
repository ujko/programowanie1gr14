package day3.threads;

import day1.sorting.Car;

import java.util.List;

public class ThreadTest {
     static boolean dd = true;


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
//        new Thread( new CountNumbers()).start();
//        new CountLeters().start();
//        new Thread(() -> countLetters()).start();
//        Thread t = new Thread(){
//            @Override
//            public void run() {
//                countLetters();
//            }
//        };
//        t.start();
//        Thread t1 = new Thread( new CountNumbers());
//        Thread t2 = new CountLeters();
//        t1.start();
//        t2.start();
//        Thread.sleep(3000);
//        t1.interrupt();
//        t1.join();
//        t2.join();

        new Thread(() -> countLetters()).start();
        Thread.sleep(3000);
        dd = false;
        System.out.println(" End");
    }

    static void countLetters() {
        int i = 0;
        char a = 'A';
        try {
            while (dd) {
                i = (i + 1) % 10;
                System.out.print((char) (i + a));
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwany Watek");
        }
    }
}
