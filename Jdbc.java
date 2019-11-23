/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author rishabh
 */
import java.sql.*;
import java.util.Scanner;
public class Jdbc {

    /**
     * @param args the command line arguments
     */
    static final String DB_URL="jdbc:mysql://localhost:3307/student";
    static final String USER="root";
    static final String PASSWORD="";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
       int ch=1;
        int total;
        float avg;
        String highest;
        Connection conn=null;
        CallableStatement astmt=null;
        Statement stmt=null;
        Scanner o=new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL,USER,PASSWORD);
            stmt=conn.createStatement();
            String sql;
            ResultSet rs = null;
            do
            {
                System.out.println("[1]-Count total no of students");
                System.out.println("[2]-Average marks of a subject");
                System.out.println("[3]-Subject wise topper");
                System.out.println("[4]-Average Marks");
                System.out.println("[5]-Student getting Highest marks");
                System.out.println("[6]-Students getting first second third divison");
                System.out.println("[7]-Student getting Second Highest marks");
                System.out.print("Enter your choice:");
                int c=o.nextInt();
                switch(c)
                {
                    case 1:
                            sql="Select count(*) as total From student";
                            rs=stmt.executeQuery(sql);
                            rs.next();
                            total=rs.getInt("total");
                            System.out.println("Total no of student: "+total);
                            break;
                    case 2:
                        System.out.println("press 1 for Maths----");
                        System.out.print("press 2 for science----");
                        c=o.nextInt();
                        if(c==1)
                            sql="Select avg(maths) as avg From result";
                        else if(c==2)
                            sql="Select avg(science) as avg From result";
                        else
                            break;
                        rs=stmt.executeQuery(sql);
                        rs.next();
                        avg=rs.getInt("avg");
                        System.out.println("Average marks:"+avg);
                        break;
                    case 3:
                        System.out.println("press 1 for Maths----");
                        System.out.print("press 2 for science----");
                        c=o.nextInt();
                        if(c==1)
                            sql="Select rollno,name From result Natural join student where maths=(select max(maths) from result)";
                        else if(c==2)
                            sql="Select rollno,name From result Natural join student where science=(select max(science) from result)";
                        else
                            break;
                        rs=stmt.executeQuery(sql);
                        while(rs.next())
                        {
                         int rollno=rs.getInt("rollno");
                         String name=rs.getString("name");
                         System.out.print("Roll Number: "+rollno+"  ");
                         System.out.println("Name: "+name);  
                        }
                        break;
                    case 4:
                            sql="Select avg(maths+science) as Average From result";
                            rs=stmt.executeQuery(sql);
                            rs.next();
                            avg=rs.getInt("Average");
                            System.out.println("Total average(2 subjects)"+avg);
                            break;
                    case 5:  
                            sql="SELECT name FROM result NATURAL JOIN STUDENT WHERE (maths+science)=(SELECT MAX(maths+science) FROM result)";
                            rs=stmt.executeQuery(sql);
                            rs.next();
                            highest=rs.getString("name");
                            System.out.println("Topper:"+highest);
                            break;
                    case 6: sql="SELECT name FROM result NATURAL JOIN STUDENT WHERE ((maths+science)/2)>=90";
                            rs=stmt.executeQuery(sql);
                            System.out.println("First Division:");
                            while(rs.next())
                            {
                               String name=rs.getString("name");
                               System.out.println(name);
                            }
                            sql="SELECT name FROM result NATURAL JOIN STUDENT WHERE ((maths+science)/2)<90 AND ((maths+science)/2)>=80";
                            rs=stmt.executeQuery(sql);
                            System.out.println("Second Division:");
                            while(rs.next())
                            {
                               String name=rs.getString("name");
                               System.out.println(name);
                            }
                            sql="SELECT name FROM result NATURAL JOIN STUDENT WHERE ((maths+science)/2)<80 AND ((maths+science)/2)>=60";
                            rs=stmt.executeQuery(sql);
                            System.out.println("Third Division:");
                            while(rs.next())
                            {
                               String name=rs.getString("name");
                               System.out.println(name);
                            }
                            break;
                    case 7:
                        sql="SELECT name,MAX(maths+science) as total FROM result NATURAL JOIN STUDENT WHERE (maths+science)<(SELECT MAX(maths+science) FROM result)";
                            rs=stmt.executeQuery(sql);
                            rs.next();
                            highest=rs.getString("name");
                            System.out.println("Second 7Topper:"+highest);
                            break;
                    default:System.out.println("Wrong choice....");
                }
            }
            while(ch==1);

            rs.close();
            stmt.close();
            conn.close();
           
        }
        catch(SQLException se)
        {
        se.printStackTrace();
        }
        catch(Exception e)
        {
      e.printStackTrace();
        }
    }
}