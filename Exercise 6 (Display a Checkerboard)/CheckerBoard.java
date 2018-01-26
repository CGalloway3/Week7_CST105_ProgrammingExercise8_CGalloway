//This is my own work. Chad Galloway
/**  Program: Checkerboard
*    File: CheckerBoard.java
*    Summary: Colors the background of the window in a black and white checkered pattern.
*    Author: Chad Galloway 
*    Date: Jan. 25, 2018
**/

package checkerboard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        // Create GridPane we will fill with the checkered pattern.
        GridPane checkerboard = new GridPane();
        
        // Fill Checkerboard with white and black checkered pattern.
        for ( int x = 0; x <= 7; x++) { // Itterate thru x coordinate.
            for ( int y = 0; y <= 7; y++) { // Itterate thru y coordinate.
                // If the sum of the x and y coordinates is evenly divisible by two we want to fill it white.
                if ( ( x + y ) % 2 == 0) {
                    Rectangle rw = new Rectangle (50, 50);
                    rw.setFill(Color.WHITE);
                    checkerboard.add(rw, x, y);
                }
                else { //The sum of x and y coordinates is not divisible by two so we will fill it black.
                    Rectangle rb = new Rectangle (50, 50);
                    rb.setFill(Color.BLACK);
                    checkerboard.add(rb, x, y);
                }
            }
        }
        
        // Create root StackPane and add our checkerboard.
        StackPane root = new StackPane();
        root.getChildren().add(checkerboard);
        
        // Create Scene.
        Scene scene = new Scene(root, 400, 400);
        
        // Load Scene and show Stage.
        primaryStage.setTitle("Let's Play a Game!!");
        primaryStage.setScene(scene); 
        primaryStage.show();
    }

     public static void main(String[] args) {
        launch(args);
    }
    
}
