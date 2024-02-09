package java1;

class Circle
{
    public double radius;
    
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
    public double circumfrence()
    {
        return 2*Math.PI*radius;
    }
    
    public double perimeter()
    {
        return circumfrence();
    }
}
public class Java1 {

    public static void main(String[] args) 
    {
        Circle c = new Circle();
        
        c.radius=7;
        System.out.println("Area is :"+c.area());
        System.out.println("Circumfrence is :"+c.circumfrence());
        System.out.println("Perimeter is :"+c.perimeter());

    }
    
}
