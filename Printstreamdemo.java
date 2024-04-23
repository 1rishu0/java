package printstreamdemo;

import java.io.*;

class Student
{
    int rollNo;
    String name;
    String dept;
}

public class Printstreamdemo {

    public static void main(String[] args) 
    {
        try
        {
//            FileOutputStream fos=new FileOutputStream("test.txt");
//            PrintStream ps=new PrintStream(fos);
//            
//            Student s=new Student();
//            s.rollNo=10;
//            s.dept="AIDS";
//            s.name="Rishu";
//            
//            ps.println(s.rollNo);
//            ps.println(s.dept);
//            ps.println(s.name );
//            
//            fos.close();
//            ps.close();
            
            
            FileInputStream fis=new FileInputStream("test.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            
            Student s=new Student();
            s.rollNo=Integer.parseInt(br.readLine());
            s.dept=br.readLine();
            s.name=br.readLine();
            
            System.out.println("RollNo "+s.rollNo);
            System.out.println("Department "+s.dept);
            System.out.println("Name "+s.name);
            
            fis.close();
            br.close();
            
        }
        catch(Exception e){}
    }
    
}
