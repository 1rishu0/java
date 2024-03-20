package enumdemo;

enum Dept
{
//    CS,ECE,IT,AIDS,AIML;
    CS("John","Block A"),ECE("Smith","Block B"),IT("Rajesh","Block C"),AIDS("Ritesh","Block D"),AIML("Lakshay","Block E");
    String head;
    String location;
    
//    private Dept()
//    {
//        System.out.println(this.name());
//    }
    
    private Dept(String head,String location)
    {
        this.head=head;
        this.location=location;
    }
    
    public String getHeadName()
    {
        return this.head;
    }
    
    public String getLocation()
    {
        return this.location;
    }

}

public class Enumdemo 
{

    public static void main(String[] args) 
    {
        Dept d=Dept.AIDS;
        
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
        System.out.println(d.ordinal());

    }
    
}
