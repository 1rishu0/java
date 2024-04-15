package datastreamdemo;

import java.io.*;

class Student
{
    int rollNo;
    String name;
    String dept;
}

public class Datastreamdemo {

    public static void main(String[] args) 
    {
        try
        {
//            FileOutputStream fos=new FileOutputStream("test.txt");
//            DataOutputStream dos=new DataOutputStream(fos);
//            
//            Student s=new Student();
//            s.dept="AIDS";
//            s.name="Rishu";
//            s.rollNo=10;
//            
//            dos.writeInt(s.rollNo);
//            dos.writeUTF(s.dept);
//            dos.writeUTF(s.name);
            
            
            FileInputStream fos=new FileInputStream("test.txt");
            DataInputStream dos=new DataInputStream(fos);
            
            Student s=new Student();
            s.rollNo=dos.readInt();
            s.dept=dos.readUTF();
            s.name=dos.readUTF();
            
            
            
            System.out.println("Name "+s.name);
            System.out.println("Roll No "+s.rollNo);
            System.out.println("Department "+s.dept);
            
            fos.close();
            dos.close();
        }
        catch(Exception e){System.out.println(e);}
        
    }
    
}
