package day1.sorting;

import java.util.ArrayList;
import java.util.List;

public class ListCreat {
    public static List<Car> getCars(){
         List<Car> list = new ArrayList<>();
        list.add(new Car("black", "i8", 265, 120000, "BMW"));
        list.add(new Car("yellow", "A4", 235, 145000, "AUDI"));
        list.add(new Car("red", "T5", 288, 110000, "VOLKSWAGEN"));
        list.add(new Car("green", "X6", 320, 99000, "BMW"));
        list.add(new Car("white", "M3", 240, 135000, "BMW"));
        list.add(new Car("yellow", "M3", 240, 135000, "BMW"));

        return list;
    }
}
