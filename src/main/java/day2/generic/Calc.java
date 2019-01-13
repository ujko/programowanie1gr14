package day2.generic;

import java.math.BigDecimal;

public class Calc<T extends Number> {


    public Number add(T a, T b) {
        if (a instanceof Integer) {
            int c = a.intValue();
            int d = b.intValue();
            System.out.println("Intidżery");
            return (Integer) (c + d);
        }
        if (a instanceof BigDecimal) {
            System.out.println("Bigdecimale");
            return ((BigDecimal) a).add((BigDecimal) b);
        }
        return null;
    }

}
