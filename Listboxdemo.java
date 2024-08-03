/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listboxdemo;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

class myframe extends Frame
{
//    create list for listbox
    List l;
//    create choice for choicebox
    Choice c;
//    create textarea 
    TextArea ta;
    
    myframe()
    {
//        call the super class
        super("listbox demo");
        
//        call the handler to handle the event 
        handler h=new handler();
//        make listbox with 4 items and multiple item can be selected
        l=new List(4,true);
//        make choice for choice box
        c=new Choice();
//        make textarea with 20 line and 30 alphabets
        ta=new TextArea(20,30);
//        add the days of the week in list
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

//        add months for the choice
        c.add("January");
        c.add("Feburary");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        c.add("October");
        c.add("November");
        c.add("December");
                
        //    set the layout with flowlayout
        setLayout(new FlowLayout());
        
//        now add the component in the frame
        add(l);
        add(c);
        add(ta);
        
//        add the item listener with the listbox and choicebox
        l.addItemListener(h);
        c.addItemListener(h);
//        add the action listener with the listbox 
        l.addActionListener(h);
    }
//        create class for the implementation of event handling
class handler implements ItemListener, ActionListener
{
        public void itemStateChanged(ItemEvent e) {
//            make if else condition statement that if itemevent source is equal to l means if it is come from the source of listbox
                    if(e.getSource()==l)
                    {
//                        put the selected text from the listbox in text area
                        ta.setText(l.getSelectedItem());
                    }
                    else
                    {
//                        put the selected item from the choicebox in the textarea
                        ta.setText(c.getSelectedItem());
                    }
                    
        }

        
        public void actionPerformed(ActionEvent e) {
//            make a string list and put the selecteditem in the list
            String[] str=l.getSelectedItems();
//            make a empty string with name txt
            String txt="";
//            make a loop with calling the element from the string list
            for(String s:str)
            {
//                concatenate the string s with the txt string with adding new line
                txt+=s+"\n";
            }
            
//            put the string in the textarea
            ta.setText(txt);
        }
    
}
    
}

public class Listboxdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myframe f=new myframe();
        
//        set the size of the frame 
        f.setSize(800,800);
        
//        set the visiblity of the frame true
        f.setVisible(true);
    }
    
}
