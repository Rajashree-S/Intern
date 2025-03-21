class Watch{
	
		static int watchId = 4;
		static String brand = "Casio"; 
		static String color = "White";
		static String type = "Analog";
		static String shape = "Circle";
		static boolean isWaterProof = false;
	public static void main(String args[]){
		
		System.out.println("Watch Id="+watchId);
		System.out.println("Watch brand="+brand);
		System.out.println("Watch color="+color);
		System.out.println("Watch type="+type);
		System.out.println("Watch shape="+shape);
		System.out.println("Watch is Water Proof="+isWaterProof);
		//watchId = 5;
		//brand = "Titan"; 
		//color = "Black";
		//type = "Analog";
		//shape = "Rectangle";
		updatedWatchDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Watch Id="+watchId);
		System.out.println("Watch brand="+brand);
		System.out.println("Watch color="+color);
		System.out.println("Watch type="+type);
		System.out.println("Watch shape="+shape);
		System.out.println("Watch is Water Proof="+isWaterProof);
	
	}
	public static void updatedWatchDetails(){
		watchId = 5;
		brand = "Titan"; 
		color = "Black";
		type = "Analog";
		shape = "Rectangle";
		isWaterProof = true;
	}
	
}