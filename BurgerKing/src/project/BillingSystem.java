package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BillingSystem {

	private JFrame frame;
	private JTextField textOrderNo;
	private JTextField textTabelNo;
	private JTextField textChickenBurger;
	private JTextField textPhillyBurger;
	private JTextField textBBQBurger;
	private JTextField textDrinks;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSystem window = new BillingSystem();
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
	public BillingSystem() {
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(444, 80, 330, 454);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("Receipt");
		label.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(127, 11, 71, 21);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 40, 310, 2);
		panel.add(separator);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea.setBounds(10, 57, 310, 386);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(10, 80, 431, 454);
		frame.getContentPane().add(panel_1);
		
		JLabel label_1 = new JLabel("Order No");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(10, 11, 80, 31);
		panel_1.add(label_1);
		
		textOrderNo = new JTextField();
		textOrderNo.setHorizontalAlignment(SwingConstants.CENTER);
		textOrderNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		textOrderNo.setColumns(10);
		textOrderNo.setBounds(89, 12, 74, 29);
		panel_1.add(textOrderNo);
		
		JLabel label_2 = new JLabel("Table No");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(264, 11, 74, 31);
		panel_1.add(label_2);
		
		textTabelNo = new JTextField();
		textTabelNo.setHorizontalAlignment(SwingConstants.CENTER);
		textTabelNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		textTabelNo.setColumns(10);
		textTabelNo.setBounds(346, 11, 74, 29);
		panel_1.add(textTabelNo);
		
		JLabel label_3 = new JLabel("Item Names");
		label_3.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		label_3.setBounds(56, 53, 110, 39);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Item Quantity");
		label_4.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		label_4.setBounds(264, 53, 129, 39);
		panel_1.add(label_4);
		
		textChickenBurger = new JTextField();
		textChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
		textChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		textChickenBurger.setColumns(10);
		textChickenBurger.setBounds(264, 93, 74, 29);
		panel_1.add(textChickenBurger);
		
		textPhillyBurger = new JTextField();
		textPhillyBurger.setHorizontalAlignment(SwingConstants.CENTER);
		textPhillyBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		textPhillyBurger.setColumns(10);
		textPhillyBurger.setBounds(264, 127, 74, 29);
		panel_1.add(textPhillyBurger);
		
		textBBQBurger = new JTextField();
		textBBQBurger.setHorizontalAlignment(SwingConstants.CENTER);
		textBBQBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		textBBQBurger.setColumns(10);
		textBBQBurger.setBounds(264, 162, 74, 29);
		panel_1.add(textBBQBurger);
		
		JComboBox comboBoxDrink = new JComboBox();
		comboBoxDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Pepsi", "7up", "Fanta", "CocaCola"}));
		comboBoxDrink.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBoxDrink.setBackground(Color.ORANGE);
		comboBoxDrink.setBounds(41, 208, 135, 31);
		panel_1.add(comboBoxDrink);
		
		textDrinks = new JTextField();
		textDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		textDrinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		textDrinks.setColumns(10);
		textDrinks.setBounds(264, 210, 74, 29);
		panel_1.add(textDrinks);
		
		JButton button_1 = new JButton("Total");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				

				// double a,b,c,d,e,f,g,h,i,j;
				
				
				 try {
					double	a=Double.parseDouble(textOrderNo.getText());
					double	b=Double.parseDouble(textTabelNo.getText());
					double	c=Double.parseDouble(textChickenBurger.getText());
					double	d=Double.parseDouble(textPhillyBurger. getText());
					double	f=Double.parseDouble(textBBQBurger. getText());
					double	g=Double.parseDouble(textDrinks. getText());
						
					double h = 180*c;
					double i = 150*d;
					double j = 200*f;
					
					double k = 19*g;
					
					double l = h+i+j+k;
						
						
						
						
						
						
						
					textTotal.setText(Double.toString(l));
						
						
					} catch (Exception ef) { 
						
						
						JOptionPane.showMessageDialog(null, "Please Enter a Vaild Number");
					}	
				

				
				
				
				
				
				
				
				
				
			}
		});
		button_1.setForeground(new Color(255, 250, 250));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBackground(new Color(255, 165, 0));
		button_1.setBounds(41, 279, 135, 36);
		panel_1.add(button_1);
		
		textTotal = new JTextField();
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		textTotal.setColumns(10);
		textTotal.setBounds(264, 283, 110, 29);
		panel_1.add(textTotal);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(200, 265, 1, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 250, 410, 34);
		panel_1.add(separator_2);
		
		JButton button_2 = new JButton("Reset");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textOrderNo.setText(null);
				textTabelNo.setText(null);
				textChickenBurger.setText(null);
				textPhillyBurger.setText(null);
				textBBQBurger.setText(null);
				textDrinks.setText(null);
				textTotal.setText(null);
			    comboBoxDrink.setSelectedItem("Select a Drink");
			    textArea.setText(null);
			
			}
			
			
		});
		button_2.setForeground(new Color(255, 250, 250));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBackground(new Color(154, 205, 50));
		button_2.setBounds(10, 362, 107, 36);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			}
		});
		button_3.setForeground(new Color(255, 250, 250));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBackground(new Color(154, 205, 50));
		button_3.setBounds(313, 362, 107, 36);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Receipt");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String aa = textOrderNo.getText();
				String bb = textTabelNo.getText();
				String cc = textChickenBurger.getText();
				String dd = textPhillyBurger.getText();
				String ff = textBBQBurger.getText();
				String gg = textDrinks.getText();
				String hh = textTotal.getText();
				
				
				double	a=Double.parseDouble(textOrderNo.getText());
				double	b=Double.parseDouble(textTabelNo.getText());
				double	c=Double.parseDouble(textChickenBurger.getText());
				double	d=Double.parseDouble(textPhillyBurger. getText());
				double	f=Double.parseDouble(textBBQBurger. getText());
				double	g=Double.parseDouble(textDrinks. getText());
					
				double h = 180*c;
				double i = 150*d;
				double j = 200*f;
				
				double k = 19*g;
				
				double l = h+i+j+k;
					
				
				
				
				textArea.append("\t    Burger King®\n"
				   						
				   + "  House: 104, Road No. 11, Dhaka 1213\n\n"
				   
				   + "\nOrder No:"+aa+ "   "+"\t\tTabel No:"+bb+ 

					
				    
				    "\n\nItem Name\t"+"Quantity  "+"   Price "+
					
					
					
				  "\n\nChicken Burger"+"     "+cc+"         "+h+
					"\nPhilly Burger"+"      "+dd+"         "+i+
					"\nBBQ Burger"+"         "+ff+"         "+j+
					"\nDrinks"+"             "+gg+"         "+k+
					"\n  ----------------------------------- "+
					"\n       \t\t"+"Total" + "\t    " +  l+"Tk" +
					"\n\n\n\t\t\t Made by Dedar"
						
						);
			}
			
		});
		button_4.setForeground(new Color(255, 250, 250));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBackground(new Color(154, 205, 50));
		button_4.setBounds(168, 364, 98, 32);
		panel_1.add(button_4);
		
		JLabel lblChickenburger = new JLabel("Chicken Burger");
		lblChickenburger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChickenburger.setBounds(55, 92, 164, 31);
		panel_1.add(lblChickenburger);
		
		JLabel lblPhillyBurger = new JLabel("Philly Burger");
		lblPhillyBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhillyBurger.setBounds(56, 125, 164, 31);
		panel_1.add(lblPhillyBurger);
		
		JLabel lblBbqBurger = new JLabel("BBQ Burger");
		lblBbqBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBbqBurger.setBounds(56, 160, 164, 31);
		panel_1.add(lblBbqBurger);
		
		JLabel label_5 = new JLabel("Burger King\u00AE\r\n");
		label_5.setFont(new Font("Sitka Text", Font.BOLD, 35));
		label_5.setBounds(274, 11, 258, 61);
		frame.getContentPane().add(label_5);
	}

}
