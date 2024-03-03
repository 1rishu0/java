package dynamicdispatch;

class Super
{
    public void meth1(){ System.out.println("Super Meth1");}
    public void meth2(){ System.out.println("Super Meth2");}
}

class sub extends Super
{
    @java.lang.Override
    public void meth2(){ System.out.println("Sub Meth2");}
    public void meth3(){ System.out.println("Sub Meth3");}
}

public class Dynamicdispatch 
{

    public static void main(String[] args) 
    {
        Super s=new sub();
        
        s.meth1();
        s.meth2();
    }
    
}
