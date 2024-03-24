package lambdademo;

@FunctionalInterface
interface mylamda
{
//    public int run(int a,int b);
    public int run(String a,String b);
}

//class my implements mylamda
//{
//    public void display(){System.out.println("Hello World");}
//}

public class Lambdademo 
{
//    public static void hero(String s)
//    {
//        StringBuffer sb=new StringBuffer(s);
//        sb.reverse();
//        System.out.println(sb);   
//    }
    
    public Lambdademo(String s)
    {
        String sb=s.toUpperCase();
        System.out.println(sb);
    }
    
    public void hero(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);   
    }

    public static void main(String[] args) 
    {
//        mylamda m=new mylamda()
//        {
//            public void display(){System.out.println("Hello World");}
//        };
        
//        mylamda m=()->{System.out.println("Hello World");};
        
//        mylamda m=(a,b)->{return a+b;};
        
//        mylamda m=(a,b)-> a+b;
        
//        System.out.println(m.run(20,24));
        
//        mylamda my=System.out::println;
        
//        mylamda my=Lambdademo::hero;
        
//        Lambdademo lm=new Lambdademo();
//        mylamda my=lm::hero;
        
//        mylamda my=Lambdademo::new;
        
        // COMPARETO METHOD RETURN VALUE SO WE HAVE TO UPDATE THE METHOD IN INTERFACE FROM VOID TO INT
        mylamda my=String::compareTo;
        
//        my.run("HEllo");

        System.out.println(my.run("hello","leelo"));
        
    }
    
}
