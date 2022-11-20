import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//import com.sun.org.apache.bcel.internal.generic.FADD;

import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import project.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import project.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class adminHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminHome frame = new adminHome();
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
	public adminHome() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				ResultSet rs=Select.getData("select * from users");
				DefaultTableModel model=(DefaultTableModel)table_1.getModel();
				model.setRowCount(0);
				try {
					while(rs.next()) {
						model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(6),rs.getString(7)});
					}
					rs.close();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 718);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin !");
		lblNewLabel.setBounds(29, 41, 512, 132);
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 48));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("     LOGOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to Logout","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					new login().setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(658, 66, 186, 83);
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\logout.png"));
		btnNewButton.setFont(new Font("Algerian", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("    EXIT");
		btnNewButton_1.setBounds(900, 66, 163, 83);
		btnNewButton_1.setForeground(new Color(128, 0, 64));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\exit.png"));
		btnNewButton_1.setFont(new Font("Algerian", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to close Application","select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
			}
		});
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Search By Name Or Email");
		lblNewLabel_1.setBounds(289, 249, 201, 29);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(465, 246, 296, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameorEmail=textField.getText();
				
				ResultSet rs=Select.getData("select * from users where name like '%"+nameorEmail+"%'or email like '%"+nameorEmail+"%'");
				DefaultTableModel model=(DefaultTableModel)table_1.getModel();
				model.setRowCount(0);
				try {
					while(rs.next()) {
						model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(6),rs.getString(7)});
					}
					rs.close();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
			
		});
		btnNewButton_2.setBounds(812, 248, 89, 31);
		btnNewButton_2.setBackground(new Color(128, 0, 64));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new adminHome().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(1112, 248, 89, 31);
		btnNewButton_3.setBackground(new Color(128, 0, 64));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(733, 377, -421, 183);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
			
		});
		scrollPane_1.setBounds(65, 354, 1136, 302);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index=table_1.getSelectedRow();
				TableModel model=table_1.getModel();
				String email=model.getValueAt(index, 1).toString();
				String status=model.getValueAt(index, 4).toString();
				if(status.equals("true"))
					status="false";
				else
					status="true";
				try {
					int a=JOptionPane.showConfirmDialog(null, "Do you really want to change the status of "+email+"","Select",JOptionPane.YES_NO_OPTION);
					if(a==0) {
						InsertUpdateDelete.setData("update users set status='"+status+"' where email='"+email+"'","Status Changed Successfully");
						setVisible(false);
						new adminHome().setVisible(true);
					}
				}
				catch(Exception ex) {
					
				}
			}
		});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Email", "Security Question", "Address", "Status"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\admin Home.png"));
		lblNewLabel_2.setBounds(0, 0, 1283, 692);
		contentPane.add(lblNewLabel_2);
		
		

	}
}
