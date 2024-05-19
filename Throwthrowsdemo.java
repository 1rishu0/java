package throwthrowsdemo;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimension of a Rectangle cannot be Negative";
    }
}


public class Throwthrowsdemo 
{
    static int area(int l,int b)throws NegativeDimensionException 
    {
        if (l<0 || b<0)
        {
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    
    static void meth1() throws NegativeDimensionException 
    {
        System.out.println("Area is "+area(20,-5));
    }

    public static void main(String[] args) 
    {
        try
        {
            meth1();
//            throw new NegativeDimensionException();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
        
    }
    
}
