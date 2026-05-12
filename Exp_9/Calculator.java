import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
    JTextField tf;
    String operator;
    double num1, num2, result;
    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());
        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+",
                "C","√","x²","%"
        }; 
        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.matches("[0-9.]")) {
            tf.setText(tf.getText() + cmd);
        }
        else if (cmd.equals("C")) {
            tf.setText("");
        }
        else if (cmd.equals("√")) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText("" + Math.sqrt(num1));
        }
        else if (cmd.equals("x²")) {
            num1 = Double.parseDouble(tf.getText());
            tf.setText("" + (num1 * num1));
        }
        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
                case "%": result = num1 % num2; break;
            }

            tf.setText("" + result);
        }
        else {
            operator = cmd;
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
