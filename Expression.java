package expression;
import java.util.Scanner;
class Expression  {
    public static void main(String[] args) 
    {
        Scanner sc=new  Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;
        
        System.out.println("Enter length, breadth and height");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        
        totalArea=2*(length*breadth+length*height+breadth*height);
        
        volume=length*breadth*height;
        
        System.out.println("Total Area "+totalArea);
        System.out.println("Volume "+volume);
        
        
    }
    
}

//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        
//        int a,b,c;
//        double r1,r2;
//        
//        System.out.println("Enter values of a , b and c respectively ");
//        a=sc.nextInt();
//        b=sc.nextInt();
//        c=sc.nextInt();
//        
//        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
//        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
//        
//        System.out.println("Root are "+r1+" "+r2);
//    }
//    
//}
