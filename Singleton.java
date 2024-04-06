package singleton;

class coffeeMachine
{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    private static coffeeMachine our=null;
    
    private coffeeMachine()
    {
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    
    public float getCoffee()
    {
        return 0.14f;
    }
    
    //THIS IS USED WHEN WE APPLY PRIVATE CONSTRUCTOR AND IF WE WANT TO LIMIT THE USE OF THE OBJECT.
    static coffeeMachine getInstance()
    {
        if (our==null)
        {
            our=new coffeeMachine();
        }
        return our;
    }
}

public class Singleton 
{

    public static void main(String[] args) 
    {
        coffeeMachine cm1=coffeeMachine.getInstance();
        coffeeMachine cm2=coffeeMachine.getInstance();
        coffeeMachine cm3=coffeeMachine.getInstance();

        System.out.println(cm1+" "+cm2+" "+cm3);
        if (cm1==cm2 && cm1==cm3)
        {
            System.out.println("Same");
        }
    }
    
}
