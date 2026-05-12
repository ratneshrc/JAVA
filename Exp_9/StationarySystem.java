import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StationarySystem extends JFrame implements ActionListener {
    JCheckBox cb1, cb2, cb3;
    JButton orderBtn;
    int notebookPrice = 50;
    int penPrice = 30;
    int pencilPrice = 10;
    StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(300, 250);
        setLayout(new FlowLayout());
        cb1 = new JCheckBox("Notebook @ 50");
        cb2 = new JCheckBox("Pen @ 30");
        cb3 = new JCheckBox("Pencil @ 10");
        orderBtn = new JButton("Order");
        orderBtn.addActionListener(this);
        add(cb1);
        add(cb2);
        add(cb3);
        add(orderBtn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String message = "";
        if (cb1.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter quantity for Notebook:");
            int q = Integer.parseInt(qty);
            int cost = q * notebookPrice;
            total += cost;
            message += "Notebook Quantity: " + q + " Total: " + cost + "\n";
        }
        if (cb2.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter quantity for Pen:");
            int q = Integer.parseInt(qty);
            int cost = q * penPrice;
            total += cost;
            message += "Pen Quantity: " + q + " Total: " + cost + "\n";
        }
        if (cb3.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter quantity for Pencil:");
            int q = Integer.parseInt(qty);
            int cost = q * pencilPrice;
            total += cost;
            message += "Pencil Quantity: " + q + " Total: " + cost + "\n";
        }
        message += "\nTotal Amount: " + total;
        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Successfully Ordered", "Alert", JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String[] args) {
        new StationarySystem();
    }
}
