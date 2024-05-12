package scio3;

import java.io.*;
import java.util.*;

class Customer implements Serializable
{
    String custId;
    String name;
    String phno;
    
    static int count=1;
    
    public Customer(){}
    public Customer(String n, String p)
    {
        name=n;
        phno=p;
        custId="C"+count;
        count++;
    }
    
    public String toString()
    {
        return "Customer ID : "+custId+"\nName : "+name+"\nPhone Number : "+phno;
    }
}

public class Scio3 {

    public static void main(String[] args) throws Exception
    {
        Customer list[]={new Customer("Rishu","554333253"),new Customer("Ritesh","5342645"),new Customer("Raghav","326t2534")};
        
        FileOutputStream fos=new FileOutputStream("test.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeInt(list.length);
        
        for(Customer x:list)
        {
            oos.writeObject(x);
        }
        
        oos.close();
        fos.close();
        
        
        FileInputStream fis=new FileInputStream("test.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        int length=ois.readInt();
        
        Customer list1[]=new Customer[length];
        
        for(int i=0;i<length;i++)
        {
            list1[i]=(Customer)ois.readObject();
        }
        
        System.out.println("Enter Name of the Customer :");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println();
        System.out.println();
        
        for(int j=0;j<length;j++)
        {
            if (name.equalsIgnoreCase(list1[j].name))
            {
                System.out.println(list1[j]);
            }
        }
        
        ois.close();
        fis.close();
        
        
        
    }
    
}
