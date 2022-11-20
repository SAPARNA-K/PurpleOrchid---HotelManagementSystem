import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.util.regex.Pattern;
import project.InsertUpdateDelete;
public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox ;
	/**
	 * Launch the application.
	 */
//	@SuppressWarnings("unchecked")
//	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//		
//		
//	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\close.png"));
		btnNewButton_1.setBounds(1241, 11, 32, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to close Application","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("      Sign up");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(639, 154, 192, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(456, 208, 49, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(456, 256, 49, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(456, 302, 103, 37);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(625, 208, 339, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(625, 256, 339, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(625, 304, 339, 37);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Security Question");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(456, 352, 157, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Answer");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(456, 400, 132, 37);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"What is the name of your first pet?", "What was your first car?", "What elementary school did you attend?", "What is the name of the town where you were born?"}));
		comboBox.setBounds(625, 352, 339, 37);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(456, 448, 103, 37);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(625, 400, 339, 37);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(625, 448, 339, 37);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBackground(new Color(128, 0, 64));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String email=textField_1.getText();
				String password=passwordField.getText();
				String securityQuestion=(String)comboBox.getSelectedItem();
				String answer=textField_2.getText();
				String address=textField_3.getText();
				if(name.equals("")||email.equals("")||password.equals("")||answer.equals("")||address.equals("")) {
				     JOptionPane.showMessageDialog(null, "Every Field is Required");
				     return;
				    }
				    if(! (Pattern.matches("^[a-z A-Z]+$",name))) {
				     JOptionPane.showMessageDialog(null,"Name should contain only alphabets");
				     return;
				    }
				    if(! (Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",email))) {
				     JOptionPane.showMessageDialog(null,"Enter email correctly \nExample:example@gmail.com");
				     return;
				    }
				    if(! (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",password))) {
				     JOptionPane.showMessageDialog(null,"Password should contain alteast 8 characters (an uppercase letter, a lowercase letter, a special character, a number)");
				     return;
				    }
				    if(! (Pattern.matches("^[a-z A-Z]+$",answer))) {
				     JOptionPane.showMessageDialog(null,"Answer should contain only alphabets");
				     return;
				    }
				    String query;
				    query="insert into users values('"+name+"','"+email+"','"+password+"','"+securityQuestion+"','"+answer+"','"+address+"','false')";
				    InsertUpdateDelete.setData(query, "Registered succesfully");
				    setVisible(false);
				    new signup().setVisible(true);
				    
				   }
		});
		btnNewButton.setBounds(454, 506, 118, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new login().setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 64));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(635, 506, 103, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Forgot Password ?");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new forgotPassword().setVisible(true);
				
			}
		});
		btnNewButton_3.setBackground(new Color(128, 0, 64));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBounds(772, 506, 192, 37);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\signup.PNG"));
		lblNewLabel_7.setBounds(-108, 0, 1370, 734);
		contentPane.add(lblNewLabel_7);
		
		
		
		
		
	}
}
