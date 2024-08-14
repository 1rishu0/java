/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingcomponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author RISHAB
 */
//create a class to handle the jframe it is used for the java swing
class myframe extends JFrame //implements ActionListener
{
//    create one reference for lable which is jlabel for swing and another for button which is jbutton in swing
    JLabel l;
    JButton b;
//    make one integer reference to store the count value 
    int count=0;
//    create a constructor for the automation of jframe
    myframe()
    {
//        call the super class for the headline
        super("Swing Demo");
//        make object of jlabel and jbutton
        l=new JLabel("Clicked "+count+" Times");
        b=new JButton("Click");
//        set the layout of jframe to flowlayout
        setLayout(new FlowLayout());
//        now add the above objects to the jframe
        add(l);
        add(b);
//        add action listener for the jbutton , whenever the button clicked label change their value
        b.addActionListener((ActionEvent ae)-> {
//        increament the count value
            count++;
//        set the text of the label when the button is clicked
            l.setText("Clicked "+count+" Times");});
//        getrootpane is the method of jframe which have the function setdefaultbutton which we set to b , means whenever we hit enter button , b button is clicked as if it get the priority
        getRootPane().setDefaultButton(b);
        
//        set the icon on the button with the Imageicon class the allocate the image to the button
//        b.setIcon(new ImageIcon("C:\\Users\\RISHAB\\Desktop\\Best Wallpaper\\23.jpg"));

//        settooltiptext have the function to show the basic information about the label text whenever you moved you cursor to that label
        l.setToolTipText("Counter hai");
    }
    
//    public void actionPerformed(ActionEvent ae)
//    {
//        
//        count++;
//        
//        l.setText("Clicked "+count+" Times");}
}

public class Swingcomponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//       make the object of the myframe class to handle the jframe 
        myframe mf=new myframe();
//        set the size of jframe
        mf.setSize(700,700);
//        set the visiblity of jframe
        mf.setVisible(true);
//        set the operation of the close button whenever it get clicked , by setdefaultcloseoperation method and inbuilt method of jframe which is exit_on_close help the window to get properly closed
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
