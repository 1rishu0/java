package interfaceexample;

class Phone
{
    public void call(){ System.out.println("Phone Call");}
    public void sms(){ System.out.println("Phone Sending SMS");}
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void click(){ System.out.println("SmartPhone Clicking Photo");}
    public void record(){ System.out.println("SmartPhone Recording Video");}
    public void play(){ System.out.println("SmartPhone Playing Music");}
    public void stop(){ System.out.println("SmartPhone Stopped Playing Music");}
    public void videoCall(){ System.out.println("SmartPhone Video Calling");}
}

public class Interfaceexample {

    public static void main(String[] args) 
    {
        IMusicPlayer sp=new SmartPhone();
        sp.play();
        sp.stop();
    }
    
}
