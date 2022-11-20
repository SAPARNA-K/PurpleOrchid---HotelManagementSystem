import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

import project.*;
import java.sql.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class manageRoom extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manageRoom frame = new manageRoom();
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
	public manageRoom() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				ResultSet rs=Select.getData("select * from room");
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				try {
					while(rs.next()) {
					model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});}
					rs.close();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null,ex);
				}
			}
		});
		setLocation(new Point(50, 96));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1265, 555);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(1265, 600));
		contentPane.setSize(new Dimension(1366, 712));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Manage room");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\manage room.png"));
		lblNewLabel.setBounds(27, 22, 190, 73);
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new login().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\close.png"));
		btnNewButton.setBounds(1133, 50, 33, 33);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 90, 780, 410);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Room Number", "Room Type", "Bed", "Price", "Status"
			}
		));
		table.getColumnModel().getColumn(4).setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Room Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(850, 121, 201, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(850, 167, 280, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Room Type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(850, 222, 121, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AC", "Non-Ac"}));
		comboBox.setBounds(850, 266, 280, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Bed");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(850, 315, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Double", "Single", "Triple"}));
		comboBox_1.setBounds(850, 358, 280, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Price");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(850, 405, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(850, 430, 280, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add Room");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roomNo=textField.getText();
				String roomType=(String)comboBox.getSelectedItem();
				String bed=(String)comboBox_1.getSelectedItem();
				String price=textField_1.getText();
				String query="insert into room values('"+roomNo+"','"+roomType+"','"+bed+"','"+price+"','Not Booked')";
				InsertUpdateDelete.setData(query,"Succesfully updated");
				setVisible(false);
				new manageRoom().setVisible(true);
				ResultSet rs=null;
				Statement st=null;
				
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(128, 0, 64));
		btnNewButton_1.setBounds(849, 477, 135, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\all pages background.png"));
		lblNewLabel_5.setBounds(0, 0, 1265, 555);
		contentPane.add(lblNewLabel_5);
	}
}
