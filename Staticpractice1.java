package staticpractice1;

class test
{
    static
    {
        System.out.println("Block 1");
    }
    static 
    {
        System.out.println("Block 2");
    }
}

public class Staticpractice1 
{
    static
    {
        System.out.println("Block 3");
    }

    public static void main(String[] args) 
    {
//        test t=new test();
        System.out.println("Main");
        
        test t=new test();
    }
    
    static
    {
        System.out.println("Block 4");
    }
    
}
