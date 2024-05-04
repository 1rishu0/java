/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtabledemo;

import java.util.*;

/**
 *
 * @author RISHU
 */
public class Hashtabledemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
//        Hashtable ht=new Hashtable();
        Hashtable<Integer,String> ht=new Hashtable<>();

        
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        
        String s=(String)ht.get(4);
        
        ht.compute(3, (k,v)->v+"D");
        ht.computeIfAbsent(7, (k)->"Z"+k);
        
        System.out.println(ht);
        System.out.println("----------------------------");
        
//        Enumeration e=ht.elements();
        Enumeration e=ht.keys();

        
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
    
}
