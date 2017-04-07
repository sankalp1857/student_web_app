/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class addempform_form1 extends javax.swing.JFrame {
    int y=0;
    int z=0;
    int x=0;
    int w=0;
    static Connection con45;
    public static void connect() throws ClassNotFoundException, SQLException
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="root";
		 con45=DriverManager.getConnection(url,user,pass);
    }
    catch(Exception e){}}

    /**
     * Creates new form addempform_form1
     */
    public addempform_form1()
    {
        initComponents();
        b.grabFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        d = new javax.swing.JComboBox();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("ADD RECORD");

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("STUDENT ID");

        b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bFocusLost(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NAME");

        c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cFocusLost(evt);
            }
        });
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("BRANCH");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ADDRESS");

        e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eFocusLost(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("ADD RECORD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        d.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Branch>", "CSE", "PE", "ECE", "EE", "IT", "ME", " " }));
        d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c)
                            .addComponent(b)
                            .addComponent(e)
                            .addComponent(d, 0, 152, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();

        new form1().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                b.setText("");
                c.setText("");
                d.setSelectedIndex(0);
                e.setText("");
                b.grabFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try
        {
            String p1=b.getText();
              String q1=c.getText();
              String r1=d.getSelectedItem().toString();
              String s1= e.getText();
              
              
              //main program for add employee
                 connect();
                 int n=0,l=0;
                 int kj=Integer.parseInt(b.getText());
           java.sql.PreparedStatement pst2=con45.prepareStatement("select * from ss");
        ResultSet rst=pst2.executeQuery();
        while(rst.next())
        {
            n=Integer.parseInt(rst.getString(1));
            if(n==kj)
            {
                l=1;
                break;
            }
            
        }
        if(l==1)
        {
             JOptionPane.showMessageDialog(this,"Student Id Already Exist");
             b.setText("");
             b.grabFocus();
        }
        else
        {
            int y=0;
            int p=Integer.parseInt(b.getText());
            String q=c.getText();
            String r=d.getSelectedItem().toString();
            String  s= e.getText();
            java.sql.PreparedStatement pst=con45.prepareStatement("INSERT INTO ss (id,name,branch,address) VALUES (?,?,?,?)");
            pst.setInt(1,p);
            pst.setString(2, q);
            pst.setString(3, r);
            pst.setString(4, s);
           
            y=pst.executeUpdate();
            if(y==0)
            {
                JOptionPane.showMessageDialog(this,"Data Feeding Failed");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Data Successfully Entered");
                b.setText("");
                c.setText("");
                d.setSelectedIndex(0);
                e.setText("");
                b.grabFocus();

            }
        }
        }
        
        catch(Exception e){}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cFocusLost
 
        if(y!=1)
        {
        String q1=c.getText();
        int fz=0;
        for(int j=0;j<q1.length();j++)
            {
                if((Character.isDigit(q1.charAt(j))))
                {
                    fz=1;
                    break;
                }
                
            }
         if(q1.equals(""))
              {
                   
              
              z=1;
               JOptionPane.showMessageDialog(this,"student name can't be left blank"); 
               c.grabFocus();
              }
        
         else if(fz==1)
         {
             c.setText(""); 
            z=1;
             JOptionPane.showMessageDialog(this,"student name can't have digits"); 
               c.grabFocus();
              
         }
         
         else
         {
         z=0;
         }
        }
       
    }//GEN-LAST:event_cFocusLost

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dFocusLost

        if((z!=1)&&(y!=1))
        {
            String hh=d.getSelectedItem().toString();
            if(hh.equals("<Branch>"))
            {
                x=1;
                JOptionPane.showMessageDialog(this,"please select the branch"); 
                d.grabFocus();
            }
            else
            {
                x=0;
            }
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_dFocusLost

    private void eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eFocusLost

          String p1=e.getText();
         int fz=0;
         if((y!=1)&&(z!=1)&&(x!=1))
         {
          for(int j=0;j<p1.length();j++)
            {
                if(!(Character.isDigit(p1.charAt(j))))
                {
                    fz=1;
                    break;
                }
                
            }
         if(p1.equals(""))
                      {
                          w=1;
                          JOptionPane.showMessageDialog(this,"student id. can't be empty");
                         
                          e.grabFocus();
                         
                      }
         else
         {
             w=0;
         }
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_eFocusLost

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bFocusLost

        String p1=b.getText();
        int fz=0;
        for(int j=0;j<p1.length();j++)
        {
            if(!(Character.isDigit(p1.charAt(j))))
            {
                fz=1;
                break;
            }

        }
        if(p1.equals(""))
        {
            y=1;
            JOptionPane.showMessageDialog(this,"student id can't be empty");

            b.grabFocus();

        }
        else
        {
            y=0;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addempform_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addempform_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addempform_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addempform_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addempform_form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JComboBox d;
    private javax.swing.JTextField e;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
