package day3.test;

public class Test {

    public static void main(String[] args) {
        Car c = Car.INSTANCE;
        Car d = Car.INSTANCE;

        c.setS("Cos tam");

        System.out.println(d.getS());
    }
}
