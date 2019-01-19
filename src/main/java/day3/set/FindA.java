package day3.set;

import java.util.Set;
import java.util.TreeSet;

public class FindA {
    static public char method(String s) {
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            int size = set.size();
            char a = s.charAt(i);
            set.add(a);
            if (set.size() == size) {
                return a;
            }
        }
        return ' ';
    }

    public static char method2(String b) {
        int size = b.length();
        char[] a = b.toCharArray();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    return a[i];
                }
            }
        }
        return ' ';
    }

    public static char method3(String b) {
        int size = b.length();
        for (int i = 0; i < size; i++) {

            if (b.substring(i + 1).contains(b.charAt(i) + "")) {
                return b.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(method3("CABBACG"));
    }
}
