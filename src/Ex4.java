import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex4 {
    public static void main(String[] args) {
            MWindow mainWindow = new MWindow();
            mainWindow.setVisible(true);
    }
}

class MWindow extends JFrame {
    private JTextArea textArea;
    private JButton sendBtn;

    public MWindow() {
        setTitle("fenetre principale");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        sendBtn = new JButton("Envoyer");

        sendBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                new SWindow(text);
                textArea.setText("");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        panel.add(sendBtn, BorderLayout.SOUTH);

        getContentPane().add(panel);
        setSize(400, 300);
        setLocation(0, 0);
    }
}

class SWindow extends JWindow {
    private JTextArea displayTextArea;

    public SWindow(String textShow) {
        setLayout(new BorderLayout());

        displayTextArea = new JTextArea(textShow);
        displayTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayTextArea);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        getContentPane().add(panel);
        setSize(200, 200);
        setLocation(400, 0);
        setVisible(true);
    }
}
