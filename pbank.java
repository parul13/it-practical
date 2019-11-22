/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.ArrayList;
/**
 *
 * @author rishabh
 */
public class bank {
    
    private static ArrayList<BankAccount>BankAccountList=new ArrayList<>();
    public bank()
    {
        BankAccountList=new ArrayList<>();
    }
    
    public static ArrayList<BankAccount> getBankAccountList()
    {
        return BankAccountList;
    }
    public void addAccount(int accountNumber,float balance,String name)
    {
        boolean add = BankAccountList.add(new BankAccount(accountNumber,balance,name));
    }
    float getTotalBalance()
    {
        float TotalBalance=0;
       int  n=BankAccountList.size();
       for(int i=0;i<=n;i++)
       {
           TotalBalance+=BankAccountList.get(i).getBalance();
           
       }
       return TotalBalance;
    }
    public float maxBalance(){
        float maxBalance= 0;
        for(BankAccount i:BankAccountList)
            if(maxBalance<i.getBalance())
                maxBalance=i.getBalance();
            
           return maxBalance ;
           
        }
    public float minBalance(){
        float minBalance=BankAccountList.get(0).getBalance();
        for(BankAccount i:BankAccountList)
            if(minBalance>i.getBalance())
                minBalance=i.getBalance();
        return minBalance;
    }
    
    public int count(float balance)
	{
		int count = 0;
		for(BankAccount i:BankAccountList)
			if(i.getBalance() > balance)
				count++;
		return count;
	}
	public static BankAccount findAccount(int accountNumber) throws BankException {
        int n = BankAccountList.size();
        for (int i = 0; i < n; i++) {
            if (BankAccountList.get(i).getAccountNumber() == accountNumber) {
                return BankAccountList.get(i);
            }
        }
        throw new BankException("No such Account");
    }
    
    int numberOfAccountsWithSpecificAmount(float amount) {
        int n = BankAccountList.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (BankAccountList.get(i).getAccountNumber() > amount) {
                count++;
            }
        }
        return count;
    }

    
    
       
    
}
