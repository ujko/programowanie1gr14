package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mediana {

    public List mediana1(){
        Scanner scanner = new Scanner(System.in);
        String s="";
        List<Double> list = new ArrayList<>();
        do{
             s = scanner.nextLine();
             try{
                 double d =Double.parseDouble(s);
                 list.add(d);
             } catch (NumberFormatException e){
                 if(!s.equals("q")) {
                     System.out.println("nie wpisano liczby, wpisz jeszcze raz, albo q jeśli chcesz wyjść");
                 }
             }

        } while(!s.equals("q"));
        return list;
    }

    private double mediana(double... dable) {
        Arrays.sort(dable);
        int tbSize = dable.length;
        if(tbSize == 0) {
            throw new IllegalArgumentException("Metoda powinna posiadać min. 1 argument");
        }
        if (tbSize % 2 == 0) {
            return (dable[tbSize / 2 - 1] + dable[tbSize / 2]) / 2;
        }
        return (dable[tbSize / 2]);
    }

    public static void main(String[] args) {
        Mediana mediana = new Mediana();
      //  System.out.println("Mediana wynosi " + mediana.mediana(4, 2, 1, 3));
      //  System.out.println("Mediana wynosi " + mediana.mediana(3, 2, 1));
        System.out.println(mediana.mediana1());
    }
}
