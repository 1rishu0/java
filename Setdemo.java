package setdemo;

import java.util.*;

public class Setdemo 
{

    public static void main(String[] args) 
    {
        HashSet<Integer> hs=new HashSet<>();
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        
        System.out.println("-----");
        System.out.println(hs);
    }
    
}
