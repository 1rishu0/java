package resourcesdemo;
import java.io.*;
import java.util.*;

public class Resourcesdemo 
{
    static void Divide() throws Exception
    {
        try(FileInputStream fi=new FileInputStream("C:\\Users\\RISHU\\OneDrive\\Desktop\\test.txt");Scanner sc=new Scanner(fi))
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }
    }

    public static void main(String[] args) 
    {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
//        int x=sc.nextInt();
//        System.out.println(x);
    }
    
}
