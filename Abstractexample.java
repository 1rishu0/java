package abstractexample;

abstract class Super
{
    public Super(){ System.out.println("Super Constructor");}
    
    public void meth1(){ System.out.println("Meth1 of Super");}
    
    abstract public void meth2();
}

class sub extends Super
{
    @java.lang.Override
    public void meth2(){System.out.println("Sub Meth2");}
}

public class Abstractexample 
{

    public static void main(String[] args) 
    {
        Super s=new sub();
        
        s.meth1();
        s.meth2();
    }
    
}
