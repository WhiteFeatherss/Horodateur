
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import DataBaseAccess.myDBAccess;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class AdminLogin_Panel extends javax.swing.JPanel
{
    public AdminLogin_Panel()
    {
        initComponents();
        
      
    }

        private void EmptyCheck() //Check if either Textfields are empty and open up a Warning Message.//
    {   
        if(Password_Text.getText().isEmpty() || Username_Text.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this,"Login or Username not entered.","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void LoginCheck() //Returns true if the Password and ID matches the DB.//  **ternary operator ??**
    {
        Boolean checksOut = myDBAccess.LoginCheck(Password_Text.getText(), Username_Text.getText());
        
        if(checksOut)
        {
            LoginUnlock();
            System.out.println(("Unlocking menu"));
        }
        else
        {   
            LoginWarning();
        }
    }
    private void LoginWarning() //Shows a warning if the Password and User ID do not match.//
    {
        JOptionPane.showMessageDialog(this,"Incorrect username or password.","Warning",JOptionPane.WARNING_MESSAGE);
    }
    private void LoginUnlock() //Unlocks the Admin Menu and dispose of the current JDialog.//
    {
        JDialogDispose();
        CreateAdminMenuFrame();
    }
    private void JDialogDispose() //Destroy the JDialog.//
    {
        JDialog parent = (JDialog) this.getTopLevelAncestor();
        parent.dispose();
        parent.pack();
    }
    private void CreateAdminMenuFrame() //Create the Admin Menu Frame.//
    {
        AdminMenu_Frame adminMenu = AdminMenu_Frame.instanceSingleton();
        adminMenu.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LoginPanel = new javax.swing.JPanel();
        UsernamePanel = new javax.swing.JPanel();
        Username_Text = new javax.swing.JTextField();
        Username_Label = new javax.swing.JLabel();
        PasswordPanel = new javax.swing.JPanel();
        Password_Label = new javax.swing.JLabel();
        Password_Text = new javax.swing.JPasswordField();
        Enter_Button = new javax.swing.JButton();

        Username_Label.setText("Enter username : ");

        javax.swing.GroupLayout UsernamePanelLayout = new javax.swing.GroupLayout(UsernamePanel);
        UsernamePanel.setLayout(UsernamePanelLayout);
        UsernamePanelLayout.setHorizontalGroup(
            UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );
        UsernamePanelLayout.setVerticalGroup(
            UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username_Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Password_Label.setText("Enter password : ");

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Password_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_Label)
                    .addComponent(Password_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        Enter_Button.setText("Enter");
        Enter_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Enter_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Enter_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addComponent(UsernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Enter_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Enter_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Enter_ButtonActionPerformed
    {//GEN-HEADEREND:event_Enter_ButtonActionPerformed
        EmptyCheck();
        LoginCheck();
    }//GEN-LAST:event_Enter_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter_Button;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JPasswordField Password_Text;
    private javax.swing.JPanel UsernamePanel;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JTextField Username_Text;
    // End of variables declaration//GEN-END:variables


}
