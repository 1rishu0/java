package circle1;

class Circle 
{
    public double radius;
    
    public double area(){ return Math.PI*radius*radius;}
    public double perimeter(){ return Math.PI*2*radius;}
    public double circumfrence(){ return 2*Math.PI*radius;}
}

class cylinder extends Circle 
{
    public double height;
    
    public double volume(){return height*area();}
}

public class Circle1 
{

    public static void main(String[] args) 
    {
        cylinder c=new cylinder();
        
        c.height=7;
        c.radius=10;
        
        System.out.println("Area :"+c.area());
        System.out.println("Volume :"+c.volume());
        
    }
    
}
