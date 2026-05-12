import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GridLayoutDemo extends JFrame implements ActionListener {
    JButton buttons[] = new JButton[6];
    JButton first = null;
    GridLayoutDemo() {
    setTitle("Grid Layout");
        setSize(300, 200);
        setLayout(new GridLayout(2, 3));
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton("" + (i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
}
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (first == null) {
            first = clicked;
        } else {
            String temp = first.getText();
            first.setText(clicked.getText());
            clicked.setText(temp);
            first = null;
}
}
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
