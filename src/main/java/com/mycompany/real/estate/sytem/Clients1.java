package com.mycompany.real.estate.sytem;


import com.mycompany.real.estate.sytem.Dashboard;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author S3IX6
 */
public class Clients1 extends javax.swing.JFrame {

    Connection Con = null;
    Statement St = null;
    Statement St1 = null;
    ResultSet Rs = null;
    ResultSet Rs1 = null;
    String DB_NAME = "jdbc:derby://localhost:1527/RealEstate";
    String DB_USER = "app";
    String DB_PASS = "app";
    public Clients1() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        menu1.initMoving(this);
        SelectClients();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        menu1 = new component.menu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PRENOM = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        NOM = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientsTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 150));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 50));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 40));

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 190, 40));

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 190, 40));
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 633));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Prenom");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        PRENOM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PRENOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRENOMActionPerformed(evt);
            }
        });

        ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        NOM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMActionPerformed(evt);
            }
        });

        EMAIL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILActionPerformed(evt);
            }
        });

        PHONE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHONEActionPerformed(evt);
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

        ClientsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ClientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Prenom", "Nom", "Email", "Phone", "NbLocations"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClientsTable.getTableHeader().setResizingAllowed(false);
        ClientsTable.getTableHeader().setReorderingAllowed(false);
        ClientsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClientsTable);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Manage Clients");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Searchbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Searchbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\S3IX6\\OneDrive\\Documents\\NetBeansProjects\\Real.estate.sytem\\src\\main\\java\\images\\search.png")); // NOI18N
        Searchbtn.setText("Search");
        Searchbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Searchbtn.setContentAreaFilled(false);
        Searchbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchbtnMouseClicked(evt);
            }
        });
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });

        Refresh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\S3IX6\\OneDrive\\Documents\\NetBeansProjects\\Real.estate.sytem\\src\\main\\java\\images\\refresh.png")); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(227, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 0, 940, 633));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public void SelectClients(){
        try{
             Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
             St1 = Con.createStatement();
             Rs1 = St1.executeQuery("Select * from CLIENTS");
            /* AppartementsTable.setModel(new ResultSetHandler.handle(Rs1)); */  
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("ID");
            tableModel.addColumn("Prenom");
            tableModel.addColumn("Nom");
            tableModel.addColumn("Email");
            tableModel.addColumn("Phone");
            tableModel.addColumn("NbLocations");
        while (Rs1.next()) {
            Object[] row = new Object[6];
            row[0] = Rs1.getString("ID");
            row[1] = Rs1.getString("PRENOM");
            row[2] = Rs1.getString("NOM");
            row[3] = Rs1.getString("EMAIL");
            row[4] = Rs1.getInt("PHONE");
            row[5] = Rs1.getInt("NBLOCATIONS");
            tableModel.addRow(row);
        }

        ClientsTable.setModel(tableModel);
        Con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
       
    }
    private void PRENOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRENOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRENOMActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMActionPerformed

    private void EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILActionPerformed

    private void PHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PHONEActionPerformed

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
        try{
            Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
            PreparedStatement add = Con.prepareStatement("insert into CLIENTS values (?,?,?,?,?,?)");
            add.setString(1, ID.getText());
            add.setString(2,PRENOM.getText());
            add.setString(3,NOM.getText());
            add.setString(4,EMAIL.getText());
            add.setLong(5,Long.valueOf(PHONE.getText().toString()));
            add.setInt(6,Integer.valueOf("0"));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Client Successfully Added !");
            Con.close();
            SelectClients();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddbtnMouseClicked

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbtnActionPerformed

    private void UpdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatebtnMouseClicked
        if(ID.getText().isEmpty() || PRENOM.getText().isEmpty() || NOM.getText().isEmpty() || PHONE.getText().isEmpty() || EMAIL.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Missing Information !");
        }else{
            try{
                Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
                PreparedStatement Upd = Con.prepareStatement("Update CLIENTS set  PRENOM = ? , NOM = ? , EMAIL = ? ,PHONE = ? WHERE ID = ?");
                Upd.setString(5, ID.getText());
                Upd.setString(1,PRENOM.getText());
                Upd.setString(2,NOM.getText());
                Upd.setString(3,EMAIL.getText());
                Upd.setLong(4,Long.valueOf(PHONE.getText()));
                int row = Upd.executeUpdate();
                JOptionPane.showMessageDialog(this,"Client Successfully Updated !");
                Con.close();
                SelectClients();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdatebtnMouseClicked

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void DeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletebtnMouseClicked
        if(ID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Client's Id To be Deleted");
        }else{
            try{
                int a = JOptionPane.showConfirmDialog(null,"Do you really want to delete the Client?","select",JOptionPane.YES_NO_OPTION);
                if(a == 0){
                    Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
                    Freeapparts(ID.getText());
                    PreparedStatement Del = Con.prepareStatement("Delete from CLIENTS where ID = ?");
                    Del.setString(1,ID.getText());
                    int row = Del.executeUpdate();
                }
                JOptionPane.showMessageDialog(this,"Client Successfully Deleted !");
                SelectClients();
                Con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeletebtnMouseClicked
    public void Freeapparts(String IDclient){
        try{
             Con =DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
             String fetchSql = "SELECT * " +
                 "from Locations " +
                 "WHERE IDCLIENT = ?";
             PreparedStatement fetchStatement = Con.prepareStatement(fetchSql);
             fetchStatement.setString(1,IDclient);
             ResultSet resultSet = fetchStatement.executeQuery();
             while(resultSet.next()){
                 String AppartmentId = resultSet.getString("IDAPPARTMENT");
                 String UpdateSql = "UPDATE APPARTEMENTS SET CONDITION = 'free' WHERE ID = ?";
                 PreparedStatement UpdateStatement = Con.prepareStatement(UpdateSql);
                 UpdateStatement.setString(1,AppartmentId);
                 UpdateStatement.executeUpdate();
             }
        }catch(SQLException e){
            e.printStackTrace();
        }
      }
    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void ClientsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientsTableMouseClicked
        int rowIndex = ClientsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ClientsTable.getModel();
        ID.setText(model.getValueAt(rowIndex, 0).toString());
        PRENOM.setText(model.getValueAt(rowIndex, 1).toString());
        NOM.setText(model.getValueAt(rowIndex, 2).toString());
        PHONE.setText(model.getValueAt(rowIndex, 4).toString());
        EMAIL.setText(model.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_ClientsTableMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setVisible(false);
        new Appartments().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setVisible(false);
        new  Clients1().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        new  Bills().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        setVisible(false);
        new  Locations().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void SearchbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchbtnMouseClicked
                try{
             Con = DriverManager.getConnection(DB_NAME,DB_USER,DB_PASS);
             St1 = Con.createStatement();
             String fetchsql = "Select * from CLIENTS where prenom LIKE ? or ID Like ? or nom Like ?";
             PreparedStatement fetchStatement = Con.prepareStatement(fetchsql);
             fetchStatement.setString(1,search.getText());
             fetchStatement.setString(2,search.getText());
             fetchStatement.setString(3,search.getText());
             Rs1 = fetchStatement.executeQuery();
            /* AppartementsTable.setModel(new ResultSetHandler.handle(Rs1)); */  
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("ID");
            tableModel.addColumn("Prenom");
            tableModel.addColumn("Nom");
            tableModel.addColumn("Email");
            tableModel.addColumn("Phone");
            tableModel.addColumn("NbLocations");
        while (Rs1.next()) {
            Object[] row = new Object[6];
            row[0] = Rs1.getString("ID");
            row[1] = Rs1.getString("PRENOM");
            row[2] = Rs1.getString("NOM");
            row[3] = Rs1.getString("EMAIL");
            row[4] = Rs1.getInt("PHONE");
            row[5] = Rs1.getInt("NBLOCATIONS");
            tableModel.addRow(row);
        }

        ClientsTable.setModel(tableModel);
        Con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_SearchbtnMouseClicked

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        SelectClients();
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
            java.util.logging.Logger.getLogger(Clients1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTable ClientsTable;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NOM;
    private javax.swing.JTextField PHONE;
    private javax.swing.JTextField PRENOM;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
