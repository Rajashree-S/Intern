class FootBall{
	
		static String brand = "Nivia";
		static String material = "Rubber";
		static String colour = "White";
		static String ageRange = "Youth";
		static String itemWeight = "420 Grams";
	public static void main(String args[]){

		System.out.println("FootBall brand = "+brand);
		System.out.println("FootBall material = "+material);
		System.out.println("FootBall colour = "+colour);
		System.out.println("FootBall ageRange = "+ageRange);
		System.out.println("FootBall itemWeight "+itemWeight);
		//brand = "Anything";
		//material = "Rubber";
		//colour = "Red";
		//ageRange = "kids";
		itemWeight = "300 Grams";
		updatedFootBall();
		System.out.println("Upadted Details are :");
		System.out.println("FootBall brand = "+brand);
		System.out.println("FootBall material = "+material);
		System.out.println("FootBall colour = "+colour);
		System.out.println("FootBall ageRange = "+ageRange);
		System.out.println("FootBall itemWeight "+itemWeight);
		
	}
	public static void updatedFootBall(){
		brand = "Anything";
		material = "Rubber";
		colour = "Red";
		ageRange = "kids";
		itemWeight = "300 Grams";
	}
}