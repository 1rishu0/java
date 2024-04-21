package listdemo;

import java.util.*;

public class Listdemo 
{

    public static void main(String[] args) 
    {
//        ArrayList<Integer> al1=new ArrayList<>(20);
        LinkedList<Integer> al1=new LinkedList<>();

        
//        ArrayList<Integer> al2=new ArrayList<>(List.of(10,20,30,40,50));
        LinkedList<Integer> al2=new LinkedList<>(List.of(10,20,30,40,50));

        
        al1.add(60);
        al1.add(0, 5);
        //al1.addAll(al2);
        al1.addAll(1, al2);
        al1.set(4, 3432);
        al1.addFirst(13);
        al1.addLast(24);
        
        System.out.println(al1);
        System.out.println(al1.contains(40));
        System.out.println(al1.get(4));
        System.out.println(al1.indexOf(30));
        
        //PART-1
//        for(int i=0;i<al1.size();i++)
//        {    System.out.println("---------");
//             System.out.println(al1.get(i));
//        }


        //PART-2
//        Iterator<Integer> it=al1.iterator();
//        ListIterator<Integer> it=al1.listIterator();//IT HAVE BIDIRECTIONAL ACCESS.
//
//        
//        while(it.hasNext())
//        {
//            System.out.println("-------");
//            System.out.println(it.next());
//        }


        //PART-3
//        for(ListIterator<Integer> it=al1.listIterator();it.hasNext();)
//        {
//            System.out.println("------");
//            System.out.println(it.next());
//        }


        //PART-4
        al1.forEach(n->show(n));
        
        
    }
    static void show(int n)
        {
            if(n>45)
            {
                System.out.println("-----");
                System.out.println(n);
            }
        }
}
