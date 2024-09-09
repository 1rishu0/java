/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textprop;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.*;
/**
 *
 * @author RISHAB
 */
//extend application class and implements eventhandler at main class
public class Textprop extends Application implements EventHandler<ActionEvent>
{
//    make instances of text,radiobutton,choicebox,checkbox
    Text t;
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3;
    ChoiceBox<Integer> cb;
//    override the start method along with throwing exception with Stage class as parameter for the application
    public void start(Stage stage) throws Exception
    {
//        make objct of text with string
        t=new Text("Hello");
//        make object of horizontal box with the text as parameter
        HBox h1=new HBox(t);
//        make object of radiobutton with string title
        r1=new RadioButton("Red");
        r2=new RadioButton("Blue");
        r3=new RadioButton("Green");
//        make object of togglegroup class to align the radiobutton at one place
        ToggleGroup tg=new ToggleGroup();
//        add togglegroup at each radiobutton
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
//        make object of horizontalbox class and add all the radiobutton in that box
        HBox h2=new HBox();
        h2.getChildren().addAll(r1,r2,r3);
//        set space of horizontalbox with value
        h2.setSpacing(15);
//        also set the padding of horizontal box with left right top bottom value
        h2.setPadding(new Insets(10,10,10,10));
//        make object of checkbox class with string title
        c1=new CheckBox("Normal");
        c2=new CheckBox("Bold");
        c3=new CheckBox("Italic");
//        make object of horizontal box with adding all the checkbox in it  
        HBox h3=new HBox();
        h3.getChildren().addAll(c1,c2,c3);
//        set the spacing and padding at horizontalbox
        h3.setSpacing(15);
        h3.setPadding(new Insets(10,10,10,10));
//        make object of choicebox with Integer marking and get all the added items
        cb=new ChoiceBox<Integer>();
        cb.getItems().addAll(10,20,30,50);
//        make object of verticalBox with adding 3 horizontalbox and one object of choicebox in it
        VBox vb=new VBox();
        vb.getChildren().addAll(h1,h2,h3,cb);
//        set the spacing and padding of verticalbox
        vb.setSpacing(15);
        vb.setPadding(new Insets(10,10,10,10));
//        set the action listener on the all the radiobox , checkbox and choicebox
        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        cb.setOnAction(this);
//        make object of scene class with add vertical box and dimension as parameters
        Scene sc=new Scene(vb,500,500);
//        set the scene at stage
        stage.setScene(sc);
//        present the scence at stage by show method
        stage.show();
    }

    @Override
    public void handle(ActionEvent ae) {
//        make object of fontweight and fontposture for the default font setting
        FontWeight fw=FontWeight.NORMAL;
        FontPosture fp=FontPosture.REGULAR;
//        make condition for each object selected and make change in text class
        if(r1.isSelected())
        {
            t.setFill(Paint.valueOf("RED"));
        }
        if(r2.isSelected())
        {
            t.setFill(Paint.valueOf("BLUE"));
        }
        if(r3.isSelected())
        {
            t.setFill(Paint.valueOf("GREEN"));
        }
        if(c1.isSelected())
        {
            fw=FontWeight.NORMAL;
        }
        if(c2.isSelected())
        {
            fw=FontWeight.BOLD;
        }
        if(c3.isSelected())
        {
            fp=FontPosture.ITALIC;
        }
//        set the font of the text with type , fontweigth ,fontposture and size as parameter
        t.setFont(Font.font("Times New Roman", fw, fp,cb.getValue()));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      launch call the main method which connect with class that initiate the start method of application class  
        launch(args);
    }

    
    
}
