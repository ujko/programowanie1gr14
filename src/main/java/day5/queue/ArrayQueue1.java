package day5.queue;

public class ArrayQueue1 {
    String[] stringArray = new String[10];

    int lastIndex = -1;
    public void peek(String s){
        if(lastIndex==stringArray.length-1){
            System.out.println("kolejka pełna");
            return;
        }
        stringArray[++lastIndex]=s;
    }
    public String pop(){
        if(lastIndex<0){
            System.out.println("kolejka pusta");
            return "";
        }
        String s=stringArray[0];
        for (int i = 0; i <= lastIndex; i++) {
           if(i<lastIndex) stringArray[i]=stringArray[i+1];

        }
        lastIndex--;
        return s;
    }

    public static void main(String[] args) {
        ArrayQueue1 arrayQueue = new ArrayQueue1();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("pierwszy element");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("drugi element");
        arrayQueue.peek("trzeci element");

        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        for (int i = 0; i <10 ; i++) {
            arrayQueue.peek("pierwszy element"+i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayQueue.pop());
        }




    }
}
