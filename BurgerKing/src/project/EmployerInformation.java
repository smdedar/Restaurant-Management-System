package project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class EmployerInformation {

	private JFrame frame;
	private JTextField textEmployer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployerInformation window = new EmployerInformation();
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
	public EmployerInformation() {
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
		
		JLabel label = new JLabel("Burger King\u00AE");
		label.setFont(new Font("Sitka Text", Font.BOLD, 35));
		label.setBounds(260, 11, 266, 78);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Employer ID");
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(150, 124, 199, 56);
		frame.getContentPane().add(label_1);
		
		
		
		
		
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Employer = textEmployer.getText();
				if(Employer.contains("1001"))
				{
					DedarDetails.main(null);
				}
				else if(Employer.contains("1002"))
				{
					BipulDetails.main(null);
				}
				
                else {
					
					textEmployer.setText(null);
					
					
					JOptionPane.showMessageDialog(null, "Invlaid Employer ID");
				}
				
				
			}
		});
		btnEnter.setForeground(new Color(255, 250, 250));
		btnEnter.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnEnter.setBackground(new Color(255, 140, 0));
		btnEnter.setBounds(287, 223, 141, 49);
		frame.getContentPane().add(btnEnter);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BurgerKingMenu.main(null);
				
			}
		});
		btnPrevious.setForeground(new Color(255, 250, 250));
		btnPrevious.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnPrevious.setBackground(new Color(154, 205, 50));
		btnPrevious.setBounds(96, 436, 150, 49);
		frame.getContentPane().add(btnPrevious);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEmployer.setText(null);
			}
		});
		btnReset.setForeground(new Color(255, 250, 250));
		btnReset.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnReset.setBackground(new Color(154, 205, 50));
		btnReset.setBounds(317, 436, 141, 49);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 250, 250));
		btnExit.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnExit.setBackground(new Color(154, 205, 50));
		btnExit.setBounds(548, 436, 150, 49);
		frame.getContentPane().add(btnExit);
		
		textEmployer = new JTextField();
		textEmployer.setHorizontalAlignment(SwingConstants.CENTER);
		textEmployer.setFont(new Font("Sitka Heading", Font.BOLD, 25));
		textEmployer.setBounds(379, 129, 226, 50);
		frame.getContentPane().add(textEmployer);
		textEmployer.setColumns(10);
	}
}
