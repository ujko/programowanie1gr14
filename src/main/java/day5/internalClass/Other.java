package day5.internalClass;

public class Other {
    public void method() {
        Test.InternalStatic testInternal = new Test.InternalStatic();
        Test.InternalStatic.a = 15;
        //Test.InternalStatic.b = 12;
        testInternal.c = 12;
        //testInternal.d = 11;
    }

    public void method2() {
        Test test = new Test();
        Test.InternalDynamic intD = test.new InternalDynamic();
        intD.c = 111;
    }

}
