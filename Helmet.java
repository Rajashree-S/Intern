class Helmet{
	
		static String colour = "Black";
		static String brand = "Studds";
		static String vehicleServiceType = "Motorcycle";
		static String itemWeight = "1100 Grams";
		static String material = "Plastic";
	public static void main(String args[]){
		
		System.out.println("Helmet colour = "+colour);
		System.out.println("Helmet brand = "+brand);
		System.out.println("Helmet vehicleServiceType = "+vehicleServiceType);
		System.out.println("Helmet itemWeight = "+itemWeight);
		System.out.println("Helmet material = "+material);
		//colour = "White";
		//brand = "Studds";
		//vehicleServiceType = "Motorcycle";
		//itemWeight = "1300 Grams";
		//material = "Plastic";
		updatedHelmetDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Helmet colour = "+colour);
		System.out.println("Helmet brand = "+brand);
		System.out.println("Helmet vehicleServiceType = "+vehicleServiceType);
		System.out.println("Helmet itemWeight = "+itemWeight);
		System.out.println("Helmet material = "+material);
		
	}
	public static void updatedHelmetDetails(){
		colour = "White";
		brand = "Studds";
		vehicleServiceType = "Motorcycle";
		itemWeight = "1300 Grams";
		material = "Plastic";
	}
}