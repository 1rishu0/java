/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterdemo;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */
////    create another calss to handle the window adapter
//    class adapter extends WindowAdapter
//    {
//        public void windowClosing(WindowEvent e)
//        {
//            System.exit(0);
//        }
//    }
//create new class to handle the frame
class myframe extends Frame
{
//    create a constructor for the automation of the frame
    myframe()
    {
//        call the super class and write Adapter demo
        super("Adapter Demo");
        
////        create the object for adapter class
//        adapter a=new adapter();

////        add the window adapter to the frame
//        addWindowListener(a);

//       another way to add the window adapter to the frame
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
////    create another calss to handle the window adapter
//    class adapter extends WindowAdapter
//    {
//        public void windowClosing(WindowEvent e)
//        {
//            System.exit(0);
//        }
//    }
}
public class Adapterdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        create the object for myframe
        myframe mf=new myframe();
//        set the size of the myframe
        mf.setSize(500,500);
//        set the visiblity of the frame to true
        mf.setVisible(true);
    }
    
}
