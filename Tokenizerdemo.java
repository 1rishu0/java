/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokenizerdemo;

import java.util.*;
import java.io.*;

/**
 *
 * @author RISHU
 */
public class Tokenizerdemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        
        // From Single String we can take out the tokens with the help of StringTokenizer.
        //  These symbols "=" and ";" are called as Delimeter.
        //If a String is having some data separated by delimeters, then we can take out the data in the form of tokens .
        
        
//        FileInputStream fis=new FileInputStream("file.txt");
//        
//        byte b[]=new byte[fis.available()];
//        fis.read(b);
//        
//        String data=new String(b);
//        String data="name=Vijay;address=delhi;country=India;dept=cse";
        
        //PART-1    
//        StringTokenizer st=new StringTokenizer(data,"=;");
//        
//        while (st.hasMoreTokens())
//        {
//            System.out.println(st.nextToken());
//        }


        //PART-2 IF THERE IS INTEGER VALUE
        
        String data="10,20,30,40,50,60,70";
        StringTokenizer st=new StringTokenizer(data,",");
        String s;
        
        ArrayList<Integer> al=new ArrayList<>();
        
        while (st.hasMoreTokens())
        {
            s=st.nextToken();
            al.add(Integer.valueOf(s));
        }
        
        System.out.println(al);
    }
    
}
