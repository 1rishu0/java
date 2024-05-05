/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashmapdemo;

import java.util.*;
import java.util.Map.*;

/**
 *
 * @author RISHU
 */
public class Linkedhashmapdemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //FIRST ONE SHOW SIZE , SECOND ONE SHOW LOADING FACTOR , THIRD ONE SHOW IF THE ORDERING OF KEY IS BASED ON ACCESS MEAN USE.
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(7,0.75f,true)
        {
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>7;
            }
        };
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        lhm.put(6,"F");
        lhm.put(9,"I");
        lhm.put(8,"H");
        
        String s=lhm.get(3);
        
        lhm.forEach((k,v)->{System.out.println(k+" "+v);});
    }
    
}
