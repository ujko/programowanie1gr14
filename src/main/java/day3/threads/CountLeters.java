package day3.threads;

public class CountLeters extends Thread {
    @Override
    public void run() {
        int end = 0;
        int i = 0;
        char a = 'A';
        try {
            while (end < 40) {
                end++;
                i = (i + 1) % 10;

                System.out.print((char) (i + a));
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwany Watek");
        }
    }
}
