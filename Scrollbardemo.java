/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrollbardemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

//create class for the inheritance of the class frame
class myframe extends Frame
{
//    create scrollbar with multiple variable and textfield
    Scrollbar red,blue,green;
    TextField tf;
//    make the contructor to automatically do the task when calling the class
    myframe()
    {
//        call the super class
        super("Scroll Demo");
        
//        call the handler for the funtion of the listener
        handler h=new handler();
//        make the scrollbar with its position horizontally , current value should be 0,size of the tracker size is 20, minimum value of the scrollbar is 0,and max is 255 for the colour
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
//        make the textfield with its size 20
        tf=new TextField(20);
//        set the size of the scrollbar with setBounds with 50 in X direction , 150 in Y direction it is a coordinator , now set size with width 300 and height 30
        red.setBounds(50, 150, 300, 30);
        blue.setBounds(50,200,300,30);
        green.setBounds(50,250,300,30);
//        also set the bounds of the textfield
        tf.setBounds(50,50,300,30);
//        set the layout to null
        setLayout(null);
//        now add textfield and scrollbar
        add(tf);
        add(red);        
        add(blue);
        add(green);
//        now add the adjustment listner to the given scrollbar
        red.addAdjustmentListener(h);
        blue.addAdjustmentListener(h);
        green.addAdjustmentListener(h);
    }
    
//    create class to handle the events of the frame
    class handler implements AdjustmentListener
    {   
        public void adjustmentValueChanged(AdjustmentEvent e) {
//            set the background colour of the textfield
            tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
            
        }
        
    }
}

public class Scrollbardemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        call the class myframe to implement
        myframe mf=new myframe();
//        set the size of the frame
        mf.setSize(500,500);
//        set the visiblity of the frame true
        mf.setVisible(true);
    }
    
}
