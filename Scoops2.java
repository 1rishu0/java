package scoops2;

class product 
{
    private String itemNo;
    private String name;
    private double price;
    private int qty;
    
    public product(String itemNo){ this.itemNo=itemNo; }
    public product(String itemNo,String name)
    {
        this.itemNo=itemNo;
        this.name=name;
    }
    public product (String itemNo,String name,double price ,int qty)
    {
        this.itemNo=itemNo;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }
    
    public String getItemNo(){return itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQty(){return qty;}
    
    public void setPrice(double price)
    {
        if (price<0)
                this.price=0;
        else
            this.price=price;
    }
    public void setQty(int qty)
    {
        if (qty<0)
            this.qty=0;
        else this.qty=qty;
    }
    
}

class customer
{
    private String custId;
    private String name;
    private String address;
    private String phoneNo;
    
    public customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public customer(String custId,String name,String address,String phoneNo)
    {
        this.address=address;
        this.custId=custId;
        this.name=name;
        this.phoneNo=phoneNo;
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhoneNo(){return phoneNo;}
    
    public void setAddress(String address){this.address=address;}
    public void setPhoneNo(String phoneNo){this.phoneNo=phoneNo;}
            
}

public class Scoops2 
{
    

    public static void main(String[] args) 
    {
        
    }
    
}
