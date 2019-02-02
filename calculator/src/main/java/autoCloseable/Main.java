package autoCloseable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        try (Dog dog = new Dog()) {
//            System.out.println("Cialo metody main");
//            throw new Exception();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("pan-tadeusz.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
