/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventfx;

import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**
 *
 * @author RISHAB
 */
//extends class for the starting of application
public class Eventfx extends Application //implements EventHandler<ActionEvent>
{
//make instance of button class
    Button b;
//make variable to store the integer value
    int count = 0;
//override method for the application class
    @Override
    public void start(Stage stage) throws Exception {
//make object of button class with string 
        b = new Button("OK");
//set the size of button with dimension in width and height
        b.setPrefSize(100, 30);
//        set an action event on button 
//        b.setOnAction(this);

//TYPE 2
//        b.setOnAction(new EventHandler<ActionEvent>()
//                {
//                public void handle(ActionEvent ae)
//{
//                    String str="";
//        count++;
//        
//        b.setText(count+"");
//}
//                });

//set the action on button 
        b.setOnAction((ActionEvent ae)
                -> {
//            make variable to store the empty string and increament the count value when the button is clicked
            String str = "";
            count++;
//set the text of button with count and empty string
            b.setText(count + str);
        });
//make object of class flowpane to hold the button
        FlowPane fp = new FlowPane(b);
//make object of scene class with flowpane and dimension with width and height as parameter
        Scene sc = new Scene(fp, 400, 400);
//set the stage with the scene
        stage.setScene(sc);
//now represent the scene at the stage with show method
        stage.show();
    }
//TYPE 1 OF HOW TO HANDLE EVENT
//    public void handle(ActionEvent ae)
//    {
//        
//        String str="";
//        count++;
//        
//        b.setText(count+"");
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//launch the main method that automatically run the application class
        launch(args);
    }

}
