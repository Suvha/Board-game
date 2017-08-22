/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.NCC.Suvha_Shrestha_150013.Board_game.CRUDcontrol.CRUDImpl;

import edu.NCC.Suvha_Shrestha_150013.Board_game.CRUDcontrol.CRUDcontrol;
import edu.NCC.Suvha_Shrestha_150013.Board_game.DBConnection.dbConnection;
import edu.NCC.Suvha_Shrestha_150013.Board_game.entity.gameDetailList;
import edu.NCC.Suvha_Shrestha_150013.Board_game.entity.playerDetailList;
import edu.NCC.Suvha_Shrestha_150013.Board_game.view.AdminDashBoard;
import edu.NCC.Suvha_Shrestha_150013.Board_game.view.playerDashboard;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Suvha
 */
public class CRUDImpl implements CRUDcontrol {
    private dbConnection conn = new dbConnection();
    private boolean flag = false;
    private String searchedOutput = "";
    private String bookmark = "";
    private String content = "";
    private String category = "";
    private String gameName = "";
    private String searchedgameName = "";
    private String location = "";
    private int time_from = 0;
    private int time_to = 0;
    private String userLogin = "";
    String optimalPlayer = "";
    String bookmark_location = "";
    String bookmark_gameName = "";
    String bookmark_category = "";
    String bookmark_searchedGameName = "";
    int bookmark_time_from = 0;
    int bookmark_time_to = 0;

    @Override 
    //This function insert game details
    public void insertGameDetail(gameDetailList gameDL) {
        conn.opendbConnection();
        String query = "INSERT INTO `game_details`(`game_name`, `game_designer`,"
        + " `Minimum_player`, `Maximum_player`, `Optimal_player`, `game_category`)"
         + " VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = conn.initStatement(query);
        try {
            stmt.setString(1, gameDL.getGameName());
            stmt.setString(2, gameDL.getGameDesigner());
            stmt.setInt(3, gameDL.getMinimum_player());
            stmt.setInt(4, gameDL.getMaximum_player());
            stmt.setInt(5, gameDL.getOptimal_player());
            stmt.setString(6, gameDL.getGameCategory());
            int result = conn.UpdatefQery();
            conn.closeCOnnection();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, " Inserted sucessfully...", 
                        "Insert", JOptionPane.PLAIN_MESSAGE);
              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    @Override //This function insert player details
    public void insertPlayerDetial(playerDetailList playerDL) {
        conn.opendbConnection();
        String query = "INSERT INTO `player_details`(`player_name`, `player_email`,"
        + "`player_password`, `player_location`, `player_preferred_category`, "
        + "`player_preferred_game`, `player_preferred_designer`, `available_time_from`,"
        + " `available_time_to`, `play_optimal_no`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conn.initStatement(query);
        try {
            stmt.setString(1, playerDL.getPlayer_name());
            stmt.setString(2, playerDL.getPlayer_email());
            stmt.setString(3, playerDL.getPlayerPassword());
            stmt.setString(4, playerDL.getPlayer_location());
            stmt.setString(5, playerDL.getPlayerPreferred_category());
            stmt.setString(6, playerDL.getPlayerPreferred_game());
            stmt.setString(7, playerDL.getPlayerPreferred_designer());
            stmt.setInt(8, playerDL.getAvailableTime_from());
            stmt.setInt(9, playerDL.getAvailableTime_to());
            stmt.setString(10, playerDL.getPlayOptimalNo());
            int result = conn.UpdatefQery();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, " Inserted sucessfully...",
                        "Insert", JOptionPane.PLAIN_MESSAGE);}
            conn.closeCOnnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
}

    @Override//This function search the player in return player list
    public String searchplayer(playerDetailList playerDL) throws 
        ClassNotFoundException, SQLException, NullPointerException {
        content = "";
        conn.opendbConnection();
        userLogin = playerDL.getPlayer_name();
        String query1 = "SELECT * FROM `player_details` WHERE player_name=?";
        PreparedStatement stm = conn.initStatement(query1);
        stm.setString(1, playerDL.getPlayer_name());
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {
            category = rs.getString("player_preferred_category");
            gameName = rs.getString("player_preferred_game");
        }
        String query = "select * from player_details where player_location=? and"
        + " available_time_from >=? and available_time_to <= ? and "
        + "(player_preferred_category=? OR player_preferred_game=?)";
        PreparedStatement stmt = conn.initStatement(query);

        location = playerDL.getPlayer_location();
        time_from = playerDL.getAvailableTime_from();
        time_to = playerDL.getAvailableTime_to();

        stmt.setString(1, playerDL.getPlayer_location());
        stmt.setInt(2, playerDL.getAvailableTime_from());
        stmt.setInt(3, playerDL.getAvailableTime_to());
        stmt.setString(4, category);
        stmt.setString(5, gameName);
        ResultSet ras = conn.executeQuery();
        while (ras.next()) {
        content += ras.getString("player_name") + "  " + ras.getString
        ("player_email") + "     " + ras.getString("player_preferred_game")
                + "\n\r";
        content += "================================================" + "\n\r";
        }
        conn.closeCOnnection();
        return content;
        }

    @Override //This function returns seleted game detail for edit
    public ResultSet updateGameDetailcombo(String search) throws SQLException {
        conn.opendbConnection();
        String query = "SELECT * FROM `game_details` WHERE  game_name=?";
        PreparedStatement stmt = conn.initStatement(query);
        stmt.setString(1, search);
        ResultSet rs = conn.executeQuery();
             return rs;
    }
     @Override // This function authenticate the user while sign in
    public void signin(playerDetailList playerDL) throws SQLException {
        conn.opendbConnection();
        String query = "SELECT * FROM `player_details`";
        PreparedStatement stmt = conn.initStatement(query);
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {
            if (playerDL.getPlayer_name().equals("admin") && 
               playerDL.getPlayerPassword().equals("admin")) {
                AdminDashBoard admin = new AdminDashBoard();
                admin.setVisible(true);
                flag = true;
                break;
             } else if (playerDL.getPlayer_name().equals(rs.getString("player_name"))
                && playerDL.getPlayerPassword().equals(rs.getString("player_password")))
             {
                playerDetailList playername = new playerDetailList();
                playername.setPlayer_name(rs.getString("player_name"));
                playerDashboard playerDB = new playerDashboard(playername);
                playerDB.setVisible(true);
                flag = true;
            }
        }
        if (flag == false) {
          JOptionPane.showMessageDialog(null, "Invallid username or password", 
                  "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }

    @Override//This fucntion save or insert the category
    public void insertGameCategory(gameDetailList gameDL) throws SQLException {
        conn.opendbConnection();
        String query = "INSERT INTO `game_category`(`game_category`) VALUES (?)";
        PreparedStatement stmt = conn.initStatement(query);
        stmt.setString(1, gameDL.getGameCategory());
        int result = conn.UpdatefQery();
        if (result > 0) {
            JOptionPane.showMessageDialog(null, " Inserted sucessfully...", 
                    "Insert", JOptionPane.PLAIN_MESSAGE);
        }
        conn.closeCOnnection();
    }

           @Override //This function helps to save added bookmark
            public void addBookmark(playerDetailList playerDL) {
            try {
            if (playerDL.getAddBookmark().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Bookmark name",
                   "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                conn.opendbConnection();
                String query = "INSERT INTO `bookmark`(player_name,`bookmark_name`,"
               + " `location`, `Preferred_category`, `Preferred_game_name`, `game_name`,"
              + " `available_time_from`, `available_time_to`) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = conn.initStatement(query);
                stmt.setString(1, userLogin);
                stmt.setString(2, playerDL.getAddBookmark());
                stmt.setString(3, location);
                stmt.setString(4, category);
                stmt.setString(5, gameName);
                stmt.setString(6, searchedgameName);
                stmt.setInt(7, time_from);
                stmt.setInt(8, time_to);
                 int result = conn.UpdatefQery();
                 if (result > 0) {
               JOptionPane.showMessageDialog(null, " Added bookmark sucessfully...",
                       "ADDED", JOptionPane.PLAIN_MESSAGE);
                }
             }
             conn.closeCOnnection();
             } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
             }
             }

       @Override //This function helps to view the bookmark according to user
       public String viewBookmark(playerDetailList playerDL) {
        bookmark = "";
        try {
            System.out.println(playerDL.getAddBookmark() + "syx");
            conn.opendbConnection();
            String query = "SELECT * FROM `bookmark` WHERE bookmark_name='" +
                    playerDL.getAddBookmark() + "'";
            PreparedStatement stmt = conn.initStatement(query);
            ResultSet ras = conn.executeQuery();
            while (ras.next()) {
                bookmark_location = ras.getString("location");
                bookmark_category = ras.getString("Preferred_category");
                bookmark_gameName = ras.getString("Preferred_game_name");
                bookmark_searchedGameName = ras.getString("game_name");
                bookmark_time_from = ras.getInt("available_time_from");
                bookmark_time_to = ras.getInt("available_time_to");
                }
            String query1 = "select * from player_details where player_location=? "
            + "and available_time_from >=? and available_time_to <=? and "
            + "(player_preferred_category=? OR player_preferred_game=?) and "
            + "player_preferred_game=?";
            PreparedStatement stm = conn.initStatement(query1);
            stm.setString(1, bookmark_location);
            stm.setInt(2, bookmark_time_from);
            stm.setInt(3, bookmark_time_to);
            stm.setString(4, bookmark_category);
            stm.setString(5, bookmark_gameName);
            stm.setString(6, bookmark_searchedGameName);

            ResultSet rs = conn.executeQuery();
            while (rs.next()) {
            bookmark += rs.getString("player_name") + "     " + rs.getString("player_email")
            + "     " + rs.getString("player_preferred_game") + "\n\r";
            bookmark += "================================================" + "\n\r";
            }
            conn.closeCOnnection();
           } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
           return bookmark;
            }

           @Override //This function search the game inputed by user and display player list
            public String searchGame(gameDetailList gameDL, playerDetailList playerDL) {
            searchedOutput = "";
            int gameOptimalPlayer=0;
            try {
            if (gameDL.getGameName().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter game name you"
           + " want to search from player list", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                conn.opendbConnection();
                String query1 = "SELECT * FROM `player_details` WHERE player_name='" 
               + userLogin + "'";
                PreparedStatement stm = conn.initStatement(query1);
                ResultSet rs = conn.executeQuery();
                while (rs.next()) {
                    optimalPlayer = rs.getString("play_optimal_no");
                    
                }
                   String query2 = "SELECT * FROM `game_details` WHERE game_name='" 
               + gameName + "'";
                PreparedStatement pstmt = conn.initStatement(query2);
                ResultSet rset = conn.executeQuery();
                while (rset.next()) {
                    gameOptimalPlayer = rset.getInt("Optimal_player");
                }
                if (optimalPlayer.equals("false") && playerDL.getPlayer_number() == 0) {
                    JOptionPane.showMessageDialog(null, "Please enter the player list "
                  + "size number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                String query = "select * from player_details where player_location=?"
                + " and available_time_from >=? and available_time_to <=? and "
                + "(player_preferred_category=? OR player_preferred_game=?) and "
                + "player_preferred_game=?";
                PreparedStatement stmt = conn.initStatement(query);
                stmt.setString(1, location);
                stmt.setInt(2, time_from);
                stmt.setInt(3, time_to);
                stmt.setString(4, category);
                stmt.setString(5, gameName);
                stmt.setString(6, gameDL.getGameName());
                searchedgameName = gameDL.getGameName();
                int a = 0;
                ResultSet ras = conn.executeQuery();
                if (playerDL.getPlayer_number() == 0 && optimalPlayer.equals("False")) {
                  JOptionPane.showMessageDialog(null, "Please enter player list number", 
                  "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    while (ras.next()) {
                     if (a < playerDL.getPlayer_number() && optimalPlayer.equals("False")){
                            searchedOutput += ras.getString("player_name") + "     "
                           + ras.getString("player_email") + "     " + ras.getString
                         ("player_preferred_game") + "\n\r";
                    searchedOutput += "================================================" + "\n\r";
                  } else if (a<gameOptimalPlayer && optimalPlayer.equals("True")) {
                         searchedOutput += ras.getString("player_name") + "     "
                        + ras.getString("player_email") + "     " + ras.getString
                        ("player_preferred_game") + "\n\r";
                    searchedOutput += "================================================" + "\n\r";
                        } else {
                            break;
                        }
                        a++;
                    }
                    }
                    }
                    conn.closeCOnnection();
                   } catch (SQLException | NullPointerException ex) {
                   JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",
                           JOptionPane.ERROR_MESSAGE);
                    }
                    return searchedOutput;
                        }

    @Override //This functio fill the textfield of player details form for editing
    public ResultSet fillPlayerDetail(String player_name) {
        conn.opendbConnection();
        String query = "SELECT * FROM `player_details` WHERE  player_name=?";
        PreparedStatement stmt = conn.initStatement(query);
        try {
            stmt.setString(1, player_name);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 
                 JOptionPane.ERROR_MESSAGE);
        }
        ResultSet rs = conn.executeQuery();
         return rs;
    }

        @Override //This function update the player detail afer editing
         public void UpdatePlayerDetail(playerDetailList playerDL) {
        conn.opendbConnection();
        int result = 0;
        String query = "UPDATE `player_details` SET `player_name`=?,"
         + "`player_email`=?,`player_password`=?,`player_location`=?,"
         + "`player_preferred_category`=?,`player_preferred_game`=?,"
         + "`player_preferred_designer`=?,`available_time_from`=?,"
         + "`available_time_to`=?,`play_optimal_no`=? WHERE player_name=?";
        PreparedStatement stmt = conn.initStatement(query);
        try {
            stmt.setString(1, playerDL.getPlayer_name());
            stmt.setString(2, playerDL.getPlayer_email());
            stmt.setString(3, playerDL.getPlayerPassword());
            stmt.setString(4, playerDL.getPlayer_location());
            stmt.setString(5, playerDL.getPlayerPreferred_category());
            stmt.setString(6, playerDL.getPlayerPreferred_game());
            stmt.setString(7, playerDL.getPlayerPreferred_designer());
            stmt.setInt(8, playerDL.getAvailableTime_from());
            stmt.setInt(9, playerDL.getAvailableTime_to());
            stmt.setString(10, playerDL.getPlayOptimalNo());
            stmt.setString(11, playerDL.getLoginPlayer());
            result = conn.UpdatefQery();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Updated sucessfully......",
                 "Update", JOptionPane.PLAIN_MESSAGE);
            }
            conn.closeCOnnection();
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
              "ERROR", JOptionPane.ERROR_MESSAGE);
             }
             }

        @Override //This function update the game detail after editng
         public void UpdateGameDetail(gameDetailList gameDL) {
        try {
          conn.opendbConnection();
          int result = 0;
          String query = "UPDATE `game_details` SET`game_name`='" + 
          gameDL.getGameName() + "',`game_designer`='" + gameDL.getGameDesigner() 
          + "',`Minimum_player`='" + gameDL.getMinimum_player() + "',`Maximum_player`='"
         + gameDL.getMaximum_player() + "',`Optimal_player`='" + gameDL.getOptimal_player() +
         "',`game_category`='" + gameDL.getGameCategory() + "'WHERE game_name='" +
         gameDL.getSelectCombo() + "'";
          PreparedStatement stmt = conn.initStatement(query);
          result = conn.UpdatefQery();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Updated sucessfully......",
                  "Update", JOptionPane.PLAIN_MESSAGE);
            }
            conn.closeCOnnection();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }
             }
            }
