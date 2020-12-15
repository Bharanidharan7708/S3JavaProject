package Admin;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class viewRevenue extends JFrame {

 

    JFrame frame1;

    JLabel l0, l1, l2;

    JButton b1;

    Connection con;

    ResultSet rs, rs1;

    Statement st, st1;

    PreparedStatement pst;

    String ids;

    static JTable table;

    String[] columnNames = {"Total_Amount", "revenue_exp"};

    String from;

 

    viewRevenue() {

 

        l0 = new JLabel("Fatching Data");

        l0.setForeground(Color.red);

        l0.setFont(new Font("Serif", Font.BOLD, 20));
 
        l0.setBounds(100, 50, 350, 40);

        setTitle("Fetching Data");

        setLayout(null);

        setVisible(true);

        setSize(500, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

 

        add(l0);

        try {

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hotel", "postgres", "krishbharani");

            st = con.createStatement();

            rs = st.executeQuery("select * from revenue");
            
            showTableData();
            
            st.close();

            rs.close();

        } catch (Exception e) {

        }

    }

 

    public void showTableData() {

 

        frame1 = new JFrame("Database Search Result");

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);



        int Total_Amount ;

        int  revenue_exp;


 

        try {

            pst = con.prepareStatement("select * from revenue");

            ResultSet rs = pst.executeQuery();

            int i = 0;

            if (rs.next()) {

                Total_Amount = rs.getInt("Total_Amount");

                revenue_exp = rs.getInt("revenue_exp");

            
                model.addRow(new Object[]{ Total_Amount, revenue_exp});

                i++;

            }

            if (i < 1) {

                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(400, 300);

    }

 

    public static void main(String args[]) {

        new viewRevenue();

    }

}
