class Blanket{
	
		static String material = "Microfiber";
		static String color = "Red";
		static String brand = "Cloth Fusion";
		static String style = "Grey & Maroon";
	public static void main(String args[]){
		
		System.out.println("Blanket material = "+material);
		System.out.println("Blanket color = "+color);
		System.out.println("Blanket brand = "+brand);
		System.out.println("Blanket style = "+style);
		//material = "Cotton";
		//color = "Blue";
		//brand = "Cloth Fusion";
		//style = "Black & White";
		updatedBlanketDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Blanket material = "+material);
		System.out.println("Blanket color = "+color);
		System.out.println("Blanket brand = "+brand);
		System.out.println("Blanket style = "+style);
	}
	public static void updatedBlanketDetails(){
		material = "Cotton";
		color = "Blue";
		brand = "Cloth Fusion";
		style = "Black & White";
	}
}