package day3.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest2 {
    static int a = 0;
    static boolean d = true;
    List<Integer> elementList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        Thread t1 = new Thread( "W1"){
            @Override
            public void run() {
//                super.run();
                System.out.print(this.getName());
                method();

            }
        };
        Thread t2 = new Thread( "W2"){
            @Override
            public void run() {
//                super.run();
                System.out.println(this.getName());
                method();

            }
        };
        t1.start();
        t2.start();
        Thread.sleep(10000);
        System.out.println("End");
    }

    public synchronized static void method() {

        try {
            while (d) {
                a++;
                System.out.print(a + " ");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void addElement (int a){
        System.out.println("Początek");
        synchronized (elementList) {
            elementList.add(a);
        }
        System.out.println("Koniec");

    }
}

