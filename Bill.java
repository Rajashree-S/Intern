class Bill{
	
	Bill(){
		
		System.out.println("Bill No args Constructor is invoked...");
		
	}
	
	
	Bill(String billReferenceNo , String billIssueDate , String billDueDate , double billAmount , boolean isBillOverDue , boolean isBillPaid , String serviceProvider){
	
	this();
	this.billReferenceNo = billReferenceNo;
	this.billIssueDate = billIssueDate;
	this.billDueDate = billDueDate;
	this.billAmount = billAmount;
	this.isBillOverDue = isBillOverDue;
	this.isBillPaid = isBillPaid;
	this.serviceProvider = serviceProvider;
	System.out.println("Bill 7 args Constructor is executed...");
		
	
	}
	
	String billReferenceNo;
	String billIssueDate;
	String billDueDate;
	double billAmount;
	boolean isBillOverDue;
	boolean isBillPaid;
	String serviceProvider;
	
	
	public void showBillInfo(){
	
		System.out.println("Bill Reference Number is : "+billReferenceNo);
		System.out.println("Bill Issue Date is : "+billIssueDate);
		System.out.println("Bill Due Date is : "+billDueDate);
		System.out.println("Bill Amount : "+billAmount);
		System.out.println("Bill Over Due is "+isBillOverDue);
		System.out.println("Bill Paid is "+isBillPaid);
		System.out.println("Service Provider is : "+serviceProvider);
	}
}