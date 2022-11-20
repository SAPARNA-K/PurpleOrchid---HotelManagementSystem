import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Manage Room");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new manageRoom().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\manage room.png"));
		btnNewButton.setBounds(10, 11, 179, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Customer Check In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CustomerCheckIn().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		btnNewButton_1.setForeground(new Color(128, 0, 64));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\Customer Registration & Check IN.png"));
		btnNewButton_1.setBounds(255, 11, 221, 59);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Customer Check Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckCheckOut().setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(128, 0, 64));
		btnNewButton_2.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\Customer Check Out.png"));
		btnNewButton_2.setBounds(537, 11, 230, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Log Out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				int a=J
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to Logout","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					new login().setVisible(true);
				}
			}
			
		});
		btnNewButton_4.setForeground(new Color(128, 0, 64));
		btnNewButton_4.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\logout.png"));
		btnNewButton_4.setBounds(817, 11, 150, 59);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to close Application","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
			}
		});
		btnNewButton_5.setForeground(new Color(128, 0, 64));
		btnNewButton_5.setFont(new Font("Algerian", Font.BOLD, 12));
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\exit.png"));
		btnNewButton_5.setBounds(1022, 11, 121, 59);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\home.png"));
		lblNewLabel.setBounds(0, 0, 1293, 710);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(152, 29, 10, 10);
		contentPane.add(panel);
	}
}
