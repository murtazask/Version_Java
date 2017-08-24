package version_control;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Version_Control_1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Login");
		frame.setLayout(null);
		JTextField user = new JTextField(10);
		JTextField pass = new JTextField(10);
		JLabel l = new JLabel("Username:");
		JLabel l2 = new JLabel("Password:");
		JButton button = new JButton("Login");
		JButton button1 = new JButton("Sign Up");
		user.setBounds(140, 100, 100, 20);
		pass.setBounds(140, 140, 100, 20);
		button.setBounds(50, 180, 100, 20);
		button1.setBounds(160, 180, 100, 20);
		l.setBounds(70, 100, 100, 20);
		l2.setBounds(70, 140, 100, 20);
		frame.add(user);
		frame.add(pass);
		frame.add(l);
		frame.add(l2);
		frame.add(button);
		frame.add(button1);
		
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 150);
		frame.setVisible(true);
	}

}
