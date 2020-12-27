package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BillingInformation {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingInformation window = new BillingInformation();
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
	public BillingInformation() {
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
		
		JLabel label = new JLabel("Burger King\u00AE Billing Information");
		label.setFont(new Font("Sitka Text", Font.BOLD, 22));
		label.setBounds(204, -2, 381, 70);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Item Names");
		label_1.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		label_1.setBounds(204, 91, 110, 39);
		frame.getContentPane().add(label_1);
		
		JLabel lblItemPrice = new JLabel("Item Price");
		lblItemPrice.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblItemPrice.setBounds(490, 91, 95, 39);
		frame.getContentPane().add(lblItemPrice);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(189, 121, 125, 9);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(473, 121, 110, 9);
		frame.getContentPane().add(separator_1);
		
		JLabel lblBttry = new JLabel("Chicken Burger");
		lblBttry.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBttry.setBounds(199, 141, 158, 39);
		frame.getContentPane().add(lblBttry);
		
		JLabel lblTk = new JLabel("180.00 Tk");
		lblTk.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTk.setBounds(483, 141, 125, 39);
		frame.getContentPane().add(lblTk);
		
		JLabel lblPhillyBurger = new JLabel("Philly Burger");
		lblPhillyBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhillyBurger.setBounds(204, 170, 158, 39);
		frame.getContentPane().add(lblPhillyBurger);
		
		JLabel lblTk_1 = new JLabel("150.00 Tk");
		lblTk_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTk_1.setBounds(483, 170, 125, 39);
		frame.getContentPane().add(lblTk_1);
		
		JLabel lblBbqBurger = new JLabel("BBQ Burger");
		lblBbqBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBbqBurger.setBounds(199, 201, 158, 39);
		frame.getContentPane().add(lblBbqBurger);
		
		JLabel lblTk_2 = new JLabel("200.00 Tk");
		lblTk_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTk_2.setBounds(483, 201, 125, 39);
		frame.getContentPane().add(lblTk_2);
		
		JLabel lblDrinkNames = new JLabel("Drink Names");
		lblDrinkNames.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblDrinkNames.setBounds(204, 251, 125, 39);
		frame.getContentPane().add(lblDrinkNames);
		
		JLabel lblDrinkPrice = new JLabel("Drink Price");
		lblDrinkPrice.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblDrinkPrice.setBounds(490, 251, 95, 39);
		frame.getContentPane().add(lblDrinkPrice);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(189, 281, 140, 9);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(473, 281, 125, 9);
		frame.getContentPane().add(separator_3);
		
		JLabel lblPepsi = new JLabel("Pepsi");
		lblPepsi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPepsi.setBounds(204, 294, 158, 39);
		frame.getContentPane().add(lblPepsi);
		
		JLabel lblTk_3 = new JLabel("20.00 Tk");
		lblTk_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTk_3.setBounds(483, 294, 125, 39);
		frame.getContentPane().add(lblTk_3);
		
		JLabel lblup = new JLabel("7up");
		lblup.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblup.setBounds(204, 326, 158, 39);
		frame.getContentPane().add(lblup);
		
		JLabel lblTk_4 = new JLabel("18.00 Tk");
		lblTk_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTk_4.setBounds(483, 326, 125, 39);
		frame.getContentPane().add(lblTk_4);
		
		JLabel lblFanta = new JLabel("Fanta");
		lblFanta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFanta.setBounds(204, 357, 158, 39);
		frame.getContentPane().add(lblFanta);
		
		JLabel lblTk_5 = new JLabel("21.00 Tk");
		lblTk_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTk_5.setBounds(483, 357, 125, 39);
		frame.getContentPane().add(lblTk_5);
		
		JLabel lblCo = new JLabel("CocaCola");
		lblCo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCo.setBounds(204, 391, 158, 39);
		frame.getContentPane().add(lblCo);
		
		JLabel lblTk_6 = new JLabel("19.00 Tk");
		lblTk_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTk_6.setBounds(483, 391, 125, 39);
		frame.getContentPane().add(lblTk_6);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BurgerKingMenu.main(null);
			}
		});
		btnPrevious.setForeground(new Color(255, 250, 250));
		btnPrevious.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnPrevious.setBackground(new Color(154, 205, 50));
		btnPrevious.setBounds(106, 462, 150, 49);
		frame.getContentPane().add(btnPrevious);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 250, 250));
		btnExit.setFont(new Font("Sitka Text", Font.BOLD, 25));
		btnExit.setBackground(new Color(154, 205, 50));
		btnExit.setBounds(511, 462, 150, 49);
		frame.getContentPane().add(btnExit);
	}
}
