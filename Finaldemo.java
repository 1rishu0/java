package finaldemo;

class test
{
    public final void show()
    {
        System.out.println();
    }
}

class test1 extends test
{
//    public void show(){}
//       GIVES ERROR AS FINAL METHODS CANNOT BE OVERLOADED.
}

public class Finaldemo 
{
//    final int f;
//    {
//        f=3333;
//    }
    
    final int f;
    Finaldemo()
    {
        f=3333;
    }

    public static void main(String[] args) 
    {
        final float PI;
        PI=3.33f;
        System.out.println(PI);
        
    }
    
}
