package Pertemuan15.Latihan2;

import javax.swing.JLabel;
import javax.swing.JFrame;

public class HelloWorldForm2 extends JFrame { 
    private JLabel label; 

    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Hello Dunia");

        add(label);
        setTitle("Program pertama");
        
        setSize(600, 300);
    }
}
