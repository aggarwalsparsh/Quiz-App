/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class DB 
{
    public static void main(String[] ar)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
                PreparedStatement stmt=con.prepareStatement("Create Database DBExam");
                stmt.executeUpdate();
                stmt=con.prepareStatement("use DBExam");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Subjects(Scode varchar(4),name varchar(20),Marks int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Questions(QID int,Scode varchar(4),Quesiton varchar(100),op1 varchar(50),op2 varchar(50),op3 varchar(50),op4 varchar(50),answer int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Exams(RollNo varchar(10),Name varchar(20),EDate date,SCode varchar(4),Marks int)");
                stmt.executeUpdate();                
                System.out.println("Done");
        }catch(Exception ee){};
    }
}
