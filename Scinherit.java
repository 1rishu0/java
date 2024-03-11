package scinherit;

class Account 
{
    private String accNo;
    private String name;
    private String address;
    private String phNo;
    private String dob;
    protected long balance;
    
    public Account (){balance=0;}//IF WE DIDN'T PUT THIS CONSTRUCTOR THEN WE HAVE TO PUT THE COMMENTED CODE BECAUSE WHEN WE MENTION ABOUT WORD "BALANCE" , IT MEANS IT ALREADY THERE AND HAVE A VALUE WHICH IS 0.
    public Account (String accNo,String name,String address,String phNo,String dob)
    {
        this.accNo=accNo;
        this.address=address;
        this.dob=dob;
        this.name=name;
        this.phNo=phNo;
        balance=0;
    }
    
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhNo(){return phNo;}
    public String getDob(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String address){ this.address=address;    }
    public void setPhNo(String phNo){ this.phNo=phNo;}
    
}

class SavingAccount extends Account
{
//    public SavingAccount(String accNo,String name,String address,String phNo,String dob){super( accNo, name, address, phNo, dob);}
    public long deposit(long balance)
    {
        this.balance+=balance;
        return this.balance;
    }
    public long withdraw(long balance)
    {
        this.balance-=balance;
        return this.balance;
    }
}

class LoanAccount extends Account
{
//    public LoanAccount(String accNo,String name,String address,String phNo,String dob){super( accNo, name, address, phNo, dob);}
    public long payEmi(long balance)
    {
        this.balance-=balance;
        return this.balance;
    }
    public long repay(long balance)
    {
        if (balance<this.balance) this.balance-=balance;
        else if (balance==this.balance) this.balance=0;
        else System.out.println("Insufficient amount");
        return this.balance;
    }
}

public class Scinherit 
{

    public static void main(String[] args) 
    {
        
    }
    
}
