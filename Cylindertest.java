package cylindertest;

class cylinder
{
    private double radius;
    private double height;
    
    public cylinder()
    {
        radius = 1;
        height = 1;
    }
    
    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRadius(double r)
    {
        if (r>=0){ radius = r;}
        else
            radius = 0;
    }
    public void setHeight(double h)
    {
        if (h>=0){height = h;}
        else
            height = 0;
    }
    public void setDimensions(double r, double h)
    {
        radius = r;
        height = h;
    }
    
    public double lidArea()
    {
        return Math.PI*radius *radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius ;
    }
    public double drumArea()
    {
        return 2*lidArea()*perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}

public class Cylindertest 
{
    

    public static void main(String[] args) 
    {
        cylinder c=new cylinder();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);
        
        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumfrence "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height " +c.getHeight());
        System.out.println("Radius "+c.getRadius());
    }
    
}
