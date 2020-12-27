package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BurgerKingLogIn {

	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurgerKingLogIn window = new BurgerKingLogIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BurgerKingLogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Burger King\u00AE");
		label.setFont(new Font("Sitka Text", Font.BOLD, 35));
		label.setBounds(263, 11, 266, 78);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Username");
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(225, 136, 138, 56);
		frame.getContentPane().add(label_1);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textUsername.setColumns(10);
		textUsername.setBounds(403, 141, 157, 40);
		frame.getContentPane().add(textUsername);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(225, 209, 138, 56);
		frame.getContentPane().add(label_2);
		
		textPassword = new JPasswordField();
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textPassword.setBounds(403, 214, 157, 40);
		frame.getContentPane().add(textPassword);
		
		JButton btnLogIn = new JButton("LogIn");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = textPassword.getText();
				String username = textUsername.getText();
				
				if(password.contains("admin") && username.contains("admin"))
				{
					BurgerKingMenu.main(null);
					frame.dispose();
					
				}
				
				else {
					
					textUsername.setText(null);
					textPassword.setText(null);
					
					JOptionPane.showMessageDialog(null, "Invlaid Username or Password");
				}
			}
			
		});
		btnLogIn.setForeground(new Color(255, 250, 250));
		btnLogIn.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnLogIn.setBackground(new Color(255, 140, 0));
		btnLogIn.setBounds(322, 276, 124, 49);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textUsername.setText(null);
				textPassword.setText(null);
			}
		});
		btnReset.setForeground(new Color(255, 250, 250));
		btnReset.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnReset.setBackground(new Color(154, 205, 50));
		btnReset.setBounds(135, 444, 124, 49);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 250, 250));
		btnExit.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnExit.setBackground(new Color(154, 205, 50));
		btnExit.setBounds(513, 444, 124, 49);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\Project Java  Fall-2017\\Source Image\\39192126-burger-wallpapers.jpeg"));
		lblNewLabel.setBounds(0, 0, 1101, 597);
		frame.getContentPane().add(lblNewLabel);
	}
}
