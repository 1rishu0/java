package rectangeltest;

class rectangel
{
    public double length;
    public double breadth;
    
    public double perimeter()
    {
        return (length*breadth);
    }
    
    public double area()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if (length==breadth)
            return true;
        else
            return false;
    }
}


public class Rectangeltest 
{

    public static void main(String[] args) 
    {
        rectangel r=new rectangel();
        
        r.length=2.5;
        r.breadth=5.5;
        
        System.out.println("Perimeter is :"+r.perimeter());
        System.out.println("Area is :"+r.area());
        System.out.println(" Is it a Square :"+r.isSquare());
        
        
        
    }
    
}
