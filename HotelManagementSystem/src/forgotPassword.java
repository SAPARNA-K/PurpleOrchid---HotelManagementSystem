import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import project.*;
import java.sql.*;
import javax.swing.JPasswordField;
public class forgotPassword extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgotPassword frame = new forgotPassword();
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
	public forgotPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1364, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                 Forgot Password ?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(568, 144, 292, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to close Application","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
				
			}
		});
//		String email;
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\close.png"));
		btnNewButton.setBounds(1232, 22, 28, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(413, 201, 49, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Security Question");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(413, 251, 112, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(413, 303, 49, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New Password");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(413, 362, 112, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(578, 199, 297, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check=0;
				String email;
				email=textField.getText();
				if(email.equals("")) {
					check=1;
					JOptionPane.showMessageDialog(null, "Email is Required");
				}
				else {
					ResultSet rs=Select.getData("select * from users where email='"+email+"'");
					try {
						if(rs.next()) {
							check=1;
							textField.setEditable(false);
							textField_1.setEditable(false);
							textField_1.setText(rs.getString(4));
						}
						
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, ex);
					}
				}
				if(check==0) {
					JOptionPane.showMessageDialog(null, "Incorrect Email");
				}
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 64));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(885, 201, 99, 23);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(578, 251, 297, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(578, 303, 297, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int check=0;
				String email=textField.getText();
				String securityQuestion=textField_1.getText();
				String answer=textField_2.getText();
				String newPassword=passwordField.getText();
				if(answer.equals("")||newPassword.equals("")) {
					check=1;
					JOptionPane.showMessageDialog(null, "All field is required");
				}
				else {
					ResultSet rs=Select.getData("select * from users where email='"+email+"' and securityQuestion='"+securityQuestion+"' and answer='"+answer+"'");
					try {
						if(rs.next()) {
							check=1;
							InsertUpdateDelete.setData("update users set password='"+newPassword+"' where email='"+email+"'","Password set successfully");
							setVisible(false);
							new forgotPassword().setVisible(true);
						}
					}
					catch(Exception ez) {
						JOptionPane.showMessageDialog(null, ez);
					}
				}
				if(check==0) {
					JOptionPane.showMessageDialog(null,"Incorrect answer");
				}
				
				
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 64));
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(578, 425, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Sign Up");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new signup().setVisible(true);
			}
			
		});
		btnNewButton_3.setBackground(new Color(128, 0, 64));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(677, 425, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Login");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new login().setVisible(true);
			}
		});
		btnNewButton_4.setBackground(new Color(128, 0, 64));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(786, 425, 89, 23);
		contentPane.add(btnNewButton_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(578, 360, 297, 29);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\forgot password.PNG"));
		lblNewLabel_5.setBounds(-90, -44, 1385, 727);
		contentPane.add(lblNewLabel_5);
	}

}
