class Pen{
	
		static String brand = "Pentonic";
		static String colour = "Black";
		static String inkColour = "Black";
		static String ageRange = "Adult";
		static String material = "Plastic";
	public static void main(String args[]){

		System.out.println("Pen brand = "+brand);
		System.out.println("Pen colour = "+colour);
		System.out.println("Pen inkColour = "+inkColour);
		System.out.println("Pen ageRange = "+ageRange);
		System.out.println("Pen material = "+material);
		//brand = "Renolds";
		//colour = "Blue";
		//inkColour = "Blue";
		//ageRange = "Adult";
		//material = "Plastic";
		updatedPenDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Pen brand = "+brand);
		System.out.println("Pen colour = "+colour);
		System.out.println("Pen inkColour = "+inkColour);
		System.out.println("Pen ageRange = "+ageRange);
		System.out.println("Pen material = "+material);
		
		
	}
	public static void updatedPenDetails(){
		brand = "Renolds";
		colour = "Blue";
		inkColour = "Blue";
		ageRange = "Adult";
		material = "Plastic";
	}
}