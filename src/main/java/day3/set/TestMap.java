package day3.set;

import java.util.*;

public class TestMap {
    Map<Integer, String> mapa = new TreeMap<>();

    public void generateMap(int size) {
        for (int i = 0; i < size; i++) {
            mapa.put(i, "String "+ i);
        }
    }
    public Set<Integer> getKeys(){
        return mapa.keySet();
    }
    public List<String> getValues() {
        return new ArrayList<>(mapa.values());
    }
    public void printMap() {
        for (Integer i:getKeys()) {
            System.out.println(i + " " + mapa.get(i));
        }
    }
    public void printMap1() {
        for (Map.Entry<Integer, String> print: mapa.entrySet()) {
            System.out.println(print.getKey() + " " + print.getValue());
        }
    }
    public void printMap2() {
        mapa.forEach((x,y)->System.out.println(x + " " + y));
//        System.out.println(mapa);
    }

    public void printMap3() {
       Map<Integer, String> mapa2 = new TreeMap(mapa){
           @Override
               public String toString() {
               return "jakiś string";
           }
       };
        System.out.println(mapa2);
    }

    public static void main(String[] args) {
        TestMap test = new TestMap();
        test.generateMap(10);
        test.mapa.put(4, "Nowy string");
        test.printMap3();
    }
}
