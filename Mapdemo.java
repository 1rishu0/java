/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapdemo;

import java.util.*;
import java.util.Map.*;

/**
 *
 * @author RISHU
 */
public class Mapdemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
//        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
        HashMap<Integer,String> tm=new HashMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));

        
        tm.put(5,"F" );
        tm.put(7, "H");
        
        System.out.println(tm);
//        System.out.println(tm.ceilingEntry(6).getValue());
        System.out.println(tm.get(4));
        
//        Entry<Integer,String> e=tm.firstEntry(); //THIS IS NOT AVAILABLE IN HASH MAP 
        
//        System.out.println(e.getKey()+" "+e.getValue());//NOT EVEN THIS
    }
    
}
