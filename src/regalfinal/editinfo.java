/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regalfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class editinfo extends javax.swing.JFrame {

    page4 pg4;

    editinfo(page4 p) {
        pg4 = p;
        initComponents();
        visibleCombobox();
    }

    public editinfo() {
        initComponents();
        visibleCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        cmblist = new javax.swing.JComboBox();
        txtlistname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        rdadd = new javax.swing.JRadioButton();
        rddelete = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(506, 392));

        jPanel2.setBackground(new java.awt.Color(135, 130, 135));
        jPanel2.setPreferredSize(new java.awt.Dimension(331, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Edit:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/702018.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnback.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        cmblist.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        cmblist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "city", "college", "branch", "course" }));
        cmblist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblistActionPerformed(evt);
            }
        });

        txtlistname.setBackground(new java.awt.Color(153, 153, 153));
        txtlistname.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtlistname.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Enter Name:");

        btnupdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdadd);
        rdadd.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rdadd.setText("Add");
        rdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdaddActionPerformed(evt);
            }
        });

        buttonGroup1.add(rddelete);
        rddelete.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rddelete.setText("Delete");
        rddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(rdadd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(rddelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnupdate)
                                .addGap(114, 114, 114)
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtlistname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmblist, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdadd)
                    .addComponent(rddelete))
                .addGap(28, 28, 28)
                .addComponent(cmblist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlistname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        pg4.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int choice,x;
        choice = cmblist.getSelectedIndex();
        String itemchoice=String.valueOf(cmblist.getSelectedItem());
      // txtlistname.setText(itemchoice);
       String query="select max(id) as ID from "+itemchoice+" ";
    
        try {
            
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enquiryformtest", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            //txtlistname.setText(rs.getString("ID"));
            String temp=rs.getString("ID");
            x=Integer.parseInt(temp)+1;
            //String.valueOf(x);
            if (rdadd.isSelected()) {
                if(txtlistname.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Enter Proper name");  
                }
                else
                {
                    String input;
                    switch(choice)
                    {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Please select where to edit");
                            break;
                        case 1:
                            input="insert into city(id,cityname) values("+x+",'"+txtlistname.getText()+"')";
                            st.executeUpdate(input);
                            break;
                        case 2:
                            input="insert into college(id,clgname) values("+x+",'"+txtlistname.getText()+"')";
                            st.executeUpdate(input);
                            break;
                        case 3:
                            input="insert into branch(id,branchname) values("+x+",'"+txtlistname.getText()+"')";
                            st.executeUpdate(input);
                            break;
                        case 4:
                            input="insert into course(id,coursename) values("+x+",'"+txtlistname.getText()+"')";
                            st.executeUpdate(input);
                            break;
                    }    
                    JOptionPane.showMessageDialog(null, "Successfully Entered!!!");
                }   
            } 
            else if (rddelete.isSelected()) {
                if(txtlistname.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Enter Proper name");
                }    
                else
                {
                    /*
                        Set @autoid :=0;
                        update tablename set id= @autoid:= (@autoid+1);
                        alter table tablename Auto_increment=1;                   
                    
                    String input;
                    switch(choice)
                    {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Please select where to edit");
                            break;
                        case 1:
                            input=("delete from city where cityname="+txtlistname.getText());
                             st.executeUpdate(input);
                    }*/
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Please Select the proper operation");
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void rdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdaddActionPerformed
        cmblist.setEnabled(true);
    }//GEN-LAST:event_rdaddActionPerformed

    private void rddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddeleteActionPerformed
        cmblist.setEnabled(true);
    }//GEN-LAST:event_rddeleteActionPerformed

    private void cmblistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblistActionPerformed

    }//GEN-LAST:event_cmblistActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        this.setState(1);
    }//GEN-LAST:event_jLabel2MousePressed

    public void visibleCombobox() {
        cmblist.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(editinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmblist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdadd;
    private javax.swing.JRadioButton rddelete;
    private javax.swing.JTextField txtlistname;
    // End of variables declaration//GEN-END:variables
}