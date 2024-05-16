package threadtest;//Threadtest

// class MyThread extends Thread
// {
//     // TO RUN THE THREAD RUN METHOD MUST BE OVERRIDED
//     public void run()
//     {
//         int i=1;
//         while (true)
//         {
//             System.out.println(i+"Hello");
//             i++;
//         }
//     }
// }

// class MyRunnable implements Runnable
// {
//     public void run()
//     {
//         int i=1;
//         while (true)
//         {
//             System.out.println(i+"Hello");
//             i++;
//         }   
//     }
// }

class Threadtest implements Runnable//extends Thread
{
    public void run()
    {
        int i=1;
        while (true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    
    public static void main(String[] args) 
    {
        Threadtest t=new Threadtest();
        Thread th=new Thread();
        th.start();
        
        int i=1;
        while (true)
        {
            System.out.println(i+"World");
            i++;
        }
        
    }
}