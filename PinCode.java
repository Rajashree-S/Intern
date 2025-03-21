class PinCode{
	
	static int pinCodes[] = {560032,560001,560012,560011,560062,560013,560014,560002,560017,560072};
	
	public static void main(String args[]){
	
		
		System.out.println("Main Started");
			//invokaing of methodName
			getPinCodes();
		
		
		System.out.println("Main ended");
	
	}
	//<access-specifier> returnType methodName(Parameter 1,Parameter n){ //there can be n number ofparameters
		
			//logic
	//}
	public static void getPinCodes(){  //get can be replaced by fetch or read
		
		System.out.println("Inside getPinCodes");
		
		System.out.println("The List of Pincodes are:");
		
		for(int ref : pinCodes){
			System.out.println(ref);
		}
		System.out.println("End of getPinCodes");
	} 
}





//If there is a null variable there will be a error in the for loop part so u should start with a condition using a if statement.