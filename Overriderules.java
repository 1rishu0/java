package overriderules;

class Super
{
    public void display()// protected may not give any error. But private will give an error.
    { System.out.println("Super Display");}
}

class sub extends Super
{
    @java.lang.Override
    public void display()// It have to be public , otherwise it will give error
    { System.out.println("Sub Display");}
}

public class Overriderules 
{

    public static void main(String[] args) 
    {
        sub s=new sub();
        s.display();
    }
    
}
