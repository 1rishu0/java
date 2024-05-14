/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setdemo1;

import java.util.*;

/**
 *
 * @author RISHU
 */
public class Setdemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,20,30,40,60,30,20));
        
        ts.add(44);
        
        System.out.println(ts.ceiling(45));//IT SHOW THE EXACT VALUE IF PRESENT IN LIST OR SHOW THE NEAREST BIG NUMBER
        System.out.println(ts);
    }
    
}
