package day3.threads;

public class CountNumbers implements Runnable {

    @Override
    public void run() {
        int end = 0;
        int i = 0;
        try {
            while (end < 20) {
                end++;
                i = (i + 1) % 10;
                System.out.print(i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwany Watek");
        }

    }
}
