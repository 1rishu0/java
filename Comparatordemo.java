/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatordemo;

import java.util.*;

/**
 *
 * @author RISHU
 */

class my implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if (i1<i2)
            return 1;
        else if(i1>i2)
            return -1;
        else return 0;
    }
}

public class Comparatordemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //PART-1
//        int a[]={1,2,3,4,5,6,7};
//        int b[]={2,2,3,4,5,6,7};
//        
//        int c[]=Arrays.copyOf(a, 4);
//        
//        Arrays.fill(c, 10);
//        for (int x:c)
//            System.out.println(x);
//        
//        System.out.println("-------");
//        System.out.println(Arrays.compare(a, b));
        
        
        //PART-2
        Integer a[]={1,2,2,5,5,3,7,5,6};
        
//        Arrays.sort(a);
        Arrays.sort(a,new my());

        
        for(Integer x:a)
            System.out.println(x);
        
        System.out.println("-------");

    }
    
}
