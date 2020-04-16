import DataBaseAccess.myDBAccess;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public final class AddEmployee_Frame extends javax.swing.JFrame
{
    // <editor-fold desc="CONSTANTS" defaultstate="collapsed">    
    
    // </editor-fold>    
    // <editor-fold desc="Variables" defaultstate="collapsed">    
    ArrayList<JTextField> TF_List = new ArrayList<JTextField>();
    private static AddEmployee_Frame instance = null;    
    // </editor-fold>

    public AddEmployee_Frame()
    {
        thisFrameSettings();
        
        initComponents();
        
        AddTextFields_Array();
        
        ComboBox_FillDepartments();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        FirstName_Label = new javax.swing.JLabel();
        FirstName_Text = new javax.swing.JTextField();
        LastName_Label = new javax.swing.JLabel();
        LastName_Text = new javax.swing.JTextField();
        PhoneNumber_Label = new javax.swing.JLabel();
        PhoneNumber_Text = new javax.swing.JTextField();
        Department_Lavel = new javax.swing.JLabel();
        Department_ComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        Button_AddEmployee = new javax.swing.JButton();
        Button_Reset = new javax.swing.JButton();
        Button_Cancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FirstName_Label.setText("First Name");

        LastName_Label.setText("Last Name");

        PhoneNumber_Label.setText("Phone Number");

        Department_Lavel.setText("Department");

        Department_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstName_Label)
                    .addComponent(FirstName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastName_Label)
                    .addComponent(LastName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneNumber_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Department_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department_Lavel))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumber_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Department_Lavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FirstName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstName_Text)
                            .addComponent(LastName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumber_Text)
                            .addComponent(Department_ComboBox))))
                .addContainerGap())
        );

        Button_AddEmployee.setText("Add Employee");
        Button_AddEmployee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Button_AddEmployeeActionPerformed(evt);
            }
        });

        Button_Reset.setText("Reset Parameters");
        Button_Reset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Button_ResetActionPerformed(evt);
            }
        });

        Button_Cancel.setText("Cancel");
        Button_Cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Button_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Button_AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold desc="Methods and functions" defaultstate="collapsed">        
    protected static AddEmployee_Frame instanceSingleton() //Make sure only one instance of the Frame exists
    {
        if(instance == null)
        {
            instance =  new AddEmployee_Frame();  
        }
        
        return instance;
    }
    
        private void thisFrameSettings() //Particular settings for this specific JFrame when instance is created.
        {
            //setVisible(true); //Must be intantiated on previous form, otherwise provokes a momentarily a black screen where the frame should be.//
            setResizable(false);
            setTitle("Add a new Employee");
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    
    private void AddTextFields_Array() //Add each textfields to an ArrayList, easier to deal with Reset.//
    {
        TF_List.add(FirstName_Text);
        TF_List.add(LastName_Text);
        TF_List.add(PhoneNumber_Text);
    }
    
    private void ResetTextField() //Resets each Text fields using the list.//
    {
        for(JTextField resetText : TF_List)
        {
            resetText.setText("");
        }
    }

    private Boolean AreTextField_Empty() //Check if all the textfields are empty a return true:false.
    {
        int count = 0;
        
        for(JTextField checkEmptyTF : TF_List)
        {
          if(checkEmptyTF.getText().isEmpty())
          {
              count++;
          }
        }
        
        return (count != 0) ? true:false;
    }
       
    private void ComboBox_FillDepartments() //Add items from deparments to the Department CB.//
    {
        String SQL_FILL = "SELECT * FROM DEPARTMENTS";

        try
        {
            Department_ComboBox.removeAllItems(); //Empties the ComboBox on start.//

            myDBAccess.OpenDB(myDBAccess.DB_URL);

            myDBAccess.p_statement = myDBAccess.connection.prepareStatement(SQL_FILL);
            myDBAccess.r_set = myDBAccess.p_statement.executeQuery();

            //Add all items of the Deparment List to the comboBox.//
            while (myDBAccess.r_set.next())
            {
                String department_Name_Pulled = myDBAccess.r_set.getString("Department_Name");
                Department_ComboBox.addItem(department_Name_Pulled);
            }

            myDBAccess.p_statement.executeUpdate();
            myDBAccess.p_statement.close();

            myDBAccess.CloseDB();
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    } 
    // </editor-fold>

    // ----------- BUTTONS -----------//
    // -------------------------------//
    
    private void Button_AddEmployeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Button_AddEmployeeActionPerformed
    {//GEN-HEADEREND:event_Button_AddEmployeeActionPerformed
        Boolean isEmpty = AreTextField_Empty();
        
        if(!isEmpty)
        {
            myDBAccess.Insert_Employee(FirstName_Text.getText(), LastName_Text.getText(), PhoneNumber_Text.getText(), Department_ComboBox.getSelectedIndex() + 1); 
            super.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please, fill in all the necessary information.","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Button_AddEmployeeActionPerformed

    private void Button_CancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Button_CancelActionPerformed
    {//GEN-HEADEREND:event_Button_CancelActionPerformed
        ResetTextField();
        super.dispose();
    }//GEN-LAST:event_Button_CancelActionPerformed

    private void Button_ResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Button_ResetActionPerformed
    {//GEN-HEADEREND:event_Button_ResetActionPerformed
        ResetTextField();
        Department_ComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_Button_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AddEmployee_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddEmployee_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_AddEmployee;
    private javax.swing.JButton Button_Cancel;
    private javax.swing.JButton Button_Reset;
    private javax.swing.JComboBox<String> Department_ComboBox;
    private javax.swing.JLabel Department_Lavel;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JTextField FirstName_Text;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JTextField LastName_Text;
    private javax.swing.JLabel PhoneNumber_Label;
    private javax.swing.JTextField PhoneNumber_Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
