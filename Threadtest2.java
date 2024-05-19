package threadtest2;//Threadtest2

class MyThread extends Thread
{
    public void run ()
    {
        int count=1;
        while(true)
        {
            System.out.println(count+"HELLO");
            count++;
        }
    }
}

class Threadtest2 extends Exception
{
    public static void main(String[] args) 
    {
        MyThread t=new MyThread();
//        t.setDaemon(true);
        t.start();
        // Thread mainThread=Thread.currentThread();
        // try{Thread.sleep(100);}catch(Exception e){}
        
        // try
        // {
        //     mainThread.join();
        //     throw new InterruptedException();
        // }
        // catch(InterruptedException e)
        // {}
        int i=1;
        while (true)
        {
            System.out.println(i+"WORLD");
            i++;
            Thread.yield();
        }
    }
}
