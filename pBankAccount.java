/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author rishabh
 */
public class BankAccount {
    private int accountNumber;
    private float balance;
    private String name;
    
    public BankAccount(int accountNumber ,float balance,String name){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        
    }

   
    
    public float deposit(float amount){
        this.balance+=amount;
        return balance;
    }
    public float withdraw(float amount)throws BankException{
        if(this.balance<amount)
        {
            throw new BankException("insufficient amount");
        }
        else
            this.balance-=amount;
            return balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public float getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    void taxdeduction(){
        if(balance>10000)
        {
            balance-=balance*0.1;
            
        }
        
    }
    
}
