/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scio1;

import java.io.*;
/**
 *
 * @author RISHU
 */

public class Scio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\RISHU\\OneDrive\\Desktop\\java coding\\scio1\\test.txt");
            FileInputStream fis1=new FileInputStream("source2.txt");
            FileOutputStream fos=new FileOutputStream("Source1.txt");
            
            SequenceInputStream sis=new SequenceInputStream(fis,fis1);
            
            int b;
            while ((b=sis.read())!=-1)
            {
                fos.write(b);
            }
            
            fis.close();
            fis1.close();
            fos.close();
            sis.close();
            
            
            
            
            
//            int b;
//            while ((b=fis.read())!=-1)
//            {
//                if(b>=65 && b<=95) fos.write(b+32);
//                else fos.write(b);
//            }
//            fis.close();
//            fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
