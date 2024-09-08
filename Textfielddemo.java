/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textfielddemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

class myframe extends Frame 
{
    Label l1,l2;
    TextField tf;
    
    public myframe()
    {
        super("TextField Demo");
        
        l1=new Label("No Text Entered");
        l2=new Label("Enter Key is not yet hit");
        handler h=new handler();
        tf=new TextField(20);
        tf.addActionListener(h);//this will perform the callback action and mover back to the method which was supposed to be call
        tf.addTextListener(h);
        tf.setEchoChar('*');//this will set all the text into the mark design, it will come in handy in password time.
        
        
        setLayout(new FlowLayout());
        
        add(l1);
        add(tf);
        add(l2);
    }

    
    class handler implements TextListener, ActionListener//we use another class to handle the listener part incase the constructor did not work properly and show error
    {
        public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    
    }

    
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
        
    }
    }
    
}

public class Textfielddemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        myframe mf=new myframe();
        
        mf.setSize(400,400);
        mf.setVisible(true);
    }
    
}
