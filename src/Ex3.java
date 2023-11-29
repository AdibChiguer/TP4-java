import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Ex3 {
    
	JMenuItem New = new JMenuItem("New");
	JMenuItem Open = new JMenuItem("Open");
	JMenuItem Save = new JMenuItem("Save");
	JMenuItem Big = new JMenuItem("Big");
	JMenuItem Small = new JMenuItem("Small");
	//private JLabel label;
	private JTextArea textArea;

	public Ex3() {
        JFrame frame = new JFrame("menu");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("FIle");
        JMenu submenu = new JMenu("Property");
        MyActionListener listener = new MyActionListener();
        
        //label = new JLabel("null");
        textArea = new JTextArea("the log: ");
        textArea.setEditable(false);
        
        JPanel pane = new JPanel();
        //pane.add(label);
        pane.add(textArea);
        
        New.addActionListener(listener);
        Open.addActionListener(listener);
        Save.addActionListener(listener);
        Big.addActionListener(listener);
        Small.addActionListener(listener);
        
        menu.add(New);
        menu.add(Open);
        menu.add(Save);
        menu.add(new JSeparator());
        menu.add(submenu);
        
        submenu.add(Big);
        submenu.add(Small);
        
        menuBar.add(menu);
        
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(pane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == New) {
            	//label.setText("New Item clicked");
            	String text = textArea.getText();
            	textArea.setText(text + " --New");
            } else if (event.getSource() == Open) {
            	//label.setText("Open Item clicked");
            	String text = textArea.getText();
            	textArea.setText(text + " --Open");	
            } else if (event.getSource() == Save) {
            	//label.setText("Save Item clicked");
            	String text = textArea.getText();
            	textArea.setText(text + " --Save");
            } else if (event.getSource() == Big) {
            	//label.setText("Big Item clicked");
            	String text = textArea.getText();
            	textArea.setText(text + " --Big");
            } else if (event.getSource() == Small) {
            	//label.setText("Small Item clicked");
            	String text = textArea.getText();
            	textArea.setText(text + " --Small");
            }
        }
    }
    
    public static void main(String[] args) {
        new Ex3();
    }
}
