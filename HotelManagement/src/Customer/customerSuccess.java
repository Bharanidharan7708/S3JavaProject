package Customer;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Login_Register.adminLogin;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.sql.*;
public class customerSuccess extends JFrame {
	static customerSuccess frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new customerSuccess();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public customerSuccess() {
		JFrame f= new JFrame("ABNS Restaurant");
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
		
		JLabel hotelManagement = new JLabel("Customer Section");
		hotelManagement.setBounds(40, 15, 120, 40);
		f.add(hotelManagement);
		JButton btnName = new JButton("Order food/ view menu");
		f.add(btnName);
		btnName.setBounds(40, 55, 200, 40);
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			viewMenu.main(new String[]{});
			frame.dispose();
			}
		});
		JButton btnLogout = new JButton("Logout");
		f.add(btnLogout);
		btnLogout.setBounds(40, 105, 120, 40);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login_Register.Login_RegisterPage.main(new String[]{});
				frame.dispose();
			}
		});
		
	}
}
