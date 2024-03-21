package finallydemo;

public class Finallydemo 
{
    static void meth1() throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            //THIS MESSAGE WILL DEFINITLY EXECUTE
            System.out.println("Final Message");
        }
    }

    public static void main(String[] args) 
    {
        try
        {
            meth1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
