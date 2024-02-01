package scmethod1;

public class Scmethod1 
{
    // find the gcd of the number
    int gcd(int m, int n)
    {
        while(m!=n)
        {
            if (m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }

    public static void main(String[] args) 
    {
        Scmethod1 x=new Scmethod1();
        System.out.println(x.gcd(35, 56));
        
    }
    
    // find whether the number is prime or not
    static boolean isprime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if (n%i==0)
                return false;
        }
        return true;
    }
    
}
