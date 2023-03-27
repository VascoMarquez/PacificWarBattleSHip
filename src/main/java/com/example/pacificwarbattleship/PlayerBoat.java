package com.example.pacificwarbattleship;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class PlayerBoat extends ImageView {

    private String playerName;

    public PlayerBoat(String name, Image image){
        this.setImage(image);
        this.playerName = name;
        this.setFitHeight(100);
        this.setFitWidth(100);
        this.setLayoutX(800/2);
        this.setLayoutY(480/2);
    }

    public String getPlayerName(){
        return playerName;
    }

}
