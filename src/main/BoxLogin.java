package main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoxLogin {

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				showGui();
			}
		});

	}

	public static void showGui() {
		JFrame frame = new JFrame("Box fake login layout.");
		frame.setSize(210, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel container = new JPanel();
		
		
		JPanel loginPanel = new JPanel();
		JLabel loginLabel = new JLabel("Login: ");
		BoxLayout bl = new BoxLayout(loginPanel, BoxLayout.Y_AXIS);
		//loginPanel.setMinimumSize(new Dimension(100, 100));
		
		loginPanel.setLayout(bl);

		loginPanel.add(loginLabel);
		JTextField user = new JTextField("user");
		user.setHorizontalAlignment(JTextField.LEFT);
		JTextField pass = new JTextField("password");
		user.setPreferredSize(new Dimension(180, 30));
		pass.setPreferredSize(new Dimension(180, 30));
		loginPanel.add(user);
		loginPanel.add(pass);
		container.add(loginPanel);

		JPanel buttonPanel = new JPanel();
		FlowLayout fl = new FlowLayout();
		fl.setHgap(10);
		fl.setVgap(90);
		buttonPanel.setLayout(fl);
		
		JButton login = new JButton("login");
		JButton register = new JButton("register");
		buttonPanel.add(login);
		buttonPanel.add(register);
		container.add(buttonPanel);
		frame.add(container);

		// add stuff to content pane
		// addComponentsToPane(frame.getContentPane());

		// display
		frame.setVisible(true);

	}

}
