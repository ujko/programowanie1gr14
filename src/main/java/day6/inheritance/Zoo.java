package day6.inheritance;

public interface Zoo {
  void  writeSomething(String a);
  default void method(String a){
      System.out.println("Cos tam " + a);

  }



}
