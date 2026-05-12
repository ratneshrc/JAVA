import javax.swing.*;
import java.awt.*;
public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("FlowLayout Demo");
        f.setSize(300, 200);
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        f.add(new JCheckBox("Java"));
        f.add(new JCheckBox("Python"));
        f.add(new JCheckBox("C++"));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
}
}
