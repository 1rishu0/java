package genericdemo;

class A {}
class B extends A{}
class C extends B{}

class data<t>
{
    public t obj;
    
    public void setData(t v)
    {
        obj=v;
    }
    
    public t getData()
    {
        return obj;
    }
}

class myArray<m>
//class myArray<? super B> // IF I WRTIE SUPER WHICH MEANS I CAN ONLY USE B AND A. SUPER IS ONLY ALLOWED WITH WILDCARD(?)
//class myArray<m extends Number>//I PUT THE BOUND HERE TO LIMIT THE DATA TYPES, HERE IN EXTENDS I CAN USE A , B AND C IF I WRITE EXTENDS A
{
    m A[]=(m[]) new Object[10];
    int length=0;
    
    public void append(m v)
    {
        A[length++]=v;
    }
    
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

//class myArray2 extends myArray<String>
//class myArray2<m> extends myArray<m >
//{
//    
//}

public class Genericdemo<T> 
{
//    T data[]=(T[]) new Object[3];
    
    static <E> void show(E[] list)
    {
        for (E x:list)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) 
    {
        //PART 1
//        Genericdemo<Integer> gd=new Genericdemo<>();
//        
//        gd.data[0]=54;
//        gd.data[1]=33;
//        gd.data[2]=43;
//        
//        int str=gd.data[2];
//        System.out.println(str);
        
        
        //PART2
//        data<Integer> d=new data();
//        data<Integer> d=new data<>();
//        
//        d.setData(3);
//        System.out.println(d.getData());
        
        
        //PART3
//        myArray<Integer> ma=new myArray();
//        
//        ma.append(33);
//        ma.append(44);
//        ma.append(23);
//        
//        ma.display();
        
        
        //PART4
        show(new String[]{"Hello ji","Kaise Ho","Mei theek hu"});
    }
    
}
