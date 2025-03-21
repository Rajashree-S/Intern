class Dominos{
	
	public static double menuPizza(String pizzaName){
		
		double pizzaPrice = 0.0;
		
		if(pizzaName == "The 4 Cheese Pizza" && !pizzaName.isEmpty()){
			pizzaPrice = 299.00;
			return pizzaPrice;
		}
		else if(pizzaName == "Margherita" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Double Cheese Margherita" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Farm House" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Peppy Paneer" && !pizzaName.isEmpty()){
			pizzaPrice = 149.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Mexican Green Wave" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Deluxe Veggie" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Veg Extravaganza" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99;
			return pizzaPrice;
		}
		else if(pizzaName == "CHEESE N CORN" && !pizzaName.isEmpty()){
			pizzaPrice = 119.99;
			return pizzaPrice;
		}
		else if(pizzaName == "FRESH VEGGIE" && !pizzaName.isEmpty()){
			pizzaPrice = 129.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "VEGGIE PARADISE" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "PANEER MAKHANI" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99  ;
			return pizzaPrice;
		}
		else if(pizzaName == "Indi Tandoori Paneer" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Moroccan Spice Pasta Pizza - Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Achari Do Pyaza" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Moroccan Spice Pasta Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Creamy Tomato Pasta Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Garlic Breadsticks" && !pizzaName.isEmpty()){
			pizzaPrice = 149.99 ;
			return pizzaPrice;
		}
		else if(pizzaName == "Stuffed Garlic Bread" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Paneer Tikka Stuffed Garlic Bread" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Corn n Cheese Paratha Pizza" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99;
			return pizzaPrice;
		}
		else if(pizzaName == "BURGER PIZZA- CLASSIC VEG" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Golden Delight" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Non Veg Supreme" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Dominator" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99;
			return pizzaPrice;
		}
		else if(pizzaName == "PEPPER BARBECUE & ONION" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99;
			return pizzaPrice;
		}
		else if(pizzaName == "PEPPER BARBECUE CHICKEN" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99;
			return pizzaPrice;
		}
		else if(pizzaName == "CHICKEN SAUSAGE" && !pizzaName.isEmpty()){
			pizzaPrice = 129.99;
			return pizzaPrice;
		}
		else if(pizzaName == "CHICKEN FIESTA" && !pizzaName.isEmpty()){
			pizzaPrice = 149.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Indi Chicken Tikka" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Pepperoni" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Creamy Tomato Pasta Pizza - Non Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Keema Do Pyaza" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Moroccan Spice Pasta Pizza - Non Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Tikka Masala Pasta non -Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Pepperoni Stuffed Garlic Bread" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99;
			return pizzaPrice;
		}
		else if(pizzaName == "ROASTED CHICKEN WINGS PERI-PERI" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99;
			return pizzaPrice;
		}
		else if(pizzaName == "CHICKEN MEATBALLS PERI-PERI" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99;
			return pizzaPrice;
		}
		else if(pizzaName == "BONELESS CHICKEN WINGS PERI-PERI" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99;
			return pizzaPrice;
		}
		else if(pizzaName == "ROASTED CHICKEN WINGS CLASSIC HOT SAUCE" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99;
			return pizzaPrice;
		}
		else {
			System.out.println(pizzaName + " Not available.. Enter a food name from the menu" );
		}
		return pizzaPrice;
		
	}
	public static double menuPizza(String pizzaName , int quantity){
		
		double pizzaPrice = 0.0;
		
		if(pizzaName == "The 4 Cheese Pizza" && !pizzaName.isEmpty()){
			pizzaPrice = 299.00 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Margherita" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Double Cheese Margherita" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Farm House" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Peppy Paneer" && !pizzaName.isEmpty()){
			pizzaPrice = 149.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Mexican Green Wave" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Deluxe Veggie" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Veg Extravaganza" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "CHEESE N CORN" && !pizzaName.isEmpty()){
			pizzaPrice = 119.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "FRESH VEGGIE" && !pizzaName.isEmpty()){
			pizzaPrice = 129.99 * quantity ;
			return pizzaPrice;
		}
		else if(pizzaName == "VEGGIE PARADISE" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "PANEER MAKHANI" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity ;
			return pizzaPrice;
		}
		else if(pizzaName == "Indi Tandoori Paneer" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Moroccan Spice Pasta Pizza - Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Achari Do Pyaza" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Moroccan Spice Pasta Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99 * quantity;
			return pizzaPrice;
		}else
		if(pizzaName == "Creamy Tomato Pasta Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Garlic Breadsticks" && !pizzaName.isEmpty()){
			pizzaPrice = 149.99 * quantity ;
			return pizzaPrice;
		}
		else if(pizzaName == "Stuffed Garlic Bread" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Paneer Tikka Stuffed Garlic Bread" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Corn n Cheese Paratha Pizza" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "BURGER PIZZA- CLASSIC VEG" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Golden Delight" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Non Veg Supreme" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Dominator" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "PEPPER BARBECUE & ONION" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "PEPPER BARBECUE CHICKEN" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "CHICKEN SAUSAGE" && !pizzaName.isEmpty()){
			pizzaPrice = 129.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "CHICKEN FIESTA" && !pizzaName.isEmpty()){
			pizzaPrice = 149.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Indi Chicken Tikka" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Pepperoni" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Creamy Tomato Pasta Pizza - Non Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 249.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Keema Do Pyaza" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Moroccan Spice Pasta Pizza - Non Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Tikka Masala Pasta non -Veg" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "Chicken Pepperoni Stuffed Garlic Bread" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "ROASTED CHICKEN WINGS PERI-PERI" && !pizzaName.isEmpty()){
			pizzaPrice = 399.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "CHICKEN MEATBALLS PERI-PERI" && !pizzaName.isEmpty()){
			pizzaPrice = 349.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "BONELESS CHICKEN WINGS PERI-PERI" && !pizzaName.isEmpty()){
			pizzaPrice = 299.99 * quantity;
			return pizzaPrice;
		}
		else if(pizzaName == "ROASTED CHICKEN WINGS CLASSIC HOT SAUCE" && !pizzaName.isEmpty()){
			pizzaPrice = 199.99 * quantity;
			return pizzaPrice;
		}
		else {
			System.out.println(pizzaName + " Not available.. Enter a food name from the menu" );
		}
		return pizzaPrice;
	}
}