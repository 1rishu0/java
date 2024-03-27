package localinner;

class outer
{
    int x=10;
    static int y=20;
    
    static class inner
    {
        public void show ()
        {
            System.out.println(y);
        }
    }
}
public class Localinner 
{

    public static void main(String[] args) 
    {
        //WITH STATIC INNER CLASS HAM SIRF OUTER.INNER OI = NEW OUTER.INNER KAR SAKTE HAI
        outer.inner oi=new outer.inner();
        
        oi.show();
        
    }
    
}
