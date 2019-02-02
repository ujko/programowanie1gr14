package panTadeusz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CountWords {
    Map<String, Integer> map = new HashMap<>();

    public int getHero(String name) {
        return map.get(name);
    }

    public Map<String, Integer> rhymes() {
        Map<String, Integer> countRhymes = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("pan-tadeusz.txt"))) {
            int numberOfLetters = 3;
            String a = "   ";
            while (reader.ready()) {
                String[] line = reader.readLine().trim().split("[\\s,.!?;:*()_\\-«=»{}]+");
                if (line.length < 1) {
                    continue;
                }
                String last = line[line.length - 1].toLowerCase();
                if (last.length() < numberOfLetters) {
                    continue;
                }
                if (last.substring(last.length() - numberOfLetters).equals(a.substring(a.length() - numberOfLetters))) {
                    String key;
                    if (a.compareTo(last) < 0) {
                        key = a + "_" + last;
                    } else {
                        key = last + "_" + a;
                }
                    countRhymes.put(key, countRhymes.get(key) == null ? 1 : countRhymes.get(key) + 1);
                }
                a = last;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> endMap = new HashMap<>();

        for (Map.Entry<String, Integer> m : countRhymes.entrySet()) {
            if(m.getValue() > 1) {
                endMap.put(m.getKey(), m.getValue());
            }
        }
        System.out.println(endMap.size());
        return endMap;
    }

    public Map<String, Integer> method() {
        try (BufferedReader reader = new BufferedReader(new FileReader("pan-tadeusz.txt"))) {
            int numberOfLetters = 3;
            while (reader.ready()) {
                String[] line = reader.readLine().trim().split("[\\s,.!?;:*()_\\-«=»{}]+");
                for (String s : line) {
                    if (s.length() > numberOfLetters) {
                        s = s.toLowerCase();
                        map.put(s, map.get(s) == null ? 1 : map.get(s) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, (x, y) -> y - x);
        int numberOfMostPopular = 5;
        Map<String, Integer> result = new HashMap<>();
        int countOfUniqueWords = 0;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                countOfUniqueWords++;
            }
        }
        System.out.println("Liczba slow wystepujacych jeden raz to " + countOfUniqueWords);
        for (int i = 0; i < numberOfMostPopular; i++) {
            for (String s : map.keySet()) {
                if (map.get(s) == values.get(i)) {
                    result.put(s, values.get(i));
                    if (result.size() >= numberOfMostPopular) {
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountWords countWords = new CountWords();
//        System.out.println(countWords.method());
//        int res = countWords.getHero("tadeusz");
//        System.out.println("Tadeusz wystapil " + res + " razy");
        Map<String, Integer> mapa = countWords.rhymes();
        int a = mapa.values().stream().collect(Collectors.maxBy((x, y) -> x - y)).get();
        System.out.println(a);
        for (Map.Entry<String, Integer> m : mapa.entrySet()) {
            if(m.getValue() == a) {
                System.out.println(m.getKey() + " : " + m.getValue());
            }
        }

    }
}
