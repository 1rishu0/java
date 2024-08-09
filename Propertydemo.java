/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propertydemo;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.*;
/**
 *
 * @author RISHAB
 */
//extend application in class for the initiation of application
public class Propertydemo extends Application
{
//    ovveride the start methdo with stage class as parameter
    public void start(Stage stage) throws Exception
    {
//        make object of button class with String and where the underscore is maked when you click alt button it will show that aplhabet
        Button b=new Button("_Click Me");
//        set the text color to blue and set the to true it means shortkey with enter key is true 
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);
//        make object of tooltip class with string and set to the button
        Tooltip tp=new Tooltip("Click the button to save");
        b.setTooltip(tp);
        
//        b.setStyle("-fx-border-color:yellow;-fx-background-color:red");
        
//        make object of alert class with alerttype and String
        Alert a=new Alert(AlertType.INFORMATION,"Button is Clicked");
//set on action event on button to show the alerttype when clicked
        b.setOnAction((ActionEvent ae)-> a.show());
//        make object of flowpane class to hold the button as parent
        FlowPane fp=new FlowPane(b);
//        make object scene class with holding scene graph with having flowpane and size of the sence as parameter
        Scene sc=new Scene(fp,400,400);
//        set the secne to the stage and present the show at stage
        stage.setScene(sc);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      launch to automatically start the application because static in main method is does not require object or instance for the initiation , it is directly connect with class   
        launch(args);
    }
    
}
