/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textareasliderdemo;
import java.io.FileInputStream;
import java.util.Scanner;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.*;
/**
 *
 * @author RISHAB
 */
//extends the class for the application
public class Textareasliderdemo extends Application 
{
//    override the start method for the initiation of application
    public void start(Stage stage) throws Exception
    {
//        make the object of textarea and set the preferred coulumn count with value
        TextArea ta=new TextArea();
        ta.setPrefColumnCount(100);
//        also set the row count of textarea with value
        ta.setPrefRowCount(20);
//        make object of slider with minimum, maximum and initial values as parameter
        Slider s=new Slider(10,50,10);
//        set the major tick unit of slider with value
        s.setMajorTickUnit(5);
//        set the show of the tick mark to true
        s.setShowTickMarks(true);
//        add listener at value  property of slider and adjust the font of textarea
        s.valueProperty().addListener(e-> {
            ta.setFont(Font.font(s.getValue()));
        });
//        make object of datepicker class and set the visiblity of week number to true
        DatePicker dp=new DatePicker();
        dp.setShowWeekNumbers(true);
//        set action listener on datepicker class whenever it clicked the date will be mention along with text
        dp.setOnAction(ae->{
            ta.setText("Date : "+dp.getValue()+"\n"+ta.getText());
        });
//        make object of colorpicker class with set actionlistener that if clicked then set the style of the text changed
        ColorPicker cp=new ColorPicker();
        cp.setOnAction(ae->{
            ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8));
//            set the text with the given value from cp along with text 
            ta.setText(cp.getValue()+"\n"+ta.getText());
        });
//        make object of button class with string
        Button b=new Button ("Open File");
//        set action listener on button
        b.setOnAction(e->{
//            make object of filechooser class
            FileChooser fc=new FileChooser();
//            to open the dialogbox and store it in file class 
            java.io.File file=fc.showOpenDialog(stage);
//            which then be scanned by scanner class through fileinputstream
            try(Scanner sc=new Scanner(new FileInputStream(file));)
            {
//                make varaible to store empty string
                String str="";
//                and make while condition that until there is no text left it add the one line at a time
                while(sc.hasNext())
                {
//                    store that line of text in str with starting with next line
                    str=str+sc.nextLine()+"\n";
                }
//                then set the text of textarea with str
                ta.setText(str);
            }catch(Exception ex){};
        });
        
//        make object of virtical box and all the childer like textarea and slider in it
        VBox vb=new VBox();
        vb.getChildren().addAll(ta,s,dp,cp,b);
        vb.setAlignment(Pos.TOP_CENTER);
//        make object of scene class with virtical box and size of scene as parameter
        Scene sc=new Scene(vb,500,500);
//        set the scene at the stage and ready to show the scene 
        stage.setScene(sc);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        launch the parameter of main method which automatically initiate the class with application class extended
        launch(args);
    }
    
}
