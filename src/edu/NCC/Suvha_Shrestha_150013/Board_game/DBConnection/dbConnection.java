    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.NCC.Suvha_Shrestha_150013.Board_game.DBConnection;

import edu.NCC.Suvha_Shrestha_150013.Board_game.ConstantValue.constantValue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Suvha
 */
    public class dbConnection {
    private Connection conn;
     private PreparedStatement pstmt;
     private ResultSet rs;

     public void opendbConnection() {
     
         try {
             Class.forName(constantValue.db_driver);
           conn=DriverManager.getConnection(constantValue.db_URL,
          constantValue.db_username,constantValue.db_password);
        
         } catch (ClassNotFoundException | SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         catch(NullPointerException nm){
            JOptionPane.showMessageDialog(null, nm.getMessage());
         }
     }
    public PreparedStatement initStatement(String qry) {
         try {
             pstmt=conn.prepareStatement(qry);
         } catch (SQLException | NullPointerException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
         }
         return pstmt;
     }
     public ResultSet executeQuery() {
         try {
           rs=pstmt.executeQuery();
        
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
         }
      
         return rs;
         
     }
     public int UpdatefQery()throws SQLException{
        
           return pstmt.executeUpdate();
     }
     public void closeCOnnection() throws SQLException{
         if(conn!=null){
             if(!conn.isClosed()){
                 conn.close();
             }
            conn=null;
         }
     }
 
}
