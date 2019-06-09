
package project;

import java.sql.Connection;
import java.sql.ResultSet;

public class Machinedetail extends javax.swing.JFrame {

    Connection con = Database.getConnection();
    public Machinedetail() {
        initComponents();
        fillTable();
        
    }
    
    public void fillTable(){
        
        String sql = "";
        try{

            sql = "select * from machine join line_assign using(machine_id) where deleted = 0 ;";
            

            ResultSet rs = (ResultSet)Database.getData(sql);
        
            int i = 0;
            rs.last();
            i = rs.getRow();
            
            Object[][] scheduleData = new Object[i][7];

            i = 0;
            
            rs.beforeFirst();

            while(rs.next()){
                scheduleData[i][0] = rs.getString("machine_id");
                scheduleData[i][1] = rs.getString("start_time");
                scheduleData[i][2] = rs.getString("stitches");
                scheduleData[i][3] = rs.getString("stop_time");
                scheduleData[i][4] = rs.getString("run_time");
                scheduleData[i][5] = rs.getString("speed");
                scheduleData[i][6] = rs.getString("date_entered");
                i++;
            }

            table.setModel(new javax.swing.table.DefaultTableModel(
                scheduleData,
                new String [] {
                    "Machine ID", "Start time", "Stitches", "Stop time", "Run time", "Speed","Date Entered"
                }){
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false, false,false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
            rs.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Machine Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 220, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Machine Id", "Start time", "Stitches", "Stop time", "Run time", "Speed", "Date Entered"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 630, 400));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 18, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wallpaper-sky-blue-background-13.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 1010, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addmachine addmachine = new addmachine();
            this.setVisible(false);
            addmachine.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
