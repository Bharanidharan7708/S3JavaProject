package Admin;

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
public class adminSuccess extends JFrame {
	static adminSuccess frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new adminSuccess();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public adminSuccess() {
		JFrame f= new JFrame("ABNS Restaurant");
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
		
		JLabel hotelManagement = new JLabel("Admin Section");
		hotelManagement.setBounds(40, 15, 120, 40);
		f.add(hotelManagement);
		JButton btnName = new JButton("Outlet Details");
		f.add(btnName);
		btnName.setBounds(40, 205, 120, 40);
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			viewRestaurant.main(new String[]{});
			frame.dispose();
			}
		});
		JButton btnRevenue = new JButton("View Revenue");
		f.add(btnRevenue);
		btnRevenue.setBounds(40, 55, 120, 40);
		btnRevenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			viewRevenue.main(new String[]{});
			frame.dispose();
			}
		});
		
		JButton btnStaff = new JButton("View Staff List");
		f.add(btnStaff);
		btnStaff.setBounds(40, 105, 120, 40);
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			viewStaff.main(new String[]{});
			frame.dispose();
			}
		});
		JButton btnMenu = new JButton("View/Edit Menu");
		f.add(btnMenu);
		btnMenu.setBounds(40, 155, 120, 40);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			viewMenu.main(new String[]{});
			frame.dispose();
			}
		});
		JButton btnLogout = new JButton("Logout");
		f.add(btnLogout);
		btnLogout.setBounds(40, 255, 120, 40);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login_Register.Login_RegisterPage.main(new String[]{});
				frame.dispose();
			}
		});
		
	}
}
