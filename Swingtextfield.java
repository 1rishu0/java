/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingtextfield;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import javax.swing.text.NumberFormatter;
/**
 *
 * @author RISHAB
 */
//create class to handle the swing frame
class myframe extends JFrame
{
//    create constructor for the automation of frame
    myframe()
    {
//        make the object of the jtextfield class with the size 
        JTextField tf=new JTextField(15);
//        make the format of the date with dateformat class to put it in jformattedtextfield
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//        make the object of the jformattedtextfield class to store the dateformat 
        JFormattedTextField ftf=new JFormattedTextField(df);
//        set the size of the jformattedtextfield with columns 15
        ftf.setColumns(15);
//        with dateformat in jformattedtextfield it have to be with some value, it cannot be empty , so that we set the value of the formattedtextfield
        ftf.setValue(0);
//        make the object of numberformat with getting its instance means in this format you can type any number you want
        NumberFormat nf=NumberFormat.getInstance();
//        make the object of the numberformatter which actually format the numberformat 
        NumberFormatter nff=new NumberFormatter(nf);
//        set the allowinvalid to false means in formattedtextfield now you can only write the number 
        nff.setAllowsInvalid(false);
//        set the maximum value that can be put in formattedtextfield
        nff.setMaximum(10000);
//        make the object of formattedtextfield class to hold the numeberformat
        JFormattedTextField ftf2=new JFormattedTextField(nff);
//        set the size of the formattedtextfield with columns 15
        ftf2.setColumns(15);
//        make the object of jtextarea with size of number of text and number of line
        JTextArea ta=new JTextArea(20,20);
//        set the layout of the frame to flowlayout which you only get form the awt package
        setLayout(new FlowLayout());
//        add jtextfield , 2 jformattedtextfield and 1 jtextarea to the frame
        add(tf);
        add(ftf);
        add(ftf2);
        add(ta);
    }
}
public class Swingtextfield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object of myframe class to handle the swing frame
        myframe mf=new myframe();
//        set the size of the frame 
        mf.setSize(800,800);
//        set the visiblity of the frame to true
        mf.setVisible(true);
//        set the operation of the defaultclose to make exit via jframe
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
