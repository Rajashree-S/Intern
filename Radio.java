class Radio{
	
	static boolean isOnOrOff = false;
	static int frequency;
	static int nextFrequency = 6;
	static int prevFrequency;
	
	
	public static void onOrOff(){
		
		if(isOnOrOff == false){
			isOnOrOff = true;
			System.out.println("The Radio is On");
		}
		else{
			isOnOrOff = false;
			System.out.println("The Radio is off");
		}
		
		
	}
	public static void volumeIncrease(){
		
		if(isOnOrOff == true){
			if(frequency < nextFrequency){
				frequency = frequency + 1;
				System.out.println("The Next Frequency is : "+frequency);
			}
			else{
				System.out.println("Reached last frequency!!!!!");
			}
		}
		else{
			System.out.println("The radio is Off!!!..");
		}
		
	}
	
	public static void volumeDecrease(){
		
		if(isOnOrOff == true){
			if(frequency > prevFrequency){
				frequency = frequency - 1;
				System.out.println("The previous frequency is : "+frequency);
			}
			else{
				System.out.println("Reached last frequency!!!!!");
			}
		}
		else{
			System.out.println("The radio is Off!!!..");
		}
		
	} 
}