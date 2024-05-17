package threadtest1;

class MyRun implements Runnable
{
    public void run(){}
}

// class MyThread extends Thread
// {
//     public MyThread(String nm)
//     {
//         super(nm);
//         // setPriority(Thread.MIN_PRIORITY+2);
//         // setPriority(Thread.MAX_PRIORITY);
//     }
//     public void run()
//     {
//         int count = 1;
        
//         while (true)
//         {
//             System.out.println(count++);
//             try
//             {
//                 //Thread.sleep(1000);
//             }
//             catch(InterruptedException e)
//             {
//                 System.out.println(e);
//             }
//         }
//     }
// }

public class Threadtest1 
{
    public static void main(String[] args) 
    {
        // THIS IS USED TO SIMPLY WRITE THE NAME OF THE THREAD USING RUNNABLE INTERFACE
        Thread t=new Thread(new MyRun(),"MyThread");
        
        //THIS IS SAME BUT USING THREAD METHOD
        // MyThread mt=new MyThread("MyThread1");
        // mt.start();
        // mt.interrupt();
        
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        System.out.println(t.getName());
        System.out.println(t.getId());
    }
}
