package com.example.pacificwarbattleship;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class HelloController {

    public AnchorPane anchorPaneMain;
    public ImageView imageHolder;
    private Image ShipImage = new Image(getClass().getResource("/Images/pirate_ship_00000.png").toExternalForm());

    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16.66666), new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {

        }
    }));

        public void initialize()
    {
        PlayerBoat playerOne = new PlayerBoat("Peru1", ShipImage);
        anchorPaneMain.getChildren().add(playerOne);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.setRate(1); //1 is normal speed. 2 is double, etc. -1 is reverse.
        timeline.play();
    }



}