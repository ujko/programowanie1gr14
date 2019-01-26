package day5.computationalComplexity;

public class Main {

    public static void main(String[] args) {
        cc(10);
    }

    private static void cc(int n) {
        System.out.println("logarytmiczna O(log n):           " + ((int) (Math.log(n))));
        System.out.println("liniowa O(n):                     " + (n));
        System.out.println("liniowo-logarytmiczna O(nlog n):  " + (int) (n * (Math.log(n))));
        System.out.println("kwadratowa O(n^2):                " + (Math.pow(n, 2)));
        System.out.println("sześcienna O(n^3):                " + (Math.pow(n, 3)));
        System.out.println("wykładnicza O(2^n):               " + (Math.pow(2, n)));
        System.out.println("silnia O(n!):                     " + (silnia(n)));

    }

    private static int silnia(int n) {
        if (n == 0) {
            return 1;
        }
        return n * silnia(n - 1);
    }
}
