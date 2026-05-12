import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImageComboBox extends JFrame implements ItemListener {
    JComboBox<String> combo;
    JLabel label;
    ImageIcon img1 = new ImageIcon("img1.jpg");
    ImageIcon img2 = new ImageIcon("img2.jpg");
    ImageComboBox() {
        setTitle("Image Viewer");
        setSize(300, 300);
        setLayout(new FlowLayout());
        String items[] = {"Image1", "Image2"};
        combo = new JComboBox<>(items);
        label = new JLabel();
        combo.addItemListener(this);
        add(combo);
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
    public void itemStateChanged(ItemEvent e) {
        if (combo.getSelectedIndex() == 0)
            label.setIcon(img1);
        else
            label.setIcon(img2);
}
    public static void main(String[] args) {
        new ImageComboBox();
}
}
