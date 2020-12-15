package Login_Register;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_RegisterPage extends JFrame {
	static Login_RegisterPage frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Login_RegisterPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Login_RegisterPage() {
		JFrame f= new JFrame("ABNS Restaurant");
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
		
		JLabel hotelManagement = new JLabel("ABNS Resaturant");
		hotelManagement.setBounds(40, 15, 120, 40);
		f.add(hotelManagement);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		f.add(btnAdminLogin);
		btnAdminLogin.setBounds(40, 120, 120, 40);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			adminLogin.main(new String[]{});
			frame.dispose();
			}
		});
		JButton btnCustomerLogin = new JButton("Customer Login");
		btnCustomerLogin.setBounds(40,50,120,40);  
		f.add(btnCustomerLogin);
		btnCustomerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				customerLogin.main(new String[]{});
			}
		});
		
	}
}
