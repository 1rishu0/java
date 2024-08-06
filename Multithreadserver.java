/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreadserver;

import java.net.*;
import java.io.*;

/**
 *
 * @author RISHAB
 */
public class Multithreadserver extends Thread{

    /**
     * @param args the command line arguments
     */
    Socket stk;

    public Multithreadserver(Socket s)
    {
        stk=s;
    }
    public void run()
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream pr=new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        do{
            msg=br.readLine();
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            pr.println(msg);
        }while(!msg.equals("dne"));
        }catch(Exception e){}
        stk.close();
    }
    
    public static void main(String[] args) {
        ServerSocket ss=new ServerSocket(2000);//port number is 2000
        Socket stk;
        Multithreadserver mts;
        do
        {
            stk=ss.accept();
            mts=new Multithreadserver(stk);
            mts.start();
        }while(true);
        
        
    }
    
}

class client
{
    Socket sk=new Socket("192.168.9.0",2000);
    
    BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br-new BufferedReader(new InputStreamReader(sk.getInputStream()));
    PrintStream ps=new PrintStream(sk.getOutputStream());
    
    String msg;
    do
    {
        msg=keyb.readLine();
        ps.println(msg);
        msg=br.readLine();
        System.out.println("From Server "+msg);
    }while(!msg.equals("dne"))
}