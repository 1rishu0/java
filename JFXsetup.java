/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jfxsetup;
import javafx.application.Application;
import javafx.stage.Stage;
/**
 *
 * @author RISHAB
 */
//extends the application class for the initiation of javafx
public class JFXsetup extends Application
{

    /**
     * @param stage
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
//override the start method with throwing exception 
    @Override
    public void start(Stage stage) throws Exception
    {
//        set the title of the stage to hello
        stage.setTitle("Hello");
//        stage represent the frame window just like Frame in awt and jframe in swing
        stage.show();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//        launch the args in main method which automatically start the javafx frame
//main will start the application and the start method will show the application
        launch(args);
    }
    
}
