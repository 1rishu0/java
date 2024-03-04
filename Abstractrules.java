package abstractrules;

abstract class Super     //static keyword cannot be used here with abstract because static need content and abstract does not provide content.
{
    abstract public void meth1();   // also not allowed here
}

class sub extends Super   // also not allowed here
{
    public void meth1(){}
}

public class Abstractrules 
{

    public static void main(String[] args) 
    {
        Super s;
    }
    
}
