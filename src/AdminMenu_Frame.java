
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class AdminMenu_Frame extends javax.swing.JFrame implements ActionListener
{
    private static AdminMenu_Frame instance = null;  

    public AdminMenu_Frame()
    {
        
        thisFrameSettings();
        
        initComponents();
        
        InitalizeButtons();
    }
    protected static AdminMenu_Frame instanceSingleton() //Make sure only one instance of the Frame exists
    {
        if(instance == null)
        {
            instance =  new AdminMenu_Frame();  
        }
        
        return instance;
    }    
    private void InitalizeButtons()
    {
        this.Cancel_Button.addActionListener(this);

        this.OverrideEntry_Button.addActionListener(this);
        
        this.NewEmployee_Button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) //Buttons operations.//
    {
        switch(e.getActionCommand())
        {
            case "New Employee":
                System.out.println("New Employee has been clicked");
                CreateAddEmployeeFrame();
                    break;
            case "Override Entry":
                System.out.println("Override Entry has been clicked");
                    break;
            case "Cancel":
                System.out.println("Cancel has been clicked");
                dispose(); //Clear the Jframe out of the way.//
                    break;
        }
    }   
    private void thisFrameSettings() //Particular settings for this specific JFrame when instance is created.
    {
        setResizable(false);
        setTitle("Admin Menu");
        //setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); //Remove the ability to press X, but does not work.//
        setUndecorated(true); //Remove the top buttons completely, also remove possibility to drag the thing.//
        setLocationRelativeTo(null); //Recenter the Jframe middle of the screen.//   
    }
    private void CreateAddEmployeeFrame() //Create the Add Employee Frame.//
    {
        AddEmployee_Frame addemployee_frame = new AddEmployee_Frame();
        addemployee_frame.setVisible(true);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Cancel_Button = new javax.swing.JButton();
        OverrideEntry_Button = new javax.swing.JButton();
        NewEmployee_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cancel_Button.setText("Cancel");

        OverrideEntry_Button.setText("Override Entry");

        NewEmployee_Button.setText("New Employee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancel_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OverrideEntry_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(NewEmployee_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewEmployee_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OverrideEntry_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("FlatLaf Dark".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AdminMenu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AdminMenu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AdminMenu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AdminMenu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AdminMenu_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton NewEmployee_Button;
    private javax.swing.JButton OverrideEntry_Button;
    // End of variables declaration//GEN-END:variables


}
