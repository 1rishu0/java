package prioritydemo;

import java.util.*;

class myComp implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1>o2) return -1;
        if (o1<o2) return 1;
        return 0;
    }
}

public class Prioritydemo 
{

    public static void main(String[] args) 
    {
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(new myComp());//THIS IS FOR CHANGING THE PRIORITY OF THE QUEUE
        
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        
        System.out.println(pq.peek());
        
        pq.forEach((x)->{System.out.println(x);});
        
        pq.poll();
        
        System.out.println("After Deletion");
        
        pq.forEach((x)->{System.out.println(x);});
        
    }
    
}
