/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incometax;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shreya
 */
public class ic extends javax.swing.JFrame {

    /**
     * Creates new form ic
     */
        
    
    public ic() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        income1 = new javax.swing.JLabel();
        income2 = new javax.swing.JLabel();
        deduction = new javax.swing.JLabel();
        taxrate = new javax.swing.JLabel();
        grossincome = new javax.swing.JLabel();
        taxableamount = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        fid = new javax.swing.JTextField();
        fincome1 = new javax.swing.JTextField();
        fincome2 = new javax.swing.JTextField();
        fdeduction = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        ftaxrate = new javax.swing.JLabel();
        fgrossincome = new javax.swing.JLabel();
        ftaxableamount = new javax.swing.JLabel();
        ftax = new javax.swing.JLabel();
        retrieve = new javax.swing.JButton();
        fsex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        jTextField4.setText("jTextField4");

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 184, 122));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(26, 104, 73));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setBackground(new java.awt.Color(0, 3, 228));
        name.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(50, 50, 64));
        name.setText("NAME");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        userid.setBackground(new java.awt.Color(181, 2, 242));
        userid.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        userid.setForeground(new java.awt.Color(75, 68, 28));
        userid.setText("USER ID");
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 40));

        sex.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        sex.setText("SEX");
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 50, 30));

        income1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        income1.setText("INCOME FROM SALARY");
        getContentPane().add(income1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        income2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        income2.setText("INCOME FROM OTHER SOURSES");
        getContentPane().add(income2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        deduction.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        deduction.setText("DEDUCTION");
        getContentPane().add(deduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        taxrate.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        taxrate.setText("TAX RATE");
        getContentPane().add(taxrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        grossincome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        grossincome.setText("TOTAL GROSS INCOME");
        getContentPane().add(grossincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 34));

        taxableamount.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        taxableamount.setText("TAXABLE AMOUNT");
        getContentPane().add(taxableamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        tax.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tax.setText("ITAX");
        getContentPane().add(tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, -1, -1));

        fname.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 90, 40));

        fid.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        fid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fidActionPerformed(evt);
            }
        });
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 90, 40));

        fincome1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        fincome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fincome1ActionPerformed(evt);
            }
        });
        getContentPane().add(fincome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 289, 95, 40));

        fincome2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        getContentPane().add(fincome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 95, 40));

        fdeduction.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        fdeduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdeductionActionPerformed(evt);
            }
        });
        getContentPane().add(fdeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 95, 40));

        calculate.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        calculate.setForeground(new java.awt.Color(43, 44, 216));
        calculate.setText("CALCULATE & SAVE");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, 220, 70));

        clear.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 3, 228));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 760, 140, 60));

        ftaxrate.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ftaxrate.setForeground(new java.awt.Color(76, 56, 0));
        ftaxrate.setText("taxrate");
        ftaxrate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(ftaxrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 70, -1));

        fgrossincome.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        fgrossincome.setForeground(new java.awt.Color(76, 56, 0));
        fgrossincome.setText("gross income");
        fgrossincome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(fgrossincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 86, 27));

        ftaxableamount.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ftaxableamount.setForeground(new java.awt.Color(76, 56, 0));
        ftaxableamount.setText("taxableamount");
        ftaxableamount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(ftaxableamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 119, -1));

        ftax.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ftax.setForeground(new java.awt.Color(76, 56, 0));
        ftax.setText("tax");
        ftax.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(ftax, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 690, 40, -1));

        retrieve.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        retrieve.setForeground(new java.awt.Color(0, 3, 228));
        retrieve.setText("RETRIEVE DATA");
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });
        getContentPane().add(retrieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 760, 240, 60));

        fsex.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        getContentPane().add(fsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 90, 40));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("INCOME TAX  CALCULATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 380, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        fname.setText("");
        fid.setText("");
        fincome1.setText("");
        fincome2.setText("");
        fdeduction.setText("");
        fgrossincome.setText("grossincome");
        ftaxableamount.setText("taxableamount");
        ftax.setText("tax");
        ftaxrate.setText("tax rate");
        fsex.setText("");
      
        JOptionPane.showMessageDialog(null,"Cleared!!");
       
    }//GEN-LAST:event_clearActionPerformed

    private void fidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fidActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        
        double userid;
        String name;
        String sex;
        double income1;
        double income2;
        double deduction;
        double taxrate =0 ;
        double grossincome;
        double taxableamount =0 ;
        double tax=0;
        
       name = fname.getText();
       userid = Double.parseDouble(fid.getText());
       income1 = Double.parseDouble(fincome1.getText());
       income2 = Double.parseDouble(fincome2.getText());
       deduction = Double.parseDouble(fdeduction.getText());
       sex = fsex.getText();
        
       grossincome = income1 + income2;
       taxableamount = grossincome -deduction;
       
       
       
		try
		{ 
                       
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection( 
			"jdbc:mysql://localhost:3306/INFO", "root", "rootpasswordgiven"); 
       
                       Statement statement = con.createStatement();
                        ResultSet results = statement.executeQuery("SELECT * FROM TAXINFO");
                        
                        JOptionPane.showMessageDialog(null,"success!!");
                 /*       
                          String q1 = "INSERT INTO USERINFO(NAME,ID,SEX,INCOME_FROM_SALARY,INC2,DEDUCTION,TAXRATE,GROSS_INCOME,TAXABLE_AMOUNT,TAX) VALUES(?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(q1);
                    System.out.println(name);
                    
                    pst.setString(1,name);
                    pst.setDouble(2,userid);
                     pst.setString(3,sex);
                      pst.setDouble(4,income1);
                       pst.setDouble(5,income2);
                        pst.setDouble(6,deduction);
                         pst.setDouble(7,taxrate);
                          pst.setDouble(8,grossincome);
                           pst.setDouble(9,taxableamount);
                            pst.setDouble(10,tax);
                            pst.execute();
                            JOptionPane.showMessageDialog(null,"Data Saved Sucessfully");
                            

         */
                       
                        
                         if(taxableamount < 250000.0)
       {
          // taxrate =0;
           results.absolute(1);  
           taxrate = (results.getInt(2)); 
           
           tax = (taxableamount * taxrate)/100;
           ftaxrate.setText(Double.toString(taxrate));
           
       }
       else if(taxableamount > 250000.0 & taxableamount < 500000.0)
               {
                   //taxrate = 10 ;
                   results.absolute(2);  
                   taxrate = (results.getInt(2)); 
                   tax = (taxrate * (taxableamount - 250000.0))/100;
                   ftaxrate.setText(Double.toString(taxrate));
               }
       else if (taxableamount > 500000.0 & taxableamount < 1000000.0)
       {
           //taxrate = 20;
           results.absolute(3);  
           taxrate = (results.getInt(2)); 
           tax = (25000 + (taxrate * (taxableamount - 50000)))/100;
           ftaxrate.setText(Double.toString(taxrate));
           
       }
       else if (taxableamount >1000000)
       {
           taxrate = 30;
           //results.absolute(4);  
           //taxrate = (results.getInt(2)); 
           tax = (125000 + (taxrate * (taxableamount - 50000)))/100;
           ftaxrate.setText(Double.toString(taxrate));
       }
                         
       fgrossincome.setText(Double.toString(grossincome));
       ftaxableamount.setText(Double.toString(taxableamount));
       ftax.setText(Double.toString(tax));
             
                JOptionPane.showMessageDialog(null,"calculated!!");
                
                con.close(); 
		} 
		catch(Exception e) 
		{ 
			JOptionPane.showMessageDialog(null,e);
		} 
                  
       
                try{
                    
                    Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection( 
			"jdbc:mysql://localhost:3306/INFO", "root", "rootpasswordgiven"); 
      
                     String q1 = "INSERT INTO USER_INFO(ID,NAME,SEX,INCOME_FROM_SALARY,INC2,DEDUCTION,TAXRATE,GROSS_INCOME,TAXABLE_AMOUNT,TAX) VALUES(?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(q1);
                    
                    
                   
                    pst.setDouble(1,userid);
                     pst.setString(2,fname.getText());
                     pst.setString(3,sex);
                      pst.setDouble(4,income1);
                       pst.setDouble(5,income2);
                        pst.setDouble(6,deduction);
                         pst.setDouble(7,taxrate);
                          pst.setDouble(8,grossincome);
                           pst.setDouble(9,taxableamount);
                            pst.setDouble(10,tax);
                            pst.execute();
                            JOptionPane.showMessageDialog(null,"Data Saved Sucessfully");
                            

                }
          
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Value Already Stored!");
                    
                }
    }//GEN-LAST:event_calculateActionPerformed

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
        // TODO add your handling code here:
       
      //  this.setVisible(false);
        //new JFrame().setVisible(true);
        try{
        double id = Double.parseDouble(fid.getText());
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
            Class.forName("com.mysql.cj.jdbc.Driver"); 
			 con = DriverManager.getConnection( 
			"jdbc:mysql://localhost:3306/INFO", "root", "rootpasswordgiven");
                         
             pst = con.prepareStatement("select * from USER_INFO where ID = ?");
             pst.setDouble(1, id);
             rs = pst.executeQuery();
             while(rs.next())
             {
                 fname.setText(rs.getString("NAME"));
                 fsex.setText(rs.getString("SEX"));
                 fincome1.setText(rs.getString("INCOME_FROM_SALARY"));
                 fincome2.setText(rs.getString("INC2"));
                 fdeduction.setText(rs.getString("DEDUCTION"));
                 ftaxrate.setText(rs.getString("TAXRATE"));
                 fgrossincome.setText(rs.getString("GROSS_INCOME"));
                 ftaxableamount.setText(rs.getString("TAXABLE_AMOUNT"));
                 ftax.setText(rs.getString("TAX"));
                 
                 JOptionPane.showMessageDialog(null,"sucessfully retrieved");
             }
             con.close();
             pst.close();
             rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_retrieveActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void fdeductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdeductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdeductionActionPerformed

    private void fincome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fincome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fincome1ActionPerformed

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
            java.util.logging.Logger.getLogger(ic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JLabel deduction;
    private javax.swing.JTextField fdeduction;
    private javax.swing.JLabel fgrossincome;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fincome1;
    private javax.swing.JTextField fincome2;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fsex;
    private javax.swing.JLabel ftax;
    private javax.swing.JLabel ftaxableamount;
    private javax.swing.JLabel ftaxrate;
    private javax.swing.JLabel grossincome;
    private javax.swing.JLabel income1;
    private javax.swing.JLabel income2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel name;
    private javax.swing.JButton retrieve;
    private javax.swing.JLabel sex;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel taxableamount;
    private javax.swing.JLabel taxrate;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables
}
