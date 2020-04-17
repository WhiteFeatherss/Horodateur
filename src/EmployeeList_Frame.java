
import DataBaseAccess.myDBAccess;
import java.beans.Statement;
import javax.swing.JTable;


public class EmployeeList_Frame extends javax.swing.JFrame
{
    public EmployeeList_Frame()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PunchList_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        EmployeeList_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        PunchList_Button.setText("Punch List");
        PunchList_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PunchList_ButtonActionPerformed(evt);
            }
        });

        Cancel_Button.setText("Cancel");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        EmployeeList_Button.setText("Employee List");
        EmployeeList_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EmployeeList_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmployeeList_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PunchList_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Cancel_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PunchList_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeList_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeList_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EmployeeList_ButtonActionPerformed
    {//GEN-HEADEREND:event_EmployeeList_ButtonActionPerformed
        
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Employee ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("First Name");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Last Name");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Email");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Department ID");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Joined in");
        jTable1.getTableHeader().repaint();
        
        
        myDBAccess.FillTable(jTable1, "SELECT * FROM EMPLOYEES");
        
    }//GEN-LAST:event_EmployeeList_ButtonActionPerformed

    private void PunchList_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PunchList_ButtonActionPerformed
    {//GEN-HEADEREND:event_PunchList_ButtonActionPerformed
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Employee ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Date worked");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Hour started");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Hour finished");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Diner Start");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Diner End");
        jTable1.getColumnModel().getColumn(6).setHeaderValue("Break Start");
        jTable1.getColumnModel().getColumn(7).setHeaderValue("Break End");
        jTable1.getTableHeader().repaint();
        
        myDBAccess.FillTable(jTable1, "SELECT * FROM PUNCH");
    }//GEN-LAST:event_PunchList_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Cancel_ButtonActionPerformed
    {//GEN-HEADEREND:event_Cancel_ButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Cancel_ButtonActionPerformed
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(EmployeeList_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EmployeeList_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EmployeeList_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EmployeeList_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new EmployeeList_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton EmployeeList_Button;
    private javax.swing.JButton PunchList_Button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
