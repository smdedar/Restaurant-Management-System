package project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BipulDetails {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BipulDetails window = new BipulDetails();
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
	public BipulDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("  Burger King\u00AE  Employer Data");
		label.setBackground(Color.WHITE);
		label.setFont(new Font("Sitka Text", Font.BOLD, 20));
		label.setBounds(203, 11, 402, 59);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Full Name     : ");
		label_1.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		label_1.setBounds(124, 92, 123, 37);
		frame.getContentPane().add(label_1);
		
		JLabel lblKmHasanBipul = new JLabel("K.M. Hasan Bipul");
		lblKmHasanBipul.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblKmHasanBipul.setBounds(279, 92, 388, 37);
		frame.getContentPane().add(lblKmHasanBipul);
		
		JLabel label_2 = new JLabel("Address       \t:");
		label_2.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		label_2.setBounds(124, 140, 123, 37);
		frame.getContentPane().add(label_2);
		
		JLabel lblRoadNohouse = new JLabel("Road No- 5,House No-B/16,Mirpur- 10.");
		lblRoadNohouse.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblRoadNohouse.setBounds(279, 135, 388, 37);
		frame.getContentPane().add(lblRoadNohouse);
		
		JLabel label_3 = new JLabel("Email          :");
		label_3.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		label_3.setBounds(124, 179, 123, 37);
		frame.getContentPane().add(label_3);
		
		JLabel lblKmhbipulgmailcom = new JLabel("kmhbipul@gmail.com");
		lblKmhbipulgmailcom.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblKmhbipulgmailcom.setBounds(279, 179, 388, 37);
		frame.getContentPane().add(lblKmhbipulgmailcom);
		
		JLabel label_4 = new JLabel("Phone          :");
		label_4.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		label_4.setBounds(124, 225, 130, 37);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("01634786121");
		label_5.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		label_5.setBounds(279, 225, 388, 37);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Employer ID  :");
		label_6.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		label_6.setBounds(124, 273, 123, 37);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("1002");
		label_7.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		label_7.setBounds(279, 273, 388, 37);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Joined Date   :");
		label_8.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		label_8.setBounds(124, 321, 123, 37);
		frame.getContentPane().add(label_8);
		
		JLabel lblthNovember = new JLabel("15th November 2017");
		lblthNovember.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblthNovember.setBounds(279, 321, 388, 37);
		frame.getContentPane().add(lblthNovember);
		
		JButton button = new JButton("Previous");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployerInformation.main(null);
			}
		});
		button.setForeground(new Color(255, 250, 250));
		button.setFont(new Font("Sitka Text", Font.BOLD, 25));
		button.setBackground(new Color(154, 205, 50));
		button.setBounds(124, 461, 150, 49);
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
		button_1.setBounds(517, 461, 150, 49);
		frame.getContentPane().add(button_1);
	}
}
