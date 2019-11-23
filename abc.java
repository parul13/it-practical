/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;


/**
 *
 * @author rishabh
 */
public class abc {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String password="";
        String query="SELECT  user_Name FROM stu WHERE `user_id`=2";
        
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, uname, password);
        Statement st=con.createStatement();
        //st.executeQuery(query);
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String name=rs.getString("user_Name");
        System.out.println(name);
        
        st.close();
        con.close();
        
        
    }
    
}
