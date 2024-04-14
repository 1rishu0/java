package bytedemo;

import java.io.*;

public class Bytedemo {

    public static void main(String[] args) 
    {
        try
        {
//            byte b[]={'a','b','c','d','e','f','g','h','i','j'};
//            ByteArrayInputStream bis=new ByteArrayInputStream(b);
            
//            int x;
//            
//            while((x=bis.read())!=-1)
//            {
//                System.out.println((char)x);
//            }


//            String str=new String(bis.readAllBytes());
//            System.out.println(str);
//            //THIS MARKSUPPORT SHOW THAT YOU CAN EITHER USE IT MULTIPLE TIMES OR NOT
//            System.out.println(bis.markSupported());
            
            
//            //IT WILL HAVE IT OWN BYTE ARRAY
//            ByteArrayOutputStream bis=new ByteArrayOutputStream(20);
//            
//            bis.write('a');
//            bis.write('b');
//            bis.write('c');
//            bis.write('d');
//            
//            //THIS WILL WRTIE ALL THE ABOVE CHARACTER TO A OUTPUT FILE STREAM
//            bis.writeTo(new FileOutputStream("test.txt"));
            
            
//            byte b[]=bis.toByteArray();
//            
//            for(byte x:b)
//                System.out.println((char)x);
            
//            bis.close();
            
            
            char c[]={'a','b','c','d','e','f','g','h','i','j'};
            
            CharArrayReader cr=new CharArrayReader(c);
            
            int x;
            while((x=cr.read())!=-1)
            {
                System.out.println((char)x);
            }
            
            cr.close();
        }
        catch(Exception e)
        {
            
        }
    }
    
}
