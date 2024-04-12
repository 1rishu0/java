package syncdemo;

class MyData
{
    //TO WRITE IN THE SYNCHRONIZED MANNER YOU CAN MAKE THE METHOD SYNCHORNIZED
    synchronized public void Display(String str)
    {
        // YOU CAN ALSO WRITE SYNCHRONIZE (THIS) IN THE CRITICAL SECTION OF THE PROGRAM
        synchronized(this)
        {
            for (int i=0; i<str.length();i++)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}

class MyThread1 extends Thread
{
    MyData d;
    
    MyThread1(MyData data)
    {
        d=data;
    }
    
    public void run()
    {
        d.Display("Hello World ");
    }
}

class MyThread2 extends Thread
{
    MyData d;
    
    MyThread2(MyData data)
    {
        d=data;
    }
    
    public void run()
    {
        d.Display("Welcome All");
    }
}

public class Syncdemo 
{

    public static void main(String[] args) 
    {
        MyData md=new MyData();
        
        MyThread1 mt1=new MyThread1(md);
        MyThread2 mt2=new MyThread2(md);
        
        mt1.start();
        mt2.start();
    }
    
}
