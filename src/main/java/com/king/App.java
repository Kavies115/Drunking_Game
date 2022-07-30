package com.king;

import com.king.game.Game;
import com.king.game.player.Player;
import com.king.game.promts.Prompts;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static Game game = new Game();


    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("fxml/start_screen/start_Screen.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Drunking");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

            test();

        } catch (Exception e){

        }
    }

    private void test(){


    }

    public static void main(String[] args) {
        launch();
    }
}

