/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package windoweventdemo;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author RISHAB
 */
//create class for the handling of the frame
class myframe extends Frame
{
//    create a label reference
    Label l;
//    create consturctor for the automation of frame
    myframe()
    {
//        call the super class which is frame
        super("Window Event Demo");
//        call the handler class for the handling of the event
        handler h=new handler();
//        call the label class with nothing on it
        l=new Label("                           ");
//        set the layout of frame to Flow layout
        setLayout(new FlowLayout());
//        now add the label to the frame
        add(l);
//        now add the event to the frame
        addWindowListener(h);
    }
//    create the handler class for the event handling
    class handler implements WindowListener
    {

        public void windowOpened(WindowEvent e) {
//            set the text to window opened
            l.setText("Window Opened");
            
        }

        public void windowClosing(WindowEvent e) {
//            set the text to window closing
            l.setText("Window Closing");
//            make the system exit
            System.exit(0);
        }

        public void windowClosed(WindowEvent e) {
//            set the text to window closed
            l.setText("Window Closed");
        }

        public void windowIconified(WindowEvent e) {
//            set the text of label to Window Iconified
            l.setText("Window Iconified");
        }

        public void windowDeiconified(WindowEvent e) {
//            set the text of label to Window deIconified
             l.setText("Window Deiconified");
        }

        public void windowActivated(WindowEvent e) {
//            set the text of label to Window activated
            l.setText("Window Activated");
        }

        public void windowDeactivated(WindowEvent e) {
//            set the text of label to Window Deactivated
            l.setText("Window Deactivated");
        }
        
    }
}
public class Windoweventdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        call the myframe class for the initiation of the frame
        myframe mf=new myframe();
//        set the size of myframe
        mf.setSize(700,700);
//        set the visibity of myframe to true
        mf.setVisible(true);
    }
    
}
