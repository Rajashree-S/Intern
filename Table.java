class Table{
	
		static String brand = "VISBY INDIA";
		static String style = "Country";
		static String baseMaterial = "Metal";
		static String finishType = "Painted, Laminated";
		static String roomType = "Office";
	
	public static void main(String args[]){

		System.out.println("Table brand = "+brand);
		System.out.println("Table style = "+style);
		System.out.println("Table baseMaterial = "+baseMaterial);
		System.out.println("Table finishType = "+finishType);
		System.out.println("Table roomType = "+roomType);
		 //brand = "New Table";
		 //style = "Classic";
		 //baseMaterial = "Wood";
		 //finishType = "Painted";
		 //roomType = "Home";
		updatedTableDetails();
		System.out.println("Updated details are:");
		System.out.println("Table brand = "+brand);
		System.out.println("Table style = "+style);
		System.out.println("Table baseMaterial = "+baseMaterial);
		System.out.println("Table finishType = "+finishType);
		System.out.println("Table roomType = "+roomType);
		
	}
	public static void updatedTableDetails(){
		 brand = "New Table";
		 style = "Classic";
		 baseMaterial = "Wood";
		 finishType = "Painted";
		 roomType = "Home";
	}
}