package day3.wildCard;

public class WildCardTest {

    class Family<T> {}

    interface GrandFather {}
    interface Father extends  GrandFather {}
    interface Son extends Father {}

    void add1(Family<?> family) {}
    void add2(Family<? extends Father> family) {}
    void add3(Family<? super Father> family) {}

    public void test() {
        add1(new Family<GrandFather>());
        add1(new Family<Father>());
        add1(new Family<Son>());
//        add2(new Family<GrandFather>());      // extends - tylko poniżej klasy badowej
        add2(new Family<Father>());
        add2(new Family<Son>());
        add3(new Family<GrandFather>());
        add3(new Family<Father>());
//        add3(new Family<Son>());          // super - tylko powyżej klasy bazowej
    }


}
