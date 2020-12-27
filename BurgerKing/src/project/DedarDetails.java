package project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DedarDetails {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DedarDetails window = new DedarDetails();
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
	public DedarDetails() {
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
		
		JLabel lblFullName = new JLabel("Full Name     : ");
		lblFullName.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblFullName.setBounds(115, 97, 123, 37);
		frame.getContentPane().add(lblFullName);
		
		JLabel lblAddress = new JLabel("Address       \t:");
		lblAddress.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblAddress.setBounds(115, 144, 123, 37);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblEmail = new JLabel("Email          :");
		lblEmail.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblEmail.setBounds(115, 187, 123, 37);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone          :");
		lblPhone.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblPhone.setBounds(115, 236, 130, 37);
		frame.getContentPane().add(lblPhone);
		
		JLabel label_4 = new JLabel("Employer ID  :");
		label_4.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		label_4.setBounds(115, 280, 123, 37);
		frame.getContentPane().add(label_4);
		
		JLabel lblSmDedarAlam = new JLabel("S.M. Dedar Alam");
		lblSmDedarAlam.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblSmDedarAlam.setBounds(269, 97, 388, 37);
		frame.getContentPane().add(lblSmDedarAlam);
		
		JLabel lblRoadNohouse = new JLabel("Road No- 5,House No-B/16,Uttar Badda.");
		lblRoadNohouse.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblRoadNohouse.setBounds(269, 144, 388, 37);
		frame.getContentPane().add(lblRoadNohouse);
		
		JLabel lblThededargmailcom = new JLabel("thededar@gmail.com");
		lblThededargmailcom.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblThededargmailcom.setBounds(269, 187, 388, 37);
		frame.getContentPane().add(lblThededargmailcom);
		
		JLabel label_5 = new JLabel("01632316121");
		label_5.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		label_5.setBounds(269, 236, 388, 37);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("1001");
		label_6.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		label_6.setBounds(269, 280, 388, 37);
		frame.getContentPane().add(label_6);
		
		JLabel lblBurgerKingEmployer = new JLabel("  Burger King\u00AE  Employer Data");
		lblBurgerKingEmployer.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblBurgerKingEmployer.setBounds(208, 11, 402, 59);
		frame.getContentPane().add(lblBurgerKingEmployer);
		
		JLabel lblJoinedDate = new JLabel("Joined Date   :");
		lblJoinedDate.setFont(new Font("Siyam Rupali", Font.BOLD, 15));
		lblJoinedDate.setBounds(115, 328, 123, 37);
		frame.getContentPane().add(lblJoinedDate);
		
		JLabel lblthNovember = new JLabel("10th November 2017");
		lblthNovember.setFont(new Font("Siyam Rupali", Font.PLAIN, 15));
		lblthNovember.setBounds(269, 328, 388, 37);
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
		button.setBounds(115, 465, 150, 49);
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
		button_1.setBounds(507, 465, 150, 49);
		frame.getContentPane().add(button_1);
	}

}
