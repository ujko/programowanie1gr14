package day5.recursion;

public class Main {

    public static void main(String[] args) {
        //System.out.println(recursiveSum(5,4));
//        System.out.println();
        System.out.println(silnia(5));
    }


    private static int recursiveSum(int a, int b) {
        if(b==0) {
            return a;
        }
        return recursiveSum(++a, --b) ;
    }

    private static int silnia(int a) {
        if(a == 0){
            return 1;
        }
        return silnia(a - 1) * a;
    }


}
