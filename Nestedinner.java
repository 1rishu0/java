package nestedinner;

class Outer
{
    static int x=10;
    //WE CAN CALL INNER METHOD BOTH INSIDE THE METHOD OF OUTER CLASS AS WELL AS OUTSIDE THE METHOD OF OUTER CLASS
//    Inner i=new Inner();
    
    class Inner
    {
        int y=20;
        public void InnerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void OuterDisplay()
    {
        Inner i=new Inner();
        //WE CAN ONLY CALL THE METHOD OF INNER CLASS IN THE METHOD OF OUTER CLASS
        i.InnerDisplay();
        System.out.println(i.y);
    }
    
}

public class Nestedinner 
{

    public static void main(String[] args) 
    {
        Outer o=new Outer();
        o.OuterDisplay();
        
        Outer.Inner oi=new Outer().new Inner();
        oi.InnerDisplay();
        
        System.out.println(oi.y);
    }
    
}
