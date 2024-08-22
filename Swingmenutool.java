/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingmenutool;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author RISHAB
 */
//make the class for jframe
class myframe extends JFrame
{
//    make 1 reference for jtoolbar, 7 for jbutton and 1 for jtextarea
    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea ta;
//    make constructor for the automation of myframe
    myframe()
    {
//        call super class for headline
        super("ToolBar Demo");
//        make the obejct of jtoolbar
        tb=new JToolBar();
//        make the object of 7 jbutton with imageicon class
        b1=new JButton(new ImageIcon(""));
        b2=new JButton(new ImageIcon("OPEN"));
        b3=new JButton(new ImageIcon(""));
        b4=new JButton(new ImageIcon(""));
        b5=new JButton(new ImageIcon(""));
        b6=new JButton(new ImageIcon(""));
        b7=new JButton(new ImageIcon(""));
//add all the jbutton in jtoolbar with separator between them
        tb.add(b1);tb.add(b2);tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);tb.add(b5);tb.add(b6);tb.add(b7);
//        make object of jtextarea
        ta=new JTextArea();
//        make object of jscrollpane class with holding jtextarea
        JScrollPane sp=new JScrollPane(ta);
//        add jtoolbar and jscrollpane to jframe with its borderlayout direction
        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);
//        make object of jmenubar , jmenu with name and 2 jmenuitem with name also
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem mi1=new JMenuItem("Color");
        JMenuItem mi2=new JMenuItem("Open");
//        set the shortkey of mi2 
        mi2.setMnemonic(KeyEvent.VK_O);
//        add the jmenuitem to menu and menut to jmenubar and jmenubar to jframe
        file.add(mi1);
        file.addSeparator();
        file.add(mi2);
        mb.add(file);
        setJMenuBar(mb);
//        set the action command of jbutton2 to open
        b2.setActionCommand("Open");
//        make object of handler class for the event handling
        handler h=new handler();
//        add action listener to both jmenuitem and jbutton 1 and 2
        b2.addActionListener(h);
        mi2.addActionListener(h);
        b1.addActionListener(h);
        mi1.addActionListener(h);
    }
//    make class to handle actionlistener
    class handler implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
//            make conditon if the give action command for actionevent is open then
            if(ae.getActionCommand()=="Open")
            {
//                make class for jfilechooser which help to show the open dialog in jframe
                JFileChooser fc=new JFileChooser();
            fc.showOpenDialog(new myframe());
//            make object of file class to hold the file that selected from the opendailog of jfilechooser
            File f=fc.getSelectedFile();
//            make try and catch to eliminate exception
            try{
//                make object of fileinputstream class to hold the file 
                FileInputStream fi=new FileInputStream(f);
//                and store that stream of fileinput in array of byte
                byte b[]=new byte[fi.available()];
//                read that file through inputfilestream
                fi.read(b);
//                convert array of byte to string 
                String str=new String(b);
//                and put that string to jtextarea
                ta.setText(str);
//                close the inputflie stream
                fi.close();
            }
            catch(Exception e){};
            }
            else
            {
//                make the objec of color class to show the dialog through fcolorchooser within jframe  with title and color
                Color col=JColorChooser.showDialog(new myframe(), "Font Color", Color.blue);
//                set that object in the foreground of jtextarea
                ta.setForeground(col);
            }
        }
    }
}
public class Swingmenutool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make object of inherited class of jframe
        myframe mf=new myframe();
//        set the size of myframe
        mf.setSize(800,800);
//        set the visiblity of myframe
        mf.setVisible(true);
//        set the default operation of close to exitonclose
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
