package day5.stack;


import java.util.Arrays;

public class ArrayStack {
    String[] stringArray = new String[100];
    int lastIndex = -1;

    public void peek(String s) {
        if (lastIndex == stringArray.length - 1) {

            String[] temp = Arrays.copyOf(stringArray, stringArray.length + 1);

            stringArray = temp;
        }
        stringArray[++lastIndex] = s;
    }

    public String pop() {
        if (lastIndex < 0) {
            System.out.println("stos jest pusty");
            return "";
        }
        return stringArray[lastIndex--];
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        //System.out.print(arrayStack.pop()+" ");
        for (int i = 0; i < 102; i++) {
            arrayStack.peek("string" + i);

        }
        for (int i = 0; i < 102; i++) {
            System.out.print(arrayStack.pop() + " ");
        }
    }
}
