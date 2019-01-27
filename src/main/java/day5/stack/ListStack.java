package day5.stack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStack {
    List<String> list = new ArrayList<>();
    int priorityIndex = -1;

    public void peek(String s, boolean priority) {
        list.add(s);
        if (priority) {
            priorityIndex = list.lastIndexOf(s);
        }
    }

    public String pop() {
        if (priorityIndex > -1) {
            String s = list.remove(priorityIndex);
            priorityIndex = -1;
            return s;
        }
        return list.remove(list.size() - 1);
    }


    public void aaaa( String ...a ){
        System.out.println("tablica");
    }
    public void aaaa(String a ){
        System.out.println("pojedynczy element");
    }
    public void aaaa( boolean ...a ){
        System.out.println("boolean");
    }
    public static void main(String[] args) {
        ListStack listStack = new ListStack();
//        listStack.peek("pierwszy element", false);
//        listStack.peek("drugi element", false);
//        listStack.peek("trzeci element priorytetowy", true);
//        listStack.peek("czwarty element", false);
//        listStack.peek("piąty element", false);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(listStack.pop());
//        }
        listStack.aaaa(true);
        listStack.aaaa("dd");
        listStack.aaaa("dd", "fdfsd");
    }
}
