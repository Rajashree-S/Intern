class BankAccount{
	
				//variable/field/data member/property/reference
	static double balance;
	
	
	
	//parameter : it is a reference passed inside a parameter
	
	public static void credit(double amount){
		
		balance = balance+amount;
		
	}
	public static void debit(double amount){
		
		balance = balance-amount;
		
	}
}