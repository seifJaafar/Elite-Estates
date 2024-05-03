package com.mycompany.real.estate.sytem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.mycompany.real.estate.sytem.Clients1;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Appartments extends javax.swing.JFrame {
    Connection Con = null;
    Statement St = null;
    Statement St1 = null;
    ResultSet Rs = null;
    ResultSet Rs1 = null;
    String DB_NAME = "jdbc:derby://localhost:1527/RealEstate";
    String DB_USER = "app";
    String DB_PASS = "app";
    
    public Appartments() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        menu1.initMoving(this);
        SelectAppartement();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ADDRESS = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        PRICE = new javax.swing.JTextField();
        CONDITION = new javax.swing.JComboBox<>();
        NBBATHROOMS = new javax.swing.JTextField();
        NBBEDROOMS = new javax.swing.JTextField();
        SURFACE = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppartementsTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        menu1 = new component.menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Address");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Price");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Number of bedrooms");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Number of bathrooms");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Surface area");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Condition");

        ADDRESS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSActionPerformed(evt);
            }
        });

        ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        PRICE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRICEActionPerformed(evt);
            }
        });

        CONDITION.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CONDITION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "free", "renovated", "under renovation", "under construction", "rented" }));

        NBBATHROOMS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NBBATHROOMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NBBATHROOMSActionPerformed(evt);
            }
        });

        NBBEDROOMS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NBBEDROOMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NBBEDROOMSActionPerformed(evt);
            }
        });

        SURFACE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SURFACE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SURFACEActionPerformed(evt);
            }
        });

        Addbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Addbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\S3IX6\\OneDrive\\Documents\\NetBeansProjects\\Real.estate.sytem\\src\\main\\java\\images\\add.png")); // NOI18N
        Addbtn.setText("ADD");
        Addbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addbtn.setContentAreaFilled(false);
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Updatebtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Updatebtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\S3IX6\\OneDrive\\Documents\\NetBeansProjects\\Real.estate.sytem\\src\\main\\java\\images\\update.png")); // NOI18N
        Updatebtn.setText("UPDATE");
        Updatebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Updatebtn.setContentAreaFilled(false);
        Updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatebtnMouseClicked(evt);
            }
        });
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        Deletebtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Deletebtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\S3IX6\\OneDrive\\Documents\\NetBeansProjects\\Real.estate.sytem\\src\\main\\java\\images\\delete.png")); // NOI18N
        Deletebtn.setText("DELETE");
        Deletebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Deletebtn.setContentAreaFilled(false);
        Deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletebtnMouseClicked(evt);
            }
        });
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        AppartementsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AppartementsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Address", "Price", "Condition", "NbBedrooms", "Surface", "NbBathrooms", "NbLocations"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppartementsTable.getTableHeader().setResizingAllowed(false);
        AppartementsTable.getTableHeader().setReorderingAllowed(false);
        AppartementsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppartementsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AppartementsTable);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Manage Appartments");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchBtn.setContentAreaFilled(false);
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        Refresh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Refresh.setContentAreaFilled(false);
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CONDITION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NBBEDROOMS, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SURFACE, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NBBATHROOMS, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NBBATHROOMS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NBBEDROOMS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SURFACE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CONDITION)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 0, 940, 643));

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 140));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 50));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 190, 60));

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 190, 50));

        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
        });
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   //Affichage liste appartements
    public void SelectAppartement(){
        try{
             Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
             St1 = Con.createStatement();
             Rs1 = St1.executeQuery("Select * from APPARTEMENTS");
            /* AppartementsTable.setModel(new ResultSetHandler.handle(Rs1)); */  
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("ID");
            tableModel.addColumn("Address");
            tableModel.addColumn("Price");
            tableModel.addColumn("Condition");
            tableModel.addColumn("NbBedrooms");
            tableModel.addColumn("Surface");
            tableModel.addColumn("NbBathrooms");
            tableModel.addColumn("NbLocations");
        while (Rs1.next()) {
            Object[] row = new Object[8];
            row[0] = Rs1.getString("ID");
            row[2] = Rs1.getDouble("PRICE");
            row[4] = Rs1.getInt("NBBEDROOMS");
            row[6] = Rs1.getInt("NBBATHROOMS");
            row[5] = Rs1.getInt("SURFACE");
            row[1]= Rs1.getString("ADDRESS");
            row[3] = Rs1.getString("CONDITION");
            row[7] = Rs1.getInt("NBRLOCATIONS");
            tableModel.addRow(row);
        }

        AppartementsTable.setModel(tableModel);
        Con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
       
    }
    private void ADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRICEActionPerformed

    private void NBBATHROOMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NBBATHROOMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NBBATHROOMSActionPerformed

    private void NBBEDROOMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NBBEDROOMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NBBEDROOMSActionPerformed

    private void SURFACEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SURFACEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SURFACEActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbtnActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletebtnActionPerformed
    // ADD APPARTEMENT
    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
        try{
            Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
            PreparedStatement add = Con.prepareStatement("insert into APPARTEMENTS values (?,?,?,?,?,?,?,?)");
            add.setString(1, ID.getText());
            add.setDouble(2,Double.valueOf(PRICE.getText()));
            add.setInt(3,Integer.valueOf(NBBEDROOMS.getText()));
            add.setInt(4,Integer.valueOf(NBBATHROOMS.getText()));
            add.setInt(5,Integer.valueOf(SURFACE.getText()));
            add.setString(6,ADDRESS.getText());
            add.setString(7,CONDITION.getSelectedItem().toString());
            add.setInt(8,0);
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Appartment Successfully Added !");
            Con.close();
            SelectAppartement();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddbtnMouseClicked

    private void DeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletebtnMouseClicked
        if(ID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Appartement's Id To be Deleted");
        }else{
            try{
                int a = JOptionPane.showConfirmDialog(null,"Do you really want to delete the Appartment?","select",JOptionPane.YES_NO_OPTION);
                 if(a == 0){
                      Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
                      
                      PreparedStatement Del = Con.prepareStatement("Delete from APPARTEMENTS where ID = ?");
                      Del.setString(1,ID.getText());
                      int row = Del.executeUpdate();
                }
                JOptionPane.showMessageDialog(this,"Appartment Successfully Deleted !");
                SelectAppartement();
                Con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeletebtnMouseClicked

    private void AppartementsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppartementsTableMouseClicked
        int rowIndex = AppartementsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) AppartementsTable.getModel();
        ID.setText(model.getValueAt(rowIndex, 0).toString());
        ADDRESS.setText(model.getValueAt(rowIndex, 1).toString());
        PRICE.setText(model.getValueAt(rowIndex, 2).toString());
        CONDITION.setSelectedItem(model.getValueAt(rowIndex, 3));
        NBBEDROOMS.setText(model.getValueAt(rowIndex, 4).toString());
        SURFACE.setText(model.getValueAt(rowIndex, 5).toString());
        NBBATHROOMS.setText(model.getValueAt(rowIndex, 6).toString());
    }//GEN-LAST:event_AppartementsTableMouseClicked

    private void UpdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatebtnMouseClicked
        if(ID.getText().isEmpty() || ADDRESS.getText().isEmpty() || PRICE.getText().isEmpty() || NBBEDROOMS.getText().isEmpty() || NBBATHROOMS.getText().isEmpty() || CONDITION.getSelectedItem().toString().isEmpty() ){
            JOptionPane.showMessageDialog(this,"Missing Information !");
        }else{
            try{
                Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
               PreparedStatement Upd = Con.prepareStatement("Update APPARTEMENTS set  PRICE = ? , NBBEDROOMS = ? , NBBATHROOMS = ? ,SURFACE = ? ,ADDRESS = ?,CONDITION = ? WHERE ID = ?");
                Upd.setString(7, ID.getText());
                Upd.setDouble(1,Double.valueOf(PRICE.getText()));
                Upd.setInt(2,Integer.valueOf(NBBEDROOMS.getText()));
                Upd.setInt(3,Integer.valueOf(NBBATHROOMS.getText()));
                Upd.setInt(4,Integer.valueOf(SURFACE.getText()));
                Upd.setString(5,ADDRESS.getText());
                Upd.setString(6,CONDITION.getSelectedItem().toString());
                int row = Upd.executeUpdate();
                JOptionPane.showMessageDialog(this,"Appartment Successfully Updated !");
                Con.close();
            SelectAppartement();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdatebtnMouseClicked

    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
            setVisible(false);
            new Clients1().setVisible(true);
    }//GEN-LAST:event_menu1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setVisible(false);
        new  Clients1().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        setVisible(false);
        new  Locations().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        new  Bills().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        setVisible(false);
        new  Dashboard().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
         try{
             Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
             St1 = Con.createStatement();
             String query = "Select * from APPARTEMENTS where ID like ? or ADDRESS like ?";
             PreparedStatement fetchStatement = Con.prepareStatement(query);
             fetchStatement.setString(1,Search.getText());
             fetchStatement.setString(2,Search.getText());
             Rs1 = fetchStatement.executeQuery(); 
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("ID");
            tableModel.addColumn("Address");
            tableModel.addColumn("Price");
            tableModel.addColumn("Condition");
            tableModel.addColumn("NbBedrooms");
            tableModel.addColumn("Surface");
            tableModel.addColumn("NbBathrooms");
            tableModel.addColumn("NbLocations");
        while (Rs1.next()) {
            Object[] row = new Object[8];
            row[0] = Rs1.getString("ID");
            row[2] = Rs1.getDouble("PRICE");
            row[4] = Rs1.getInt("NBBEDROOMS");
            row[6] = Rs1.getInt("NBBATHROOMS");
            row[5] = Rs1.getInt("SURFACE");
            row[1]= Rs1.getString("ADDRESS");
            row[3] = Rs1.getString("CONDITION");
            row[7] = Rs1.getInt("NBRLOCATIONS");
            tableModel.addRow(row);
        }

        AppartementsTable.setModel(tableModel);
        Con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        SelectAppartement();
    }//GEN-LAST:event_RefreshMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Appartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JButton Addbtn;
    private javax.swing.JTable AppartementsTable;
    private javax.swing.JComboBox<String> CONDITION;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NBBATHROOMS;
    private javax.swing.JTextField NBBEDROOMS;
    private javax.swing.JTextField PRICE;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField SURFACE;
    private javax.swing.JTextField Search;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private component.menu menu1;
    // End of variables declaration//GEN-END:variables
}
