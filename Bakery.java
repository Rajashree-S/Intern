class Bakery{
	
	static String name = "Pooja Bakery";
	static int yearOpened = 1997;
	static String items = "Cake,icecream,choclates,puffs.";
	
	public static void main(String args[]){
	
		System.out.println("The name of the bakery is "+name);
		System.out.println("The year of opening is "+yearOpened);
		System.out.println("The items are :"+items);
		//name = "Iyengar Bakery";
		//yearOpened = 2001;
		//items = "Cake,icecream,choclates,puffs and juice.";
		updatedBakery();
		System.out.println("The Updated details are ");
		System.out.println("The name of the bakery is "+name);
		System.out.println("The year of opening is "+yearOpened);
		System.out.println("The items are :"+items);
		
	
	}
	public static void updatedBakery(){
		name = "Iyengar Bakery";
		yearOpened = 2001;
		items = "Cake,icecream,choclates,puffs and juice.";
		
	}


}