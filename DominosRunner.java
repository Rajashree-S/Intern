class DominosRunner{
	
	public static void main(String a[]){
	
	String pizzaName = "The 4 Cheese Pizza";
	double pizza = Dominos.menuPizza(pizzaName);
	System.out.println( " The Cost of " + pizzaName + " is :" + pizza);
	
	int quantity = 4;
	double ref = Dominos.menuPizza(pizzaName , quantity);
	System.out.println( " The Cost of " + quantity + " " + pizzaName +" is :" + ref);

	
	}

}