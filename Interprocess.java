package interprocess;

class MyData
{
    int value;
    boolean flag=true;
    
    synchronized public void set(int v)
    {
        while (flag!=true)
        {
            try{wait();}catch(Exception e){}
        }
        value =v;
        flag=false;
        notify();
    }
    
    synchronized public int get()
    {
        while (flag!=false)
        {
            try{wait();}catch(Exception e){}
        }
        
        flag=true;
        notify();
        return value;
    }
}

class Producer extends Thread
{
    MyData d;
    
    Producer(MyData dat)
    {
        d=dat;
    }
    
    public void run()
    {
        int count=1;
        while(true)
        {
            d.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyData d;
    
    Consumer(MyData dat)
    {
        d=dat;
    }
    
    public void run()
    {
        int value;
        
        while(true)
        {
            value=d.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class Interprocess 
{

    public static void main(String[] args) 
    {
        MyData d=new MyData();
        
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        
        p.start();
        c.start();
    }
    
}
