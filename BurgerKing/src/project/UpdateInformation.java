package project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateInformation {

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateInformation window = new UpdateInformation();
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
	public UpdateInformation() {
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
		
		JLabel lblUpdateEmployerBurger = new JLabel("Update  Burger King\u00AE  Employer Data");
		lblUpdateEmployerBurger.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblUpdateEmployerBurger.setBounds(162, 11, 402, 59);
		frame.getContentPane().add(lblUpdateEmployerBurger);
		
		JLabel lblNewLabel = new JLabel("Full Name     :");
		lblNewLabel.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblNewLabel.setBounds(73, 81, 123, 37);
		frame.getContentPane().add(lblNewLabel);
		
		text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.BOLD, 16));
		text1.setBounds(230, 81, 382, 36);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address       :");
		lblAddress.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblAddress.setBounds(73, 145, 123, 37);
		frame.getContentPane().add(lblAddress);
		
		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.BOLD, 16));
		text2.setColumns(10);
		text2.setBounds(230, 145, 382, 36);
		frame.getContentPane().add(text2);
		
		JLabel lblEmail = new JLabel("Email           :");
		lblEmail.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblEmail.setBounds(73, 210, 123, 37);
		frame.getContentPane().add(lblEmail);
		
		text3 = new JTextField();
		text3.setFont(new Font("Tahoma", Font.BOLD, 16));
		text3.setColumns(10);
		text3.setBounds(230, 210, 382, 36);
		frame.getContentPane().add(text3);
		
		JLabel lblPhone = new JLabel("Phone          :");
		lblPhone.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblPhone.setBounds(73, 275, 130, 37);
		frame.getContentPane().add(lblPhone);
		
		text4 = new JTextField();
		text4.setFont(new Font("Tahoma", Font.BOLD, 16));
		text4.setColumns(10);
		text4.setBounds(230, 275, 382, 36);
		frame.getContentPane().add(text4);
		
		text5 = new JTextField();
		text5.setFont(new Font("Tahoma", Font.BOLD, 16));
		text5.setColumns(10);
		text5.setBounds(230, 334, 382, 36);
		frame.getContentPane().add(text5);
		
		JLabel lblEmployerId = new JLabel("Employer ID  :");
		lblEmployerId.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblEmployerId.setBounds(73, 333, 123, 37);
		frame.getContentPane().add(lblEmployerId);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Infomation Update Succesfully");
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				text4.setText(null);
				text5.setText(null);
			}
		});
		btnSubmit.setForeground(new Color(255, 250, 250));
		btnSubmit.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnSubmit.setBackground(new Color(255, 140, 0));
		btnSubmit.setBounds(290, 406, 124, 49);
		frame.getContentPane().add(btnSubmit);
		
		JButton button = new JButton("Previous");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BurgerKingMenu.main(null);
			}
		});
		button.setForeground(new Color(255, 250, 250));
		button.setFont(new Font("Sitka Text", Font.BOLD, 25));
		button.setBackground(new Color(154, 205, 50));
		button.setBounds(73, 489, 150, 49);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setForeground(new Color(255, 250, 250));
		button_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		button_1.setBackground(new Color(154, 205, 50));
		button_1.setBounds(481, 489, 150, 49);
		frame.getContentPane().add(button_1);
	}
}
