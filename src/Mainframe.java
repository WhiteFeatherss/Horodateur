
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

import DataBaseAccess.myDBAccess;
import Email.SendEmail;

import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mainframe extends javax.swing.JFrame implements ActionListener
{    
    public Mainframe()
    {
        
        initComponents();
        
        InitializeButtons();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        NumberInput_Buttons = new javax.swing.JPanel();
        Input1_Button = new javax.swing.JButton();
        Input2_Button = new javax.swing.JButton();
        Input3_Button = new javax.swing.JButton();
        Input4_Button = new javax.swing.JButton();
        Input5_Button = new javax.swing.JButton();
        Input6_Button = new javax.swing.JButton();
        Input7_Button = new javax.swing.JButton();
        Input8_Button = new javax.swing.JButton();
        Input9_Button = new javax.swing.JButton();
        Input0_Button = new javax.swing.JButton();
        Reset_Button = new javax.swing.JButton();
        Enter_Button = new javax.swing.JButton();
        Horizontal_Separator = new javax.swing.JSeparator();
        javax.swing.JSeparator Vertical_Separator = new javax.swing.JSeparator();
        Display_Panel = new javax.swing.JScrollPane();
        OutputText = new javax.swing.JTextArea();
        InfoInput_Buttons = new javax.swing.JPanel();
        In_Button = new javax.swing.JButton();
        Out_Button = new javax.swing.JButton();
        StartBreak_Button = new javax.swing.JButton();
        EndBreak_Button = new javax.swing.JButton();
        StartDiner_Button = new javax.swing.JButton();
        EndDiner_Button = new javax.swing.JButton();
        AdminMenu_Button = new javax.swing.JButton();
        Menu_Bar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        CreateDB_Item = new javax.swing.JMenuItem();
        DeleteDB_Item = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Input1_Button.setText("1");
        Input1_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input2_Button.setText("2");
        Input2_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input3_Button.setText("3");
        Input3_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input4_Button.setText("4");
        Input4_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input5_Button.setText("5");
        Input5_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input6_Button.setText("6");
        Input6_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input7_Button.setText("7");
        Input7_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input8_Button.setText("8");
        Input8_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input9_Button.setText("9");
        Input9_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Input0_Button.setText("0");
        Input0_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Reset_Button.setText("Reset");
        Reset_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Enter_Button.setText("Enter");
        Enter_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout NumberInput_ButtonsLayout = new javax.swing.GroupLayout(NumberInput_Buttons);
        NumberInput_Buttons.setLayout(NumberInput_ButtonsLayout);
        NumberInput_ButtonsLayout.setHorizontalGroup(
            NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumberInput_ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(NumberInput_ButtonsLayout.createSequentialGroup()
                            .addComponent(Input4_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Input5_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Input6_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(NumberInput_ButtonsLayout.createSequentialGroup()
                            .addComponent(Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Enter_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(NumberInput_ButtonsLayout.createSequentialGroup()
                            .addGroup(NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Input0_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(NumberInput_ButtonsLayout.createSequentialGroup()
                                    .addComponent(Input7_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Input8_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Input9_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NumberInput_ButtonsLayout.createSequentialGroup()
                        .addComponent(Input1_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input2_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input3_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NumberInput_ButtonsLayout.setVerticalGroup(
            NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumberInput_ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input1_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input2_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input3_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input5_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input6_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input4_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input7_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input8_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input9_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Input0_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NumberInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enter_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Vertical_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        OutputText.setColumns(20);
        OutputText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        OutputText.setRows(1);
        Display_Panel.setViewportView(OutputText);

        In_Button.setText("In");
        In_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        Out_Button.setText("Out");
        Out_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        StartBreak_Button.setText("Start Break");
        StartBreak_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        EndBreak_Button.setText("End Break");
        EndBreak_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        StartDiner_Button.setText("Start Diner");
        StartDiner_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        EndDiner_Button.setText("End Diner");
        EndDiner_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        AdminMenu_Button.setText("Admin Menu");
        AdminMenu_Button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        AdminMenu_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AdminMenu_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoInput_ButtonsLayout = new javax.swing.GroupLayout(InfoInput_Buttons);
        InfoInput_Buttons.setLayout(InfoInput_ButtonsLayout);
        InfoInput_ButtonsLayout.setHorizontalGroup(
            InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoInput_ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminMenu_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InfoInput_ButtonsLayout.createSequentialGroup()
                        .addGroup(InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(In_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Out_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StartBreak_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(EndBreak_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EndDiner_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StartDiner_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InfoInput_ButtonsLayout.setVerticalGroup(
            InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoInput_ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(In_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartBreak_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartDiner_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoInput_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Out_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndBreak_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndDiner_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminMenu_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        File.setText("File");

        CreateDB_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        CreateDB_Item.setText("Create DB");
        CreateDB_Item.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CreateDB_ItemActionPerformed(evt);
            }
        });
        File.add(CreateDB_Item);

        DeleteDB_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        DeleteDB_Item.setText("Delete DB");
        DeleteDB_Item.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteDB_ItemActionPerformed(evt);
            }
        });
        File.add(DeleteDB_Item);

        Menu_Bar.add(File);

        setJMenuBar(Menu_Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Horizontal_Separator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Display_Panel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumberInput_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vertical_Separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InfoInput_Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Horizontal_Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NumberInput_Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vertical_Separator)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(InfoInput_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void AdminMenu_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AdminMenu_ButtonActionPerformed
    {//GEN-HEADEREND:event_AdminMenu_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminMenu_ButtonActionPerformed

    private void CreateDB_ItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CreateDB_ItemActionPerformed
    {//GEN-HEADEREND:event_CreateDB_ItemActionPerformed
       myDBAccess.Create_DB();
    }//GEN-LAST:event_CreateDB_ItemActionPerformed

    private void DeleteDB_ItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteDB_ItemActionPerformed
    {//GEN-HEADEREND:event_DeleteDB_ItemActionPerformed
        myDBAccess.DeleteDB();
    }//GEN-LAST:event_DeleteDB_ItemActionPerformed
    
    private void InitializeButtons() //Add action listener to the buttons.//
    {
        //Buttons 0 - 9.//
        this.Input0_Button.addActionListener(this);
        this.Input1_Button.addActionListener(this);
        this.Input2_Button.addActionListener(this);
        this.Input3_Button.addActionListener(this);
        this.Input4_Button.addActionListener(this);
        this.Input5_Button.addActionListener(this);
        this.Input6_Button.addActionListener(this);
        this.Input7_Button.addActionListener(this);
        this.Input8_Button.addActionListener(this);
        this.Input9_Button.addActionListener(this);
        
        //Buttons Enter/Reset.//
        this.Reset_Button.addActionListener(this);
        this.Enter_Button.addActionListener(this);
        
        //Buttons Employee Actions.//
        this.In_Button.addActionListener(this);
        this.Out_Button.addActionListener(this);
        
        this.StartBreak_Button.addActionListener(this);
        this.EndBreak_Button.addActionListener(this);
        
        this.StartDiner_Button.addActionListener(this);
        this.EndDiner_Button.addActionListener(this);
        
        //Buttons Admin Actions.//
        this.AdminMenu_Button.addActionListener(this);
    }
    
        @Override
    public void actionPerformed(ActionEvent e) //Buttons operations.//
    {
        switch(e.getActionCommand())
        {
            //Buttons 0-9.//
            case "0":
                OutputText.append("0");
                    break;
            case "1":
                OutputText.append("1");
                    break;    
            case "2":
                OutputText.append("2");
                    break;
            case "3":
                OutputText.append("3");
                    break;
            case "4":
                OutputText.append("4");
                    break;
            case "5":
                OutputText.append("5");
                    break;    
            case "6":
                OutputText.append("6");
                    break;
            case "7":
                OutputText.append("7");
                    break;
            case "8":
                OutputText.append("8");
                    break;
            case "9":
                OutputText.append("9");
                    break;
                    
            //Buttons Enter/Reset.//
            case "Enter":
                System.out.println("Enter has been clicked.");
                    break;
            case "Reset":
                OutputText.setText(null);
                    break;
                    
            //Employee action buttons.//
            case "In":
            {
                try
                {
                    Punching("Punch_IN", "You've started working");
                } 
                catch (Exception ex)
                {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;


            case "Out":
            {
                try
                {
                    Punching("Punch_OUT", "You've stopped working.");
                } 
                catch (Exception ex)
                {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;    
                    
                    
            case "Start Break":
            {
                try
                {
                    Punching("Pause_IN", "Your break has started");
                } 
                catch (Exception ex)
                {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                    
            case "End Break":
            {
                try
                {
                    Punching("Pause_OUT", "Your break is now over.");
                } 
                catch (Exception ex)
                {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                    
                    
            case "Start Diner":
            {
                try
                {
                    Punching("DINER_IN", "You've started your diner.");
                } 
                catch (Exception ex)
                {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
            case "End Diner":
                try
                {
                    Punching("DINER_OUT", "Your diner is now over.");
                } 
                catch (Exception ex)
                {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
                    break;
             
             //Admin Menu.//
            case "Admin Menu":
                
                CreateLogin();
                
                System.out.println("Admin has been clicked.");
                    break;
                    
        }
    }
    
    private void Punching(String PunchingFunction, String PunchingMessage) throws NumberFormatException, Exception
    {
            Integer ID = Integer.parseInt(OutputText.getText());
            String Email = myDBAccess.ReturnEmail(ID);
            Time TimeWork = newTime();

            myDBAccess.InsertPunchIN(ID);
            myDBAccess.UpdatePunch(ID, PunchingFunction);
            SendEmail.SendMail(Email, PunchingMessage, TimeWork.toString());
    }
    
    private void CreateLogin()//Create a JDialog with Application Modality, prevents background click.//
    {   
        AdminLogin_Panel AdminPanel = new AdminLogin_Panel();
        
        JDialog LoginFrame = new JDialog(this, "Login", ModalityType.APPLICATION_MODAL);
        
        //Properties.// //Learn why order matters.//
        
        LoginFrame.setResizable(false);
        LoginFrame.add(AdminPanel);
        LoginFrame.pack();
        LoginFrame.setVisible(true);
        
        
    }
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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Mainframe().setVisible(true);
            }
        });
    }
    
        private static Time newTime()
    {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Time sqlDate = new java.sql.Time(javaTime);
        return sqlDate;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminMenu_Button;
    private javax.swing.JMenuItem CreateDB_Item;
    private javax.swing.JMenuItem DeleteDB_Item;
    private javax.swing.JScrollPane Display_Panel;
    private javax.swing.JButton EndBreak_Button;
    private javax.swing.JButton EndDiner_Button;
    private javax.swing.JButton Enter_Button;
    private javax.swing.JMenu File;
    private javax.swing.JSeparator Horizontal_Separator;
    private javax.swing.JButton In_Button;
    private javax.swing.JPanel InfoInput_Buttons;
    private javax.swing.JButton Input0_Button;
    private javax.swing.JButton Input1_Button;
    private javax.swing.JButton Input2_Button;
    private javax.swing.JButton Input3_Button;
    private javax.swing.JButton Input4_Button;
    private javax.swing.JButton Input5_Button;
    private javax.swing.JButton Input6_Button;
    private javax.swing.JButton Input7_Button;
    private javax.swing.JButton Input8_Button;
    private javax.swing.JButton Input9_Button;
    public javax.swing.JMenuBar Menu_Bar;
    private javax.swing.JPanel NumberInput_Buttons;
    private javax.swing.JButton Out_Button;
    private javax.swing.JTextArea OutputText;
    private javax.swing.JButton Reset_Button;
    private javax.swing.JButton StartBreak_Button;
    private javax.swing.JButton StartDiner_Button;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

}
