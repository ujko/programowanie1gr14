package day6.inheritance;

public class Animal implements Zoo {

   void metoda2 (){
       System.out.println("Bla,bla");
    }

    @Override
    public void writeSomething(String a) {
        System.out.println("Ta metoda " + a);
    }
}
