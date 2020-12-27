package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BurgerKingMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurgerKingMenu window = new BurgerKingMenu();
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
	public BurgerKingMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Welcome to Burger King\u00AE Management System");
		label.setFont(new Font("Sitka Text", Font.BOLD, 21));
		label.setBounds(146, 10, 492, 70);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Update Information");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateInformation.main(null);
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Tahoma", Font.BOLD, 17));
		button.setBackground(new Color(154, 205, 50));
		button.setBounds(77, 155, 256, 82);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Billing Information");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 BillingInformation.main(null);
			}
		});
		button_1.setForeground(new Color(250, 240, 230));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_1.setBackground(new Color(154, 205, 50));
		button_1.setBounds(444, 155, 256, 82);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Employer Information");
		button_2.setForeground(new Color(255, 255, 240));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmployerInformation.main(null);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_2.setBackground(new Color(154, 205, 50));
		button_2.setBounds(77, 315, 256, 82);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Billing System");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BillingSystem.main(null);
			}
		});
		button_3.setForeground(new Color(255, 255, 240));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_3.setBackground(new Color(154, 205, 50));
		button_3.setBounds(444, 315, 256, 82);
		frame.getContentPane().add(button_3);
	}

}
