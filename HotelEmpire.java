class HotelEmpire{
	
	static String menuCard[] = {"Mini Salad","Green Salad","Chilli Kebab","Grilled Chicken","Chicken Biryani","Mutton Biryani","Egg Burji","Mutton Raan","Chicken Masala","Pepper Chicken"};
		
	
	public static void main(String args[]){
	
		System.out.println("main started");
		
		getMenuCard();
		
		System.out.println("main ended");
		
	
	}
		public static void getMenuCard(){
		
		System.out.println("Inside getMenuCard");
		System.out.println("The list of items in the menu card are:");
		
		for(String ref : menuCard){
			System.out.println(ref);
			
		}
		System.out.println("End of getMenuCard");
		}
	

}