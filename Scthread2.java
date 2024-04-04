package scthread2;

class WhiteBoard
{
    String text;
    int noOfStudent=0;
    int count=0;
    
    public void attendance()
    {
        noOfStudent++;
    }
    
    synchronized public void write(String msg)
    {
        System.out.println("Teacher is Writing "+msg);
        while (count !=0)
        {
            try{wait();}catch(Exception e){}
        }
        text=msg;
        count =noOfStudent;
        notify();
    }
    
    synchronized public String read()
    {
        while(count ==0)
        {
            try{wait();}catch(Exception e){}
        }
        String t=text;
        count--;
        if (count == 0)
        {
            notify();
        }
        return text;
    }
}

class Teacher extends Thread
{
    WhiteBoard w;
    String[] msg={"Java is a Language","It is OOPS","It is Platform Independent","It Supports Thread","End"};
    
    Teacher(WhiteBoard wb)
    {
        
        w=wb;
    }
    
    public void run()
    {
        
        for (int i=0;i<msg.length;i++)
        {
            w.write(msg[i]);
        }
          
    }
}

class Student extends Thread
{
    WhiteBoard w;
    String name;
    
    Student (String n,WhiteBoard wb)
    {
        name=n;
        w=wb;
    }
    
    public void run()
    {
        String rs;
        w.attendance();
        do
        {
            rs=w.read();
            System.out.println(name+" Reading "+rs);
            System.out.flush();
        }
        while (!rs.equals("End"));
    }
}

public class Scthread2 
{

    public static void main(String[] args) 
    {
        WhiteBoard w=new WhiteBoard();
        
        Teacher t=new Teacher(w);
        Student s=new Student ("Rishu",w);
        Student s1=new Student ("Rishabh",w);
        Student s2=new Student ("Rishab",w);
        
        t.start();
        s.start();
        s1.start();
        s2.start();
    }
    
}
