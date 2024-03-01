package overridingexample;

class Car
{
    public void start(){ System.out.println("Car Started");}
    public void accelerated(){ System.out.println("Car is Accelerated");}
    public void changeGear(){ System.out.println("Car Gear Changed");}
}

class LuxuryCar extends Car
{
    @java.lang.Override
    public void changeGear(){ System.out.println("Automatic Gear");}
    public void sunRoof(){ System.out.println("Sun Roof is Opened");}
}

public class Overridingexample 
{

    public static void main(String[] args) 
    {
        Car c=new LuxuryCar();
        
        c.accelerated();
        c.changeGear();
        c.start();
//        c.sunRoof();    USED THIS WHEN USED THIS LuxuryCar c=new LuxuryCar(); THEN USE, AS YOU KNOW THIS WILL ONLY CALL METHOD FROM LUXURY CAR BUT ABOVE REFERENCE CALL THOSE METHOD THAT ARE BOTH IN CAR AND LUXURY CAR.
    }
    
}
