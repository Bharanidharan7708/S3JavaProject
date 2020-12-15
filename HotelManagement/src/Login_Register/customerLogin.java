package Login_Register;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class customerLogin extends JFrame {
	static customerLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new customerLogin();
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
	public customerLogin() {
		JFrame f= new JFrame("ABNS Restaurant");
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
		JLabel lbladminLoginForm = new JLabel("Customer Login Form");
		lbladminLoginForm.setBounds(40, 15, 400, 40);
		lbladminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		f.add(lbladminLoginForm);
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setBounds(40, 45, 120, 40);
		f.add(lblEnterName);
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setBounds(40,115,120,40);
		f.add(lblEnterPassword);
		textField = new JTextField(50);
		textField.setBounds(40, 75, 120,40);
		f.add(textField);
		passwordField = new JPasswordField();
		passwordField.setBounds(40, 150, 120, 40);
		f.add(passwordField);
		JButton btnLogin = new JButton("Login");
		f.add(btnLogin);
		btnLogin.setBounds(40,195,120,40);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(name.equals("customer")&&password.equals("customer123")){
				Customer.customerSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(customerLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				passwordField.setText("");
			}
			}
		});
		
	}
}
