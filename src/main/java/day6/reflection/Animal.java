package day6.reflection;

public class Animal {

    @RunIt
    public static void staticMethod() {
        System.out.println("wywołanie metody statycznej");
    }

    public Animal() {
        System.out.println("konstruktor");
    }

    @RunIt(name = "dog")
    public void method1() {
        System.out.println("wywołanie methody1");
    }

    @RunIt
    public void method2() {
        System.out.println("wywołanie methody2");
    }

    public void method3() {
        System.out.println("wywołanie methody3");
    }

    public void method4() {
        System.out.println("wywołanie methody4");
    }

    public void method5() {
        System.out.println("wywołanie methody5");
    }
}