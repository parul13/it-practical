package Bank;
public class daccount{
    double bal;
    long account_no;
    String name;
    daccount(long a,double ba,String nam)
    {
        account_no=a;
        bal=ba;
        name=nam;
    }
    public double deposit(float x)
    {
        bal+=x;
        return bal;
    }
    public double withdraw(float x)
    {
        if(bal<x)
        {
            return -1;
        }
        else
        {
            bal-=x;
            return bal;
        }
    }
    public double getBalance()
    {
        return bal;
    }
    public long getaccount_no()
    {
        return account_no;
    }
    public String getname()
    {
        return name;
    }
    
}
