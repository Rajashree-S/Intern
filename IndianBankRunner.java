class IndianBankRunner{
	
	public static void main(String args[]){
	
		System.out.println("Main Started");
		
			//ClassName.methodName
		IndianBank.getBalance();
		
		IndianBank.credit(2000.0);
		
		IndianBank.getBalance();
		
		IndianBank.debit(500.0);
		
		IndianBank.getBalance();
		
		IndianBank.credit(0.0);
		
		System.out.println("Main ended");
	}

}