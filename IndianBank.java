class IndianBank{
	
				//variable/field/data member/property/reference
	static double balance;
	
	
	//this is a behaviour or purpose or functionality
	//parameter : it is a reference passed inside a parameter
	//parameter : Datatype ref
	
	public static void credit(double amount){
		System.out.println("Credit Started");
		if(amount > 0.0){
			balance = balance+amount;
			System.out.println("The Credited amount is "+balance);
		}else{ 
			System.out.println("Invalid Amount");
		}
		System.out.println("Credit Ended");
	}
	public static void debit(double amount){
		System.out.println("Debit Started");
		if(balance >= amount){
			balance = balance-amount;
			System.out.println("The Balance after Debited is "+balance);
		}else{
			System.out.println("Insufficient Balance");
		}
		System.out.println("Debit Ended");
	}
	public static void getBalance(){
		System.out.println("The Available Balance is "+balance);
	}
}