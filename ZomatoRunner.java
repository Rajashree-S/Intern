class ZomatoRunner{
	
	public static void main(String a[]){
	
	String orderName = "Burger";
	double food = Zomato.orders(orderName);
	System.out.println( " The Cost of " + orderName + " is :" + food);
	
	int quantity = 5;
	double foodPrice = Zomato.orders(orderName , quantity);
	System.out.println( " The Cost of " + quantity + " "+ orderName + " is :" + foodPrice);
	}


}