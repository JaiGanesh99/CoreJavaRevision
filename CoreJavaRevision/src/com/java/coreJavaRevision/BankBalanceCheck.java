package com.java.coreJavaRevision;

public class BankBalanceCheck {

	int bankBalance= 12457;
	String BankName= "Standard Chartened";
	String ifsc;
	
    private void bank(String Bank, int bal) {
		System.out.println("I am having a/c with "+BankName+" Bank and having "+ bankBalance + "Rupees balance.");
		System.out.println("I am having a/c with "+Bank+" Bank and having "+ bal + " Rupees balance.");

	}
    
    BankBalanceCheck(){
    	System.out.println("Constrctor");
    }
	
	public static void main(String args[]) {
		BankBalanceCheck bank = new BankBalanceCheck();
		System.out.println(bank.ifsc);
		bank.bank("Indian Bank",13456);		
	}
}
