/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingitemdemo;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author RISHAB
 */
//create class for the swing frame
class myframe extends JFrame
{
//    create 2 reference for the checkbox
    JCheckBox c1,c2;
//    create 2 reference for the radiobutton
    JRadioButton r1,r2;
//    create reference for the textfield
    JTextField tf;
//    create constructor for the automation of the swing frame
    myframe()
    {
//        call the super class for the headline
        super("Demo");
//        make the obejct of textfield with name and size
        tf=new JTextField("Demo Text",20);
//        set the bounds of the textfield
        tf.setBounds(10,20,100,80);
//        make the object for the checkbox with name in it
        c1=new JCheckBox("Bold");
//        set the mnemonic of the about checkbox , it means whenever you click particular button it operate that checkbox
        c1.setMnemonic(KeyEvent.VK_B);
//        make new object for the checkbox for the italic 
        c2=new JCheckBox("Italic");
//        also set the mnemonic for the italic object
        c2.setMnemonic(KeyEvent.VK_I);
//        make the 2 object of the radiobutton with names in it 
        r1=new JRadioButton("lower");
        r2=new JRadioButton("UPPER");
//        make the object of the buttongroup class which act as a group to add the radiobutton
        ButtonGroup bg=new ButtonGroup();
//        now add the radiobuttons to the buttongroup
        bg.add(r1);
        bg.add(r2);
//        make the object of the handler class for the handling of the events
        handler h=new handler();
//        add the event listener to the checkbox and radiobutton
        c1.addActionListener(h);
        c2.addActionListener(h);
        r1.addActionListener(h);
        r2.addActionListener(h);
//        set the actioncommand of the radionbutton with names, it means whenever you click that radiobutton it conside the action with name on it
        r1.setActionCommand("lower");
        r2.setActionCommand("UPPER");
//        set the layout of the swing frame to flowlayout
        setLayout(new FlowLayout());
//        add all the object to the frame
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
    }
//    make the class to handle the event listeners
    class handler implements ActionListener
    {
//        override the method of the actionlistener with parameter in it
        public void actionPerformed(ActionEvent ae)
        {
//            make the switch condition which is applied only to the radiobutton with their action commands in the case area
            switch(ae.getActionCommand())
            {
//                if the case is lower set the text fo the textfield to lowcase 
                case "lower": tf.setText(tf.getText().toLowerCase());
                                break;
//                if the case is upper then set the text of the textfield to uppercase
                case "UPPER": tf.setText(tf.getText().toUpperCase());
                                break;
            }
//            make two integer reference to hold the criteria of bold and italics
            int b=0,i=0;
//            make two condion on if the checkbox selected make that font to it needs
            if(c1.isSelected())b=Font.BOLD;
            if(c2.isSelected())i=Font.ITALIC;
//            make the object of the font class to setup the font in the given textfield
            Font f=new Font("Times New Roman",b|i,15);
//            set the font to the refernce of above font class
            tf.setFont(f);
        }
    }
}
public class Swingitemdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object of the class myframe 
        myframe mf=new myframe();
//        set the size of the swing frame
        mf.setSize(700,700);
//        make the visible of the frame to true
        mf.setVisible(true);
//        set the operation of close to exit on close
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
