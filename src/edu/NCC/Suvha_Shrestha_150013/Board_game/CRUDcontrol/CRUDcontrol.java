/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.NCC.Suvha_Shrestha_150013.Board_game.CRUDcontrol;

import edu.NCC.Suvha_Shrestha_150013.Board_game.entity.gameDetailList;
import edu.NCC.Suvha_Shrestha_150013.Board_game.entity.playerDetailList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Suvha
 */
public interface CRUDcontrol {

    void insertGameDetail(gameDetailList gameDL);

    void insertPlayerDetial(playerDetailList playerDL);

    String searchplayer(playerDetailList playerDL) throws ClassNotFoundException, SQLException;

    ResultSet updateGameDetailcombo(String search) throws ClassNotFoundException, SQLException;

    void UpdateGameDetail(gameDetailList gameDL);

    void signin(playerDetailList playerDL) throws ClassNotFoundException, SQLException;

    void insertGameCategory(gameDetailList gameDL) throws ClassNotFoundException, SQLException;

    String searchGame(gameDetailList gameDL, playerDetailList playerDL);

    void addBookmark(playerDetailList playerDL);

    String viewBookmark(playerDetailList playerDL);

    ResultSet fillPlayerDetail(String player_name);

    void UpdatePlayerDetail(playerDetailList playerDL);
}
