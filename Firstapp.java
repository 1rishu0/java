/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstapp;

import java.awt.*;
/**
 *
 * @author RISHAB
 */
////FIRST METHOD
//class MyFrame extends Frame
//{
//    Label l;
//    TextField tf;
//    Button b;
//    
//    public MyFrame()
//    {
//        super("My App");
//        
//        setLayout(new FlowLayout());
//        
//        l=new Label("Name");
//        tf=new TextField(30);
//        b=new Button("OK");
//        
//        add(l);
//        add(tf);
//        add(b);
//    }
//}




public class Firstapp extends Frame//it is a application claas because it handle main method
{
//    SECOND METHOD
    
    Label l;
    TextField tf;
    Button b;
    
    public Firstapp()
    {
        super("My App");
        
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new TextField(30);
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Firstapp mf=new Firstapp();
        
        mf.setSize(400,400);
        mf.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Frame f=new Frame("My First App");
//        f.setLayout(new FlowLayout()); //to limit the size of the button
//        
//        Label l=new Label("Name");
//        
//        TextField tf=new TextField(20);
//        
////        button is come with constructor
//        Button b=new Button("OK");
//        
//        f.add(l);
//        f.add(tf);
//        f.add(b);
//        
//        f.setSize(300, 300);
//        f.setVisible(true);
    }
    
}
