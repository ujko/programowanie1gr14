package day5.sorting;

import java.util.Arrays;

public class BubbleSort {

    static int[] tablica = {9, 2, 8, 4, 3, 7, 1};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tablica));
        bubbleSort();
        System.out.println("**************");
        System.out.println(Arrays.toString(tablica));
    }
    private static void bubbleSort() {
        int t = tablica.length;
        for (int i = 0; i < t-1; i++) {
            for (int j = 0; j < t - 1 - i; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int k = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = k;
                }
                System.out.print(j + ",");
            }
            System.out.println();
            System.out.println(Arrays.toString(tablica));
        }
    }
}


