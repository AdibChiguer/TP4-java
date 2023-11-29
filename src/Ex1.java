import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1 {
    private JLabel label;
    private int clickCount = 0;

    public Ex1() {
        JFrame frame = new JFrame("exemple");
        JButton button = new JButton("clic clic");
        button.addActionListener(new MyActionListener());
        label = new JLabel("0");
        JPanel pane = new JPanel();
        pane.add(button);
        pane.add(label);
        frame.getContentPane().add(pane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            clickCount++;
            label.setText(String.valueOf(clickCount));
        }
    }

    public static void main(String[] args) {
        new Ex1();
    }
}
