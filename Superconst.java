package superconst;

class rectangle
{
    int length;
    int breadth;
    
    public rectangle(){ length=breadth=1;}
    public rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}

class cuboid extends rectangle
{
    int height;
    
    public cuboid(){ height=1;}
    public cuboid (int height){ this.height=height;}
    public cuboid (int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
    }
    
    public int volume(){ return this.length*this.breadth*this.height;}
}

public class Superconst 
{

    public static void main(String[] args) 
    {
        cuboid c=new cuboid(5,3,10);
        
        System.out.println(c.volume());
    }
    
}
