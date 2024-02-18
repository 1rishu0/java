package studenttest;

class student
{
    public double roll;
    public String name;
    public String course;
    public double m1,m2 , m3;
    
    public double total (){return m1+m2+m3;}
    
    public double average(){return total()/3;}
    
    public char grade(){return average()>=60?'A':'B';}
    
    public String toString(){ return "Roll No: "+roll+"\n" + "Name: "+ name +"\n"+"Course: "+ course +"\n"; }
    
}

public class Studenttest {

    public static void main(String[] args) 
    {
       student s=new student();
       s.name="Rishabh";
       s.roll=354;
       s.course="CS";
       s.m1=92;
       s.m2=94;
       s.m3=96;
       
       System.out.println("Total : " +s.total());
       System.out.println("Average :"+s.average());
       System.out.println("Grade :"+s.grade());
       System.out.println(s.toString());
    }
    
}
