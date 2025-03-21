class FoodPanda{
	
	public static double items(String name){
		
		double price = 0.0;
		
		if(name == "Veg Biryani" && !name.isEmpty()){
			price = 150.00;
			return price;
		}
		else if(name == "Chicken Biryani" && !name.isEmpty()){
			price = 200.00;
			return price;
		}
		else if(name == "mutton biryani" && !name.isEmpty()){
			price = 300.00;
			return price;
		}
		else if(name == "egg biryani" && !name.isEmpty()){
			price = 150.00;
			return price;
		}
		else if(name == "prawn biryani" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "Chilli chicken" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "dragon chicken" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "pepper chicken" && !name.isEmpty()){
			price = 180.00;
			return price;
		}
		else if(name == "mutton roast" && !name.isEmpty()){
			price = 340.00;
			return price;
		}
		else if(name == "egg omlete" && !name.isEmpty()){
			price = 50.00;
			return price;
		}
		else if(name == "boiled egg" && !name.isEmpty()){
			price = 20.00;
			return price;
		}
		else if(name == "hyderbadi special biryani" && !name.isEmpty()){
			price =280.00 ;
			return price;
		}
		else if(name == "Sheshwan noodles" && !name.isEmpty()){
			price = 160.00;
			return price;
		}
		else if(name == "fried rice" && !name.isEmpty()){
			price = 160.00;
			return price;
		}
		else if(name == "wontons" && !name.isEmpty()){
			price = 90.00;
			return price;
		}
		else if(name == "spring rolls" && !name.isEmpty()){
			price = 90.00;
			return price;
		}
		else if(name == "manchurian" && !name.isEmpty()){
			price = 90.00;
			return price;
		}
		else if(name == "egg kheema" && !name.isEmpty()){
			price = 90.00;
			return price;
		}
		else if(name == "chicken lollipop" && !name.isEmpty()){
			price = 120.00;
			return price;
		}
		else if(name == "kebab" && !name.isEmpty()){
			price = 120.00;
			return price;
		}
		else if(name == "prawn ghee roast" && !name.isEmpty()){
			price = 250.00;
			return price;
		}
		else if(name == "fish kabab" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "fish fry" && !name.isEmpty()){
			price = 200.00;
			return price;
		}
		else if(name == "non-veg thalli" && !name.isEmpty()){
			price = 350.00;
			return price;
		}
		else if(name == "veg thalli" && !name.isEmpty()){
			price = 280.00;
			return price;
		}
		else if(name == "Butter chicken" && !name.isEmpty()){
			price = 170.00;
			return price;
		}
		else if(name == "panner butter masala" && !name.isEmpty()){
			price = 150.00;
			return price;
		}
		else if(name == "Dal makani" && !name.isEmpty()){
			price = 120.00;
			return price;
		}
		else if(name == "rogan josh" && !name.isEmpty()){
			price = 340.00;
			return price;
		}
		else if(name == "chiken tikka masala" && !name.isEmpty()){
			price = 230.00;
			return price;
		}
		else if(name == "panner tikka" && !name.isEmpty()){
			price = 190.00;
			return price;
		}
		else if(name == "Chettinad Chicken" && !name.isEmpty()){
			price = 180.00;
			return price;
		}
		else if(name == "Vindaloo" && !name.isEmpty()){
			price = 210.00;
			return price;
		}
		else if(name == "Tandoori Chicken" && !name.isEmpty()){
			price = 280.00;
			return price;
		}
		else if(name == "grill chicken" && !name.isEmpty()){
			price = 300.00;
			return price;
		}
		else if(name == "Shawarma" && !name.isEmpty()){
			price = 120.00;
			return price;
		}
		else if(name == "plate shawarma" && !name.isEmpty()){
			price = 140.00;
			return price;
		}
		else if(name == "malai kofta" && !name.isEmpty()){
			price = 80.00;
			return price;
		}
		else if(name == "Hakka Noodles" && !name.isEmpty()){
			price = 90.00;
			return price;
		}
		else if(name == "Chilli Paneer" && !name.isEmpty()){
			price = 130.00;
			return price;
		}
		else if(name == "Hot and Sour Soup" && !name.isEmpty()){
			price = 150.00;
			return price;
		}
		else {
			System.out.println(name + " Not available.. Enter a different item." );
		}
		return price;
		
		
	}
	
	public static double items(String name , int itemQuantity){
		
		double price = 0.0;
		
		if(name == "Veg Biryani" && !name.isEmpty()){
			price = 150.00 * itemQuantity;
			return price;
		}
		else if(name == "Chicken Biryani" && !name.isEmpty()){
			price = 200.00 * itemQuantity;
			return price;
		}
		else if(name == "mutton biryani" && !name.isEmpty()){
			price = 300.00 * itemQuantity;
			return price;
		}
		else if(name == "egg biryani" && !name.isEmpty()){
			price = 150.00 * itemQuantity;
			return price;
		}
		else if(name == "prawn biryani" && !name.isEmpty()){
			price = 250.00 * itemQuantity;
			return price;
		}
		else if(name == "Chilli chicken" && !name.isEmpty()){
			price = 250.00 * itemQuantity;
			return price;
		}
		else if(name == "dragon chicken" && !name.isEmpty()){
			price = 190.00 * itemQuantity;
			return price;
		}
		else if(name == "pepper chicken" && !name.isEmpty()){
			price = 180.00 * itemQuantity;
			return price;
		}
		else if(name == "mutton roast" && !name.isEmpty()){
			price = 340.00 * itemQuantity;
			return price;
		}
		else if(name == "egg omlete" && !name.isEmpty()){
			price = 50.00 * itemQuantity;
			return price;
		}
		else if(name == "boiled egg" && !name.isEmpty()){
			price = 20.00 * itemQuantity;
			return price;
		}
		else if(name == "hyderbadi special biryani" && !name.isEmpty()){
			price =280.00 * itemQuantity ;
			return price;
		}
		else if(name == "Sheshwan noodles" && !name.isEmpty()){
			price = 160.00 * itemQuantity;
			return price;
		}
		else if(name == "fried rice" && !name.isEmpty()){
			price = 160.00 * itemQuantity;
			return price;
		}
		else if(name == "wontons" && !name.isEmpty()){
			price = 90.00 * itemQuantity;
			return price;
		}
		else if(name == "spring rolls" && !name.isEmpty()){
			price = 90.00 * itemQuantity;
			return price;
		}
		else if(name == "manchurian" && !name.isEmpty()){
			price = 90.00 * itemQuantity;
			return price;
		}
		else if(name == "egg kheema" && !name.isEmpty()){
			price = 90.00 * itemQuantity;
			return price;
		}
		else if(name == "chicken lollipop" && !name.isEmpty()){
			price = 120.00 * itemQuantity;
			return price;
		}
		else if(name == "kebab" && !name.isEmpty()){
			price = 120.00 * itemQuantity;
			return price;
		}
		else if(name == "prawn ghee roast" && !name.isEmpty()){
			price = 250.00 * itemQuantity;
			return price;
		}
		else if(name == "fish kabab" && !name.isEmpty()){
			price = 190.00 * itemQuantity;
			return price;
		}
		else if(name == "fish fry" && !name.isEmpty()){
			price = 200.00 * itemQuantity;
			return price;
		}
		else if(name == "non-veg thalli" && !name.isEmpty()){
			price = 350.00 * itemQuantity;
			return price;
		}
		else if(name == "veg thalli" && !name.isEmpty()){
			price = 280.00 * itemQuantity;
			return price;
		}
		else if(name == "Butter chicken" && !name.isEmpty()){
			price = 170.00 * itemQuantity;
			return price;
		}
		else if(name == "panner butter masala" && !name.isEmpty()){
			price = 150.00 * itemQuantity;
			return price;
		}
		else if(name == "Dal makani" && !name.isEmpty()){
			price = 120.00 * itemQuantity;
			return price;
		}
		else if(name == "rogan josh" && !name.isEmpty()){
			price = 340.00 * itemQuantity;
			return price;
		}
		else if(name == "chiken tikka masala" && !name.isEmpty()){
			price = 230.00 * itemQuantity;
			return price;
		}
		else if(name == "panner tikka" && !name.isEmpty()){
			price = 190.00 * itemQuantity;
			return price;
		}
		else if(name == "Chettinad Chicken" && !name.isEmpty()){
			price = 180.00 * itemQuantity;
			return price;
		}
		else if(name == "Vindaloo" && !name.isEmpty()){
			price = 210.00 * itemQuantity;
			return price;
		}
		else if(name == "Tandoori Chicken" && !name.isEmpty()){
			price = 280.00 * itemQuantity;
			return price;
		}
		else if(name == "grill chicken" && !name.isEmpty()){
			price = 300.00 * itemQuantity;
			return price;
		}
		else if(name == "Shawarma" && !name.isEmpty()){
			price = 120.00 * itemQuantity;
			return price;
		}
		else if(name == "plate shawarma" && !name.isEmpty()){
			price = 140.00 * itemQuantity;
			return price;
		}
		else if(name == "malai kofta" && !name.isEmpty()){
			price = 80.00 * itemQuantity;
			return price;
		}
		else if(name == "Hakka Noodles" && !name.isEmpty()){
			price = 90.00 * itemQuantity;
			return price;
		}
		else if(name == "Chilli Paneer" && !name.isEmpty()){
			price = 130.00 * itemQuantity;
			return price;
		}
		else if(name == "Hot and Sour Soup" && !name.isEmpty()){
			price = 150.00 * itemQuantity;
			return price;
		}
		else {
			System.out.println(name + " Not available.. Enter a different item." );
		}
		return price;
		
		
	}

}