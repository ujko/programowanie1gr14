package day4.testSwing;

import javax.swing.*;

public class MainSwingTest{

    public static void main(String[] args) {
        JFrame swingFrame = new JFrame();
        JButton swingButton = new JButton("Random text");
        swingButton.addActionListener(x -> System.out.println("Text"));
        swingFrame.add(swingButton);
        swingFrame.setName("Test name");
        swingFrame.setSize(500, 400);
        swingFrame.setTitle("New Title");
        swingFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        swingFrame.setVisible(true);
    }

}
