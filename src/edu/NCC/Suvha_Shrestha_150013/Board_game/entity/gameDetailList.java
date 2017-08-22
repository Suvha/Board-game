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
public class gameDetailList {
    private int gameDetail_id, minimum_player, maximum_player, optimal_player;
    private String gameName, gameDesigner, gameCategory,selectCombo;

    public gameDetailList() {
    }

    public int getGameDetail_id() {
        return gameDetail_id;
    }

    public void setGameDetail_id(int gameDetail_id) {
        this.gameDetail_id = gameDetail_id;
    }

    public int getMinimum_player() {
        return minimum_player;
    }

    public void setMinimum_player(int minimum_player) {
        this.minimum_player = minimum_player;
    }

    public int getMaximum_player() {
        return maximum_player;
    }

    public void setMaximum_player(int maximum_player) {
        this.maximum_player = maximum_player;
    }

    public int getOptimal_player() {
        return optimal_player;
    }

    public void setOptimal_player(int optimal_player) {
        this.optimal_player = optimal_player;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDesigner() {
        return gameDesigner;
    }

    public void setGameDesigner(String gameDesigner) {
        this.gameDesigner = gameDesigner;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getSelectCombo() {
        return selectCombo;
    }

    public void setSelectCombo(String selectCombo) {
        this.selectCombo = selectCombo;
    }

   

   
    
}
