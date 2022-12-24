/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms;

import classes.BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mypc
 */
public class Prets_retard extends javax.swing.JInternalFrame {
             DefaultTableModel dfm =new DefaultTableModel();

    /**
     * Creates new form Prets_retard
     */
    public Prets_retard() {
        initComponents();
        jTable_sensible.setModel(dfm);
        dfm.addColumn("CIN");
        dfm.addColumn("idMat ");
        dfm.addColumn("date emprunt");
        dfm.addColumn("durée");
        //afficher prts sensibles au retard
        afficher_pets();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_sensible = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(89, 98, 117));

        jLabel1.setBackground(new java.awt.Color(254, 211, 48));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("* Liste des prêts sensibles aux retards  :");

        jTable_sensible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_sensible);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void afficher_pets(){
    try {
                
                //creation de la requete
                String query = "SELECT `etudiant`.`cin` FROM `etudiant`,`emprunt` WHERE `etudiant`.`cin`=`emprunt`.`cin` AND DATEDIFF(date_retour,date_emprunt) > duree AND `emprunt`.`retour` =1"
                        + " UNION SELECT `etudiant`.`cin` FROM `etudiant`,`emprunt` WHERE `etudiant`.`cin`=`emprunt`.`cin` AND DATEDIFF(CURRENT_DATE(),DATE_ADD(date_emprunt, INTERVAL duree DAY)) > 0 AND `emprunt`.`retour` =0";
                PreparedStatement ps;
                ResultSet rs;
                //preparation de la requete
                ps=BD.connect().prepareStatement(query);
                //ajouter les valeurs de la requete
                rs=ps.executeQuery();
                while(rs.next()){
                   
                   String query2 = "SELECT `emprunt`.`cin`, `emprunt`.`idMat`, `emprunt`.`date_emprunt` , `emprunt`.`duree` FROM `etudiant`,`emprunt` WHERE `etudiant`.`cin`=`emprunt`.`cin` AND `emprunt`.`retour` =0 AND `etudiant`.`cin`=?";
                PreparedStatement ps2;
                ResultSet rs2;
                //preparation de la requete
                ps2=BD.connect().prepareStatement(query2);
                //ajouter les valeurs de la requete
                ps2.setString(1, rs.getString("cin"));
                rs2=ps2.executeQuery();
                Object[] row = new Object[jTable_sensible.getColumnCount()];
                while(rs2.next()){
                   row[0]=rs2.getString("cin");
                   row[1]=rs2.getString("idMat");
                   row[2]=rs2.getString("date_emprunt");
                   row[3]=rs2.getString("duree");
                   
                   dfm.addRow(row);
                }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
               
            }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_sensible;
    // End of variables declaration//GEN-END:variables
}
