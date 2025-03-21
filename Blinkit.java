class Blinkit{
	
	public static double products(String productName){
		
		double productPrice = 0.0;
		
		if(productName == "Lays Creme and onion" && !productName.isEmpty()){
			productPrice = 20.00;
			return productPrice;
		}
		else if(productName == "Lays Magic masala" && !productName.isEmpty()){
			productPrice = 20.00;
			return productPrice;
		}
		else if(productName == "Coco cola" && !productName.isEmpty()){
			productPrice = 45.00;
			return productPrice;
		}
		else if(productName == "Britania Toastea" && !productName.isEmpty()){
			productPrice = 42.00;
			return productPrice;
		}
		else if(productName == "Doritos Cheese nachos" && !productName.isEmpty()){
			productPrice = 20.00;
			return productPrice;
		}
		else if(productName == "Nandini Milk" && !productName.isEmpty()){
			productPrice = 30.00;
			return productPrice;
		}
		else if(productName == "Mother Diary Milk" && !productName.isEmpty()){
			productPrice = 30.00;
			return productPrice;
		}
		else if(productName == "White Eggs" && !productName.isEmpty()){
			productPrice = 82.00;
			return productPrice;
		}
		else if(productName == "Cornflakes" && !productName.isEmpty()){
			productPrice = 70.00;
			return productPrice;
		}
		else if(productName == "Toothpick" && !productName.isEmpty()){
			productPrice = 40.00;
			return productPrice;
		}
		else if(productName == "Tissue" && !productName.isEmpty()){
			productPrice = 62.00;
			return productPrice;
		}
		else if(productName == "Paper cups" && !productName.isEmpty()){
			productPrice = 74.00;
			return productPrice;
		}
		else if(productName == "Candles" && !productName.isEmpty()){
			productPrice = 40.00;
			return productPrice;
		}
		else if(productName == "Scented Candles" && !productName.isEmpty()){
			productPrice = 70.00;
			return productPrice;
		}
		else if(productName == "Buddha Figureines" && !productName.isEmpty()){
			productPrice = 300.00;
			return productPrice;
		}
		else if(productName == "Coffee cups" && !productName.isEmpty()){
			productPrice = 245.00;
			return productPrice;
		}
		else if(productName == "Shampoo" && !productName.isEmpty()){
			productPrice = 340.00;
			return productPrice;
		}
		else if(productName == "Tomato Ketchup" && !productName.isEmpty()){
			productPrice = 72.00;
			return productPrice;
		}
		else if(productName == "Red chilli sauce" && !productName.isEmpty()){
			productPrice = 67.00;
			return productPrice;
		}
		else if(productName == "green chilli sauce" && !productName.isEmpty()){
			productPrice = 67.00;
			return productPrice;
		}
		else if(productName == "kissan jam" && !productName.isEmpty()){
			productPrice = 189.00;
			return productPrice;
		}
		else if(productName == "Mayonnaise" && !productName.isEmpty()){
			productPrice = 86.00;
			return productPrice;
		}
		else if(productName == "Honey" && !productName.isEmpty()){
			productPrice = 95.00;
			return productPrice;
		}
		else if(productName == "Peanut butter" && !productName.isEmpty()){
			productPrice = 110.00;
			return productPrice;
		}
		else if(productName == "butter" && !productName.isEmpty()){
			productPrice = 60.00;
			return productPrice;
		}
		else if(productName == "panner" && !productName.isEmpty()){
			productPrice = 50.00;
			return productPrice;
		}
		else if(productName == "curd" && !productName.isEmpty()){
			productPrice =50.00 ;
			return productPrice;
		}
		else if(productName == "Ghee" && !productName.isEmpty()){
			productPrice = 90.00;
			return productPrice;
		}
		else if(productName == "Sunflower Oil" && !productName.isEmpty()){
			productPrice = 120.00;
			return productPrice;
		}
		else if(productName == "yogurt" && !productName.isEmpty()){
			productPrice = 30.00;
			return productPrice;
		}
		else if(productName == "Eyeliner" && !productName.isEmpty()){
			productPrice = 120.00;
			return productPrice;
		}
		else if(productName == "Mascara" && !productName.isEmpty()){
			productPrice = 150.00;
			return productPrice;
		}
		else if(productName == "Camphor" && !productName.isEmpty()){
			productPrice = 135.00;
			return productPrice;
		}
		else if(productName == "Rice" && !productName.isEmpty()){
			productPrice = 130.00;
			return productPrice;
		}
		else if(productName == "Maida" && !productName.isEmpty()){
			productPrice = 48.00;
			return productPrice;
		}
		else if(productName == "Oreo biscuit" && !productName.isEmpty()){
			productPrice = 70.00;
			return productPrice;
		}
		else if(productName == "Cupcakes" && !productName.isEmpty()){
			productPrice = 40.00;
			return productPrice;
		}
		else if(productName == "Daal" && !productName.isEmpty()){
			productPrice = 60.00;
			return productPrice;
		}
		else if(productName == "Sugar" && !productName.isEmpty()){
			productPrice = 55.00;
			return productPrice;
		}
		else if(productName == "Salt" && !productName.isEmpty()){
			productPrice = 45.00;
			return productPrice;
		}
		else {
			System.out.println(productName + " Not available.. Enter a different product." );
		}
		return productPrice;
		
	}
	public static double products(String productName , int productQuantity){
		
		double productPrice = 0.0;
		
		if(productName == "Lays Creme and onion" && !productName.isEmpty()){
			productPrice = 20.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Lays Magic masala" && !productName.isEmpty()){
			productPrice = 20.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Coco cola" && !productName.isEmpty()){
			productPrice = 45.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Britania Toastea" && !productName.isEmpty()){
			productPrice = 42.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Doritos Cheese nachos" && !productName.isEmpty()){
			productPrice = 20.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Nandini Milk" && !productName.isEmpty()){
			productPrice = 30.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Mother Diary Milk" && !productName.isEmpty()){
			productPrice = 30.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "White Eggs" && !productName.isEmpty()){
			productPrice = 82.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Cornflakes" && !productName.isEmpty()){
			productPrice = 70.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Toothpick" && !productName.isEmpty()){
			productPrice = 40.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Tissue" && !productName.isEmpty()){
			productPrice = 62.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Paper cups" && !productName.isEmpty()){
			productPrice = 74.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Candles" && !productName.isEmpty()){
			productPrice = 40.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Scented Candles" && !productName.isEmpty()){
			productPrice = 70.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Buddha Figureines" && !productName.isEmpty()){
			productPrice = 300.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Coffee cups" && !productName.isEmpty()){
			productPrice = 245.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Shampoo" && !productName.isEmpty()){
			productPrice = 340.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Tomato Ketchup" && !productName.isEmpty()){
			productPrice = 72.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Red chilli sauce" && !productName.isEmpty()){
			productPrice = 67.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "green chilli sauce" && !productName.isEmpty()){
			productPrice = 67.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "kissan jam" && !productName.isEmpty()){
			productPrice = 189.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Mayonnaise" && !productName.isEmpty()){
			productPrice = 86.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Honey" && !productName.isEmpty()){
			productPrice = 95.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Peanut butter" && !productName.isEmpty()){
			productPrice = 110.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "butter" && !productName.isEmpty()){
			productPrice = 60.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "panner" && !productName.isEmpty()){
			productPrice = 50.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "curd" && !productName.isEmpty()){
			productPrice =50.00 * productQuantity; 
			return productPrice;
		}
		else if(productName == "Ghee" && !productName.isEmpty()){
			productPrice = 90.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Sunflower Oil" && !productName.isEmpty()){
			productPrice = 120.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "yogurt" && !productName.isEmpty()){
			productPrice = 30.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Eyeliner" && !productName.isEmpty()){
			productPrice = 120.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Mascara" && !productName.isEmpty()){
			productPrice = 150.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Camphor" && !productName.isEmpty()){
			productPrice = 135.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Rice" && !productName.isEmpty()){
			productPrice = 130.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Maida" && !productName.isEmpty()){
			productPrice = 48.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Oreo biscuit" && !productName.isEmpty()){
			productPrice = 70.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Cupcakes" && !productName.isEmpty()){
			productPrice = 40.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Daal" && !productName.isEmpty()){
			productPrice = 60.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Sugar" && !productName.isEmpty()){
			productPrice = 55.00 * productQuantity;
			return productPrice;
		}
		else if(productName == "Salt" && !productName.isEmpty()){
			productPrice = 45.00 * productQuantity;
			return productPrice;
		}
		else {
			System.out.println(productName + " Not available.. Enter a different product." );
		}
		return productPrice;
		
	}
}