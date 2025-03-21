class Calculator{
	
	
	public static void add(int newNumber , int anotherNumber){
		System.out.println("Addition of 2 numbers");
		int total = newNumber + anotherNumber;
		System.out.println("The Addition "+ newNumber + " and " + anotherNumber + " is : " + total);
	
	}
	public static void subtract(int newNumber , int anotherNumber){
		System.out.println("Subtraction of 2 numbers");
		int total = newNumber - anotherNumber;
		System.out.println("The Subtraction "+ newNumber + " and " + anotherNumber + " is : " + total);
		
	}
	public static void multiply(int newNumber , int anotherNumber){
		System.out.println("Multiplication of 2 Numbers");
		int total = newNumber * anotherNumber;
		System.out.println("The Multiplication "+ newNumber + " and " + anotherNumber + " is : " + total);
		
	}
	public static void divide(int newNumber , int anotherNumber){
		System.out.println("Division of 2 Numbers");
		int total = newNumber / anotherNumber;
		System.out.println("The Division "+ newNumber + " and " + anotherNumber + " is : " + total);
		
	}
	public static void modulus(int newNumber , int anotherNumber){
		System.out.println("Modulus of 2 Numbers");
		int total = newNumber % anotherNumber;
		System.out.println("The Modulus "+ newNumber + " and " + anotherNumber + " is : " + total);
		
	}



}