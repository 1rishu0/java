package scoops3;

class subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public subject(String subID, String name, int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    
    public void setMaxMarks(int maxMarks){this.maxMarks=maxMarks;}
    public void setMarksObtain(int marksObtain){this.marksObtain=marksObtain;}
    public boolean isQualified(){return marksObtain>=maxMarks/10*4;}
    public String toString(){return "\nSubject ID: "+subID+"\nName: "+name+"\nMaximum Marks: "+maxMarks+"\nQualified: "+isQualified();}
}


class student 
{
    private String name;
    private int roll;
    private String dept;
    private int numOfSub;
    private subject[] sub;
    
    public student (int roll, String name)
    {
        this.roll=roll;
        this.name=name;
    }
    public student(int roll, String name,int ns)
    {
        this.roll=roll;
        this.name=name;
        numOfSub=ns;
    }
    
    public String getName(){return name;}
    public int getRoll(){return roll;}
    public String getDept(){return dept;}
    public int getNumOfSub(){return numOfSub;}
    public subject[] getSub(){return sub;}
    
    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubject(subject ...sub)
    {
        for(int i=0;i<sub.length;i++)
            this.sub[i]=sub[i];
    }
    public String toString()
    {
        return "Roll: "+roll+"\nName: "+name+"\nDepartment: "+dept;
    }
}

public class Scoops3 {

    public static void main(String[] args) 
    {
        subject[] sub=new subject[3];
        sub[0]=new subject("s101","DS",100);
        sub[1]=new subject("s102","CS",100);
        sub[2]=new subject("s103","DSA",100);


        

        for (subject s:sub)
            System.out.println(s);
    }
    
}
