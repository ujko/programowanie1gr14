package day3;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(){
            @Override
            public void writeSomething() {
                System.out.println("Cos innego");
                write();
            }



        };
        employee.writeSomething();
        employee.write();
    }
}
