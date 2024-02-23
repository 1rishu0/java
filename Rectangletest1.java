package rectangletest1;

class rectangle 
{
    private double length ;
    private double breadth ;
    
    public double getLength(){return length; }//here it will show the length
    public double getBreadth(){ return breadth;}//here it will show the breadth
    
    public void setLength(double length)//here it will set the length
    {
        if (length<=0)
            this.length=0;
        else this.length=length;
    }
    public void setBreadth(double breadth)//here it will set the breadth
    {
        if (breadth <=0)
            this.breadth=0;
        else this.breadth=breadth;
    }
    
    public double area(){return getLength()*getBreadth();}//here it will call the length and breadth from the method getLength and getBreadth
    public double perimeter(){return 2*(getLength()+getBreadth());}//Similar action perform here which is perform in line 24
    
    public boolean isSquare()//here it will give the answer in true and false whether the area is square or not
    {
        if (this.length==this.breadth)
            return true;
        else return false;
    }
    
    
}

public class Rectangletest1 
{
    

    public static void main(String[] args) 
    {
        rectangle r=new rectangle();
        
        r.setBreadth(10.5);//check with the negative values
        r.setLength(10.5);//perform same action that you are going to perform in line 44
        
        System.out.println("Area :"+r.area());
        System.out.println("Perimeter :"+r.perimeter());
        System.out.println("Is Square :"+r.isSquare());
        
        System.out.println("Length :"+r.getLength());
        System.out.println("Breadth :"+r.getBreadth());
    }
    
}
