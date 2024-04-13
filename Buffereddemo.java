package buffereddemo;

import java.io.*;

public class Buffereddemo {

    public static void main(String[] args) 
    {
        try
        {
//            FileInputStream fis=new FileInputStream("test.txt");
//            BufferedInputStream bis=new BufferedInputStream(fis);
            
            
            //THIS IS FOR CHARACTER WHERE YOU DON'T HAVE TO WRITE CHAR WITH BIS.READ()
            FileReader fis=new FileReader("test.txt");
            BufferedReader bis=new BufferedReader(fis);
            
            System.out.println("File "+fis.markSupported());
            System.out.println("Buffer "+bis.markSupported());
            
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            //HERE WE PUT BUFFER MARK WITH VALUE MEANS THE NEXT VALUE IS STORED IN BUFFER 
            bis.mark(10);
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            //HERE WE PUT RESET MEANS THOSE CHARACTER THAT COMES AFTER MARK WILL REPEAT
            bis.reset();
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            
            //IT IS ONLY PRESENT IN READER PART NOT IN INPUT STREAM
            System.out.println("String "+bis.readLine());
            
            fis.close();
            bis.close();
        }
        catch(Exception e)
        {
        }
    }
    
}
