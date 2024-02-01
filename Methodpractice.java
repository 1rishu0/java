package methodpractice;

public class Methodpractice {
    static int max(int x,int y)
    {
        if (x>y)
            return x;
        else 
            return y;
    }
    
    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) 
    {
        int a=10,b=15;
        System.out.println(max(a,b));
        
        Methodpractice mp=new Methodpractice();
        System.out.println(mp.max(a,b));
    }
    
}
