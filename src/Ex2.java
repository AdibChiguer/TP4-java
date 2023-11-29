import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex2 {
    private JLabel label;
    private JButton plus;
    private JButton moins;
    private int clickCount = 0;

    public Ex2() {
        JFrame frame = new JFrame("exemple");
        plus = new JButton("plus");
        moins = new JButton("moins");
        MyActionListener listener = new MyActionListener();
        plus.addActionListener(listener);
        moins.addActionListener(listener);
        label = new JLabel("0");
        JPanel pane = new JPanel();
        JPanel pane1 = new JPanel(); 

        pane1.setLayout(new BoxLayout(pane1, BoxLayout.X_AXIS));

        pane1.add(plus);
        pane1.add(moins);

        pane.add(pane1);
        pane.add(label, BorderLayout.EAST);

        frame.getContentPane().add(pane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == plus) {
                clickCount++;
                label.setText(String.valueOf(clickCount));
            } else if (event.getSource() == moins) {
                clickCount--;
                label.setText(String.valueOf(clickCount));
            }
        }
    }

    public static void main(String[] args) {
        new Ex2();
    }
}
