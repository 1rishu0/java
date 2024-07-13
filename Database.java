/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;
import java.sql.*;
import java.util.*;
/**
 *
 * @author RISHAB
 */
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
//        Class.forName("org.sqlite.JDBC");
//        Connection con =DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univv.db");
//        Statement stm=con.createStatement();
//        ResultSet rs=stm.executeQuery("select * from dept");
//        int dno;
//	String dname; 
//	while(rs.next())
//	{
//		dno=rs.getInt("deptno");
//		dname=rs.getString("dname");
//		System.out.println(dno+" "+dname);
//	}
//        stm.close();
//        con.close



//It is about the prepared statement
         Class.forName("org.sqlite.JDBC");
        Connection con =DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univv.db");
        PreparedStatement stm=con.prepareStatement("select * from dept where deptno>?");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dept number :");
        int no=sc.nextInt();
        
        stm.setInt(1, no);
        
        ResultSet rs=stm.executeQuery();
        int dno;
	String dname; 
	while(rs.next())
	{
		dno=rs.getInt("deptno");
		dname=rs.getString("dname");
		System.out.println(dno+" "+dname);
	}
        stm.close();
        con.close();
    }
    
}
