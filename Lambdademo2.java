package lambdademo2;

@FunctionalInterface
interface my
{
    public void display();
}

class mylamda
{
    public void callLamda(my m)
    {
        m.display();
    }
}

class useLamda
{
    public void method1()
    {
        mylamda m=new mylamda();
        m.callLamda(()->{System.out.println("heelo");});
    }
}

public class Lambdademo2 
{
    //IT DIDN'T NEED TO BE FINAL AND YOU CAN MODIFY IT 
    static int temp1=0;

    public static void main(String[] args) 
    {
        useLamda u=new useLamda();
        u.method1();
        
        //IT MUST BE EITHER FINAL OR EFFECTIVLY FINAL
        int temp=0;
        my m=()->{
            int count =0;
            System.out.println("Hello sister"+temp1);
            System.out.println("HEllo Brother"+count+temp);
        count ++;
        };
    }
    
}
