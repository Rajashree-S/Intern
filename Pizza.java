class Pizza{
	
		static int pizzaId = 2;
		static String name = "pepporni pizza";
		static String size = "12 inches";
		static String type = "Thin crust pizza";
		static int price = 349;
	public static void main(String args[]){
		
		System.out.println("Pizza Id = "+pizzaId);
		System.out.println("Pizza Name = "+name);
		System.out.println("Pizza size = "+size);
		System.out.println("Pizza type = "+type);
		System.out.println("Pizza price = "+price);
		//pizzaId = 3;
		//name = "Veg Loaded Pizza";
		//size = "16 inches";
		//type = "Thin crust pizza";
		//price = 449;
		updatedPizzaDetails();
		System.out.println("updated Details are :");
		System.out.println("Pizza Id = "+pizzaId);
		System.out.println("Pizza Name = "+name);
		System.out.println("Pizza size = "+size);
		System.out.println("Pizza type = "+type);
		System.out.println("Pizza price = "+price);
	}
	public static void updatedPizzaDetails(){
		pizzaId = 3;
		name = "Veg Loaded Pizza";
		size = "16 inches";
		type = "Thin crust pizza";
		price = 449;
	}
}