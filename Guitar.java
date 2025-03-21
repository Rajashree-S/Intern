class Guitar{
		static String brand = "Kadence";
		static String colour = "Natural";
		static String topMaterialType = "Wood";
	public static void main(String args[]){
	

		System.out.println("Guitar brand = "+brand);
		System.out.println("Guitar colour = "+colour);
		System.out.println("Guitar top Material Type = "+topMaterialType);
		//String brand = "Anything";
		//String colour = "Royal gold";
		//String topMaterialType = "Wood";
		updatedGuitar();
		System.out.println("Updated Details are :");
		System.out.println("Guitar brand = "+brand);
		System.out.println("Guitar colour = "+colour);
		System.out.println("Guitar top Material Type = "+topMaterialType);
		
		
	}
	public static void updatedGuitar(){	
		String brand = "Anything";
		String colour = "Royal gold";
		String topMaterialType = "Wood";
	}
}