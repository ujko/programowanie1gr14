import javax.swing.*;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(1, 2));
        String a = JOptionPane.showInputDialog("Podaj liczbę 1" );
        String b = JOptionPane.showInputDialog("Podaj liczbę 2" );
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        JOptionPane.showMessageDialog(null, "Suma liczb " + calc.add(c,d));
    }
}