package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {


    String query ;
    String itemSelected;
    Connection conn = Database.getConnection();
    public Register() {
        initComponents();
        itemSelected = (String) combo.getItemAt(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        user_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        town = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        petname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mothername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 30));

        first_name.setBorder(null);
        getContentPane().add(first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 30));

        last_name.setBorder(null);
        getContentPane().add(last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, 30));

        user_name.setBorder(null);
        getContentPane().add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Register");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 110, 30));

        pass.setBorder(null);
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Roll :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 30));

        combo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Supervisor" }));
        combo.setBorder(null);
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 288, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("What is the name of the town");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 210, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" where you were born?");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 170, -1));

        town.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        town.setBorder(null);
        getContentPane().add(town, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("What is the name of your first pet?");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 250, -1));

        petname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        petname.setBorder(null);
        getContentPane().add(petname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("What is your mother's maiden name?");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 270, -1));

        mothername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mothername.setBorder(null);
        getContentPane().add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/image2.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String lname = last_name.getText();
        String fname = first_name.getText();
        String uname = user_name.getText();
        String password = pass.getText();
        String pet = petname.getText();
        String mother = mothername.getText();
        String twn = town.getText();
        
            try{

            if(itemSelected == "Manager"){
                query = "insert into manager (firstname, lastname,username,"
                        + " password,mother_name,pet_name,town )"
              + " values (?, ?, ?, ?,?,?,?)";
            }else{
                query = "insert into supervisor (firstname, lastname,username,"
                        + " password,mother_name,pet_name,town )"
              + "  values (?, ?, ?, ?,?,?,?)";
            }

            conn.setAutoCommit(false);
            
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, fname);
            preparedStmt.setString(2, lname);
            preparedStmt.setString(3, uname);
            if("Valid".equals(ValidatePassword.PassCheck(password))){
            preparedStmt.setString(4, password);
            }
            
            preparedStmt.setString(5, mother);
            preparedStmt.setString(6, pet);
            preparedStmt.setString(7, twn);

            preparedStmt.execute();
            
            conn.commit();

            conn.close();
            
            login lg = new login();
            this.setVisible(false);
            lg.setVisible(true);
            
          }
          catch (Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            if(e.getMessage().equalsIgnoreCase("No value specified for parameter 4") ){
                JOptionPane.showMessageDialog(null, ValidatePassword.PassCheck(password));
            }else{
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            try {
                conn.rollback();
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
          }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        itemSelected = (String)combo.getSelectedItem( );
    }//GEN-LAST:event_comboActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo;
    private javax.swing.JTextField first_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField mothername;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField petname;
    private javax.swing.JTextField town;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
