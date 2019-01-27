package day6.inheritance;

public class Main {
    public static void main(String[] args) {
       /* Zoo animal = new Snake();
        animal.method("Gatunek ");
        animal.writeSomething("Imię");
//        ((Animal) animal).metoda2();

//        Zoo rr = ((a)-> System.out.println(a + "write something"));
//
//        rr.writeSomething("ddd");
//        rr.method("ddd");*/

        SomeAbstract someAbstract = new SomeAbstract() {
            @Override
            void abstractMethod() {
                System.out.println("override abstract method");
            }
        };

        someAbstract.abstractMethod();
        someAbstract.writeSth();
        
    }
}
