/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mouseeventdemo;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

//create class to handle the frame
class myframe extends Frame
{
//    create label reference
    Label l,l2;
//    create a constructor for the automation
    myframe()
    {
//        call the super class
        super("Mouse Event Demo");
//        call the handler class for the events
        handler h=new handler();
//        call the Label class
        l=new Label("");
        l2=new Label("");
//        set the layout of the frame to null
        setLayout(null);
//        set the bounds of the label with x and y coordinates and width and height
        l.setBounds(10,50,100,20);
        l2.setBounds(10,80,100,20);
//        now add the label to the frame
        add(l);
        add(l2);
//        now add the event listener in the frame
        addMouseListener(h);
        addMouseMotionListener(h);
    }
//    create class for the handling of the events
    class handler implements MouseListener,MouseMotionListener
    {

        public void mouseClicked(MouseEvent e) {
//            set the text of the label to mouseclicked
            l.setText("Mouse Clicked");
        }

        public void mousePressed(MouseEvent e) {
//            set the text of the label to mousepressed
            l.setText("Mouse Pressed");
        }

        public void mouseReleased(MouseEvent e) {
//            set the text of the label to mousereleased
            l.setText("Mouse Released");
        }

        public void mouseEntered(MouseEvent e) {
//            set the text of the label to mouseentered
            l.setText("Mouse Entered");
        }

        public void mouseExited(MouseEvent e) {
//            set the text of the label to mouseexited
            l.setText("Mouse Exited");
        }

        public void mouseDragged(MouseEvent e) {
//            set the text of the label to mousedragged
            l.setText("Mouse Dragged");
//            show the coordinate of the mouse dragged
            l2.setText("("+e.getX()+","+e.getY()+")");
            
        }

        public void mouseMoved(MouseEvent e) {
//            set the text of the label to mousemove
            l.setText("Mouse Moved");
//            set the coordinate of the mouse movement
            l2.setText("("+e.getX()+","+e.getY()+")");
        }
        
    }
}
public class Mouseeventdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        call the myframe for the intiation of the Frame
        myframe mf=new myframe();
//        set the size of myframe
        mf.setSize(600,600);
//        set the visiblity of myframe to true
        mf.setVisible(true);
    }
    
}
