package exceptiondemo;
import java.util.Scanner;


public class Exceptiondemo 
{

    public static void main(String[] args) 
    {
        int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        try
        {
            c=a/b;
            System.out.println("Division is"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again");
        }
        System.out.println("Bye");
    }
    
}
