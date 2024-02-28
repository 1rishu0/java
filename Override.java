package override;

class Super
{
    public void display(){ System.out.println("Super Display");}
}

class sub extends Super
{
    @java.lang.Override
    public void display(){ System.out.println("Sub Display");}
}

public class Override 
{

    public static void main(String[] args) 
    {
        Super s=new sub();
        s.display();
    }   
}
