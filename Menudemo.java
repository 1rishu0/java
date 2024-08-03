/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menudemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

//create class to handle the frame
class myframe extends Frame {
//    make 2 refrences for  the menu - file and subfile

    Menu file, sub;
//    make 4 references for the menuitem 
    MenuItem open, save, close, closeall;
//    make a reference for the textfield
    TextField tf;
//    make one reference for the checkboxmenuitem
    CheckboxMenuItem auto;
//    make constructor for the automation of the frame

    myframe() {
//        call the super class for the headline
        super("Menu Demo");
//        make object of the menu - file and subfile
        file = new Menu("File");
        sub = new Menu("Close");
//        make object of the menuitem
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("Close All");
//        make object of the checkboxmenuitem
        auto = new CheckboxMenuItem("Auto Save");
//        make object of the textfield
        tf = new TextField(20);
//        set the layout of the frame to the flow layout
        setLayout(new FlowLayout());
//        add textfield to the frame
        add(tf);
//        add all the menuitem in the file
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);
//        now add 2 menuitem in the sub file
        sub.add(close);
        sub.add(closeall);
//        create object of the class menubar
        MenuBar mb = new MenuBar();
//        now add file to the menubar
        mb.add(file);
//        now set menubar to the frame
        setMenuBar(mb);
//        add actionlistener event in all the menuitems
        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeall.addActionListener((ActionEvent ae) -> tf.setText("Close All"));
//        add itemlistener event in the checkboxitemmenu
        auto.addItemListener((ItemEvent ie)
                -> {
            if (auto.getState()) {
                tf.setText("Auto Save ON");
            } else {
                tf.setText("Auto Save OFF");
            }
        });

    }
}

public class Menudemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the objct of class myframe
        myframe mf = new myframe();
//        set the size of myframe
        mf.setSize(700, 700);
//        set the visiblity of the frame
        mf.setVisible(true);
    }

}
