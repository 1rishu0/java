package thissuper;

class rectangle
{
    int length;
    int breadth;
    int x=10;
    
    public rectangle(){ length=breadth=0;} // THIS IS USED TO BE A COMMENTED CODE
    public rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}

class cuboid extends rectangle
{
    int height;
    int x=20;
    
    public cuboid(){ height=0;}
    public cuboid (int length,int breadth,int heigth)
    {
//        this.length=length;            TO APPLY THIS CODE WE HAVE TO FIRST MENTION THE DEAFAULT VALUE OF LENGTH AND BREADTH WHICH IS MENTION IN ABOVE COMMENTED CODE.
//        this.breadth=breadth;
        super(length,breadth);
        this.height=heigth;
    }
    
    public void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
    
}

public class Thissuper 
{

    public static void main(String[] args) 
    {
        cuboid c=new cuboid();
        
        c.display();
    }
    
}
