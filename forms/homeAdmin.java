/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.border.Border;

/**
 *
 * @author Mypc
 */
public final class homeAdmin extends javax.swing.JFrame {
    /**
     * Creates new form home
     */
    public homeAdmin() {
        super("Home");
        initComponents();
        AfficherImage();
        //ajouter un border à la  pannel de l'entete 
        Border borderpanel =BorderFactory.createMatteBorder(0,0,1,0,Color.white);
        panelHeader.setBorder(borderpanel);
        buttonHover();
        //centrer jframe
        this.setLocationRelativeTo(null);
       
        
    } 
    // fontion pour afficher image logo de l'entete
    public  void AfficherImage(){
        //recuperer l'image
        ImageIcon iconimg = new ImageIcon(getClass().getResource("/images/logo_home.png"));
        //adapter l'image a jlabel 
        Image img = iconimg.getImage().getScaledInstance(home_logo_jLabel.getWidth(),home_logo_jLabel.getHeight(),Image.SCALE_SMOOTH);
        //positionner l'image dans jlabel 
        home_logo_jLabel.setIcon(new ImageIcon(img));
        
    }
    //creation d'une fonction pour ajouter hover à les bouttons de menu
    public void buttonHover(){
        //recuperer tous les composants dans jpanel menu
        Component[] comps = panelMenu.getComponents();
        for(Component comp : comps){
            if(comp instanceof JButton){
                JButton button =(JButton) comp;
                // ajouter l'action au jbutton
                button.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseEntered(MouseEvent evt){
                        button.setForeground(Color.orange);
                    }
                });
                 button.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseExited(MouseEvent evt){
                        button.setForeground(Color.white);
                    }//mouseExited
                });
                
                
            }
        }
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
        panelMenu = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        home_logo_jLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nv_utilisateur_btn = new javax.swing.JButton();
        liste_utilisateurs_btn = new javax.swing.JButton();
        consulter_utilisateur_btn1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(0, 51, 102));

        panelHeader.setBackground(new java.awt.Color(0, 51, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addComponent(home_logo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home_logo_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 163, 188));
        jLabel2.setText("Utilisateur");

        nv_utilisateur_btn.setBackground(new java.awt.Color(0, 51, 102));
        nv_utilisateur_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nv_utilisateur_btn.setForeground(new java.awt.Color(255, 255, 255));
        nv_utilisateur_btn.setText("  Nouveau utilisateur");
        nv_utilisateur_btn.setBorder(null);
        nv_utilisateur_btn.setContentAreaFilled(false);
        nv_utilisateur_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv_utilisateur_btnActionPerformed(evt);
            }
        });

        liste_utilisateurs_btn.setBackground(new java.awt.Color(0, 51, 102));
        liste_utilisateurs_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        liste_utilisateurs_btn.setForeground(new java.awt.Color(255, 255, 255));
        liste_utilisateurs_btn.setText("        liste des utilisateurs");
        liste_utilisateurs_btn.setBorder(null);
        liste_utilisateurs_btn.setContentAreaFilled(false);
        liste_utilisateurs_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liste_utilisateurs_btnActionPerformed(evt);
            }
        });

        consulter_utilisateur_btn1.setBackground(new java.awt.Color(0, 51, 102));
        consulter_utilisateur_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        consulter_utilisateur_btn1.setForeground(new java.awt.Color(255, 255, 255));
        consulter_utilisateur_btn1.setText("        Consulter un utilisateur");
        consulter_utilisateur_btn1.setBorder(null);
        consulter_utilisateur_btn1.setContentAreaFilled(false);
        consulter_utilisateur_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulter_utilisateur_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liste_utilisateurs_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nv_utilisateur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consulter_utilisateur_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(nv_utilisateur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(consulter_utilisateur_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(liste_utilisateurs_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nv_utilisateur_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv_utilisateur_btnActionPerformed
         //creer une instance de jinternalFFrame  Nouveau_emprunt
        Nouveau_utilisateur nv_utilisateur=new Nouveau_utilisateur();
        //Appeler la methode AfficherForm
        AfficherForm(nv_utilisateur);
    }//GEN-LAST:event_nv_utilisateur_btnActionPerformed

    private void liste_utilisateurs_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liste_utilisateurs_btnActionPerformed
  
         //creer une instance de jinternalFFrame  liste_utilisateur
        liste_utilisateur frame_list_utilisateur=new liste_utilisateur();
        //Appeler la methode AfficherForm
        AfficherForm(frame_list_utilisateur);
        
    }//GEN-LAST:event_liste_utilisateurs_btnActionPerformed

    private void consulter_utilisateur_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulter_utilisateur_btn1ActionPerformed
        //creer une instance de jinternalFFrame  consulter_utilisateur
        Consulter_Utilisateur frame_consulter_utilisateur=new Consulter_Utilisateur();
        //Appeler la methode AfficherForm
        AfficherForm(frame_consulter_utilisateur);
    }//GEN-LAST:event_consulter_utilisateur_btn1ActionPerformed
 
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
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeAdmin().setVisible(true);
            }
        });
    }
    //Creation de la methode afficherForm pour afficher JInternalframe dans jDesktopPane1
    public void AfficherForm(JInternalFrame frame){
        jDesktopPane1.removeAll();
        /////
        //  titlebar invisible
           setRootPaneCheckingEnabled(false);
           javax.swing.plaf.InternalFrameUI ifu= frame.getUI();
           ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
        ////
        //ajouter le meme size de jdesktoppane 
        frame.setSize(jDesktopPane1.getSize());
        //supprimer le border
        frame.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jDesktopPane1.add(frame).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consulter_utilisateur_btn1;
    private javax.swing.JLabel home_logo_jLabel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton liste_utilisateurs_btn;
    private javax.swing.JButton nv_utilisateur_btn;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
