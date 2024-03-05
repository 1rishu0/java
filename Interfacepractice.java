package interfacepractice;

interface Test
{
    // OBJECTS IN INTERFACE ARE BY DEFAULT PUBLIC , FINAL AND STATIC 
    // IN FINAL OBJECT WE MUST WRITE THE OBJECT ALL IN CAPITAL LETTERS
    final static int X=10;
    // METHODS ARE BY DEFAULT ABSTACT AND IF YOU IMPLEMENT THE INTERFACE IN THE CLASS THEN IT AUTOMATICALLY BECOMES ABSTRACT UNLESS YOU OVERRIDE ALL THE METHODS 
    public abstract void meth1();
    public abstract void meth2();
    // ALL THE METHODS IN THE INTERFACE ARE EMPTY UNLESS IT IS STATIC THEN IT MUST HAVE THE BODY 
    public static void meth3() { System.out.println("Meth3 of Test");  }
}

//INTERFACE CAN EXTEND MULTIPLE INTERFACES
interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){ System.out.println("Meth1");}
    public void meth2(){ System.out.println("Meth2");}
    public void meth4(){ System.out.println("Meth4");}
}

public class Interfacepractice 
{

    public static void main(String[] args) 
    {
        Test2 t=new My();
        
        t.meth4();
        t.meth1();
        t.meth2();
        
        System.out.println(t.X);
    }
    
}
