/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datedemo;

import java.util.*;

/**
 *
 * @author RISHU
 */
public class Datedemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
//        Date d=new Date("4/8/2003");
        Date d=new Date();
        
        GregorianCalendar gc=new GregorianCalendar();
        
        TimeZone tz=gc.getTimeZone();
        
        System.out.println(tz.getID());
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        
        System.out.println(gc.isLeapYear(2024));
        System.out.println(Calendar.DATE);

        
        System.out.println(System.currentTimeMillis());
        System.out.println(d);
        System.out.println(d.getDay());
        System.out.println(d.getYear()+1900);
    }
    
}
