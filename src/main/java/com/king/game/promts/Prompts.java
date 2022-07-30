package com.king.game.promts;

import com.king.App;
import com.king.game.Game;
import javafx.scene.image.Image;

import java.util.Random;

public class Prompts {
    String title;
    String subtitle;
    Image img[];
    TARGET target;

    public Prompts(String title, String subtitle) {

        this.title = title;
        this.subtitle = subtitle;

            Random rand = new Random();
            String name = App.game.getPlayerList().get(rand.nextInt(App.game.getPlayerList().size() )).getName();
           this.title = this.title.replace("%player%", name);

            String name1 = App.game.getPlayerList().get(rand.nextInt(App.game.getPlayerList().size() )).getName();
            this.title = this.title.replace("%player1%", name1);

            String name2 = App.game.getPlayerList().get(rand.nextInt(App.game.getPlayerList().size() )).getName();
            this.title = this.title.replace("%player2%", name2);



        //this.img = img;
       // this.target = target;
    }
}
