package reflectdemo;
import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    My(){}
    My(String a,String b){}
    
    public void display(String s1, String s2){}
    public int show (int i, int j){return 0;}
}

public class Reflectdemo 
{

    public static void main(String[] args) 
    {
        Class a=My.class;
        
//        My m=new My();
//        Class b=a;

        //THIS IS USED TO GET THE TYPE OF IDENTIFIER USED IN MY CLASS
        Field f[]=a.getDeclaredFields();
        for(Field b:f)
            System.out.println(b);
        
        //THIS IS FOR GETTING THE TYPE OF CONSTRUCTOR
        Constructor c[]=a.getConstructors();
        for(Constructor d:c)
            System.out.println(d);
        
        //THIS WILL SHOW ALL THE TYPES OF METHOD PRESENT IN MY CLASS INCLUDING THE METHOD FROM OBJECT CLASS
        Method m[]=a.getMethods();
        for (Method n:m)
            System.out.println(n);
        
        //THIS WILL SHOW THE ARGUMENT OF THE PARTICULAR METHOD
        Parameter[] p=m[0].getParameters();
        for (Parameter q:p)
            System.out.println(q);
        
    }
    
}
