/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sccollection1;

import java.util.*;
import java.io.*;

/**
 *
 * @author RISHU
 */
class account implements Serializable
{
    String accNo;
    String name;
    double balance;
    
    account(){}
    
    account(String a,String n, double b)
    {
        accNo=a;
        name=n;
        balance=b;
    }
    
    public String toString()
    {
        return "Account No: "+accNo+"\nName: "+name+"\nBalance: "+balance;
    }
    
    
    
}

public class Sccollection1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        account acc=null;
        
        HashMap<String,account> hm=new HashMap<>();
        
        try
        {
            FileInputStream fis=new FileInputStream("Account.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            int count=ois.readInt();
            
            for(int i=0;i<count;i++)
            {
                acc=(account)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNo, acc);
                
            }
            
            ois.close();
            fis.close();
        }
        catch(Exception e){};
        
        FileOutputStream fos=new FileOutputStream("Account.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        System.out.println("Menu");
        
        int choice;
        String accNo,name;
        double balance;
        
        do
        {
            System.out.println("1. Create Account ");
            System.out.println("2. Delete Account ");
            System.out.println("3. View Account ");
            System.out.println("4. View All Account ");
            System.out.println("5. Save Account ");
            System.out.println("6. Exit ");
            System.out.println("Enter Your Choice ");
            
            choice=sc.nextInt();
            
            sc.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Details AccNo, Name , Balance ");
                    accNo=sc.nextLine();
                    name=sc.nextLine();
                    balance=sc.nextDouble();
                    acc=new account (accNo,name,balance);
                    hm.put(acc.accNo, acc);
                    System.out.println("Account Created for :"+name);
                    
                    break;
                    
                case 2:
                    System.out.println("Enter Account Number :");
                    
                    accNo=sc.nextLine();
                    hm.remove(accNo);
                    
                    break;
                    
                case 3:
                    System.out.println("Enter Account Number :");
                    
                    accNo=sc.nextLine();
                    acc=hm.get(accNo);
                    System.out.println(acc);
                    
                    break;
                    
                case 4:
                    for (account ac:hm.values())
                    {
                        System.out.println(ac);
                    }
                    
                    break;
                    
                case 5:
                    
                case 6:
                    oos.writeInt(hm.size());
                    for(account a:hm.values())
                        oos.writeObject(a);
                
            }
            
        }
        while(choice!=5);
        
        oos.close();
        oos.flush();
        fos.close();
    }
    
}
