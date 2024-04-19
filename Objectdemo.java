package objectdemo;

import java.io.*;

class Student implements Serializable
{
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    private static int Data=10;
    public transient int t;
    
    public Student()
    {
        
    }
    public Student(int r,String n,float a,String d)
    {
        rollNo=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollNo+
                "\nName "+name+
                "\navg "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
        
    }
}

public class Objectdemo {

    public static void main(String[] args) 
    {
        try
        {
//            FileOutputStream fos=new FileOutputStream("test.txt");
//            ObjectOutputStream oos=new ObjectOutputStream(fos);
//            
//            Student s=new Student(10,"Rishu",89.9f,"AI&DS");
//            
//            oos.writeObject(s);
            
            
            FileInputStream fos=new FileInputStream("test.txt");
            ObjectInputStream oos=new ObjectInputStream(fos);
            
            Student s=(Student)oos.readObject();
            
            System.out.println(s);
            
            fos.close();
            oos.close();
        }
        catch(Exception e){}
        
        
    }
    
}
