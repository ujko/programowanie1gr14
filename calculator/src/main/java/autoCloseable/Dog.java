package autoCloseable;

public class Dog implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Zamykam psa");
    }
}
