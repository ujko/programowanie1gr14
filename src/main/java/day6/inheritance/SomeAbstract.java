package day6.inheritance;

public abstract class SomeAbstract {
    private int a = 1;

    public void writeSth() {
        System.out.println("write sth " + a);
    }

    abstract void abstractMethod();
}
