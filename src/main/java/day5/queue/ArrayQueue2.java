package day5.queue;

public class ArrayQueue2 {
    String[] stringArray = new String[10];

    int lastIndex = -1;

    public void peek(String s) {
        if (lastIndex == stringArray.length - 1) {
            System.out.println("kolejka pełna");
            return;
        }
        stringArray[++lastIndex] = s;
    }

    public void peek(String s, boolean priorytet) {
        if (lastIndex == stringArray.length - 1) {
            System.out.println("kolejka pełna");
            return;
        }
        if (priorytet) {
            for (int i = lastIndex; i >=0; i--) {
                 stringArray[i+1] = stringArray[i];

            }

            stringArray[0] = s;
            lastIndex++;
        } else {
            stringArray[++lastIndex] = s;
        }
    }

    public String pop() {
        if (lastIndex < 0) {
            System.out.println("kolejka pusta");
            return "";
        }
        String s = stringArray[0];
        for (int i = 0; i <= lastIndex; i++) {
            if (i < lastIndex) stringArray[i] = stringArray[i + 1];

        }
        lastIndex--;
        return s;
    }

    public static void main(String[] args) {
        ArrayQueue2 arrayQueue = new ArrayQueue2();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("pierwszy element");
        arrayQueue.peek("inny element");

        arrayQueue.peek("drugi element",true);

        arrayQueue.peek("trzeci element");
        arrayQueue.peek("czwarty element");

        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());



    }
}
