package nestedcatch;

public class Nestedcatch 
{

    public static void main(String[] args) 
    {
        int A[]={20,30,10,40,0};
        
        try 
        {
            int c=A[0]/A[3];
            System.out.println("Division is "+c);
            
            try
            {
                System.out.println(A[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index is Invalid");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }
        
        System.out.println("Bye");
    }
    
}
