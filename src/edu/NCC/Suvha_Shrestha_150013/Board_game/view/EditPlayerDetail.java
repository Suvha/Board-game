/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.NCC.Suvha_Shrestha_150013.Board_game.view;

import edu.NCC.Suvha_Shrestha_150013.Board_game.CRUDcontrol.CRUDImpl.CRUDImpl;
import edu.NCC.Suvha_Shrestha_150013.Board_game.CRUDcontrol.CRUDcontrol;
import edu.NCC.Suvha_Shrestha_150013.Board_game.DBConnection.dbConnection;
import edu.NCC.Suvha_Shrestha_150013.Board_game.entity.playerDetailList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Suvha
 */
public class EditPlayerDetail extends javax.swing.JFrame {
private dbConnection conn= new dbConnection();
private  playerDetailList playerList= new playerDetailList();
private CRUDcontrol crudControl= new CRUDImpl();
    String playername;
/**
     * Creates new form PlayerDetail
     * @param playername
     */
    public EditPlayerDetail(String playername) {
        initComponents();
        fillcomboPeferredGame();
        fillcomboPreferredDesigner();
        fillcomboCategory();
        this.playername = playername;
        filluserdetail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_player = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_location = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmb_perferred_category = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmb_perferred_game = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmb_perferred_designer = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txt_avaible_time_shot_from = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmb_play_optimal_number = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_avaible_time_shot_to = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ptxt_password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Edit Player Detail");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Email: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("location:");

        txt_location.setText("Enter your state");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("perferred category:");

        cmb_perferred_category.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("perferred game:");

        cmb_perferred_game.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("perferred designer:");

        cmb_perferred_designer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Avaible time shot:");

        txt_avaible_time_shot_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_avaible_time_shot_fromActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Play optimal number: ");

        cmb_play_optimal_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_play_optimal_number.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "True", "False" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("From");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("To");

        txt_avaible_time_shot_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_avaible_time_shot_toActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Password: ");

        javax.swing.GroupLayout jp_playerLayout = new javax.swing.GroupLayout(jp_player);
        jp_player.setLayout(jp_playerLayout);
        jp_playerLayout.setHorizontalGroup(
            jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_playerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addContainerGap())))
            .addGroup(jp_playerLayout.createSequentialGroup()
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_playerLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_avaible_time_shot_to, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_location, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_perferred_category, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_perferred_game, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_perferred_designer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_play_optimal_number, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jp_playerLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_avaible_time_shot_from, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(ptxt_password))))
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_playerLayout.setVerticalGroup(
            jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_playerLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ptxt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_location, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_perferred_category, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_perferred_game, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_perferred_designer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_avaible_time_shot_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_avaible_time_shot_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_playerLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cmb_play_optimal_number, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_close.setText("CLOSE");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_close))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void CleartextFeild(){
        txt_name.setText("");
        txt_email.setText("");
        txt_location.setText("");
        txt_avaible_time_shot_from.setText("");
        txt_avaible_time_shot_to.setText("");
        ptxt_password.setText("");
        
    }
    private void fillcomboPeferredGame(){
         conn.opendbConnection();
           try{
              
                String qry="SELECT * FROM `game_details`";
            PreparedStatement pstmt=conn.initStatement(qry);
           ResultSet res=conn.executeQuery();
            while(res.next()){
                String gameList=res.getString("game_name");
                
                cmb_perferred_game.addItem(gameList);
            
            }
            conn.closeCOnnection();
    }
           catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
}
    }
    private void fillcomboCategory(){
     conn.opendbConnection();
           try{
              
                String qry="SELECT * FROM game_category";
            PreparedStatement pstmt=conn.initStatement(qry);
           ResultSet res=conn.executeQuery();
            while(res.next()){
                String gameList=res.getString("game_category");
                
                cmb_perferred_category.addItem(gameList);
            
            }
            conn.closeCOnnection();
    }
           catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
}   
    }
    private void fillcomboPreferredDesigner(){
                 conn.opendbConnection();
           try{
              
                String qry="SELECT * FROM `game_details`";
            PreparedStatement pstmt=conn.initStatement(qry);
           ResultSet res=conn.executeQuery();
            while(res.next()){
                String gameList=res.getString("game_designer");
                
                cmb_perferred_designer.addItem(gameList);
            
            }
            conn.closeCOnnection();
    }
           catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
}
    }
    private void filluserdetail(){
        ResultSet rs;
       try{
           rs=crudControl.fillPlayerDetail(playername);
           if(rs.next()){
               txt_name.setText(rs.getString("player_name"));
              txt_location.setText(rs.getString("player_location"));
              txt_email.setText(rs.getString("player_email"));
             txt_avaible_time_shot_from.setText(rs.getString("available_time_from"));
             txt_avaible_time_shot_to.setText(rs.getString("available_time_to"));
             ptxt_password.setText(rs.getString("player_password"));
           }
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
       }
    }
    private void txt_avaible_time_shot_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_avaible_time_shot_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_avaible_time_shot_fromActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       playerList.setPlayer_name(txt_name.getText());
       playerList.setPlayer_email(txt_email.getText());
       playerList.setPlayerPassword(String.valueOf(ptxt_password.getPassword()));
       playerList.setPlayer_location(txt_location.getText());
       playerList.setPlayerPreferred_category(cmb_perferred_category.getSelectedItem().toString());
       playerList.setPlayerPreferred_game(cmb_perferred_game.getSelectedItem().toString());
       playerList.setPlayerPreferred_designer(cmb_perferred_designer.getSelectedItem().toString());
       playerList.setAvailableTime_from(Integer.parseInt(txt_avaible_time_shot_from.getText()));
       playerList.setAvailableTime_to(Integer.parseInt(txt_avaible_time_shot_to.getText()));
       playerList.setPlayOptimalNo(cmb_play_optimal_number.getSelectedItem().toString());
       playerList.setLoginPlayer(playername);
       
         crudControl.UpdatePlayerDetail(playerList);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_avaible_time_shot_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_avaible_time_shot_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_avaible_time_shot_toActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cmb_perferred_category;
    private javax.swing.JComboBox cmb_perferred_designer;
    private javax.swing.JComboBox cmb_perferred_game;
    private javax.swing.JComboBox cmb_play_optimal_number;
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
    private javax.swing.JPanel jp_player;
    private javax.swing.JPasswordField ptxt_password;
    private javax.swing.JTextField txt_avaible_time_shot_from;
    private javax.swing.JTextField txt_avaible_time_shot_to;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
