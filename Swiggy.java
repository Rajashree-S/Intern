class Swiggy{
	
	public static double foodOrders(String foodName){
		
		double foodPrice = 0.0;
	
		if(foodName == "2idli" && !foodName.isEmpty()){
			foodPrice = 40.00;
			return foodPrice;
		}
		else if(foodName == "Pudi idli" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Ghee Pudi idli" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Ghee Sambar Button Idli" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Ghee Button idli" && !foodName.isEmpty()){
			foodPrice = 65.00 ;
			return foodPrice;
		}
		else if(foodName == "Tatte Idli" && !foodName.isEmpty()){
			foodPrice = 35.00 ;
			return foodPrice;
		}
		else if(foodName == "Dhahi Vada" && !foodName.isEmpty()){
			foodPrice = 50.00;
			return foodPrice;
		}
		else if(foodName == "Vegetable Bonda" && !foodName.isEmpty()){
			foodPrice = 40.00;
			return foodPrice;
		}
		else if(foodName == "Bajji" && !foodName.isEmpty()){
			foodPrice = 40.00;
			return foodPrice;
		}
		else if(foodName == "Vada" && !foodName.isEmpty()){
			foodPrice = 30.00;
			return foodPrice;
		}
		else if(foodName == "mini vada" && !foodName.isEmpty()){
			foodPrice = 20.00;
			return foodPrice;
		}
		else if(foodName == "Plain dosa" && !foodName.isEmpty()){
			foodPrice = 65.00 ;
			return foodPrice;
		}
		else if(foodName == "Ghee Pudi dosa" && !foodName.isEmpty()){
			foodPrice = 90.00;
			return foodPrice;
		}
		else if(foodName == "Open Masala dosa" && !foodName.isEmpty()){
			foodPrice = 120.00;
			return foodPrice;
		}
		else if(foodName == "Masala dosa" && !foodName.isEmpty()){
			foodPrice = 90.00;
			return foodPrice;
		}
		else if(foodName == "Onion dosa" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Ghee Set Dosa" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Millet Masala Dosa" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Ragi dosa" && !foodName.isEmpty()){
			foodPrice = 85.00;
			return foodPrice;
		}
		else if(foodName == "Akki roti" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Ragi roti" && !foodName.isEmpty()){
			foodPrice = 65.00;
			return foodPrice;
		}
		else if(foodName == "Roti curry" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "kara bath" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "kesari bath" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Pongal" && !foodName.isEmpty()){
			foodPrice = 90.00;
			return foodPrice;
		}
		else if(foodName == "Poori sagu" && !foodName.isEmpty()){
			foodPrice = 50.00;
			return foodPrice;
		}
		else if(foodName == "Parotta" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Bisibele bath" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "curd rice" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Chitharana" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Tomato bath" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Pulao" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Puliyogare" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Shavige Bhath" && !foodName.isEmpty()){
			foodPrice = 65.00;
			return foodPrice;
		}
		else if(foodName == "Avalakki Bath" && !foodName.isEmpty()){
			foodPrice = 65.00;
			return foodPrice;
		}
		else if(foodName == "Navane Bath" && !foodName.isEmpty()){
			foodPrice = 65.00;
			return foodPrice;
		}
		else if(foodName == "Upitu" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Coffee" && !foodName.isEmpty()){
			foodPrice = 15.00;
			return foodPrice;
		}
		else if(foodName == "Tea" && !foodName.isEmpty()){
			foodPrice = 15.00;
			return foodPrice;
		}
		else if(foodName == "Badam Milk" && !foodName.isEmpty()){
			foodPrice = 20.00;
			return foodPrice;
		}
		else {
			System.out.println(foodName + " Not available.. Enter a food name from the menu" );
		}
		return foodPrice;
	}
	public static double foodOrders(String foodName , int quantity){
		
		double foodPrice = 0.0;
	
		if(foodName == "2idli" && !foodName.isEmpty()){
			foodPrice = 40.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Pudi idli" && !foodName.isEmpty()){
			foodPrice = 70.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Ghee Pudi idli" && !foodName.isEmpty()){
			foodPrice = 80.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Ghee Sambar Button Idli" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Ghee Button idli" && !foodName.isEmpty()){
			foodPrice = 65.00 * quantity ;
			return foodPrice;
		}
		else if(foodName == "Tatte Idli" && !foodName.isEmpty()){
			foodPrice = 35.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Dhahi Vada" && !foodName.isEmpty()){
			foodPrice = 50.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Vegetable Bonda" && !foodName.isEmpty()){
			foodPrice = 40.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Bajji" && !foodName.isEmpty()){
			foodPrice = 40.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Vada" && !foodName.isEmpty()){
			foodPrice = 30.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "mini vada" && !foodName.isEmpty()){
			foodPrice = 20.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Plain dosa" && !foodName.isEmpty()){
			foodPrice = 65.00 * quantity ;
			return foodPrice;
		}
		else if(foodName == "Ghee Pudi dosa" && !foodName.isEmpty()){
			foodPrice = 90.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Open Masala dosa" && !foodName.isEmpty()){
			foodPrice = 120.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Masala dosa" && !foodName.isEmpty()){
			foodPrice = 90.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Onion dosa" && !foodName.isEmpty()){
			foodPrice = 80.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Ghee Set Dosa" && !foodName.isEmpty()){
			foodPrice = 80.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Millet Masala Dosa" && !foodName.isEmpty()){
			foodPrice = 70.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Ragi dosa" && !foodName.isEmpty()){
			foodPrice = 85.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Akki roti" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Ragi roti" && !foodName.isEmpty()){
			foodPrice = 65.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Roti curry" && !foodName.isEmpty()){
			foodPrice = 70.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "kara bath" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "kesari bath" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Pongal" && !foodName.isEmpty()){
			foodPrice = 90.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Poori sagu" && !foodName.isEmpty()){
			foodPrice = 50.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Parotta" && !foodName.isEmpty()){
			foodPrice = 70.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Bisibele bath" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "curd rice" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Chitharana" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Tomato bath" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Pulao" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Puliyogare" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Shavige Bhath" && !foodName.isEmpty()){
			foodPrice = 65.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Avalakki Bath" && !foodName.isEmpty()){
			foodPrice = 65.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Navane Bath" && !foodName.isEmpty()){
			foodPrice = 65.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Upitu" && !foodName.isEmpty()){
			foodPrice = 60.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Coffee" && !foodName.isEmpty()){
			foodPrice = 15.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Tea" && !foodName.isEmpty()){
			foodPrice = 15.00 * quantity;
			return foodPrice;
		}
		else if(foodName == "Badam Milk" && !foodName.isEmpty()){
			foodPrice = 20.00 * quantity;
			return foodPrice;
		}
		else {
			System.out.println(foodName + " Not available.. Enter a food name from the menu" );
		}
		return foodPrice;
	}
}