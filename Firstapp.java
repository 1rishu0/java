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
public class Firstapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame f=new Frame("My First App");
        f.setLayout(new FlowLayout()); //to limit the size of the button
        
        Label l=new Label("Name");
        
        TextField tf=new TextField(20);
        
//        button is come with constructor
        Button b=new Button("OK");
        
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
}
