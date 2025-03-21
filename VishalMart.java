class VishalMart{
		static String vegetables[] = {"Capsicum" , "Onion" , "Carrot" , "Beetroot" , "Potato" , "Beans" , "Chillies" , "Brinjal","Bitter Guard","Cabbage"};
		static String groceries[] = {"Rice","Bread","Eggs","Milk","Butter","Panner","Oats","Oil","Salt","Sugar"};
		static String perfumes[] = {"Fogg","Wild Stone","Park Avenue","Ustraa","Body Cupid","Denver","Axe Signature","Renee","Bella Vita","Skinn"};
		static String biscuits[] = {"Parle-G","Good Day","Hide & Seek","Jim Jam","50-50","Dark Fantasy","Marie Light","Mom's Magic","Oreo","Unibic"};
		static String utensils[] = {"Frying Pan","Saucepan","Pressure Cooker","Tava","Kadai","Grater","Plates","Glasses","Knives","Spoons"};
		
	public static void main(String mart[]){
	
		
		System.out.println("main started");
		
		getMart();
		
		System.out.println("main ended");
		
		}
	public static void getMart(){
		
		System.out.println("The total list of Vegetables :");
		
		for(String veg : vegetables){
			System.out.println(veg);
		}
		
		System.out.println("The total list of groceries :");
		
		for(String groc : groceries){
			System.out.println(groc);
		}
		
		System.out.println("The total list of perfumes :");
		
		for(String pref : perfumes){
			System.out.println(pref);
		}
		
		System.out.println("The total list of biscuits :");
		
		for(String bis : biscuits){
			System.out.println(bis);
		}
		
		System.out.println("The total list of utensils :");
		
		for(String uten : utensils){
			System.out.println(uten);
		}
	}
}