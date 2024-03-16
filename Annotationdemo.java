package annotationdemo;

/**
 * IT ONLY ALLOW ONE METHOD IN INTERFACE 
 * @author RISHU
 */
@java.lang.FunctionalInterface
interface fun
{
    public void fun1();
//    public void fun2();
}

class my<T>
{
    //while using safevarargs the method must be either private or final
    @java.lang.SafeVarargs
    private void show(T...args){}
    public void display(){}
}

class student extends my
{
    @java.lang.Override
    public void display(){}
    
    @java.lang.Deprecated
    public int show(){return 9;}
}

public class Annotationdemo 
{
//    @java.lang.SuppressWarnings("Deprecation")
    @java.lang.SuppressWarnings("SafeVarargs")
    public static void main(String[] args) 
    {
        student st=new student ();
        
        System.out.println(st.show());
    }
    
}
