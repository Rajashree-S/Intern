class FoodPandaRunner{
	
	
	public static void main(String a[]){
	
	String name = "wontons";
	double pro = FoodPanda.items(name);
	System.out.println( " The Cost of " + name + " is :" + pro);
	
	int itemQuantity = 6;
	double ref = FoodPanda.items(name , itemQuantity);
	System.out.println( " The Cost of " + itemQuantity + " " + name +" is :" + ref);
	
	
	
	}

}

