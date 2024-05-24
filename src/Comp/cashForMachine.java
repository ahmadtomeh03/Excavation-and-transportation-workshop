
package Comp;
// لم يتم تجريبه 
import company_project.Paid;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class cashForMachine extends javax.swing.JPanel {

    public cashForMachine() {
        System.out.println("cashForMachine");
        initComponents();
    }
private String f;
private Connection con;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amount = new javax.swing.JTextField();
        add = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        amount.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "القيمة\n\n", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 15))); // NOI18N

        add.setBackground(new java.awt.Color(255, 153, 0));
        add.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("دفع\n");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
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
    public JTextField getAmount() {
        return amount;
    }

    public void setAmount(JTextField amount) {
        this.amount = amount;
    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
 connect();
String query1 = "SELECT ID from mechanism where id=?";
try (PreparedStatement ps1 = con.prepareStatement(query1)) {
    ps1.setString(1, f);
    ResultSet rs = ps1.executeQuery();
    if(rs.next()){
        String check = rs.getString("ID");
    //    System.out.println("check: " + check);
  //      System.out.println("f: " + f);
        String query2="INSERT INTO cash(salary,date_paid,kind,ID_Mechanism) values(?,?,?,?) ";
//        System.out.println("ID --- >"+f);
        try (PreparedStatement ps = con.prepareStatement(query2)) {
        ps.setInt(1,Integer.parseInt(amount.getText()));
        LocalDate date = LocalDate.now();
        ps.setString(2,date.toString());
        ps.setString(3,"Mechanism");
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
    }//GEN-LAST:event_addActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    // End of variables declaration//GEN-END:variables

    public void setID(String x) {
       f=x;
    }
}
