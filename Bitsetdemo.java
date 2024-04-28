/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitsetdemo;

import java.util.*;

/**
 *
 * @author RISHU
 */
public class Bitsetdemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //Bit Set is used for missing value , duplicate values , or common values.
        
        BitSet bs=new BitSet();
        
        bs.set(0);
        bs.set(2);
        bs.set(4);
        bs.set(8);
        bs.set(6);
        
        BitSet bs1=new BitSet();
        
        bs.set(0);
        bs.set(2);
        bs.set(4);
        bs.set(8);
        bs.set(6);
        bs.set(1);
        bs.set(3);
        bs.set(5);
        bs.set(7);
        
        bs.and(bs1);
        
        bs.flip(0,bs.length());
        
        System.out.println(bs);
        System.out.println(bs.get(4));
        System.out.println(bs1);

    }
    
}
