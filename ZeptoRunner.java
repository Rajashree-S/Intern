class ZeptoRunner{
	
	public static void main(String a[]){
	
	String foodName = "Fried Momos";
	double food = ZeptoCafe.cafe(foodName);
	System.out.println( " The Cost of " + foodName + " is :" + food);

	int foodQuantity = 5;
	double ref = ZeptoCafe.cafe(foodName , foodQuantity);
	System.out.println( " The Cost of " + foodQuantity + " " + foodName +" is :" + ref);
	
	}

}