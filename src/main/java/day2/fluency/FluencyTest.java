package day2.fluency;

public class FluencyTest {

    public static void main(String[] args) {

        Settings settings = new Settings();
        settings.setSize(12)
        .setName("Times New Roman")
        .setColor("black")
        .setStyle("italic")
        .setFontFamily("Times");
        System.out.println(settings);
        settings.setName("Arial");
        System.out.println(settings);

    }
}
