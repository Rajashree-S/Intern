class Speaker{
	
	static boolean isConnected = false;
	static int volume;
	static int highVolume = 25;
	static int lowVolume;
	
	
	public static void connect(){
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Speakers are connected");
		}
		else{
			isConnected = false;
			System.out.println("The speakers Disconnected");
		}
		
		
	}
	public static void volumeIncrease(){
		
		if(isConnected == true){
			if(volume < highVolume){
				volume = volume + 1;
				System.out.println("The volume is increased : "+volume);
			}
			else{
				System.out.println("Reached Highest Volume!!!!!");
			}
		}
		else{
			System.out.println("The speakers are not Connected!!!..");
		}
		
	}
	
	public static void volumeDecrease(){
		
		if(isConnected == true){
			if(volume > lowVolume){
				volume = volume - 1;
				System.out.println("The volume is decreased : "+volume);
			}
			else{
				System.out.println("Reached Highest Volume!!!!!");
			}
		}
		else{
			System.out.println("The speakers are not Connected!!!..");
		}
		
	}

}