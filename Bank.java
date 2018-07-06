package businesslayer;

//super class for all BANK Classes....
public class Bank {

	//Instance variables 
	private int BankIfscCode = 0001;
	private String BankName = "";
	
	
	//Functionalities specific to banks...
	public int OpeningSavingsAccount(String AccountHoldername, String ProffofID){
		System.out.println("Business Logic for opening savings account goes here ");
		return 1234;
	}
	
	//Function to display bank details 
	public void DisplaybankDetails(){
		System.out.println("Bank name : " + BankName);
		System.out.println("Bank Ifsc code : " + BankIfscCode);
		
	}
}
