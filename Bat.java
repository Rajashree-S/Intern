class Bat{
	
		static String size = "Full";
		static String sport = "Cricket";
		static String material = "Wood";
		static String colour = "Natural";
	public static void main(String args[]){
		
		System.out.println("Bat size = "+size);
		System.out.println("Bat sport = "+sport);
		System.out.println("Bat material = "+material);
		System.out.println("Bat colour = "+colour);
		//size = "Full";
		//sport = "Cricket";
		//material = "Wood";
		//colour = "Rustic Brown";
		updatedBatDetails();		
		System.out.println("Upadted Details are :");
		System.out.println("Bat size = "+size);
		System.out.println("Bat sport = "+sport);
		System.out.println("Bat material = "+material);
		System.out.println("Bat colour = "+colour);
		
	}
	public static void updatedBatDetails(){
		size = "Full";
		sport = "Cricket";
		material = "Wood";
		colour = "Rustic Brown";
	}
}