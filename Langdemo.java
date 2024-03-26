package langdemo;
import java.lang.*;

//THIS CLASS IS AUTOMATICALLY INHERITING THE OBJECT CLASS BY DEFAULT
class MyObject
{
    //WE CAN OVERRIDE TOSTRING , HASHCODE ,EQUALS BUT WE CANNOT OVERRIDE WAIT AND NOTIFY BECAUSE OF FINAL FUNCTION IN THESE MEHTODS
    public String toString()
    {
        return "Hello MyOBject";
    }
    
    //THIS WILL MAKE ALL THE REFERENCE HAVING SAME HASHCODE
    public int hashCode()
    {
        return 100;
    }
    
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
}

public class Langdemo 
{

    public static void main(String[] args) 
    {
        //ALL THE REFRENCE OF THE OBJECT HAVE UNIQUE HASHCODE 
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        
        System.out.println(o1);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.equals(o2));

    }
    
}




