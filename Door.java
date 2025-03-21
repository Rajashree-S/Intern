class Door{
	
		static String brand = "Plantex";
		static String colour = "Ember Pattern";
		static String material = "WPC";
		static String itemWeight = "22 Kilograms";
		static String assemblyRequired = "No";
	public static void main(String args[]){
		
		System.out.println("Door brand = "+brand);
		System.out.println("Door colour = "+colour);
		System.out.println("Door material = "+material);
		System.out.println("Door itemWeight = "+itemWeight);
		System.out.println("Door assemblyRequired = "+assemblyRequired);
		//brand = "Anything";
		//colour = "Rusty Brown";
		//material = "WPC";
		//itemWeight = "18 Kilograms";
		//assemblyRequired = "Yes";
		updatedDoorDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Door brand = "+brand);
		System.out.println("Door colour = "+colour);
		System.out.println("Door material = "+material);
		System.out.println("Door itemWeight = "+itemWeight);
		System.out.println("Door assemblyRequired = "+assemblyRequired);
		
	}
	public static void updatedDoorDetails(){
		brand = "Anything";
		colour = "Rusty Brown";
		material = "WPC";
		itemWeight = "18 Kilograms";
		assemblyRequired = "Yes";
	}
}