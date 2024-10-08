/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wayofeventhandling;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author RISHAB
 */

//create class to handle the Frame
class myframe extends Frame
{
//    create references for button and textfield
    Button b;
    TextField tf;
//    create a variable to handle the count number
    int count = 0;
//    create a constructor for the automation of the frame
    myframe()
    {
//        call the super class
        super("Event Demo");
//        make the object of those references
        b=new Button("Click");
        tf=new TextField("0",20 );
//        set the layout to flowlayout
        setLayout(new FlowLayout());
//        add all the objects
        add(tf);
        add(b);
//        add the event handling to the frame using lambda expression which is applied on the interface with only one abstract method and we write only the parameter of that interface 
//        here actionevent is the parameter of the actionlistener interface and inside that interface there is only one abstract method which actionperformed
        b.addActionListener((ActionEvent ae)-> {
            count++;
            tf.setText(String.valueOf(count));
        });
    }
}
public class Wayofeventhandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object of myframe class
        myframe mf=new myframe();
//        set the size of myframe
        mf.setSize(700,700);
//        set the visiblity of the frame to true
        mf.setVisible(true);
    }
    
}
