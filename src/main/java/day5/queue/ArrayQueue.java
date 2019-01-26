package day5.queue;

public class ArrayQueue {
    String[] stringArray = new String[10];
    int firstIndex = 0;
    int lastIndex = -1;
    public void peek(String s){
        if(lastIndex==stringArray.length-1){
            System.out.println("kolejka pełna");
            return;
        }
        stringArray[++lastIndex]=s;
    }
    public String pop(){
        if(firstIndex>lastIndex){
            System.out.println("kolejka pusta");
            return "";
        }
        return stringArray[firstIndex++];
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("pierwszy element");
        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());
        arrayQueue.peek("drugi element");
        arrayQueue.peek("trzeci element");

        System.out.println(arrayQueue.pop());
        System.out.println(arrayQueue.pop());




    }
}
