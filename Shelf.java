class Shelf{
	
	    static String material = "Engineered Wood";
		static String style = "Modern";
		static String ageRange = "Adult";
		static String size = "Medium";
	public static void main(String args[]){
		
		System.out.println("Shelf material = "+material);
		System.out.println("Shelf style = "+style);
		System.out.println("Shelf ageRange = "+ageRange);
		System.out.println("Shelf size = "+size);
		//material = "Wood";
		//style = "Modern";
		//ageRange = "Adult";
		//size = "Large";
		updatedShelfDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Shelf material = "+material);
		System.out.println("Shelf style = "+style);
		System.out.println("Shelf ageRange = "+ageRange);
		System.out.println("Shelf size = "+size);
			
	}
	public static void updatedShelfDetails(){
		material = "Wood";
		style = "Modern";
		ageRange = "Adult";
		size = "Large";
	}
}