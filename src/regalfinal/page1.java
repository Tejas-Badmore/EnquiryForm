/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regalfinal;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class page1 extends javax.swing.JFrame {

    JFrame frame;
    int x,y;
    int day,month,year;
    public page1() {
        initComponents();
        //watermark.rotate( Math.toRadians( 90 ));
        
        //((Graphics2D)watermark.getGraphics()).rotate( 3.14, watermark.getX(),watermark.getY() );
    }

  
   /* public void paintComponents(Graphics g) {
        ((Graphics2D)watermark.getGraphics()).rotate( 3.14, watermark.getX(),watermark.getY() );
        super.paintComponents(g);
       
    }*/


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        btnnewform = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtloginusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnadminlogin = new javax.swing.JButton();
        pwdloginpassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnnewform.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnnewform.setText("NEW FORM");
        btnnewform.setToolTipText("To new form\n");
        btnnewform.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnewform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewformActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "ADMIN LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        txtloginusername.setBackground(new java.awt.Color(135, 130, 135));
        txtloginusername.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtloginusername.setForeground(new java.awt.Color(255, 255, 255));
        txtloginusername.setToolTipText("username");
        txtloginusername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtloginusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginusernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("USERNAME:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD:");

        btnadminlogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnadminlogin.setText("LOGIN");
        btnadminlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadminlogin.setMaximumSize(new java.awt.Dimension(133, 31));
        btnadminlogin.setMinimumSize(new java.awt.Dimension(133, 31));
        btnadminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminloginActionPerformed(evt);
            }
        });

        pwdloginpassword.setBackground(new java.awt.Color(135, 130, 135));
        pwdloginpassword.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        pwdloginpassword.setForeground(new java.awt.Color(255, 255, 255));
        pwdloginpassword.setToolTipText("password");
        pwdloginpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pwdloginpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdloginpasswordActionPerformed(evt);
            }
        });
        pwdloginpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdloginpasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtloginusername)
                    .addComponent(pwdloginpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnadminlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtloginusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwdloginpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnadminlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(135, 130, 135));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Enquiry Form:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/70201asd8.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/702018.png"))); // NOI18N
        jLabel6.setText(" ");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("To Fill Enquiry Form Click Here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnewform, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel5)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnnewform, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnadminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminloginActionPerformed
       
        Calendar cal=new GregorianCalendar();
        day=cal.get(Calendar.DAY_OF_MONTH);
        month=cal.get(Calendar.MONTH);
        year=cal.get(Calendar.YEAR);
        
        String uname,pword;
        uname="REGAL";
        pword="12345";
        if(txtloginusername.getText().equals(uname) && pwdloginpassword.getText().equals(pword))
        {
            page4 pg4 = new page4(this);
            setVisible(false);
            pg4.setVisible(true);
             try
            {
                String str,str1;       
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/enquiryformtest","root","root");
                Statement st=con.createStatement();
                String query="Select max(id) as ID from mainform";
                String query2="Select max(id) as ID1 from logindate";
                ResultSet rs=st.executeQuery(query);
                if(rs.first())
                {
                    str=rs.getString("ID");
                    x=Integer.parseInt(str);
                    pg4.setCountId(x);
                }
                ResultSet rs1=st.executeQuery(query2);
                if(rs1.first())
                {
                    str1=rs1.getString("ID1");
                    y=Integer.parseInt(str1)+1;                                    
                }       
                else
                {
                    y=1;
                }
                String date=(day+"/"+(month+1)+"/"+year);
                int hr=cal.get(Calendar.HOUR);
                int min=cal.get(Calendar.MINUTE);
                int sec=cal.get(Calendar.SECOND);
                String time=(hr+":"+min+":"+sec);
                String query3="insert into logindate(id,date,time) values("+y+",'"+date+"','"+time+"')";
                st.executeUpdate(query3);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }         
            txtloginusername.setText("");
            pwdloginpassword.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Credential");
            if(txtloginusername.getText().equals(""))
            {
                txtloginusername.requestFocusInWindow();
            }
            else if(pwdloginpassword.getText().equals(""))
            {
                pwdloginpassword.requestFocusInWindow();
            }    
        }
    }//GEN-LAST:event_btnadminloginActionPerformed

    private void txtloginusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginusernameActionPerformed

    private void btnnewformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewformActionPerformed

        page2 pg2=new page2(this);
        setVisible(false);
        pg2.setVisible(true);
        try
        {
            String str;       
            Connection con;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/enquiryformtest","root","root");
            Statement st=con.createStatement();
            String query="Select max(id) as ID from mainform";
            ResultSet rs=st.executeQuery(query);
            if(rs.first())
            {
                str=rs.getString("ID");
                x=Integer.parseInt(str)+1;
                pg2.setNewId(x);
            }
            else
            {
                x=1;
                pg2.setNewId(x);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnnewformActionPerformed

    private void pwdloginpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdloginpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdloginpasswordActionPerformed

    private void pwdloginpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdloginpasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            Calendar cal=new GregorianCalendar();
            day=cal.get(Calendar.DAY_OF_MONTH);
            month=cal.get(Calendar.MONTH);
            year=cal.get(Calendar.YEAR);
             String uname,pword;
        uname="REGAL";
        pword="12345";
        if(txtloginusername.getText().equals(uname) && pwdloginpassword.getText().equals(pword))
        {
            page4 pg4 = new page4(this);
            setVisible(false);
            pg4.setVisible(true);
            try
            {
                String str,str1;       
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/enquiryformtest","root","root");
                Statement st=con.createStatement();
                String query="Select max(id) as ID from mainform";
                ResultSet rs=st.executeQuery(query);
                if(rs.first())
                {
                    str=rs.getString("ID");
                    x=Integer.parseInt(str);
                    pg4.setCountId(x);
                }            
                String query2="Select max(id) as ID1 from logindate";
                 ResultSet rs1=st.executeQuery(query2);
                if(rs1.first())
                {
                    str1=rs1.getString("ID1");
                    y=Integer.parseInt(str1)+1;                                    
                }  
                else
                {
                    y=1;
                }
                String date=(day+"/"+(month+1)+"/"+year);
                int hr=cal.get(Calendar.HOUR);
                int min=cal.get(Calendar.MINUTE);
                int sec=cal.get(Calendar.SECOND);
                String time=(hr+":"+min+":"+sec);
                String query3="insert into logindate(id,date,time) values("+y+",'"+date+"','"+time+"')";
                st.executeUpdate(query3);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            } 
            txtloginusername.setText("");
            pwdloginpassword.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Credential");
            if(txtloginusername.getText().equals(""))
            {
                txtloginusername.requestFocusInWindow();
            }
            else if(pwdloginpassword.getText().equals(""))
            {
                pwdloginpassword.requestFocusInWindow();
            }    
        } 
        }
    }//GEN-LAST:event_pwdloginpasswordKeyPressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
       dispose();       
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        this.setState(1);
    }//GEN-LAST:event_jLabel6MousePressed

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
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadminlogin;
    private javax.swing.JButton btnnewform;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pwdloginpassword;
    private javax.swing.JTextField txtloginusername;
    // End of variables declaration//GEN-END:variables
}
