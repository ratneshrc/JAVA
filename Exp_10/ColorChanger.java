import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChanger extends JFrame implements ActionListener {
    JButton button;
    ColorChanger() {
        setTitle("Color Changer");
        setSize(300, 200);
        button = new JButton("Change Color");
        button.addActionListener(this);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(this, "Select Color", getContentPane().getBackground());
        if (color != null) {
            getContentPane().setBackground(color);
}
}
    public static void main(String[] args) {
        new ColorChanger();
}
}
