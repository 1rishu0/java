/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buttondemo;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author RISHAB
 */

class myframe extends Frame implements ActionListener
{
    int count =0;
    Label l;
    Button b;
    
    public myframe()
    {
        super("Button Demo");
        
        l=new Label("   "+count);
        b=new Button("Click");
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(b);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("   "+count);
    }
}

public class Buttondemo {

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
