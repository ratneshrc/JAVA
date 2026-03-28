import javax.swing.*;

public class RadioDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Gender");
        
        JRadioButton m = new JRadioButton("Male");
        JRadioButton fe = new JRadioButton("Female");

        JButton b = new JButton("Submit");
        JLabel l = new JLabel();

        ButtonGroup bg = new ButtonGroup();
        bg.add(m); bg.add(fe);

        f.setLayout(new java.awt.FlowLayout());

        b.addActionListener(e -> {
            if (m.isSelected())
                l.setText("Selected: Male");
            else if (fe.isSelected())
                l.setText("Selected: Female");
        });

        f.add(m); f.add(fe); f.add(b); f.add(l);

        f.setSize(250,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
