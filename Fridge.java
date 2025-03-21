class Fridge{
	
	static boolean plugIn = false;
	static int temperature;
	static int highTemp = 7;
	static int lowTemp;
	
	
	public static void power(){
		
		if(plugIn == false){
			plugIn = true;
			System.out.println("The Fridge is on");
		}
		else{
			plugIn = false;
			System.out.println("The Fridge is off");
		}
		
		
	}
	public static void tempIncrease(){
		
		if(plugIn == true){
			if(temperature < highTemp){
				temperature = temperature + 1;
				System.out.println("The temperature is increased : "+temperature);
			}
			else{
				System.out.println("Reached Highest temperature!!!!!");
			}
		}
		else{
			System.out.println("The Fridge is off!!!!..");
		}
		
	}
	
	public static void tempDecrease(){
		
		if(plugIn == true){
			if(temperature > lowTemp){
				temperature = temperature - 1;
				System.out.println("The temperature is decreased : "+temperature);
			}
			else{
				System.out.println("Reached lowest temperature!!!!!");
			}
		}
		else{
			System.out.println("The Fridge is off!!!!..");
		}
		
	}
}