/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comp;

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

/**
 *
 * @author Lenovo
 */
public class cash extends javax.swing.JPanel {

    private String f;
    private int f2;
    private String f3;
    private Connection con;
    public cash() {
        initComponents();
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

        jButton1 = new javax.swing.JButton();
        finalsalary1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("دفع\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        finalsalary1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        finalsalary1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        finalsalary1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "أدخل القيمة ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 15))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(finalsalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalsalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        connect();
        if(f3.equals("workshops_mechanism"))
        {
            //
            String query2 = "select ID_Mechanism , ID_workshops\n" +
                            "from workshops_mechanism\n" +
                            "where ID_Mechanism=? and ID_workshops=?";
            
            try (PreparedStatement ps2 = con.prepareStatement(query2)) {
                ps2.setString(1, f);
                ps2.setInt(2, f2);
                ResultSet rs2 = ps2.executeQuery();
                
            if(rs2.next()){
                String check1 = rs2.getString("ID_Mechanism");
                int check2 = rs2.getInt("ID_workshops");
                    String query3=  "insert into cash(salary,date_paid,kind,ID_Workshops,ID_Mechanism)\n" +
                                    "values (?,?,?,?,?)";
                    try (PreparedStatement ps3 = con.prepareStatement(query3)) {
                    ps3.setInt(1,Integer.parseInt(finalsalary1.getText()));
                    LocalDate date = LocalDate.now();
                    ps3.setString(2,date.toString());
                    ps3.setString(3,"workshops_mechanism");
                    ps3.setInt(4,f2);
                    ps3.setString(5, f);
                    int rowsAffected3 = ps3.executeUpdate();
                    if (rowsAffected3 > 0) {
                        System.out.println("Rows affected: " + rowsAffected3);
                    } else {
                        System.out.println("No rows affected");
                    }
            
        }
        catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else {
        System.out.println("No data found for ID: " + f);
    }   
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //////////
        }
        else{
        String query1 = "SELECT ID_Number from employees where ID_Number=?";
        System.out.println("f1"+f);
        try (PreparedStatement ps1 = con.prepareStatement(query1)) {
    ps1.setString(1, f);
    ResultSet rs = ps1.executeQuery();
            System.out.println("f2"+f);
    if(rs.next()){
        String check = rs.getString("ID_Number");
        String query2="INSERT INTO cash(salary,date_paid,kind,ID_Number) values(?,?,?,?) ";
        try (PreparedStatement ps = con.prepareStatement(query2)) {
        ps.setInt(1,Integer.parseInt(finalsalary1.getText()));
        LocalDate date = LocalDate.now();
        ps.setString(2,date.toString());
        ps.setString(3,"Employees");
        ps.setString(4,f);
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
        System.out.println("No data found for ID: " + f);
    }   
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField finalsalary1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    public void setID(String x) {
        f=x;
    }

    public void setID(int ID) {
        f2=ID;
    }

    public void setKind(String workshops_mechanism) {
       f3 = workshops_mechanism;
    }
}
