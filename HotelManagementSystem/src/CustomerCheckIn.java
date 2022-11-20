import java.awt.EventQueue;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.InsertUpdateDelete;
import project.Select;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class CustomerCheckIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	JComboBox comboBox_3;
	JComboBox comboBox_4 ;
	JComboBox comboBox_2;
	String bed;
	String roomType;
	String roomNo;
	String price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerCheckIn frame = new CustomerCheckIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerCheckIn() {
		
		setLocation(new Point(50, 118));
		setPreferredSize(new Dimension(1266, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1266, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer CheckIn");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 12));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\Customer Registration & Check IN.png"));
		lblNewLabel.setBounds(33, 36, 210, 67);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\close.png"));
		btnNewButton.setBounds(1009, 93, 25, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 166, 70, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(33, 202, 320, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(33, 239, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 278, 320, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nationality");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(33, 317, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(33, 355, 320, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(33, 400, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(33, 493, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(33, 529, 320, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBox.setBounds(33, 440, 320, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("ID Proof");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(449, 172, 95, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(449, 202, 226, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(449, 240, 49, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(449, 278, 226, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Check In Date(Today)");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(449, 318, 128, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(449, 355, 226, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Bed");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(749, 172, 49, 14);
		contentPane.add(lblNewLabel_9);
		
		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				roomDetails();
			}
		});
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Single", "Double", "Triple"}));
		comboBox_4.setBounds(749, 201, 226, 22);
		contentPane.add(comboBox_4);
		
		JLabel lblNewLabel_10 = new JLabel("Room Type");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(749, 240, 107, 14);
		contentPane.add(lblNewLabel_10);
		comboBox_3 = new JComboBox();
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_3.removeAllItems();
				textField_7.setText("");
				bed=(String)comboBox_4.getSelectedItem();
				roomType=(String)comboBox_2.getSelectedItem();
				try {
					System.out.print(bed+" "+roomType);
					ResultSet rs=Select.getData("select * from room where bed='"+bed+"' and roomType='"+roomType+"' and status='Not Booked'");
					while(rs.next())
					{
						comboBox_3.addItem(rs.getString(1));
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null,ex);
					
				}
				
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"AC", "Non-AC"}));
		comboBox_2.setBounds(749, 277, 226, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_11 = new JLabel("Room Number");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(749, 318, 107, 14);
		contentPane.add(lblNewLabel_11);
		
//		 comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roomNo=(String)comboBox_3.getSelectedItem();
				try {
					ResultSet rs=Select.getData("select * from room where roomNo='"+roomNo+"'");
					while(rs.next()) {
						textField_7.setText(rs.getString(4));
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		comboBox_3.setBounds(749, 354, 226, 22);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_12 = new JLabel("Price");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setBounds(749, 401, 49, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(749, 441, 226, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		textField_6.setEditable(false); 
		textField_7.setEditable(false);
		SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal=Calendar.getInstance();
		textField_6.setText(myFormat.format(cal.getTime()));
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new CustomerCheckIn().setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 64));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(749, 528, 145, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Allot Room");
		btnNewButton_2.setBackground(new Color(128, 0, 64));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=1;
				String name=textField.getText();
				String mobileNumber=textField_1.getText();
				String nationality=textField_2.getText();
				String gender=(String)comboBox.getSelectedItem();
				String email=textField_4.getText();
				String idProof=textField_3.getText();
				String address=textField_5.getText();
				String checkIN=textField_6.getText();
				String bed=(String)comboBox_4.getSelectedItem();
				String price=textField_7.getText();
				String query="select max(id) from customer";
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_4.getText().equals("")||textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Every Field is Required");
					return;
				}
				if(! (Pattern.matches("^[a-z A-Z]+$",textField.getText()))) {
					JOptionPane.showMessageDialog(null,"Name should contain only alphabets");
					return;
				}
				if(! (Pattern.matches("[6789]{1}[0-9]{9}",textField_1.getText()))) {
					JOptionPane.showMessageDialog(null,"Phone number should contain only 10 numbers");
					return;
				}
				if(! (Pattern.matches("^[a-z A-Z]+$",textField_2.getText()))) {
					JOptionPane.showMessageDialog(null,"Nationality should contain only alphabets");
					return;
				}
				if(! (Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",textField_4.getText()))) {
					JOptionPane.showMessageDialog(null,"Enter email correctly \nExample:example@gmail.com");
					return;
				}
				if(! (Pattern.matches("^[a-z A-Z 0-9]+$",textField_3.getText()))) {
					JOptionPane.showMessageDialog(null,"ID should contain only alphabets and numbers");
					return;
				}
				try {
					ResultSet rs=Select.getData(query);
					while(rs.next()) 
						id=rs.getInt(1);
					id=id+1;
					if(!price.equals("")) {
						query="update room set status='Booked' where roomNo='"+roomNo+"'";
						InsertUpdateDelete.setData(query, "");
						query="insert into customer(id,Name,mobileNumber,nationality,gender,email,idProof,address,checkIn,roomNo,bed,roomType,pricePerDay) values('"+id+"','"+name+"','"+mobileNumber+"','"+nationality+"','"+gender+"','"+email+"','"+idProof+"','"+address+"','"+checkIN+"','"+roomNo+"','"+bed+"','"+roomType+"','"+price+"')";
						InsertUpdateDelete.setData(query,"Customer Check In Successfully");
						setVisible(false);
						new CustomerCheckIn().setVisible(true);
					}
					
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null,ex);
					
				}
				
			}
			
		});
		btnNewButton_2.setBounds(749, 490, 145, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\all pages background.png"));
		lblNewLabel_13.setBounds(0, 0, 1266, 600);
		contentPane.add(lblNewLabel_13);
		
	}	
	
	public void roomDetails() {
		comboBox_3.removeAllItems();
		textField_7.setText("");
		bed=(String)comboBox_4.getSelectedItem();
		roomType=(String)comboBox_2.getSelectedItem();
		try {
			System.out.print(bed+" "+roomType);
			ResultSet rs=Select.getData("select * from room where bed='"+bed+"' and roomType='"+roomType+"' and status='Not Booked'");
			while(rs.next())
			{
				comboBox_3.addItem(rs.getString(1));
			}
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null,ex);
			
		}
		
		
		
	}
}