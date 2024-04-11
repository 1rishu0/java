package superconstr;

class Parent
{
    public Parent(){System.out.println("Non Param of Parents");}
    public Parent(int x){System.out.println("Param of Parent "+x);}
}

class Child extends Parent
{
    public Child(){System.out.println("Non Param of Child ");}
    public Child(int y){System.out.println("Param of Child "+y);}
    public Child(int x,int y)
    {
        super(x);
        System.out.println("2 Param of Child "+y);
        
    }
}

public class Superconstr 
{

    public static void main(String[] args) 
    {
        Child c=new Child(4,5);
    }
    
}
