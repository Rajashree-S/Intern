class Zomato{
	
	public static double orders(String orderName){
		
		double orderPrice = 0.0;
		
		if(orderName == "Burger"){
			orderPrice = 120.0;
			return orderPrice;
		}
		return orderPrice;
	
	}
	public static double orders(String orderName , int quantity){
		
		double orderPrice = 0.0;
		
		if(orderName == "Burger"){
			orderPrice = 120.0 * quantity;
			return orderPrice;
		}
		return orderPrice;
		
	}



}