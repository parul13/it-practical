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
public class Banking {
    

	public static void main(String[] args)
	{
		bank obj = new bank();
		obj.addAccount(1234567,10000,"parul");
		obj.addAccount(67484,20000,"abc");
		obj.addAccount(77656,3420,"desf");
                obj.addAccount(7748856,0,"deshjhjf");
		System.out.println("Min Balance: Rs." + obj.minBalance());
		System.out.println("Max Balance: Rs." + obj.maxBalance());
                System.out.println("number of accounts: " +obj.numberOfAccountsWithSpecificAmount(10));
                
	}
}
    

