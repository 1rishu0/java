/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputform;
import java.io.*;
import java.util.*;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
/**
 *
 * @author RISHABH
 */
//make class to store the customer detail
class Customer
{
//    make instance of integer and 2 string
    int count;
    String name;
    String address;
//    make constructor for the saving of detail easily
    Customer(int c,String n,String a )
    {
//        store the values
        count=c;
        name=n;
        address=a;
    }
//    make method to get the cutomer id
    public int getCust(){return count;}
//    make method to get the cutomer name
    public String getName(){return name;}
//    make method to get the customer address
    public String getAdd(){return address;}
}
//make applictaion class extends in main class
public class Inputform extends Application
{
//    make instance of 3 label,1 combobox,2 textfield, 2button, 4 Hbox, 1 vbox, 1 font and 1 count integer
    Label l1,l2,l3;
    ComboBox<Integer> cb;
    TextField tf1,tf2;
    Button b1,b2;
    HBox hb1,hb2,hb3,hb4;
    VBox vb;
    Font f;
    int count=0;
//    override the start method for the initiation of application class
    @Override
    public void start(Stage stage) throws Exception
    {
//        make object of hashmap to store count as keys and customer detail as values
        HashMap<Integer,Customer> h=new HashMap<>();
//        make object of font class with style and size
        f=new Font("Times New Roman",20);
//        make object of label with title
        l1=new Label("Customer ID");
        l2=new Label("Name");
        l3=new Label("Address");
//        set the font of labels
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
//        make object of combobox class and set the style of it
        cb=new ComboBox<>();
        cb.setStyle("-fx-font-size:20");
//        make object of textfield
        tf1=new TextField();
        tf2=new TextField();
//        set the preferred column count of textfield class
        tf1.setPrefColumnCount(20);
        tf2.setPrefColumnCount(20);
//        make object of button class with tilte
        b1=new Button("Create");
        b2=new Button("Save");
//        set the action listener on button 1
        b1.setOnAction(e->{
//            increment the count
            ++count;
//            add that count no to the combobox class
            cb.getItems().add(count);
//            set the current value of combobox class 
            cb.setValue(count);
//            make the text of both text field empty whenever click button 1
            tf1.setText("");
            tf2.setText("");
        });
//        set action listener on button 2
        b2.setOnAction(ae->{
//            make object of cutstomer class with the value that get from combobox  and both textfield class as parameter
            Customer c=new Customer(cb.getValue(),tf1.getText(),tf2.getText());
//            put the count and customer detail in the hashmap
            h.put(count, c);
//            make object of printstream which is used to print the value to file output stream which is connected to text file
            try(PrintStream ps=new PrintStream(new FileOutputStream("Customer.txt"));)
            {
//                every time we write in the customer.txt it reset the previous one so that we use hash map to fill entire map in the text file
                for(Customer custo:h.values())
                {
//                    add the detail in file via printstraem class
                    ps.println(custo.getCust());
                    ps.println(custo.getName());
                    ps.println(custo.getAdd());
                }
                
            }catch(Exception e){}
        });
//        set the font of both button
        b1.setFont(f);
        b2.setFont(f);
//        add the object to the variout hbox panel
        hb1=new HBox(l1,cb);
        hb2=new HBox(l2,tf1);
        hb3=new HBox(l3,tf2);
        hb4=new HBox(b1,b2);
//        set the alignment of all the hbox to center
        hb1.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);
//        make all the hbox add to the vbox panel and the set vbox alignment to center also
        vb=new VBox(hb1,hb2,hb3,hb4);
        vb.setAlignment(Pos.CENTER);
//        make ooject of scanner class which is used to scan the file input stream which is connected to the text file
        try(Scanner sc=new Scanner(new FileInputStream("Customer.txt"));)
            {
//                make instances of integer and 2 string
                int c =0;
                String name;
                String address;
//                make condition until text file have value this loop continue to be moved
                while(sc.hasNext())
                {
//                    add all the detail to the object 
                    c=sc.nextInt();
                    name=sc.next();
                    address=sc.next();
//                    make object of customer class and add all the detail in it 
                    Customer cust=new Customer(c,name,address);
//                    with cust add the c and cust to the hash map for storing the well mannered detail
                    h.put(c, cust);
//                    make condition if current c is greater than count then make count=c and start the combobox value with c
                    if(c>count)count=c;
                    cb.getItems().add(c);
                }   
            }catch(Exception ex){}
//        add the action listener to the combobox class whenever the value in the box is click the action performed
        cb.valueProperty().addListener(mc->{
//            store the detail of that customer id in ct which is click by the user in combobox
            Customer ct=h.get(cb.getValue());
//            set the name and address of that customer id in textfield
            tf1.setText(ct.getName());
            tf2.setText(ct.getAdd());
        });
//        make object of scene to hold the vbox 
        Scene sc=new Scene(vb,500,500);
//        set the stage for the scene to show
        stage.setScene(sc);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        launce the parameter of the main method with directly call the class and initiate the applcation class via start method
        launch(args);
    }
    
}
