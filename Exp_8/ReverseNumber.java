import javax.swing.*;

public class ReverseNumber {
    public static void main(String[] args) {

        JFrame f = new JFrame("Reverse Number");
        JTextField t = new JTextField(10);
        JButton b = new JButton("Reverse");
        JLabel l = new JLabel();

        f.setLayout(new java.awt.FlowLayout());

        b.addActionListener(e -> {
            String num = t.getText();
            String rev = new StringBuilder(num).reverse().toString();
            l.setText("Reverse: " + rev);
        });

        f.add(t); f.add(b); f.add(l);

        f.setSize(300,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
