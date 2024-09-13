/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swinginternalframe;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author RISHAB
 */
//make class for the handling of jinternalframe
class myinternalframe extends JInternalFrame
{
//    make a static integer variable that remain constant without any change to count the document number
    static int count=0;
//    make references for jtextarea and jscrollpane
    JTextArea ta;
    JScrollPane sp;
//    make constructor for the automation of the jinternalframe
    myinternalframe()
    {
//        call the super class for headline and for the determination jinternalframe decrease in size , resizeable , iconisable , deiconisable
        super("Document"+(++count),true,true,true,true);
//        make the object of jtextarea
        ta=new JTextArea();
//        make the object of jscrollpane to hold the jtextarea
        sp=new JScrollPane(ta);
//        add the jscrollpane to the jinternalframe
        add(sp);
//        make the object of jmenubar , jmenu with name , jmenuitem with name
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem mi=new JMenuItem("Save");
//        add jmenuitem to the jmenu
        file.add(mi);
//        now add jmenu to the jmenubar
        mb.add(file);
//        set the jmenubar of the internalframe to mb
        setJMenuBar(mb);
//        set the size of the jinternalframe
        setSize(300,300);
//        also set the location of the jinternalframe
        setLocation(50,50);
//        also set the visiblity of the jinternalframe to true
        setVisible(true);
    }
}
//make the class to handle the jframe 
class myframe extends JFrame
{
//    maket the reference of the jdesktoppane class to hold the jinternalframe
    JDesktopPane dp;
//    make the constructor for the automation of jframe
    myframe()
    {
//        call the super class for the headline
        super("Internal Frame Demo");
//        make object of jdesktoppane class
        dp=new JDesktopPane();
//        set the contentpane of the jframe to jdesktoppane
        setContentPane(dp);
//        make the object of jmenubar, jmenu with name ,jmenuitem with name
        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem mi=new JMenuItem("New");
//        add jmenuitem to jmenu
        d.add(mi);
//        add jmenu to jmenubar
        mb.add(d);
//        set the menubar of the jframe to mb
        setJMenuBar(mb);
//        make the object of inherited class of jinternalframe
        myinternalframe mif=new myinternalframe();
//            now add that object to the jdesktoppane
        dp.add(mif);
//        add the actionlistener to the jmenuitem
        mi.addActionListener((ActionEvent ae)->{
//            make the oject of inherited class of jinternalframe
            myinternalframe mf=new myinternalframe();
//            add that object to jdesktoppane
            dp.add(mf);
        });
    }
}
public class Swinginternalframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the object of the inherited class of jframe
        myframe mf=new myframe();
//        set the size of mf
        mf.setSize(800,800);
//        set the visiblity of mf to true
        mf.setVisible(true);
//        set the default operation of close to exitonclose
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
