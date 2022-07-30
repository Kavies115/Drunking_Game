package com.king.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartScreenController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void startButton(ActionEvent event) throws IOException {

    }


    public void quitButton(ActionEvent event) {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.hide();
    }
}
