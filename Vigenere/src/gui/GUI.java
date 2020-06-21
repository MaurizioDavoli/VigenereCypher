package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.Operation;

public class GUI extends JFrame{

	private static final long serialVersionUID = 1L;
	
	JLabel label;
	JTextField textField;
	JTextField textField2;
	JPanel panel;
	JButton button;
	JPasswordField passwordField;
	JComboBox<String> opt;
	int command;
	Operation op;
	String toPrint;
	
	public GUI() {
		
		toPrint = "";
		
		op = new Operation();
		
		JFrame frame = new JFrame("Vigenere Cypher");
		
		panel = new JPanel();
		panel.setLayout(null);
		
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		label = new JLabel();
		label.setText("text :");
		label.setBounds(20, 5, 60, 50);
		panel.add(label);
		
		textField = new JTextField(20);
		textField.setBounds(75, 5, 400, 50);
		panel.add(textField);
		
		label = new JLabel();
		label.setText("verme :");
		label.setBounds(20 , 60, 60, 50);
		panel.add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(75 ,60 ,200 ,50 );
		panel.add(passwordField);
		
		String[] options = { "encrypt", "decript"};
		opt = new JComboBox<String>(options);
		opt.setSelectedIndex(0);
		opt.setBounds(280, 60, 100, 50);
		panel.add(opt);
		
		button = new JButton("DO!");
		button.setBounds(390, 60, 50, 50);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (button.isEnabled()) {
					 toPrint = op.doSomething((String)(opt.getSelectedItem()), 
							 textField.getText(),passwordField.getText());
					 
					 textField2.setText(toPrint);
				}
			}
		});
		panel.add(button);
		
		textField2 = new JTextField(20);
		textField2.setBounds(20, 115, 460, 50);
		textField2.setText(toPrint);
		panel.add(textField2);

		frame.setVisible(true);

	}

}
