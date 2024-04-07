package staticpractice;

class test
{
    //STATIC VARIABLE IS CONNECTED MEANS IF WE CREATE MULTIPLE REFERENCE AND IF WE CHANGE THE VALUE OF STATIC VARIABLE THEN IT IS CHANGED IN EVERY REFERENCES.
    static int x=10;
    int y=20;
    
    void show ()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x);
    }
}

public class Staticpractice 
{

    public static void main(String[] args) 
    {
        test t1=new test();
        
        t1.show();
        t1.x=30;
        t1.y=50;
        t1.show();
        
        test t2=new test();
        t2.show();
    }
    
}
