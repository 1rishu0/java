package scloops;

class subject
{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;
    
    public subject(String subId,String name,int marksObtained)
    {
        this.subId=subId;
        this.name=name;
        this.marksObtained=marksObtained;
    }
    
    public String getSubId(){return subId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtained(){return marksObtained;}
    
    public void setMaxMarks(int maxMarks){this.maxMarks=maxMarks;}
    public void setMarksObtained (int marksObtained){this.marksObtained=marksObtained;}
    
    boolean isQualified(){ return marksObtained>=marksObtained*0.4; }
    
    public String toString()
    {
        return "\n SubjectID :"+subId+"\n Name :"+name+"\n MarksObtained :"+marksObtained;
    }
}

public class Scloops 
{

    public static void main(String[] args) 
    {
        subject[] sub=new subject[3];
        sub[0]=new subject("s101","DS",100);
        sub[1]=new subject("s102","DSA",100);
        sub[2]=new subject("s103","DSU",100);
        
        for (subject s:sub)
            System.out.println(s);
        
    }
    
}
