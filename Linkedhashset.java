/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashset;

import java.util.*;

/**
 *
 * @author RISHU
 */
public class Linkedhashset 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
        //PART-1
//        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
//        
//        lhs.add("A");
//        lhs.add("B");
//        lhs.add("C");
//        lhs.add("D");
//        lhs.add("E");
//        lhs.add("F");
//        
//        lhs.forEach(System.out::println);
        
        
        //PART-2
        HashSet<String> lhs=new HashSet<>(10);
        
        //IT IS ALREADY SHOW IN SORTED MANNER
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("J");
        lhs.add("E");
        lhs.add("F");
        
        lhs.forEach(System.out::println);
        System.out.println("-------");
        
        //BUT TO SHOW IT SEQUENTIALLY
        Iterator<String> itr=lhs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}
