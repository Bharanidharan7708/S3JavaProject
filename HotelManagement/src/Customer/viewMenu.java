package Customer;
import javax.swing.*;

import Admin.viewRevenue;

import java.awt.event.*;  
public class viewMenu implements ActionListener{ 
 JLabel l;
    JTextField tf1;  
    int no1,no2,no3,no4,no5;
    JButton b1,m1,m2,m3,m4,m5,m6; 
    public String count="0";
    viewMenu(){  
        JFrame f= new JFrame("Menu");
        String[][] data = { 
                { "1", "Chinese", "250" }, 
                { "2", "Indian", "100" } ,{"3","Thai","200"},{"4","Italian","350"},{"5","Arabian","400"}
            };
        String column[]= {"Item no","Cuisine","price"};
        JTable t= new JTable(data, column); 
        t.setBounds(30, 40, 500, 150); 
        JScrollPane sp = new JScrollPane(t);
        f.add(t);
        l = new JLabel("Menu: ");
        l.setBounds(25,25,150,20);
        tf1=new JTextField();
        tf1.setBounds(10, 500, 100, 30);
        tf1.setEditable(false);
        b1=new JButton("Count");  
        m1=new JButton("item:1");
        m2=new JButton("item:2");
        m3=new JButton("item:3");
        m4=new JButton("item:4");
        m5=new JButton("item:5");
        m6=new JButton("Total");
        m1.setBounds(10, 200, 80, 20);
        m2.setBounds(10, 250, 80, 20);
        m3.setBounds(10, 300, 80, 20);
        m4.setBounds(10, 350, 80, 20);
        m5.setBounds(10, 400, 80, 20);
        m6.setBounds(10, 450, 80, 20);
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m6.addActionListener(this);
        JButton btnRevenue = new JButton("Pay Bill");
    	f.add(btnRevenue);
    	btnRevenue.setBounds(10, 550, 80, 20);
    	btnRevenue.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		payBill.main(new String[]{});
    		}
    	});
        f.add(tf1);f.add(m1);f.add(l);
        f.add(m2);f.add(m3);f.add(m4);f.add(m5);f.add(m6);
        f.setSize(1000,1000);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=  count; 
        int flag=0; 
        if (e.getSource()==m1) {
          no1=no1+1;
          
        }
        if (e.getSource()==m2) {
          no2++;
        }
        if (e.getSource()==m3) {
          no3++;
          
        }
        if (e.getSource()==m4) {
          no4++;
          
        }
        if (e.getSource()==m5) {
          no5++;
          
        }
        if (e.getSource()==m6) {
          flag=1;
        }
        if (flag==1) {
          String result=String.valueOf(no1*250+no2*100+no3*200+no4*350+no5*400);  
            tf1.setText(result); 
            System.out.println("Thankyou");
        } 
       
    }
    
public static void main(String[] args) {  
    new viewMenu();  
} }