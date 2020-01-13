/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regalfinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class statistics extends javax.swing.JFrame {

    page4 pg4;
    String text;
    public statistics() {
        initComponents();
        _addMenuItem();
    }
    statistics(page4 p4){
        pg4=p4;
        initComponents();
        _addMenuItem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmname = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jmgender = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jmclg = new javax.swing.JMenu();
        jmbranch = new javax.swing.JMenu();
        jmcourse = new javax.swing.JMenu();
        jmshift = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmcity = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "E-mail", "Gender", "Course", "College", "Branch", "Shift", "Birthdate", "Parent mobile", "Parent E-mail", "City", "Local Address", "Per Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCellSelectionEnabled(true);
        jTable1.setRowHeight(25);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(1);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1850, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(135, 130, 135));
        jMenuBar1.setForeground(new java.awt.Color(135, 130, 135));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(66, 40));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(123, 50));

        jmname.setText("Name");
        jmname.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jmname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmname.setPreferredSize(new java.awt.Dimension(80, 24));
        jmname.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jmnameMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jmname.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmnameMenuSelected(evt);
            }
        });
        jmname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmnameMouseExited(evt);
            }
        });
        jmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnameActionPerformed(evt);
            }
        });

        jMenuItem6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem6.setText("First Name");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmname.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem7.setText("Last Name");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmname.add(jMenuItem7);

        jMenuBar1.add(jmname);

        jmgender.setText("Gender");
        jmgender.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jmgender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmgender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmgender.setPreferredSize(new java.awt.Dimension(97, 24));
        jmgender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmgenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmgenderMouseExited(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem4.setText("Male");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmgender.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem5.setText("Female");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmgender.add(jMenuItem5);

        jMenuBar1.add(jmgender);

        jmclg.setText("College");
        jmclg.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jmclg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmclg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmclg.setPreferredSize(new java.awt.Dimension(98, 24));
        jmclg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmclgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmclgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmclgMousePressed(evt);
            }
        });
        jmclg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmclgActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmclg);

        jmbranch.setText("Branch");
        jmbranch.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jmbranch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmbranch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmbranch.setPreferredSize(new java.awt.Dimension(94, 24));
        jmbranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmbranchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmbranchMouseExited(evt);
            }
        });
        jMenuBar1.add(jmbranch);

        jmcourse.setText("Course");
        jmcourse.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jmcourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmcourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmcourse.setPreferredSize(new java.awt.Dimension(95, 24));
        jmcourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmcourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmcourseMouseExited(evt);
            }
        });
        jMenuBar1.add(jmcourse);

        jmshift.setText("Shift");
        jmshift.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jmshift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmshift.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmshift.setPreferredSize(new java.awt.Dimension(75, 24));
        jmshift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmshiftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmshiftMouseExited(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem2.setText("1");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmshift.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenuItem3.setText("2");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmshift.add(jMenuItem3);

        jMenuBar1.add(jmshift);

        jmcity.setText("City");
        jmcity.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jmcity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmcity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmcity.setPreferredSize(new java.awt.Dimension(55, 24));
        jmcity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmcityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmcityMouseExited(evt);
            }
        });
        jMenuBar1.add(jmcity);

        jMenu2.setEnabled(false);
        jMenu2.setHideActionText(true);
        jMenu2.setPreferredSize(new java.awt.Dimension(1400, 24));
        jMenuBar1.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/702018.png"))); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(40, 50));
        jMenu1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/702018.png"))); // NOI18N
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/70201asd8.jpg"))); // NOI18N
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnameMouseEntered
        jmname.setForeground(Color.red);
        
    }//GEN-LAST:event_jmnameMouseEntered

    private void jmnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnameMouseExited
       jmname.setForeground(Color.BLACK);
    }//GEN-LAST:event_jmnameMouseExited

    private void jmgenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmgenderMouseEntered
        jmgender.setForeground(Color.red);
    }//GEN-LAST:event_jmgenderMouseEntered

    private void jmgenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmgenderMouseExited
        jmgender.setForeground(Color.black);
    }//GEN-LAST:event_jmgenderMouseExited

    private void jmclgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmclgMouseEntered
        jmclg.setForeground(Color.red);
    }//GEN-LAST:event_jmclgMouseEntered

    private void jmclgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmclgMouseExited
        jmclg.setForeground(Color.black);
    }//GEN-LAST:event_jmclgMouseExited

    private void jmbranchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmbranchMouseEntered
        jmbranch.setForeground(Color.red);
    }//GEN-LAST:event_jmbranchMouseEntered

    private void jmbranchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmbranchMouseExited
        jmbranch.setForeground(Color.black);
    }//GEN-LAST:event_jmbranchMouseExited

    private void jmcourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmcourseMouseEntered
        jmcourse.setForeground(Color.red);
    }//GEN-LAST:event_jmcourseMouseEntered

    private void jmcourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmcourseMouseExited
        jmcourse.setForeground(Color.black);
    }//GEN-LAST:event_jmcourseMouseExited

    private void jmshiftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmshiftMouseEntered
        jmshift.setForeground(Color.red);
    }//GEN-LAST:event_jmshiftMouseEntered

    private void jmshiftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmshiftMouseExited
        jmshift.setForeground(Color.black);
    }//GEN-LAST:event_jmshiftMouseExited

    private void jmcityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmcityMouseEntered
        jmcity.setForeground(Color.red);
    }//GEN-LAST:event_jmcityMouseEntered

    private void jmcityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmcityMouseExited
      jmcity.setForeground(Color.black);
    }//GEN-LAST:event_jmcityMouseExited

    private void jmnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnameMouseClicked
           
    }//GEN-LAST:event_jmnameMouseClicked

    private void jmclgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmclgMousePressed
        
    }//GEN-LAST:event_jmclgMousePressed

    private void jmclgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmclgActionPerformed
        
            
    }//GEN-LAST:event_jmclgActionPerformed

    private void jmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnameActionPerformed
       
    }//GEN-LAST:event_jmnameActionPerformed

    private void jmnameMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmnameMenuSelected
        
    }//GEN-LAST:event_jmnameMenuSelected

    private void jmnameMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jmnameMenuKeyPressed
        
    }//GEN-LAST:event_jmnameMenuKeyPressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        text=evt.getActionCommand();
        if(text=="Male")
            setTable(2,"male",null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        text=evt.getActionCommand();
        if(text=="Female")
            setTable(2,"female",null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      text=evt.getActionCommand();
        setTable(6, text,null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        text=evt.getActionCommand();
        setTable(6, text,null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        String str=JOptionPane.showInputDialog(null,"Input Name");
        setTable(1,str,"fname");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       String str=JOptionPane.showInputDialog(null,"Input Name");
        setTable(1,str,"lname");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
       
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
       this.setState(1);
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        dispose();
        pg4.setVisible(true);
    }//GEN-LAST:event_jMenu3MousePressed

    public void _addMenuItem()
    {
        try {
            Connection con;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/enquiryformtest","root","root");
            String sql1="select clgname from college";
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(sql1);
            Font f=new Font("Arial",Font.BOLD,16);
            
            while(rs.next())
            {
                JMenuItem jm=new JMenuItem(rs.getString("clgname"));
                jm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JMenuItem menuItem = (JMenuItem) e.getSource();
                   text = menuItem.getText();
                    setTable(3, text,null);
                }
                });
                jm.setFont(f);
                jmclg.add(jm);
                
            }
             sql1="select cityname from city";
             ResultSet rs1= st.executeQuery(sql1);
             while(rs1.next())
            {
                JMenuItem jm=new JMenuItem(rs1.getString("cityname"));
                jm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JMenuItem menuItem = (JMenuItem) e.getSource();
                   text = menuItem.getText();
                    setTable(7, text,null);
                }
                });
                jm.setFont(f);
                jmcity.add(jm);
                
            }
             sql1="select coursename from course";
             ResultSet rs2= st.executeQuery(sql1);
             while(rs2.next())
            {
                JMenuItem jm=new JMenuItem(rs2.getString("coursename"));
                jm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JMenuItem menuItem = (JMenuItem) e.getSource();
                   text = menuItem.getText();
                    setTable(5, text,null);
                }
                });
                jm.setFont(f);
                jmcourse.add(jm);
                 
            }
             sql1="select branchname from branch";
             ResultSet rs3= st.executeQuery(sql1);
             while(rs3.next())
            {
                JMenuItem jm=new JMenuItem(rs3.getString("branchname"));
                jm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JMenuItem menuItem = (JMenuItem) e.getSource();
                   text = menuItem.getText();
                    setTable(4, text,null);
                }
                });
                jm.setFont(f);
                jmbranch.add(jm);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setTable(int tb_no,String label,String first)
    {
       jTable1.setVisible(true);
        try {
             Connection con;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/enquiryformtest","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            String query;
            switch(tb_no)
            {
                case 1:
                    DefaultTableModel model4 = (DefaultTableModel) jTable1.getModel();
                    model4.setRowCount(0);
                    query=("select mainform.id,fname,mname,lname,phone,birthdate,mail,p_phone,p_mail,branchname,clgname,coursename,gender,cityname,shift,locaddress,peraddress from mainform,branch,college,course,city\n" +
                    "where mainform.branchid=branch.id\n" +
                    "and mainform.clgid=college.id\n" +
                    "and mainform.courseid=course.id\n" +
                    "and mainform.cityid=city.id and "+first+"='"+label+"'");  
                    rs= st.executeQuery(query);
                    while(rs.next())
                    {
                        int ID=Integer.parseInt(rs.getString("id"));
                        String name=rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname");
                        String phone=rs.getString("phone");
                        String birthdate=rs.getString("birthdate");
                        String email=rs.getString("mail");
                        String p_phone=rs.getString("p_phone");
                        String p_mail=rs.getString("p_mail");
                        String branch=rs.getString("branchname");
                        String clg=rs.getString("clgname");
                        String course=rs.getString("coursename");
                        String gender=rs.getString("gender");
                        String city=rs.getString("cityname");
                        String shift=rs.getString("shift");
                        String loc=rs.getString("locaddress");
                        String per=rs.getString("peraddress");
                        Object[] row = { ID,name,phone,email,gender,course,clg,branch,shift,birthdate,p_phone,p_mail,city,loc,per };
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(row);
                    }    
                    break;
                case 2:
                    DefaultTableModel model6 = (DefaultTableModel) jTable1.getModel();
                    model6.setRowCount(0);
                    query=("select mainform.id,fname,mname,lname,phone,birthdate,mail,p_phone,p_mail,branchname,clgname,coursename,gender,cityname,shift,locaddress,peraddress from mainform,branch,college,course,city\n" +
                    "where mainform.branchid=branch.id\n" +
                    "and mainform.clgid=college.id\n" +
                    "and mainform.courseid=course.id\n" +
                    "and mainform.cityid=city.id and gender='"+label+"'");  
                    rs= st.executeQuery(query);
                    while(rs.next())
                    {
                        int ID=Integer.parseInt(rs.getString("id"));
                        String name=rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname");
                        String phone=rs.getString("phone");
                        String birthdate=rs.getString("birthdate");
                        String email=rs.getString("mail");
                        String p_phone=rs.getString("p_phone");
                        String p_mail=rs.getString("p_mail");
                        String branch=rs.getString("branchname");
                        String clg=rs.getString("clgname");
                        String course=rs.getString("coursename");
                        String gender=rs.getString("gender");
                        String city=rs.getString("cityname");
                        String shift=rs.getString("shift");
                        String loc=rs.getString("locaddress");
                        String per=rs.getString("peraddress");
                        Object[] row = { ID,name,phone,email,gender,course,clg,branch,shift,birthdate,p_phone,p_mail,city,loc,per };
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(row);
                    }
                    break;
                case 3:
                    DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
                    model1.setRowCount(0);
                    query=("select mainform.id,fname,mname,lname,phone,birthdate,mail,p_phone,p_mail,branchname,clgname,coursename,gender,cityname,shift,locaddress,peraddress from mainform,branch,college,course,city\n" +
                    "where mainform.branchid=branch.id\n" +
                    "and mainform.clgid=college.id\n" +
                    "and mainform.courseid=course.id\n" +
                    "and mainform.cityid=city.id and clgname='"+label+"'");  
                    rs= st.executeQuery(query);
                    while(rs.next())
                    {
                        int ID=Integer.parseInt(rs.getString("id"));
                        String name=rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname");
                        String phone=rs.getString("phone");
                        String birthdate=rs.getString("birthdate");
                        String email=rs.getString("mail");
                        String p_phone=rs.getString("p_phone");
                        String p_mail=rs.getString("p_mail");
                        String branch=rs.getString("branchname");
                        String clg=rs.getString("clgname");
                        String course=rs.getString("coursename");
                        String gender=rs.getString("gender");
                        String city=rs.getString("cityname");
                        String shift=rs.getString("shift");
                        String loc=rs.getString("locaddress");
                        String per=rs.getString("peraddress");
                        Object[] row = { ID,name,phone,email,gender,course,clg,branch,shift,birthdate,p_phone,p_mail,city,loc,per };
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(row);
                    }
                    break;
                case 4:
                    DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                    model2.setRowCount(0);
                    query=("select mainform.id,fname,mname,lname,phone,birthdate,mail,p_phone,p_mail,branchname,clgname,coursename,gender,cityname,shift,locaddress,peraddress from mainform,branch,college,course,city\n" +
                    "where mainform.branchid=branch.id\n" +
                    "and mainform.clgid=college.id\n" +
                    "and mainform.courseid=course.id\n" +
                    "and mainform.cityid=city.id and branchname='"+label+"'");  
                    rs= st.executeQuery(query);
                    while(rs.next())
                    {
                        int ID=Integer.parseInt(rs.getString("id"));
                        String name=rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname");
                        String phone=rs.getString("phone");
                        String birthdate=rs.getString("birthdate");
                        String email=rs.getString("mail");
                        String p_phone=rs.getString("p_phone");
                        String p_mail=rs.getString("p_mail");
                        String branch=rs.getString("branchname");
                        String clg=rs.getString("clgname");
                        String course=rs.getString("coursename");
                        String gender=rs.getString("gender");
                        String city=rs.getString("cityname");
                        String shift=rs.getString("shift");
                        String loc=rs.getString("locaddress");
                        String per=rs.getString("peraddress");
                        Object[] row = { ID,name,phone,email,gender,course,clg,branch,shift,birthdate,p_phone,p_mail,city,loc,per };
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(row);
                    }
                    break;
                case 5:
                    DefaultTableModel model3 = (DefaultTableModel) jTable1.getModel();
                    model3.setRowCount(0);
                    query=("select mainform.id,fname,mname,lname,phone,birthdate,mail,p_phone,p_mail,branchname,clgname,coursename,gender,cityname,shift,locaddress,peraddress from mainform,branch,college,course,city\n" +
                    "where mainform.branchid=branch.id\n" +
                    "and mainform.clgid=college.id\n" +
                    "and mainform.courseid=course.id\n" +
                    "and mainform.cityid=city.id and coursename='"+label+"'");  
                    rs= st.executeQuery(query);
                    while(rs.next())
                    {
                        int ID=Integer.parseInt(rs.getString("id"));
                        String name=rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname");
                        String phone=rs.getString("phone");
                        String birthdate=rs.getString("birthdate");
                        String email=rs.getString("mail");
                        String p_phone=rs.getString("p_phone");
                        String p_mail=rs.getString("p_mail");
                        String branch=rs.getString("branchname");
                        String clg=rs.getString("clgname");
                        String course=rs.getString("coursename");
                        String gender=rs.getString("gender");
                        String city=rs.getString("cityname");
                        String shift=rs.getString("shift");
                        String loc=rs.getString("locaddress");
                        String per=rs.getString("peraddress");
                        Object[] row = { ID,name,phone,email,gender,course,clg,branch,shift,birthdate,p_phone,p_mail,city,loc,per };
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(row);
                    }
                    break;
                case 6:
                    DefaultTableModel model7 = (DefaultTableModel) jTable1.getModel();
                    model7.setRowCount(0);
                    query=("select mainform.id,fname,mname,lname,phone,birthdate,mail,p_phone,p_mail,branchname,clgname,coursename,gender,cityname,shift,locaddress,peraddress from mainform,branch,college,course,city\n" +
                    "where mainform.branchid=branch.id\n" +
                    "and mainform.clgid=college.id\n" +
                    "and mainform.courseid=course.id\n" +
                    "and mainform.cityid=city.id and shift='"+label+"'");  
                    rs= st.executeQuery(query);
                    while(rs.next())
                    {
                        int ID=Integer.parseInt(rs.getString("id"));
                        String name=rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname");
                        String phone=rs.getString("phone");
                        String birthdate=rs.getString("birthdate");
                        String email=rs.getString("mail");
                        String p_phone=rs.getString("p_phone");
                        String p_mail=rs.getString("p_mail");
                        String branch=rs.getString("branchname");
                        String clg=rs.getString("clgname");
                        String course=rs.getString("coursename");
                        String gender=rs.getString("gender");
                        String city=rs.getString("cityname");
                        String shift=rs.getString("shift");
                        String loc=rs.getString("locaddress");
                        String per=rs.getString("peraddress");
                        Object[] row = { ID,name,phone,email,gender,course,clg,branch,shift,birthdate,p_phone,p_mail,city,loc,per };
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(row);
                    }
                    break;
                case 7:
                    DefaultTableModel model5 = (DefaultTableModel) jTable1.getModel();
                    model5.setRowCount(0);
                    query=("select mainform.id,fname,mname,lname,phone,birthdate,mail,p_phone,p_mail,branchname,clgname,coursename,gender,cityname,shift,locaddress,peraddress from mainform,branch,college,course,city\n" +
                    "where mainform.branchid=branch.id\n" +
                    "and mainform.clgid=college.id\n" +
                    "and mainform.courseid=course.id\n" +
                    "and mainform.cityid=city.id and cityname='"+label+"'");  
                    rs= st.executeQuery(query);
                    while(rs.next())
                    {
                        int ID=Integer.parseInt(rs.getString("id"));
                        String name=rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname");
                        String phone=rs.getString("phone");
                        String birthdate=rs.getString("birthdate");
                        String email=rs.getString("mail");
                        String p_phone=rs.getString("p_phone");
                        String p_mail=rs.getString("p_mail");
                        String branch=rs.getString("branchname");
                        String clg=rs.getString("clgname");
                        String course=rs.getString("coursename");
                        String gender=rs.getString("gender");
                        String city=rs.getString("cityname");
                        String shift=rs.getString("shift");
                        String loc=rs.getString("locaddress");
                        String per=rs.getString("peraddress");
                        Object[] row = { ID,name,phone,email,gender,course,clg,branch,shift,birthdate,p_phone,p_mail,city,loc,per };
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(row);
                    }
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
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
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu jmbranch;
    private javax.swing.JMenu jmcity;
    private javax.swing.JMenu jmclg;
    private javax.swing.JMenu jmcourse;
    private javax.swing.JMenu jmgender;
    private javax.swing.JMenu jmname;
    private javax.swing.JMenu jmshift;
    // End of variables declaration//GEN-END:variables
}
