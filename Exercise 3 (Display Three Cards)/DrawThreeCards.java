//This is my own work. Chad Galloway
/**  Program: Draw Three Cards
*    File: DrawThreeCards.java
*    Summary: Creates a simple integer card deck, shuffles it, then draws (displays) the top three cards.
*    Author: Chad Galloway 
*    Date: Jan. 25, 2018
**/

package drawthreecards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DrawThreeCards extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException, FileNotFoundException {
        
        // Create a FlowPane to hold the output cards.
        FlowPane cardsPane = new FlowPane(Orientation.HORIZONTAL, 5, 0);
        cardsPane.setPadding(new Insets(10));
        
        // Create a simple integer based 52 card deck.
        ArrayList<Integer> cards = new ArrayList<>();
        for ( int i = 1; i <= 52; i++) {
            cards.add(i);
        }
        
        // Shuffle the deck
        Collections.shuffle(cards);
        
        // Display first card in deck
        try ( 
                FileInputStream input0 = new FileInputStream(System.getProperty("user.dir") + "/Image/card/" + cards.get(0) + ".png")) {
            cardsPane.getChildren().add(new ImageView(new Image(input0)));
        }
        
        // Display second card in deck
        try ( 
                FileInputStream input1 = new FileInputStream(System.getProperty("user.dir") + "/Image/card/" + cards.get(1) + ".png")) {
            cardsPane.getChildren().add(new ImageView(new Image(input1)));
        }
        
        // Display third card in deck
        try ( 
                FileInputStream input2 = new FileInputStream(System.getProperty("user.dir") + "/Image/card/" + cards.get(2) + ".png")) {
            cardsPane.getChildren().add(new ImageView(new Image(input2)));
        } 
        
        // Create root stack pane and add the flow pane with our cards to display
        StackPane root = new StackPane();
        root.getChildren().add(cardsPane);
        
        // Create Scene
        Scene scene = new Scene(root, 250, 115);
        
        // Load Scene and show stage.
        primaryStage.setTitle("Draw Three");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
