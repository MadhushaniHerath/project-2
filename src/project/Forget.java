
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Forget extends javax.swing.JFrame {

    
    Connection con = Database.getConnection();
    String query;
    String itemSelected;

    public Forget() {
        initComponents();
        itemSelected = (String) combo.getItemAt(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        mothername = new javax.swing.JTextField();
        petname = new javax.swing.JTextField();
        town = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 130, 30));

        mothername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mothername.setBorder(null);
        getContentPane().add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 190, 30));

        petname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        petname.setBorder(null);
        getContentPane().add(petname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 190, 30));

        town.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        town.setBorder(null);
        getContentPane().add(town, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 190, 30));

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("What is your mother's maiden name?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("What is the name of the town where you were born?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("What is the name of your first pet?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("submit");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Roll :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 40, 20));

        combo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Supervisor" }));
        combo.setBorder(null);
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 130, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Forget Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/image3.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -30, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String uname = username.getText();
            String mname = mothername.getText();
            String pname = petname.getText();
            String twn = town.getText();
            
            
            if("Manager".equals(itemSelected)){
                query = "SELECT * FROM manager where username = ? and mother_name = ? and pet_name = ? and town = ? ;";
            }else{
                query = "SELECT * FROM supervisor where username = ? and mother_name = ? and pet_name = ? and town = ? ;";
            }
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1,uname);
            preparedStmt.setString(2, mname);
            preparedStmt.setString(3, pname);
            preparedStmt.setString(4, twn);
            
            ResultSet rs;

            Statement st = con.createStatement();
            rs = preparedStmt.executeQuery();
            
            if(rs.last()){        
                Reset set = new Reset(uname,itemSelected); 
                set.setVisible(true);
                this.setVisible(false);
                                               
            }else{
               JOptionPane.showMessageDialog(null,"Invalide details" );
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Forget.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
       itemSelected = (String)combo.getSelectedItem( );
    }//GEN-LAST:event_comboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mothername;
    private javax.swing.JTextField petname;
    private javax.swing.JTextField town;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
