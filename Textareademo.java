/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textareademo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

class myframe extends Frame
{
    TextArea ta;
    Label l;
    Button b;
    TextField tf;
    
    myframe()
    {
        super("TextArea Demo");
        
        handler h=new handler();
        
        ta=new TextArea(10,30);
        l=new Label("No Text Entered");
        tf=new TextField(20);
        
        b=new Button("Click");
        b.addActionListener(h);
        
        setLayout(new FlowLayout());
        
        add(ta);
        add(l);
        add(tf);
        add(b);
    }
    
    class handler implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
//            l.setText(ta.getSelectedText //if you select the text in the text area then click button it will come on label
//            ta.append(tf.getText());//here if you have written something in the text area and then want to append some other text in it then write in the text field and then click button
            ta.insert(tf.getText(),ta.getCaretPosition() );//similar to append but add the text from the textfield on the position where you point your cursor line.
            
        }
    }
}

public class Textareademo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        myframe f=new myframe();
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
}
