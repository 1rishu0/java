package randomaccessdemo;

import java.io.*;

public class Randomaccessdemo {

    public static void main(String[] args) 
    {
        try
        {
             //BYTE B[] = {"A","B","C","D","E","F","G","H","I","J"};
            RandomAccessFile raf=new RandomAccessFile("test.txt","rw");
            
            System.out.println((char)raf.read());//A
            System.out.println((char)raf.read());//B
            System.out.println((char)raf.read());//C
            raf.write('d');//{"A","B","C","d","E","F","G","H","I","J"}
            System.out.println((char)raf.read());//E
            raf.skipBytes(3);
            System.out.println((char)raf.read());//I
            raf.seek(3);//MOVE BACK TO d
            System.out.println((char)raf.read());//d
            System.out.println(raf.getFilePointer());//4
            raf.seek(raf.getFilePointer()+2);//MOVE BACK TO G
            System.out.println((char)raf.read());//G
        }
        catch(Exception e){}
        
        
        
    }
    
}
