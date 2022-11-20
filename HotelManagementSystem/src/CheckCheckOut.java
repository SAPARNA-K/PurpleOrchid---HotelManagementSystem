import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import project.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CheckCheckOut extends JFrame {

private JPanel contentPane;
private JTable table;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
CheckCheckOut frame = new CheckCheckOut ();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
int id=0;
String query;
String roomType;
String bed;
String roomNo;
/**
* Create the frame.
*/
public CheckCheckOut() {
	addComponentListener(new ComponentAdapter() {
		@Override
		public void componentShown(ComponentEvent e) {
			ResultSet rs=Select.getData("select * from customer where checkout is NULL");
			DefaultTableModel md=(DefaultTableModel)table.getModel();
			try {
				while(rs.next()) {
					md.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
					
				}
				rs.close();
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
			}

		}
	});
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1267, 700);
contentPane = new JPanel();
contentPane.setSize(new Dimension(1366, 700));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblNewLabel = new JLabel("CUSTOMER CHECKOUT");
lblNewLabel.setBounds(37, 41, 310, 35);
lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 30));
contentPane.add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("Customer Name");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_1.setBounds(37, 92, 127, 28);
contentPane.add(lblNewLabel_1);

JScrollPane scrollPane = new JScrollPane();
scrollPane.setFont(new Font("Tahoma", Font.BOLD, 14));
scrollPane.setBounds(0, 381, 1266, 319);
contentPane.add(scrollPane);

table = new JTable();
table.setFont(new Font("Tahoma", Font.BOLD, 14));
table.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "CheckIn Date", "Room number", "Bed", "Room Type", "Price per Day"
	}
));
scrollPane.setViewportView(table);

textField = new JTextField();
textField.setBounds(37, 130, 127, 19);
contentPane.add(textField);
textField.setColumns(10);

JLabel lblNewLabel_2 = new JLabel("CheckIn Date");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_2.setBounds(270, 100, 114, 13);
contentPane.add(lblNewLabel_2);

textField_1 = new JTextField();
textField_1.setBounds(270, 130, 114, 19);
contentPane.add(textField_1);
textField_1.setColumns(10);

JLabel lblNewLabel_3 = new JLabel("Check Out Date (Today)");
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_3.setBounds(495, 100, 190, 13);
contentPane.add(lblNewLabel_3);

textField_2 = new JTextField();
textField_2.setBounds(495, 130, 114, 19);
contentPane.add(textField_2);
textField_2.setColumns(10);

JLabel lblNewLabel_4 = new JLabel("Mobile Number");
lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_4.setBounds(722, 100, 127, 13);
contentPane.add(lblNewLabel_4);

textField_3 = new JTextField();
textField_3.setBounds(722, 130, 114, 19);
contentPane.add(textField_3);
textField_3.setColumns(10);

JLabel lblNewLabel_5 = new JLabel("Price per Day");
lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_5.setBounds(37, 242, 127, 13);
contentPane.add(lblNewLabel_5);

textField_4 = new JTextField();
textField_4.setBounds(37, 282, 127, 19);
contentPane.add(textField_4);
textField_4.setColumns(10);

JLabel lblNewLabel_6 = new JLabel("Number Of Days Stay");
lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_6.setBounds(270, 242, 148, 13);
contentPane.add(lblNewLabel_6);

textField_5 = new JTextField();
textField_5.setBounds(270, 282, 114, 19);
contentPane.add(textField_5);
textField_5.setColumns(10);

JLabel lblNewLabel_7 = new JLabel("Total Price");
lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_7.setBounds(495, 242, 114, 13);
contentPane.add(lblNewLabel_7);

textField_6 = new JTextField();
textField_6.setBounds(495, 282, 114, 19);
contentPane.add(textField_6);
textField_6.setColumns(10);

JLabel lblNewLabel_8 = new JLabel("Email");
lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_8.setBounds(722, 242, 45, 13);
contentPane.add(lblNewLabel_8);

textField_7 = new JTextField();
textField_7.setBounds(722, 282, 114, 19);
contentPane.add(textField_7);
textField_7.setColumns(10);

JLabel lblNewLabel_9 = new JLabel("Room Number");
lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_9.setBounds(722, 49, 105, 29);
contentPane.add(lblNewLabel_9);

textField_8 = new JTextField();
textField_8.setBounds(856, 48, 127, 35);
contentPane.add(textField_8);
textField_8.setColumns(10);

JButton btnNewButton = new JButton("Search");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	String roomNo=textField_8.getText();
	try {
		ResultSet rs=Select.getData("select * from customer where roomNo='"+roomNo+"' and checkout is NULL");
		if(rs.next()) {
			textField_8.setEditable(false);
			id=rs.getInt(1);
			textField.setText(rs.getString(2));
			textField_1.setText(rs.getString(9));
			textField_3.setText(rs.getString(3));
			textField_4.setText(rs.getString(13));
			SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal=Calendar.getInstance();
			textField_2.setText(myFormat.format(cal.getTime()));
			String dateBeforeString=rs.getString(9);
			java.util.Date dateBefore=myFormat.parse(dateBeforeString);
			String dateAfterString=myFormat.format(cal.getTime());
			java.util.Date dateAfter=myFormat.parse(dateAfterString);
			long difference=dateAfter.getTime()-dateBefore.getTime();
			int noOfDayStay=(int)(difference/1000*60*60*24);
			if(noOfDayStay==0)
				noOfDayStay=1;
			
			textField_5.setText(String.valueOf(noOfDayStay));
			float price=Float.parseFloat(textField_4.getText());
			textField_6.setText(String.valueOf(noOfDayStay*price));
			textField_7.setText(rs.getString(6));
			roomType=rs.getString(12);
			bed=rs.getString(11);
			
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Room number is not Booked or Room Number does not exist");
		}
	}
	catch(Exception ex) {
		JOptionPane.showMessageDialog(null, ex);
	}
}
});
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
btnNewButton.setBounds(1024, 46, 85, 35);
contentPane.add(btnNewButton);
JButton btnNewButton_1 = new JButton("Check Out");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String name=textField.getText();
		String mob=textField_3.getText();
		String email=textField_7.getText();
		String checkout=textField_2.getText();
		String numberOfDay=textField_5.getText();
		String tot=textField_6.getText();
		roomNo=textField_8.getText();
		query="update customer set numberOfDaysStay='"+numberOfDay+"',totalAmount='"+tot+"',checkOut='"+checkout+"'where id='"+id+"'";
		InsertUpdateDelete.setData(query, "");
		query="update room set Status='Not Booked' where roomNo='"+roomNo+"'";
		InsertUpdateDelete.setData(query, "");
//		String path="E:\\";
//		com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
		
		
		
	}
});
btnNewButton_1.setBounds(37, 332, 127, 23);
contentPane.add(btnNewButton_1);
JButton btnNewButton_2 = new JButton("Clear");
btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new CheckCheckOut().setVisible(true);
	}
});
btnNewButton_2.setBounds(270, 332, 114, 23);
contentPane.add(btnNewButton_2);
JLabel lblNewLabel_10 = new JLabel("");
lblNewLabel_10.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		setVisible(false);
		
	}
	
});
lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\all pages background.png"));
lblNewLabel_10.setBounds(0, 0, 1402, 415);
contentPane.add(lblNewLabel_10);
JButton btnNewButton_4 = new JButton("New button");
btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\saparna\\Downloads\\Hotel Images & Icon\\Hotel Images & Icon\\close.png"));
btnNewButton_4.setBounds(1007, 12, 32, 23);
contentPane.add(btnNewButton_4);
textField.setEditable(false);
textField_1.setEditable(false);
textField_2.setEditable(false);
textField_3.setEditable(false);
textField_4.setEditable(false);
textField_5.setEditable(false);
textField_6.setEditable(false);
textField_7.setEditable(false);

//query=


}
}
