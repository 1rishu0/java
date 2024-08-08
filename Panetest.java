/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panetest;
import java.io.FileInputStream;
import javafx.application.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.*;
/**
 *
 * @author RISHAB
 */
public class Panetest extends Application
{
    
    Button b1,b2,b3,b4,b5;
    
    public void start(Stage stage) throws Exception
    {
        
//        b1=new Button("One");
//        b2=new Button("Two");
//        b3=new Button("Three");
//        b4=new Button("Four");
//        b5=new Button("Five");
        
//        FlowPane fp=new FlowPane();
//        fp.getChildren().addAll(b1,b2,b3,b4,b5);
//        fp.setHgap(5);

//        TilePane fp=new TilePane();
//        fp.getChildren().addAll(b1,b2,b3,b4,b5);

//        HBox hb=new HBox();
//        hb.getChildren().addAll(b1,b2,b3,b4,b5);
//        BorderPane root=new BorderPane();
//        root.setBottom(hb);
        
//        root.setTop(b1);
//        root.setRight(b2);
//        root.setBottom(b3);
//        root.setLeft(b4);
//        root.setCenter(b5);

//        GridPane root=new GridPane();
//        root.add(b1, 0, 0);
//        root.add(b2, 1,1);
//        root.add(b3, 1, 0);
//        root.add(b4, 0, 2);
        
        ImageView iv1=null;
        ImageView iv2=null;
        ImageView iv3=null;

        iv1=new ImageView(new Image(new FileInputStream("image.jpg")));
        iv2=new ImageView(new Image(new FileInputStream("image.jpg")));
        iv3=new ImageView(new Image(new FileInputStream("image.jpg")));
                
        ScrollPane sp1=new ScrollPane(iv1);
        ScrollPane sp2=new ScrollPane(iv2);
        ScrollPane sp3=new ScrollPane(iv3);
        
        TitledPane t1=new TitledPane("Eiffel",sp1);
        TitledPane t2=new TitledPane("Eiffel2",sp2);
        TitledPane t3=new TitledPane("Eiffel3",sp3);

        Accordion root=new Accordion();
        root.getPanes().addAll(t1,t2,t3);
        
//        Tab t1=new Tab("Eiffel",sp1);
//        Tab t2=new Tab("Eiffel2",sp2);
//        Tab t3=new Tab("Eiffel3",sp3);
        
//        TabPane root=new TabPane();
//        root.getTabs(t1,t2,t3);
        
//        
//        SplitPane root=new SplitPane(sp1,sp2,sp3);
//        root.setDividerPosition((int) 0.33, 0.88);
        
//        SplitPane root=new SplitPane(iv1,iv2,iv3);

        Scene sc=new Scene(root,500,500);
        
        stage.setScene(sc);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        launch(args);
    }
    
}
