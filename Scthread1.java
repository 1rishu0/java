package scthread1;

class ATM
{
    synchronized public void checkBalance(String name,float amount)
    {
        System.out.println(name+"Checking");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance :"+amount);
    }
    synchronized public void withdraw(String name, float amount)
    {
        System.out.println(name+"Withdrawing");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(amount);
    }
}

class Customer extends Thread
{
    ATM atm;
    String name;
    float amount;
    
    Customer(String n,ATM Atm,float amt)
    {
        name=n;
        atm=Atm;
        amount=amt;
    }
    
    public void useATM()
    {
        atm.checkBalance(name,amount);
        atm.withdraw(name, amount);
    }
    
    public void run()
    {
        useATM();
    }
}

public class Scthread1 
{

    public static void main(String[] args) 
    {
        ATM atm=new ATM();
        
        Customer cust=new Customer("Raju",atm,444);
        Customer cust1=new Customer("Ram",atm,555);
        
        cust.start();
        cust1.start();
    }
    
}
