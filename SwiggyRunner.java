class SwiggyRunner{
	
	public static void main(String a[]){
	
	String foodName = "Masala dosa";
	double ref = Swiggy.foodOrders(foodName);
	System.out.println( " The Cost of " + foodName + " is :" + ref);
	
	int quantity = 2;
	double msg = Swiggy.foodOrders(foodName , quantity);
	System.out.println( " The Cost of " + quantity + " " + foodName +" is :" + msg);
	
	}

}