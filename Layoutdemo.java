/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package layoutdemo;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

//create myframe class to handle the frame
class myframe extends Frame
{
//    make the referencce of  3 Button , 3 textfield , 4 panel and 2 checkbox
    Button b1,b2,b3;
    TextField t1,t2,t3;
    Panel p1,p2;
//    one panel is for the checkboxes
    Panel cp;
//    another panel is for the holding of other panels
    Panel mainp;
    Checkbox c1,c2;
//    create the reference of the cardlayout
    CardLayout cl;
//    create a constructor for the automation of the frame
    myframe()
    {
//        call the super class
        super("CardLayout Demo");
//        create the object for the class checkboxgroup
        CheckboxGroup cbg=new CheckboxGroup();
//        create the object for cardlayout
        cl=new CardLayout();
//        create the object of handler class
        handler h=new handler();
//        initiate all the references
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        c1=new Checkbox("One",true,cbg);
        c2=new Checkbox("Two",false,cbg);
        p1=new Panel();
        p2=new Panel();
//        create the panel cp
        cp=new Panel();
//        now add the checkbox inside the panel
        cp.add(c1);
        cp.add(c2);
//        now add all the button in panel p1
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
//        add all the textfield in panel p2
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);
//        create object for the panel mainp
        mainp=new Panel();
//        set the layout of the mainp to cardlayout
        mainp.setLayout(cl);
//        now add panel p1 and p2 in mainp
        mainp.add("One",p1);
        mainp.add("Two",p2);
//        add panel cp in the frame in north and mainp in south
        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);
//        add the event listener to the checkboxes
        c1.addItemListener(h);
        c2.addItemListener(h);

    }
//        create handler class to handle the event
        class handler implements ItemListener
        {
            public void itemStateChanged(ItemEvent ie)
            {
                if(c1.getState())
                {
                    cl.first(mainp);
                }
                else{
                    cl.last(mainp);
                }
            }
        }
}

public class Layoutdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        make the reference of the class myframe
        myframe mf=new myframe();
//        set the size of the myframe
        mf.setSize(700,700);
//        set the visiblity of the frame to true
        mf.setVisible(true);
    }
    
}
