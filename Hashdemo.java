/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashdemo;

import java.util.*;

/**
 *
 * @author RISHU
 */
public class Hashdemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        LinkedHashMap<Integer,String> lhs=new LinkedHashMap<>(Map.of(1, "A",2,"B"));
        
        lhs.put(3,"C");
        
        
        System.out.println(lhs.get(1));
        System.out.println(lhs);
    }
    
}
