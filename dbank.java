package Bank;

import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c3
 */
public class dbank {
    static ArrayList<daccount> acci=new ArrayList<>();
    static public int acc_count;
    static public int base=35678;
    static private int count=0;
    public void addAccount(double balance,String n)
    {
        daccount a=new daccount(base++,balance,n);
        acci.add(a);
        count++;
    }
    public double bankBalance()
    {
        double bb = 0;
//        for(Account a : acci)
//        {
//            bb += a.getBalance();
//        }
        
        double sum = acci.stream().map(daccount::getBalance).reduce(0.0, (c,e)->c+e);
//        System.out.println(sum);
        return sum;
    }
    public long bankmax()
    {
        double max = 0;
        long ac_no = 0;
        for(daccount a : acci)
        {
            if( a.getBalance() > max)
            {
                ac_no=a.account_no;
            }
        }
        
        return ac_no;
    }
    public long bankmin()
    {
        double min = acci.get(0).getBalance();
        long ac_no = acci.get(0).account_no;
        for(daccount a : acci)
        {
            if( min > a.getBalance())
            {
                ac_no=a.account_no;
                min=a.getBalance();
            }
        }
        return ac_no;
    }
    public double accInfo(long ac_no)
    {
        double ba=0;
        for(daccount a : acci)
        {
            if( ac_no == a.account_no)
            {
                ba=a.getBalance();
            }
        }
        return ba;
    }
    public int countac(double limit)
    {
        return count;
    }
    public daccount getAccount(long ac)
    {
        for(daccount a : acci)
        {
            if( ac == a.account_no)
            {
                return a;
            }
        }
        return null;
    }
    public int upload() throws SQLException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
            PreparedStatement cle=conn.prepareStatement("delete from bank");
            cle.execute();
            PreparedStatement stmt=conn.prepareStatement("insert into bank values(?,?,?)");
            for(int i=0;i<count;i++)
            {
                System.out.println("STORED DATA");
                stmt.setInt(1, (int) acci.get(i).getaccount_no());
                stmt.setFloat(2, (float) acci.get(i).getBalance());
                stmt.setString(3, acci.get(i).getname());
                stmt.executeUpdate();
            }
            stmt.close();
            conn.close();
            return 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbank.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }    

    public int load() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
            String q1="select * from bank";
            Statement stmt=conn.createStatement();
            ResultSet rset=stmt.executeQuery(q1);
            while(rset.next())
            {
                acci.add(new daccount(rset.getInt(1),rset.getFloat(2),rset.getString(3)));
                count++;
                base++;
            }
            stmt.close();
            conn.close();
            return 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbank.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}