package wrapper.demo;

public class WrapperDemo 
{

    public static void main(String[] args) 
    {
        //  WE DIDN'T RECOMMEND IT TO USE
        Integer i=new Integer(10);
        //THIS IS CALLED BOXING
        Integer a=Integer.valueOf(10);
        //THIS IS CALLED AUTO BOXING
        Integer b=10;
        // THIS IS CALLED UNBOXING 
        int j=b.intValue();
        //THIS IS CALLED AUTO UNBOXING
        int k=b;
        
        Byte c=15;
        Byte d=Byte.valueOf("14");
        Byte e=Byte.valueOf(c);
        
        Short f=Short.valueOf("132");
        
        Float g=134.4f;
        Float h=g.floatValue();
        Float l=Float.valueOf("133.3");
        Float m=h;
        
        Character n=Character.valueOf('A');
        
        Boolean o=Boolean.valueOf("true");
        
        
        int m1=17;
        
//        Integer m2=m1;
//        Integer m3=17;
        
        Integer m2=Integer.valueOf("134");
        //IT DEFINES THE FORMAT OF THE VALUE AND GIVE THE RADIX OF THAT VALUE 
        Integer m3=Integer.valueOf("11111111",2);
        
//        Integer m3=Integer.valueOf("A7",16);
        Integer m4=Integer.decode("0x0001");
        
        System.out.println(m4);
        
        System.out.println(Integer.parseInt("2333"));
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(10));
        
        
        
        float p=12.5f;
        Float q=12.5f;
        Float r=(float)13.4/0;
        Float s=(float)Math.sqrt(-1);
        
        System.out.println(q.equals(p));
        System.out.println(r.isInfinite());
        System.out.println(r==Float.POSITIVE_INFINITY);
        System.out.println(r==Float.NEGATIVE_INFINITY);
        System.out.println(s.isNaN());
        //THIS IS COMPLEX TO EXPLAIN BUT TO CHECK IF IT SAME WE HAVE TO WRITE IS NOT EQUAL TO
        System.out.println(s!=Float.NaN);
        
    }
    
}
