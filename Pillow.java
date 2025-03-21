class Pillow{
	
		static String fillMaterial = "Gel Microfiber";
		static String pillowType = "Bed Pillow";
		static String size = "Pack of 2";
		static String shape = "Rectangular";
	public static void main(String args[]){
		
		System.out.println("Pillow fillMaterial = "+fillMaterial);
		System.out.println("Pillow Type = "+pillowType);
		System.out.println("Pillow size = "+size);
		System.out.println("Pillow shape = "+shape);
		//fillMaterial = "Cotton";
		//pillowType = "Neck Pillow";
		//size = "Pack of 1";
		//shape = "Circle";
		updatedPillowDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Pillow fillMaterial = "+fillMaterial);
		System.out.println("Pillow Type = "+pillowType);
		System.out.println("Pillow size = "+size);
		System.out.println("Pillow shape = "+shape);
		
	}
	public static void updatedPillowDetails(){
		fillMaterial = "Cotton";
		pillowType = "Neck Pillow";
		size = "Pack of 1";
		shape = "Circle";
	}
}