package scstatic1;
import java.util.*;

class student
{
    private String rollNo;
    
    private static int count=1;
    
    private String assignRollNo()
    {
        Date d=new Date();
        
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    
    student()
    {
        rollNo=assignRollNo();
    }
    
    public String getRollNo()
    {
        return rollNo;
    }
}


public class Scstatic1 
{

    public static void main(String[] args) 
    {
        student s1=new student();
        student s3=new student();
        student s2=new student();

        System.out.println(s1.getRollNo());
        System.out.println(s3.getRollNo());
        System.out.println(s2.getRollNo());
        
    }
    
}
