class BlinkitRunner{
	
	public static void main(String a[]){
	
	String productName = "Coco cola";
	double pro = Blinkit.products(productName);
	System.out.println( " The Cost of " + productName + " is :" + pro);
	
	int productQuantity = 5;
	double msg = Blinkit.products(productName , productQuantity);
	System.out.println( " The Cost of " + productQuantity + " " + productName +" is :" + msg);
	
	
	
	}

}
