package clientlayer;

import businesslayer.Bank;

public class bankInterface {
	
	public static void main(String[] args){
		
		//TODO Auto-Generated method sub
		Bank sbi = new Bank();
		int accountNumber = sbi.OpeningSavingsAccount("Arpitha", "Adharcard");
		System.out.println("Account Number Allocated " + accountNumber );
	}

}
