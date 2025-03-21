class Kfc{
	
	public static double menu(String name){

		double price = 0.0;
		
		if(name == "Original Recipe Chicken" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Extra Crispy Chicken" && !name.isEmpty()){
			price = 250.00 ;
			return price;
		}
		else if(name == "Fried Chicken Tenders" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Hot Wings" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Popcorn Chicken" && !name.isEmpty()){
			price = 125.00;
			return price;
		}
		else if(name == "Chicken Strips" && !name.isEmpty()){
			price = 299.00;
			return price;
		}
		else if(name == "Smoky Red Chicken" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Hot & Crispy Chicken" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Peri Peri Chicken" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Grilled Chicken" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Classic Chicken Sandwich" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Zinger Sandwich" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Tower Burger" && !name.isEmpty()){
			price = 200.00;
			return price;
		}
		else if(name == "Chicken Littles" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Twister Wraps" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Veg Krisper Burger" && !name.isEmpty()){
			price = 200.00;
			return price;
		}
		else if(name == "Mexican Zinger Pro Burger" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Caribbean Spicy Zinger Burger" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Chicken Zinger Burger" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Indian Tandoori Zinger Burger" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Indian Paneer Zinger Burger" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Mashed Potatoes and Gravy" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Cole Slaw" && !name.isEmpty()){
			price = 150.00;
			return price;
		}
		else if(name == "French Fries" && !name.isEmpty()){
			price = 150.00;
			return price;
		}
		else if(name == "Mac & Cheese" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Corn on the Cob" && !name.isEmpty()){
			price = 125.00;
			return price;
		}
		else if(name == "Biscuits" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Potato Wedges" && !name.isEmpty()){
			price = 125.00;
			return price;
		}
		else if(name == "Rizo Rice" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Popcorn Chicken Rice Bowl" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Hot & Crispy Rice Bowl" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Korean Chicken Roll" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Thai Spicy Chicken Roll." && !name.isEmpty()){
			price =350.00 ;
			return price;
		}
		else if(name == "Leg Piece Bucket" && !name.isEmpty()){
			price = 499.00;
			return price;
		}
		else if(name == "Smoky Red Chicken" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Veg Krisper Burger" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Peri Peri chicken strips" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "Popcorn Chicken Rice Bowl" && !name.isEmpty()){
			price = 180.00;
			return price;
		}
		else if(name == "Choco lava cake" && !name.isEmpty()){
			price = 109.00;
			return price;
		}
		else if(name == "Missipi mud pie" && !name.isEmpty()){
			price = 119.00;
			return price;
		}
		else if(name == "Pepsi" && !name.isEmpty()){
			price = 60.00;
			return price;
		}
		else {
			System.out.println(name + " Not available.. Enter a different item." );
		}
		return price;
	}
	
	public static double menu(String name , int quantity){

		double price = 0.0;
		
		if(name == "Original Recipe Chicken" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Extra Crispy Chicken" && !name.isEmpty()){
			price = 250.00 * quantity ;
			return price;
		}
		else if(name == "Fried Chicken Tenders" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Hot Wings" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Popcorn Chicken" && !name.isEmpty()){
			price = 125.00 * quantity;
			return price;
		}
		else if(name == "Chicken Strips" && !name.isEmpty()){
			price = 299.00 * quantity;
			return price;
		}
		else if(name == "Smoky Red Chicken" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Hot & Crispy Chicken" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Peri Peri Chicken" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Grilled Chicken" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Classic Chicken Sandwich" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Zinger Sandwich" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Tower Burger" && !name.isEmpty()){
			price = 200.00 * quantity;
			return price;
		}
		else if(name == "Chicken Littles" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Twister Wraps" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Veg Krisper Burger" && !name.isEmpty()){
			price = 200.00 * quantity;
			return price;
		}
		else if(name == "Mexican Zinger Pro Burger" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Caribbean Spicy Zinger Burger" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Chicken Zinger Burger" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Indian Tandoori Zinger Burger" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Indian Paneer Zinger Burger" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Mashed Potatoes and Gravy" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Cole Slaw" && !name.isEmpty()){
			price = 150.00 * quantity;
			return price;
		}
		else if(name == "French Fries" && !name.isEmpty()){
			price = 150.00 * quantity;
			return price;
		}
		else if(name == "Mac & Cheese" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Corn on the Cob" && !name.isEmpty()){
			price = 125.00 * quantity;
			return price;
		}
		else if(name == "Biscuits" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Potato Wedges" && !name.isEmpty()){
			price = 125.00 * quantity;
			return price;
		}
		else if(name == "Rizo Rice" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Popcorn Chicken Rice Bowl" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Hot & Crispy Rice Bowl" && !name.isEmpty()){
			price = 190.00 * quantity;
			return price;
		}
		else if(name == "Korean Chicken Roll" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Thai Spicy Chicken Roll." && !name.isEmpty()){
			price =350.00 * quantity; 
			return price;
		}
		else if(name == "Leg Piece Bucket" && !name.isEmpty()){
			price = 499.00 * quantity;
			return price;
		}
		else if(name == "Smoky Red Chicken" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Veg Krisper Burger" && !name.isEmpty()){
			price = 250.00 * quantity;
			return price;
		}
		else if(name == "Peri Peri chicken strips" && !name.isEmpty()){
			price = 350.00 * quantity;
			return price;
		}
		else if(name == "Popcorn Chicken Rice Bowl" && !name.isEmpty()){
			price = 180.00 * quantity;
			return price;
		}
		else if(name == "Choco lava cake" && !name.isEmpty()){
			price = 109.00 * quantity;
			return price;
		}
		else if(name == "Missipi mud pie" && !name.isEmpty()){
			price = 119.00 * quantity;
			return price;
		}
		else if(name == "Pepsi" && !name.isEmpty()){
			price = 60.00 * quantity;
			return price;
		}
		else {
			System.out.println(name + " Not available.. Enter a different item." );
		}
		return price;
	}
		
}