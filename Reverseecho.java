/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseecho;

import java.net.*;
import java.io.*;

/**
 *
 * @author RISHU
 */

/**
 * HERE IS THE EXPLAINATION
 * PEHLE MEIN CLIENT PE JAAKE SOCKET KHOLA AUR AUR SYSTEM.IN SE KEYBOARD PE LIKHA 
 * USKE BAAD JO LIKHA VOH INPUT STREAM READER SE BUFFERED READER NE READER KIYA 
 * FIR USNE MSG BANAYA JISME USNE YEH STORE KIYA 
 * STORE KARNE KE BAAD USNE PRINT STREAM SE HOKE SOCKET PE BHEJA 
 * TAB VOH SOKET REVERSE ECHO WALLI CLASS SE JUDA AUR INSTREAM READER SE BUFFERED READER KE THROUGH HOKE VOH MSG MEI STORE HUA
 * STORE HONE KE BAAD STRING BUILDER SE REVERSE KARKE USE WAAPIS PRINTSTREAM SE SOCKET PE BHEJA TOH TRANFER HUA CLIENT CLASS SE 
 * WANHA INPUT STREAM READER SE HOKAR BUFFERED READER PE GAYA AUR AGAIN MSG MEI STORE HO GAYA 
 * AUR LAST WANHA PAR PRINT KARA
 */
public class Reverseecho 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        
        ServerSocket ss=new ServerSocket(2000);
        
        Socket stk=ss.accept();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        
        do
        {
            msg=br.readLine();
            
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            
            ps.println(msg);
            
        }while(!msg.equals("dne"));
        
        
        
    }
    
}

class client
{
    public static void main(String args[]) throws Exception
    {
        Socket stk=new Socket("localhost",2000);
        
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        
        do
        {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server "+msg);
        }while(!msg.equals("dne"));
        stk.close();
    }
}
