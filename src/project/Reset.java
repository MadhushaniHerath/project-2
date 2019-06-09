
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Reset extends javax.swing.JFrame {


    String user_name ;
    String User_type;
    String query;
    Connection conn = Database.getConnection();
    
    public Reset(String user_name ,String User_type) {
        this.User_type = User_type.toLowerCase();
        this.user_name = user_name;
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("New password :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("New password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 20));

        pass1.setBorder(null);
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 117, 20));

        pass2.setBorder(null);
        getContentPane().add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 117, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reset Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/image2.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-700, -300, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pword = pass1.getText();
        String pword2 = pass2.getText();

        
        if (pword == null ? pword2 == null : pword.equals(pword2)){
            try {
                if("manager".equals(User_type)){
                    query = "update manager  set password = ? WHERE username = ? ;";
                    System.out.println(query);
                }else{
                    query = "update supervisor set  password = ? WHERE username = ? ;";
                    System.out.println(query);
                }
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                if("Valid".equals(ValidatePassword.PassCheck(pword))){
                preparedStmt.setString(1, pword);
                }
                preparedStmt.setString(2, user_name);
                preparedStmt.executeUpdate();
                conn.close();
                
                login lg = new login();
                this.setVisible(false);
                lg.setVisible(true);
                                
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
                if(e.getMessage().equalsIgnoreCase("No value specified for parameter 1") ){
                    JOptionPane.showMessageDialog(null, ValidatePassword.PassCheck(pword));
                }else{
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }
             
             
        }else{
            JOptionPane.showMessageDialog(null,"Passwords are not matching" );
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    // End of variables declaration//GEN-END:variables
}
