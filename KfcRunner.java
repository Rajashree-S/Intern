class KfcRunner{
	
	public static void main(String a[]){
	
	String name = "Popcorn Chicken Rice Bowl";
	double pro = Kfc.menu(name);
	System.out.println( " The Cost of " + name + " is :" + pro);
	
	int quantity = 3;
	double ref = Kfc.menu(name , quantity);
	System.out.println( " The Cost of " + quantity + " " + name +" is :" + ref);
	
	
	
	}
 
}

