/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comp;

import company_project.checks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class check extends javax.swing.JPanel {

    /**
     * Creates new form check
     */
    checks checkk = new checks(); 
    private String f1;
    private int f2;
    private Connection con;
    private String s;
    private String id2;
    public check() {
        initComponents();
        System.out.println("check");
    }
    public  Connection connect() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "root");
        JOptionPane.showMessageDialog(null, "connected ");
        return con;
    } catch (Exception e) {
        
    }
    return null;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberOfCheque = new javax.swing.JTextField();
        date_spending = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        numberOfCheque.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        numberOfCheque.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numberOfCheque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "رقم الشيك", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 15))); // NOI18N

        date_spending.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        date_spending.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        date_spending.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تاريخ الصرف", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 15))); // NOI18N

        amount.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "القيمة\n\n", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 15))); // NOI18N

        date1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        date1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        date1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تاريخ التسليم", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 15))); // NOI18N

        add.setBackground(new java.awt.Color(255, 153, 0));
        add.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("دفع\n");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "حالة الشك ", "تاريخ الصرف ", "تاريخ التسليم ", "القيمة", "رقم الشك ", "اسم صاحب الشك "
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(numberOfCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_spending, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfCheque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(date_spending, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(259, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        System.out.println("f1"+f1+" "+"f2"+f2);
        System.out.println("s"+s);
        connect();
        String query1;
        
        if( s .equals("Mechanism")  )
        {
        query1 = "SELECT ID from mechanism where id=?";
        id2="ID_mechanism";
            try (PreparedStatement ps1 = con.prepareStatement(query1)) {
            ps1.setString(1,f1);
            ResultSet rs = ps1.executeQuery();
            if(rs.next()){
        
                String query2="INSERT INTO cheque(Doubt_Number,Amount,Received_Date,Data_Spending_The_Money,kind,ID_mechanism)"+ "values(?,?,?,?,?,?) ";


                try (PreparedStatement ps = con.prepareStatement(query2)) {
                ps.setInt(1,Integer.parseInt(numberOfCheque.getText()));
                ps.setInt(2,Integer.parseInt(amount.getText()));
                ps.setString(3,date1.getText());
                ps.setString(4,date_spending.getText());
                ps.setString(5,s);
                ps.setString(6,f1);
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Rows affected: " + rowsAffected);
                } else {
                    System.out.println("No rows affected");
                }

                }
                catch (SQLException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            else 
            {
        System.out.println("No data found for ID: " + f1);
             }   
        } 
            catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if(s .equals( "Advance_Payment") || s .equals( "Additional_Acts") || s .equals("Employees"))
        {
            
        query1 = "SELECT ID_Number from Employees where ID_Number=?";    
            try (PreparedStatement ps1 = con.prepareStatement(query1)) {
            ps1.setString(1,f1);
            ResultSet rs = ps1.executeQuery();
            if(rs.next()){
        
                String query2="INSERT INTO cheque(Doubt_Number,Amount,Received_Date,Data_Spending_The_Money,kind,ID_Number)"+ "values(?,?,?,?,?,?) ";


                try (PreparedStatement ps = con.prepareStatement(query2)) {
                ps.setInt(1,Integer.parseInt(numberOfCheque.getText()));
                ps.setInt(2,Integer.parseInt(amount.getText()));
                ps.setString(3,date1.getText());
                ps.setString(4,date_spending.getText());
                ps.setString(5,s);
                ps.setString(6,f1);
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Rows affected: " + rowsAffected);
                } else {
                    System.out.println("No rows affected");
                }
            
                }
            catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else {
             System.out.println("No data found for ID: " + f1);
            }   
            } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            }
        else if(s.equals("workshops_mechanism"))
        {
            query1 = "select ID_Mechanism , ID_workshops\n" +
                            "from workshops_mechanism\n" +
                            "where ID_Mechanism=? and ID_workshops=?";
                try (PreparedStatement ps1 = con.prepareStatement(query1)) {
            ps1.setString(1,f1);
            ps1.setInt(2, f2);
            ResultSet rs = ps1.executeQuery();
            if(rs.next()){
        
                String query2="INSERT INTO cheque(Doubt_Number,Amount,Received_Date,Data_Spending_The_Money,kind,ID_Mechanism,ID_workshops)"+ "values(?,?,?,?,?,?,?) ";


                    try (PreparedStatement ps = con.prepareStatement(query2)) {
                    ps.setInt(1,Integer.parseInt(numberOfCheque.getText()));
                    ps.setInt(2,Integer.parseInt(amount.getText()));
                    ps.setString(3,date1.getText());
                    ps.setString(4,date_spending.getText());
                    ps.setString(5,s);
                    ps.setString(6,f1);
                    ps.setInt(7, f2);
                    int rowsAffected = ps.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Rows affected: " + rowsAffected);
                    } else {
                        System.out.println("No rows affected");
                    }

                    }
                    catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    }
                    else {
                     System.out.println("No data found for ID: " + f1);
                    }   
                    } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        else 
            {
            query1 = "SELECT ID from stations where ID=?";
            try (PreparedStatement ps1 = con.prepareStatement(query1)) {
            ps1.setInt(1,f2);
            ResultSet rs = ps1.executeQuery();
            if(rs.next()){
        
                String query2="INSERT INTO cheque(Doubt_Number,Amount,Received_Date,Data_Spending_The_Money,kind,ID_Station)"+ "values(?,?,?,?,?,?) ";


                try (PreparedStatement ps = con.prepareStatement(query2)) {
                ps.setInt(1,Integer.parseInt(numberOfCheque.getText()));
                ps.setInt(2,Integer.parseInt(amount.getText()));
                ps.setString(3,date1.getText());
                ps.setString(4,date_spending.getText());
                ps.setString(5,s);
                ps.setInt(6,f2);
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Rows affected: " + rowsAffected);
                } else {
                    System.out.println("No rows affected");
                }
            
            }
            catch (SQLException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        if(s.equals("Station"))
        {
             String query3= "update stations\n" +
                            "set Balance=Balance + ?\n" +
                            "where ID=?;";
        try (PreparedStatement ps = con.prepareStatement(query3)) {
        ps.setInt(1,Integer.parseInt(amount.getText()));
        ps.setInt(2,f2);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Rows affected: " + rowsAffected);
            } else {
                System.out.println("No rows affected");
            }
            
        }
        catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    else {
        System.out.println("No data found for ID: " + f2);
    }   
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
                        String query4="update cheque\n" +
                        "set state_of_doubt=false\n" +
                        "where Doubt_number=?";

                        try (PreparedStatement ps4 = con.prepareStatement(query4)) {
        ps4.setInt(1,Integer.parseInt(numberOfCheque.getText()));
        
            int rowsAffected4 = ps4.executeUpdate();
            if (rowsAffected4 > 0) {
                System.out.println("Rows affected: " + rowsAffected4);
            } else {
                System.out.println("No rows affected");
            }
            
        }
        catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
    }//GEN-LAST:event_addActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        connect();
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        tb.setRowCount(0);
        String query="select Name , Doubt_Number , Amount , Received_Date , Data_Spending_The_Money , state_of_doubt\n" +
"from cheque\n" +
"where kind='Workshops' or kind ='Admin'";
        try (PreparedStatement ps = con.prepareStatement(query)) {
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            String name  = rs.getString("Name");
            String numberOfcheque=String.valueOf(rs.getInt("Doubt_Number"));
            String amount = String.valueOf(rs.getInt("Amount"));
            String date1   = rs.getString("Received_Date");
            String date2   = rs.getString("Data_Spending_The_Money");
            boolean state1 = rs.getBoolean("state_of_doubt");
            String state2="غير متاح ";
            if(state1==true)
            {
                state2="متاح";
            }
            String emp[] = {state2 , date2 , date1 , amount ,numberOfcheque ,name};
            tb.addRow(emp);
        }
    } catch (SQLException ex) {
        Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
    } 
        
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
           DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
           int selectedRow = jTable1.getSelectedRow();
           String state =model.getValueAt(selectedRow, 0).toString();
           if(state.equals("متاح")){
           date_spending.setText(model.getValueAt(selectedRow, 1).toString());
           date1.setText(model.getValueAt(selectedRow, 2).toString());
           amount.setText(model.getValueAt(selectedRow, 3).toString());
           numberOfCheque.setText(model.getValueAt(selectedRow, 4).toString());
           }
           else
           {
            JOptionPane.showMessageDialog(this, "This doubt cannot be used", "Error", JOptionPane.ERROR_MESSAGE);   
           }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField date1;
    private javax.swing.JTextField date_spending;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numberOfCheque;
    // End of variables declaration//GEN-END:variables
   public void setID(int x) {
     f2=x;
    }
    public void setID(String x) {
     f1=x;
    }
     public void setKind(String x) {
     s=x;
    }
}
