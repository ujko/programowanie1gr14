package day5.internalClass;

import java.util.Arrays;

public class Test {
    public static int aa = 7;
    private static int bb = 12;
    public int cc = 17;
    private int dd = 18;

    public static class InternalStatic {
        public static int a = 7;
        private static int b = 12;
        public int c = 17;
        private int d = 18;

        public void method2() {
            Test test = new Test();
            Test.aa = 7;
            Test.bb = 12;
            test.cc = 11;
            test.dd = 666;
        }
    }

    public class InternalDynamic {
        // public static int a = 7;
        // private static int b = 12;
        public int c = 17;
        private int d = 18;

        public void method2() {
            Test test = new Test();
            Test.aa = 7;
            Test.bb = 12;
            test.cc = 11;
            test.dd = 666;
        }
    }

    public void method1() {
        InternalStatic test = new InternalStatic();
        InternalStatic.a = 15;
        InternalStatic.b = 7;
        test.c = 1;
        test.d = 3;
    }

    public void method2() {
        InternalDynamic test = new InternalDynamic();
        // InternalDynamic.a = 15;
        // InternalDynamic.b = 7;
        test.c = 1;
        test.d = 3;
    }

}
