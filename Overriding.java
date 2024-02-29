package overriding;

class TV
{
    public void SwitchON(){ System.out.println("TV is Switched ON");}
    public void changeChannel(){ System.out.println("TV Channel is Changed");}
}
    
class SmartTV extends TV
{
    @java.lang.Override
    public void SwitchON(){ System.out.println("SmartTV is Switched ON");}
    @java.lang.Override
    public void changeChannel(){ System.out.println("SmartTV Channel is Changed");}
    public void browsing(){ System.out.println("SmartTV is Browsing");}
}

public class Overriding 
{

    public static void main(String[] args) 
    {
        TV t=new SmartTV();
        
        t.SwitchON();
        t.changeChannel();
        
    }
    
}
