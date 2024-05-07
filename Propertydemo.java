/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propertydemo;

import java.util.*;
import java.io.*;

/**
 *
 * @author RISHU
 */
public class Propertydemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        try{
        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor","i7");
        p.setProperty("OS","Window");
        p.setProperty("Model", "Latitude");
        
//        p.store(new FileOutputStream("file.txt"), "MyLaptop");
//        p.storeToXML(new FileOutputStream("file.xml"), "MyLaptop");

//        p.loadFromXML(new FileInputStream("file.xml"));
        p.load(new FileInputStream("file.txt"));



        
        System.out.println(p);
        }
        
        catch(Exception e){};
    }
    
}
