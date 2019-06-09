package project;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productivity = new javax.swing.JButton();
        utilization = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        line_efficiency1 = new javax.swing.JButton();
        feedback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        productdetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productivity.setBackground(new java.awt.Color(51, 0, 51));
        productivity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        productivity.setForeground(new java.awt.Color(255, 255, 255));
        productivity.setText("machine productivity");
        productivity.setBorder(null);
        productivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productivityActionPerformed(evt);
            }
        });
        getContentPane().add(productivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 330, 40));

        utilization.setBackground(new java.awt.Color(51, 0, 51));
        utilization.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        utilization.setForeground(new java.awt.Color(255, 255, 255));
        utilization.setText("machine utilization");
        utilization.setBorder(null);
        utilization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilizationActionPerformed(evt);
            }
        });
        getContentPane().add(utilization, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 330, 40));

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Machine Details");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 330, 40));

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("BACK");
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 63, 28));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Sewing Machine Monitoring System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 440, 40));

        line_efficiency1.setBackground(new java.awt.Color(51, 0, 51));
        line_efficiency1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        line_efficiency1.setForeground(new java.awt.Color(255, 255, 255));
        line_efficiency1.setText("line efficiency");
        line_efficiency1.setBorder(null);
        line_efficiency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line_efficiency1ActionPerformed(evt);
            }
        });
        getContentPane().add(line_efficiency1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 330, 40));

        feedback.setBackground(new java.awt.Color(51, 0, 51));
        feedback.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        feedback.setForeground(new java.awt.Color(255, 255, 255));
        feedback.setText("Feedback");
        feedback.setBorder(null);
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 330, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 500));

        productdetails.setBackground(new java.awt.Color(51, 0, 51));
        productdetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        productdetails.setForeground(new java.awt.Color(255, 255, 255));
        productdetails.setText("Product Details");
        productdetails.setBorder(null);
        productdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(productdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 330, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            addmachine ad = new addmachine();
            this.setVisible(false);
            ad.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productivityActionPerformed
        Machine_productivity prod = new Machine_productivity();
        prod.setDefaultCloseOperation(WIDTH);
        prod.setVisible(true);
    }//GEN-LAST:event_productivityActionPerformed

    private void utilizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilizationActionPerformed
        Machine_utilization uti = new Machine_utilization();
        uti.setDefaultCloseOperation(WIDTH);
        uti.setVisible(true);
    }//GEN-LAST:event_utilizationActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void line_efficiency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line_efficiency1ActionPerformed
        Line_efficiency ln = new Line_efficiency();
        ln.setDefaultCloseOperation(WIDTH);
        ln.setVisible(true);
        
    }//GEN-LAST:event_line_efficiency1ActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
        SetFeedback fd = new SetFeedback();
        fd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_feedbackActionPerformed

    private void productdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productdetailsActionPerformed
        UpdateQuality uq = new UpdateQuality();
        uq.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_productdetailsActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton feedback;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton line_efficiency1;
    private javax.swing.JButton productdetails;
    private javax.swing.JButton productivity;
    private javax.swing.JButton utilization;
    // End of variables declaration//GEN-END:variables
}
