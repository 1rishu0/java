/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowlayoutdemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

//create class for the frame
class myframe extends Frame
{
//    create total of 6 buttons 
    Button b1,b2,b3,b4,b5,b6;
//    create a consturctor to automatically circulate the frame 
    myframe()
    {
//        call the super class
        super("FlowLayout Demo");
//        make the button with their name on it 
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
////        create the object of the flow layout
//        FlowLayout fl=new FlowLayout();
////        set the alignment of the flowlayout to the right
//        fl.setAlignment(FlowLayout.RIGHT);
////        set the layout of the frame to flowlayout
//        setLayout(fl);
////        now add the button to the frame
//        add(b1);
//        add(b2);
//        add(b3);
//        add(b4);
//        add(b5);
//        add(b6);
//       this is for the borderlayout , here we don't need to anything frame have already the class of the border layout 
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
//        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
//        create the class of Panel
        Panel p=new Panel();
//        set the layout of the panel to the gridlayout with 3 element in one column
        p.setLayout(new GridLayout(3,1));
//        add new button on the panel
        p.add(new Button("MON"));
        p.add(new Button("TUE"));
        p.add(new Button ("WED"));
//        now add panel to the frame
        add(p,BorderLayout.EAST);
        
    }
}

public class Flowlayoutdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        call the myframe class for the activation of the frame
        myframe mf=new myframe();
//        set the size of the myframe
        mf.setSize(500,500);
//        set the visiblity of the frame to true
        mf.setVisible(true);
    }
    
}
