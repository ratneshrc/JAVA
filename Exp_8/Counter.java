import javax.swing.*;
import java.awt.event.*;

public class Counter {
    public static void main(String[] args) {

        JFrame f = new JFrame("Counter");
        JTextField t = new JTextField("0", 10);

        JButton up = new JButton("Up");
        JButton down = new JButton("Down");
        JButton reset = new JButton("Reset");

        f.setLayout(new java.awt.FlowLayout());

        up.addActionListener(e -> t.setText("" + (Integer.parseInt(t.getText()) + 1)));
        down.addActionListener(e -> t.setText("" + (Integer.parseInt(t.getText()) - 1)));
        reset.addActionListener(e -> t.setText("0"));

        f.add(t); f.add(up); f.add(down); f.add(reset);

        f.setSize(250,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
