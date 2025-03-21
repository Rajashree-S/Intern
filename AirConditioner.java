class AirConditioner{
	
	static boolean isConnected = false;
	static int currentTemperature;
	static int maxTemperature = 5;
	static int minTemperature;
	
	public static void onOrOff(){
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Ac is on");
		}
		else{
			isConnected = false;
			System.out.println("The ac is off");
		}
		return;
	}

	public static void increaseTemp(){
		
		
		if(isConnected == true){
			if(currentTemperature < maxTemperature){
				currentTemperature = currentTemperature + 1;
				System.out.println("The Current temperature = "+currentTemperature);
			}else
				System.out.println("Maximum temperature reached...");
		}else 
			System.out.println("Turn on the AC");
		
		
		return;
		
		
		
	}
	public static void decreaseTemp(){
		
		
		if(isConnected == true)
		{
			if(currentTemperature > minTemperature){
				currentTemperature = currentTemperature - 1;
				System.out.println("The Current temperature = "+currentTemperature);
			}else 
				System.out.println("Minimum temperature reached...");
		}else
			System.out.println("Turn on the AC ");
		
		
		return;
		
		
		
	}
	

	

	
}