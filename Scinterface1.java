package scinterface1;

interface member
{
    public void callback();
}


class store
{
    // THIS IS USE TO CREATE ARRAY FOR THE MEMBER 
    member mem[]=new member[100];
    // COUNT HERE IS USED AS INCREASE IN INDEX INSIDE THE MEMBER ARRAY
    int count=0;
    // HERE WE WRITE MEMBER M INSIDE REGISTER AS A REFRENCE WHERE WE PUT THE OBJCET OF CUSTOMER CLASS LIKE MEMBER M=NEW CUSTOMER(STRING);
    public void register(member m)
    {
        mem[count++]=m;
    }
    
    public void inviteSale()
    {
        for (int i=0;i<count;i++)
        {
            // THIS WILL SEND THE DIRECTION TO THE MEMBER INTERFACE WHICH IS TO BE IMPLEMENTED INSIDE THE CUSTOMER CLASS AND TO CALL THAT MEMBER OF PARTICULAR INDEX
            mem[i].callback();
        }
    }
}

class customer implements member
{
    String name;
    customer(String name)
    {
        this.name=name;
    }
    
    public void callback()
    {
        // SO WHEN IT IS CALL BY INVITESALE METHOD SO FOR EACH INDEX IN MEMBER ARRAY IT WILL PRINT THAT STATEMENT AND THE NAME THAT GOING TO BE PRINTED HERE IS THE NAME STORE IN THE INDEX OF MEMBER FROM REGISTER METHOD.
        System.out.println("Ok, I will Invite "+name);
    }
}


public class Scinterface1 
{

    public static void main(String[] args) 
    {
        store s=new store();
        
        customer c1=new customer("Ritesh");
        customer c2=new customer("Raghav");
        customer c3=new customer("Rishabh");
        
        s.register(c3);
        s.register(c2);
        s.register(c1);
        
        s.inviteSale();
        
        
    }
    
}
