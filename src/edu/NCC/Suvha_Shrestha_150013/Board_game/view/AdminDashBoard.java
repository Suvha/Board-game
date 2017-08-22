/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.NCC.Suvha_Shrestha_150013.Board_game.view;

/**
 *
 * @author Suvha
 */
public class AdminDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashBoard
     */
    public AdminDashBoard() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_add_game = new javax.swing.JButton();
        btn_edit_game = new javax.swing.JButton();
        btn_add_player = new javax.swing.JButton();
        btn_add_category = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADMIN DASHBOARD");

        btn_add_game.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_game.setText("Add Game");
        btn_add_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_gameActionPerformed(evt);
            }
        });

        btn_edit_game.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_edit_game.setText("Edit Game");
        btn_edit_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_gameActionPerformed(evt);
            }
        });

        btn_add_player.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_player.setText("Add Player");
        btn_add_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_playerActionPerformed(evt);
            }
        });

        btn_add_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_category.setText("Add Category");
        btn_add_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_categoryActionPerformed(evt);
            }
        });

        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_add_game)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_edit_game))
                            .addComponent(btn_add_player)
                            .addComponent(btn_add_category)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btn_logout)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add_game)
                    .addComponent(btn_edit_game))
                .addGap(18, 18, 18)
                .addComponent(btn_add_player)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_add_category)
                .addGap(18, 18, 18)
                .addComponent(btn_logout)
                .addContainerGap(84, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_gameActionPerformed
       gameDetails gameD=new gameDetails();
       gameD.setVisible(true);
    }//GEN-LAST:event_btn_add_gameActionPerformed

    private void btn_edit_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_gameActionPerformed
       EditGameDetails editGame= new EditGameDetails();
      editGame.setVisible(true);
    }//GEN-LAST:event_btn_edit_gameActionPerformed

    private void btn_add_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_playerActionPerformed
       PlayerDetail playerD = new PlayerDetail();
       playerD.setVisible(true);
    }//GEN-LAST:event_btn_add_playerActionPerformed

    private void btn_add_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_categoryActionPerformed
      GameCategory gameC = new GameCategory();
      gameC.setVisible(true);
    }//GEN-LAST:event_btn_add_categoryActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_category;
    private javax.swing.JButton btn_add_game;
    private javax.swing.JButton btn_add_player;
    private javax.swing.JButton btn_edit_game;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}