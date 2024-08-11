/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingborders;
import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author RISHAB
 */
//create class to handle the swing frame 
class myframe extends JFrame
{
//    make the reference for the jlabel,jtextfield,jbutton
    JLabel l;
    JTextField tf;
    JButton b;
//    make one more reference for the panel that containg above reference's objects
    JPanel p;
//    create a constructor for the automation of the jframe
    myframe()
    {
//        make the object of the all references
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("OK");
        p=new JPanel();
//        create a reference for the border class and with borderfactory you can create multiple border
//        Border br=BorderFactory.createLoweredBevelBorder();
//        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE),"Login");
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.CYAN),"Login",TitledBorder.CENTER , Font.BOLD);        
//set the border br in the panel
        p.setBorder(br);
//        add all the object in the panel
        p.add(l);
        p.add(tf);
        p.add(b);
//        set the layout of the jframe to flowlayout
        setLayout(new FlowLayout());
//        now add the panel to the jframe
        add(p);
    }
}
public class Swingborders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        create the object of the class myframe to handle the swing frame
        myframe mf=new myframe();
//        set the size of the myframe
        mf.setSize(700,700);
//        set the visiblity of myframe to true
        mf.setVisible(true);
//        set the operation of the default close to exit on close
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
