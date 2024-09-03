/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingsplit;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
/**
 *
 * @author RISHAB
 */
//make the class to handle the swing jframe
class myframe extends JFrame
{
//    make the reference of the class jsplitpane
    JSplitPane sp;
//    make the reference of the class jlist
    JList list;
//    make the reference of class jlabel
    JLabel l;
//    make the constructor for the automation of jframe
    myframe()
    {
//        call the super class for the headline
        super("Split Demo");
//        make the string array to contain the data for the jlist , this is called model
        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
//        make the object of jlist class which contain str , it is called module
        list=new JList(cols);
//        add the listselectionlistener to the jlist object
        list.addListSelectionListener((ListSelectionEvent lse)->{
//            the values that get selected from the jlist is not string so first convert it to string then store it in string variable
            String str=list.getSelectedValue().toString();
//            make the switch condition to select either one of them
            switch(str)
            {
                case "RED": l.setBackground(Color.red);
                            break;
                case "GREEN": l.setBackground(Color.GREEN);
                            break;
                case "BLUE": l.setBackground(Color.blue);
                            break;
                case "YELLOW": l.setBackground(Color.yellow);
                            break;
                case "MAGENTA": l.setBackground(Color.magenta);
                            break;
                case "ORANGE": l.setBackground(Color.orange);
                            break;
                case "BLACK": l.setBackground(Color.black);
                            break;
            }
        });
//        make the object of the class jscrollpane for the holding of jlist and jlabel
        JScrollPane jsp=new JScrollPane(list);
//        make the object of jlabel with some space in string , then set the background color and set the opaque of the label to true to avoid transparency
        l=new JLabel(" ");
        l.setBackground(Color.red);
        l.setOpaque(true);
//        make another object of jscrollpane to hold jlist and jlabel
        JScrollPane jsp2=new JScrollPane(l);
        
////        make the object of jsplitpane class with splitting type , and multiple jscrollpane
//        sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jsp,jsp2);
////        set the dividerloaction of the jsplitpane with integer value
//        sp.setDividerLocation(200);
        
//        make the object of the class jtabbedpane to make the jlist and jlabel divide into  2 tabs
        JTabbedPane tp=new JTabbedPane();
//        add the 2 jscrollpane to the object of jtabbedpane
        tp.addTab("Color",jsp);
        tp.addTab("Label",jsp2);
//        add the object of jtabbedpane to the jframe
        add(tp);
    }
}
public class Swingsplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object of the inherited class of jframe
        myframe mf=new myframe();
//        set the size of inherited class of jframe
        mf.setSize(800,800);
//        set the visiblity of myframe to true
        mf.setVisible(true);
//        set the default operation of close to exitonclose
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
