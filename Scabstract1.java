package scabstract1;

abstract class shape
{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends shape
{
    public double radius;
    
    public double perimeter(){return 2*Math.PI*radius;}
    public double area(){ return Math.PI*radius*radius;}
}

class Rectangle extends shape
{
    public double length;
    public double breadth;
    
    public double perimeter(){ return 2*(length+breadth);}
    public double area(){ return length*breadth;}
}

public class Scabstract1 
{

    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle();
        
        r.length=10;
        r.breadth=20;
        
        shape s=r;
        
        System.out.println(r.area());
        System.out.println(s.perimeter());
    }
    
}
