/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.NCC.Suvha_Shrestha_150013.Board_game.entity;
/**
 *
 * @author Suvha
 */
public class playerDetailList {
    private int player_id, availableTime_from, availableTime_to,player_number;
    private String player_name, player_email, player_location, 
    playerPreferred_category, playerPreferred_game, playerPreferred_designer,
   playOptimalNo,playerPassword,addBookmark,loginPlayer;

    public playerDetailList() {
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getAvailableTime_from() {
        return availableTime_from;
    }

    public void setAvailableTime_from(int availableTime_from) {
        this.availableTime_from = availableTime_from;
    }

    public int getAvailableTime_to() {
        return availableTime_to;
    }

    public void setAvailableTime_to(int availableTime_to) {
        this.availableTime_to = availableTime_to;
    }

    public int getPlayer_number() {
        return player_number;
    }

    public void setPlayer_number(int player_number) {
        this.player_number = player_number;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_email() {
        return player_email;
    }

    public void setPlayer_email(String player_email) {
        this.player_email = player_email;
    }

    public String getPlayer_location() {
        return player_location;
    }

    public void setPlayer_location(String player_location) {
        this.player_location = player_location;
    }

    public String getPlayerPreferred_category() {
        return playerPreferred_category;
    }

    public void setPlayerPreferred_category(String playerPreferred_category) {
        this.playerPreferred_category = playerPreferred_category;
    }

    public String getPlayerPreferred_game() {
        return playerPreferred_game;
    }

    public void setPlayerPreferred_game(String playerPreferred_game) {
        this.playerPreferred_game = playerPreferred_game;
    }

    public String getPlayerPreferred_designer() {
        return playerPreferred_designer;
    }

    public void setPlayerPreferred_designer(String playerPreferred_designer) {
        this.playerPreferred_designer = playerPreferred_designer;
    }

    public String getPlayOptimalNo() {
        return playOptimalNo;
    }

    public void setPlayOptimalNo(String playOptimalNo) {
        this.playOptimalNo = playOptimalNo;
    }

    public String getPlayerPassword() {
        return playerPassword;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

    public String getAddBookmark() {
        return addBookmark;
    }

    public void setAddBookmark(String addBookmark) {
        this.addBookmark = addBookmark;
    }

    public String getLoginPlayer() {
        return loginPlayer;
    }

    public void setLoginPlayer(String loginPlayer) {
        this.loginPlayer = loginPlayer;
    }
    }
