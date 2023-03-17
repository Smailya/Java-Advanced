/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package hellojafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ISMAIL
 */
public class HelloJaFx extends Application {
    
    Button btn;

    @Override
    public void start(Stage primaryStage) {
// Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());
// Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);
// Finalize and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");
        primaryStage.show();
    }

    public void buttonClick() {
        if (btn.getText() == "Click me please!") {
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
