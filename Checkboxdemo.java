/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkboxdemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

class myframe extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cg;// this is used for the radio box
    
    public myframe()
    {
        super("Check Box Demo");
        
        l=new Label("Nothing is Selected");
        
        cg=new CheckboxGroup();
        
        c1=new Checkbox("Java",false,cg);//In radion box , we have to write in constructor the label name , its state and to which group it belong.
        c1.addItemListener(this);
        
        c2=new Checkbox("Python",false,cg);
        c2.addItemListener(this);
        
        c3=new Checkbox("C#",false,cg);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(c1);
        add(c2);
        add(c3);
        
    }
    
    
    public void itemStateChanged(ItemEvent e) {
            String str="";
            
            if(c1.getState())
            {
                str=str+" "+c1.getLabel();
            }
            if(c2.getState())
            {
                str=str+" "+c2.getLabel();
            }
            if(c3.getState())
            {
                str=str+" "+c3.getLabel();
            }
            if(str.isEmpty())
            {
                str="Nothing is Selected";
            }
            l.setText(str);
    }
    
}

public class Checkboxdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        myframe f=new myframe();
        
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
