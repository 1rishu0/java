/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keyeventdemo;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author RISHAB
 */

//create class to handle the frame
class myframe extends Frame
{
//        create 4 references for the label
        Label l1,l2,l3,l4;
//    create constructor for the automation of the frame
    myframe()
    {
//        call the super class for the implementation
        super("KeyEvent Demo");
//        create the object of handler class
        handler h=new handler();
//        create label from 4 references
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
//        set the layout of the frame to null
        setLayout(null);
//        set the bounds of the labels with x and y coordinates and width and height
        l1.setBounds(30,30,100,20);
        l2.setBounds(30,60,100,20);
        l3.setBounds(30,90,100,20);
        l4.setBounds(30,120,200,20);
//        add all the labels to the frame
         add(l1);
         add(l2);
         add(l3);
         add(l4);
//         add keylistner to the frame
        addKeyListener(h);
    }
//create class handler for the handling of the events
    class handler implements KeyListener
    {

        
        public void keyTyped(KeyEvent e) {
//            set the text of the label-3
            l3.setText("Key Typed");
//            set the text of the label-4 to the time of keyevent by calling date class with "" to make it a String element
            l4.setText(new Date(e.getWhen())+"");
        }

        public void keyPressed(KeyEvent e) {
//            set the text label-1
            l1.setText("Key Pressed");
//            set the text of the label-2 to empty
            l2.setText("");
        }

        public void keyReleased(KeyEvent e) {
//            set the text of label-2
            l2.setText("Key Released");
//            set the text of the label-1 and label-3 and label-4 to empty
            l1.setText("");
            l3.setText("");
            l4.setText("");
        }
        
    }
}

public class Keyeventdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        create the object for the class myframe for the implementation of frame
        myframe mf=new myframe();
//        set the size of myframe
        mf.setSize(600, 600);
//        set the visiblity of myframe to true
        mf.setVisible(true);
    }
    
}
