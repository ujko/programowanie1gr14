import java.util.ArrayList;
import java.util.List;

public class TestMem {
    private List<String> s = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        boolean a = true;

        while (a) {
            new TestMem().s.add("Jakis string");
            Thread.sleep(20);
        }
        System.out.println(new TestMem().s);
    }
}
