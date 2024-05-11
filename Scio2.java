package scio2;

import java.io.*;



public class Scio2 {

    public static void main(String[] args) throws Exception
    {
        float f[]={1.1f , 20.4f , 34.3f , 33.3f , 33.4f};
        
        FileOutputStream fos=new FileOutputStream("test.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        dos.writeInt(f.length);
        
        for(float x:f)
        {
            dos.writeFloat(x);
        }
        
        dos.close();
        fos.close();
        
        
        FileInputStream fis=new FileInputStream("test.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        int a=dis.readInt();
        float data;
        for(int i=0;i<a;i++)
        {
            data=dis.readFloat();
            System.out.println(data);
        }
        
        dis.close();
        fis.close();
    }
    
}
