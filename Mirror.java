class Mirror{
		
		static String brand = "Kohler";
		static String roomType = "Living Room";
		static String shape = "Oblong";
		static String style = "Capsule Gold";
	public static void main(String args[]){
		
		System.out.println("Mirror brand = "+brand);
		System.out.println("Mirror roomType "+roomType);
		System.out.println("Mirror shape = "+shape);
		System.out.println("Mirror style = "+style);
		//brand = "Anything";
		//roomType = "Dressing Mirror";
		//shape = "Rectangle";
		//style = "New Gold";
		updatedMirrorDetails();
		System.out.println("Updated Details are :");
		System.out.println("Mirror brand = "+brand);
		System.out.println("Mirror roomType "+roomType);
		System.out.println("Mirror shape = "+shape);
		System.out.println("Mirror style = "+style);
		
	}
	public static void updatedMirrorDetails(){
		brand = "Anything";
		roomType = "Dressing Mirror";
		shape = "Rectangle";
		style = "New Gold";
	}
}