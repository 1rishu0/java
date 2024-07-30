/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gridlayoutdemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

//create class for the frame
class myframe extends Frame
{
//    create the button objects
    Button b1,b2,b3,b4,b5,b6;
//    create a constuctor for the automation
    myframe()
    {
//        call the super class
        super("GridLayout Demo");
////        setup the grid layout with 3 rows and 2 column
//        setLayout(new GridLayout(3,2));

//        call the class of GridBagLayout and GridBagConstraints in the frame
        GridBagLayout gbl=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
//        setup the layout for gridbaglayout
        setLayout(gbl);
//        call the objects of the button for gridlayout and Gridbaglayout
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");

//        add the upper object in the frame and put the gridaxis with number for gridbagconstraints
        gbc.gridx=1;
        gbc.gridy=1;
        add(b1,gbc);
        
        gbc.gridx=2;
        gbc.gridy=2;
        add(b2,gbc);
        
        gbc.gridx=3;
        gbc.gridy=3;
        add(b3,gbc);
        
        gbc.gridx=4;
        gbc.gridy=4;
        add(b4,gbc);
        
        gbc.gridx=1;
        gbc.gridy=2;
        add(b5,gbc);
        
        gbc.gridx=3;
        gbc.gridy=4;
        add(b6,gbc);


    }
}

public class Gridlayoutdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        call the myframe class for the working of frame
        myframe mf=new myframe();
//        set the size of the given frame
        mf.setSize(500,500);
//        set the visiblity of the frame to true
        mf.setVisible(true);
    }
    
}
