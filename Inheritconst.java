package inheritconst;

class Parent
{
    public Parent(){System.out.println("Parent Constructor");}
}
    
class Child extends Parent
{
    public Child(){System.out.println("Child Constructor");}
}
    
class GrandChild extends Child
{
    public GrandChild(){System.out.println("GrandChild Constructor");}
}

public class Inheritconst 
{

    public static void main(String[] args) 
    {
        GrandChild gc = new GrandChild();
        
    }
    
}
