//This is my own work. Chad Galloway
/**  Program: Java Font and Color Randomizer
*    File: JavaColorFont.java
*    Summary: Displays the word Java sideways five times and randomizes the color and transparency.
*    Author: Chad Galloway 
*    Date: Jan. 25, 2018
**/

package javacolorfont;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaColorFont extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        // Create HBox for holding text "Java"
        HBox myHBox  = new HBox();
                
        // Create first text Java and set all it's properties.
        Text myText1 = new Text("Java");
        myText1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        myText1.setRotate(90);
        myText1.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
       
        // Create second text Java and set all it's properties.
        Text myText2 = new Text("Java");
        myText2.setRotate(90);
        myText2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        myText2.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
        
        // Create third text Java and set all it's properties.
        Text myText3 = new Text("Java");
        myText3.setRotate(90);
        myText3.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        myText3.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
        
        // Create fourth text Java and set all it's properties.
        Text myText4 = new Text("Java");
        myText4.setRotate(90);
        myText4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        myText4.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
        
        // Create fifth text Java and set all it's properties.
        Text myText5 = new Text("Java");
        myText5.setRotate(90);
        myText5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        myText5.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
        
        // Add text nodes to hbox
        myHBox.getChildren().addAll(myText1, myText2, myText3, myText4, myText5);
        
        // Create Stack Pane and add HBox to it.
        StackPane root = new StackPane();
        root.setPadding(new Insets(20));
        root.getChildren().add(myHBox);
        
        // Create Scene
        Scene scene = new Scene(root, 250, 75);
        
        // Loaad Scene and show Primary Stage.
        primaryStage.setTitle("Can you say \"Java\"");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
