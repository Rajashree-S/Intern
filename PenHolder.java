class PenHolder{
	
		static String colour = "White & teal";
		static String material = "Concrete";
		static String itemWeight = "450 Grams";
		static String brand = "Dwell dapper";
	public static void main(String args[]){
		
		System.out.println("PenHolder colour = "+colour);
		System.out.println("PenHolder material = "+material);
		System.out.println("PenHolder itemWeight = "+itemWeight);
		System.out.println("PenHolder brand = "+brand);
		//colour = "Red & blue";
		//material = "Concrete";
		//itemWeight = "600 Grams";
		//brand = "Dwell dapper";
		updatedPenHolderDetails();
		System.out.println("Updated Details are:");
		System.out.println("PenHolder colour = "+colour);
		System.out.println("PenHolder material = "+material);
		System.out.println("PenHolder itemWeight = "+itemWeight);
		System.out.println("PenHolder brand = "+brand);
		
	}
	public static void updatedPenHolderDetails(){
		colour = "Red & blue";
		material = "Concrete";
		itemWeight = "600 Grams";
		brand = "Dwell dapper";
		
	}
}