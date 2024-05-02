/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datedemo;

import java.util.*;
import java.time.*;
import java.time.temporal.*;

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
        
        //PART-1
        
////        Date d=new Date("4/8/2003");
//        Date d=new Date();
//        
//        GregorianCalendar gc=new GregorianCalendar();
//        
//        TimeZone tz=gc.getTimeZone();
//        
//        System.out.println(tz.getID());
//        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
//        
//        System.out.println(gc.isLeapYear(2024));
//        System.out.println(Calendar.DATE);
//
//        
//        System.out.println(System.currentTimeMillis());
//        System.out.println(d);
//        System.out.println(d.getDay());
//        System.out.println(d.getYear()+1900);
        
        
        //PART-2
//Joda API have separate class for local date , local time and local date time .
//These class contain time in seconds and nano seconds.
//The year which is 1970 the start of the year is called the epoch day.
        
        Date d=new Date();
        d.setHours(21);
        System.out.println(d);
        
//        LocalDate ld=LocalDate.now();
//        LocalDate ld=LocalDate.now(ZoneId.of("Asia/Kolkata"));
//        LocalDate ld=LocalDate.ofEpochDay(1);//1970
        LocalDate ld=LocalDate.parse("2024-08-04");
        
        LocalDate ld1=ld.plusMonths(4);
        ld1=ld1.plusDays(4);
        
        System.out.println(ld1);
        
        
        LocalTime lt=LocalTime.now();
        
        LocalTime lt1=lt.plusHours(4);
        
        System.out.println(lt);        
        System.out.println(lt1);
        
        
        LocalDateTime ldt=LocalDateTime.now();
        
        System.out.println(ldt);
        
    }
    
}
