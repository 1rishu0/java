package filehandling;

import java.io.*; 

public class Filehandling {

    public static void main(String[] args) 
    {
//        File f=new File("test.txt");
//        
//        System.out.println(f.isDirectory());
////        String list[]=f.list();
////        for(String x:list)
////            System.out.println(x);
//
//
//        File list[]=f.listFiles();
//        for(File x:list)
//            
//            System.out.print(x.getName()+" ");
////            System.out.println(x.getPath());


        try
        {
            File f=new File("test.txt");
            f.setReadOnly();
            FileOutputStream fos=new FileOutputStream("test.txt");
        }
        catch(Exception e){}
        
            
    }
    
}
