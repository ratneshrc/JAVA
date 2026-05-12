import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TimerApp extends JFrame implements ActionListener {
    JLabel label;
    JButton start, stop;
    Timer timer;
    int count = 0;
    TimerApp() {
        setTitle("Timer");
        setSize(300, 200);
        setLayout(new FlowLayout());
        label = new JLabel("0");
        start = new JButton("Start");
        stop = new JButton("Stop");
        add(label);
        add(start);
        add(stop);
        timer = new Timer(1000, this);
        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("" + count);
}
    public static void main(String[] args) {
        new TimerApp();
}
}
