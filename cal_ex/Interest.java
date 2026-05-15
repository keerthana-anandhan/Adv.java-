import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interest extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JLabel result;
    JButton btn;

    public Interest() {
        setTitle("Simple Interest");
        setSize(300, 250);
        setLayout(new FlowLayout());

        add(new JLabel("Principal:"));
        t1 = new JTextField(10);
        add(t1);

        add(new JLabel("Rate:"));
        t2 = new JTextField(10);
        add(t2);

        add(new JLabel("Time:"));
        t3 = new JTextField(10);
        add(t3);

        btn = new JButton("Calculate");
        add(btn);

        result = new JLabel("");
        add(result);

        btn.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double p = Double.parseDouble(t1.getText());
            double r = Double.parseDouble(t2.getText());
            double t = Double.parseDouble(t3.getText());

            double si = (p * r * t) / 100;

            result.setText("SI = " + si);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter numbers only!");
        }
    }

    public static void main(String[] args) {
        new Interest();
    }
}