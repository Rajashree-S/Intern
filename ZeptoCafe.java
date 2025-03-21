class ZeptoCafe{
	
	public static double cafe(String foodName){
		
		double foodPrice = 0.0;
		
		if(foodName == "Butter Popocorn tub" && !foodName.isEmpty()){
			foodPrice = 129.99 ;
			return foodPrice;
		}
		else if(foodName == "Tandoori Momos." && !foodName.isEmpty()){
			foodPrice = 219.00;
			return foodPrice;
		}
		else if(foodName == "Fried Momos" && !foodName.isEmpty()){
			foodPrice = 219.00;
			return foodPrice;
		}
		else if(foodName == "Chicken Momos" && !foodName.isEmpty()){
			foodPrice = 150.00;
			return foodPrice;
		}
		else if(foodName == "Paneer Momos" && !foodName.isEmpty()){
			foodPrice = 150.00;
			return foodPrice;
		}
		else if(foodName == "Bhelpuri" && !foodName.isEmpty()){
			foodPrice = 120.00;
			return foodPrice;
		}
		else if(foodName == "Chilli cheese toast" && !foodName.isEmpty()){
			foodPrice = 140.00;
			return foodPrice;
		}
		else if(foodName == "Samosa" && !foodName.isEmpty()){
			foodPrice = 50.00;
			return foodPrice;
		}
		else if(foodName == "Channa Chat" && !foodName.isEmpty()){
			foodPrice = 100.00;
			return foodPrice;
		}
		else if(foodName == "Bread Pakora" && !foodName.isEmpty()){
			foodPrice = 50.00;
			return foodPrice;
		}
		else if(foodName == "French fries" && !foodName.isEmpty()){
			foodPrice = 99.99;
			return foodPrice;
		}
		else if(foodName == "Vada pav" && !foodName.isEmpty()){
			foodPrice = 50.00;
			return foodPrice;
		}
		else if(foodName == "chesse vada pav" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "butter vada pav" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Gobi Manchurian" && !foodName.isEmpty()){
			foodPrice = 100.00;
			return foodPrice;
		}
		else if(foodName == "Sev Puri" && !foodName.isEmpty()){
			foodPrice = 90.00;
			return foodPrice;
		}
		else if(foodName == "Garlic Shrimp" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Veg cutlet" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "aloo tikki" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Kachori" && !foodName.isEmpty()){
			foodPrice = 40.00;
			return foodPrice;
		}
		else if(foodName == "Vanilla Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Choclate Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Butterscotch Milkshake" && !foodName.isEmpty()){
			foodPrice =70.00 ;
			return foodPrice;
		}
		else if(foodName == "Strawberry Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Mango Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Pistachiu Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Oreo Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Black Current Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "Cheese balls" && !foodName.isEmpty()){
			foodPrice = 85.00;
			return foodPrice;
		}
		else if(foodName == "Babycorn manchurian" && !foodName.isEmpty()){
			foodPrice = 90.00;
			return foodPrice;
		}
		else if(foodName == "chicken cheese balls" && !foodName.isEmpty()){
			foodPrice = 90.00;
			return foodPrice;
		}
		else if(foodName == "pudding" && !foodName.isEmpty()){
			foodPrice = 80.00 ;
			return foodPrice;
		}
		else if(foodName == "Carrot pudding" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Bonda" && !foodName.isEmpty()){
			foodPrice = 60.00;
			return foodPrice;
		}
		else if(foodName == "Mirchi Bajji" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else if(foodName == "strawberry icecream" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Oreo icecream" && !foodName.isEmpty()){
			foodPrice = 80.00 ;
			return foodPrice;
		}
		else if(foodName == "Butterscotch Icecream" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Choclate icecream" && !foodName.isEmpty()){
			foodPrice = 80.00;
			return foodPrice;
		}
		else if(foodName == "Vanilla Icecream" && !foodName.isEmpty()){
			foodPrice = 70.00;
			return foodPrice;
		}
		else {
			System.out.println(foodName + " Not available.. Enter a food name from the menu" );
		}
		return foodPrice;
		}
		public static double cafe(String foodName , int foodQuantity){
		
		double foodPrice = 0.0;
		
		if(foodName == "Butter Popocorn tub" && !foodName.isEmpty()){
			foodPrice = 129.99 * foodQuantity ;
			return foodPrice;
		}
		else if(foodName == "Tandoori Momos." && !foodName.isEmpty()){
			foodPrice = 219.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Fried Momos" && !foodName.isEmpty()){
			foodPrice = 219.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Chicken Momos" && !foodName.isEmpty()){
			foodPrice = 150.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Paneer Momos" && !foodName.isEmpty()){
			foodPrice = 150.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Bhelpuri" && !foodName.isEmpty()){
			foodPrice = 120.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Chilli cheese toast" && !foodName.isEmpty()){
			foodPrice = 140.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Samosa" && !foodName.isEmpty()){
			foodPrice = 50.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Channa Chat" && !foodName.isEmpty()){
			foodPrice = 100.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Bread Pakora" && !foodName.isEmpty()){
			foodPrice = 50.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "French fries" && !foodName.isEmpty()){
			foodPrice = 99.99 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Vada pav" && !foodName.isEmpty()){
			foodPrice = 50.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "chesse vada pav" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "butter vada pav" && !foodName.isEmpty()){
			foodPrice = 60.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Gobi Manchurian" && !foodName.isEmpty()){
			foodPrice = 100.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Sev Puri" && !foodName.isEmpty()){
			foodPrice = 90.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Garlic Shrimp" && !foodName.isEmpty()){
			foodPrice = 80.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Veg cutlet" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "aloo tikki" && !foodName.isEmpty()){
			foodPrice = 60.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Kachori" && !foodName.isEmpty()){
			foodPrice = 40.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Vanilla Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Choclate Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Butterscotch Milkshake" && !foodName.isEmpty()){
			foodPrice =70.00 * foodQuantity ;
			return foodPrice;
		}
		else if(foodName == "Strawberry Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Mango Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Pistachiu Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Oreo Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Black Current Milkshake" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Cheese balls" && !foodName.isEmpty()){
			foodPrice = 85.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Babycorn manchurian" && !foodName.isEmpty()){
			foodPrice = 90.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "chicken cheese balls" && !foodName.isEmpty()){
			foodPrice = 90.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "pudding" && !foodName.isEmpty()){
			foodPrice = 80.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Carrot pudding" && !foodName.isEmpty()){
			foodPrice = 80.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Bonda" && !foodName.isEmpty()){
			foodPrice = 60.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Mirchi Bajji" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "strawberry icecream" && !foodName.isEmpty()){
			foodPrice = 80.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Oreo icecream" && !foodName.isEmpty()){
			foodPrice = 80.00 * foodQuantity ;
			return foodPrice;
		}
		else if(foodName == "Butterscotch Icecream" && !foodName.isEmpty()){
			foodPrice = 80.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Choclate icecream" && !foodName.isEmpty()){
			foodPrice = 80.00 * foodQuantity;
			return foodPrice;
		}
		else if(foodName == "Vanilla Icecream" && !foodName.isEmpty()){
			foodPrice = 70.00 * foodQuantity;
			return foodPrice;
		}
		else {
			System.out.println(foodName + " Not available.. Enter a food name from the menu" );
		}
		return foodPrice;
		
	}
	
}