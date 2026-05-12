import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialSwing extends JFrame implements ActionListener {

    JTextField tf, result;
    JButton btn;

    FactorialSwing() {
        setTitle("Factorial");
        setSize(300, 200);
        setLayout(new FlowLayout());

        add(new JLabel("Enter Number:"));

        tf = new JTextField(10);
        add(tf);

        btn = new JButton("Find Factorial");
        add(btn);

        result = new JTextField(10);
        result.setEditable(false);
        add(result);

        btn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(tf.getText());
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            result.setText("" + fact);

        } catch (Exception ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new FactorialSwing();
    }
}
