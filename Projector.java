class Projector{
	
	static boolean isOnOrOff = false;
	static int channel;
	static int lastChannel = 5;
	static int firstChannel;
	
	
	public static void onOrOff(){
		
		if(isOnOrOff == false){
			isOnOrOff = true;
			System.out.println("The Projector is On");
		}
		else{
			isOnOrOff = false;
			System.out.println("The Projector is Off");
		}
		
		
	}
	public static void nextChannel(){
		
		if(isOnOrOff == true){
			if(channel < lastChannel){
				channel = channel + 1;
				System.out.println("The next channel is : "+channel);
			}
			else{
				System.out.println("Reached last channel!!!!!");
			}
		}
		else{
			System.out.println("The projector is off");
		}
		
	}
	
	public static void prevChannel(){
		
		if(isOnOrOff == true){
			if(channel > firstChannel){
				channel = channel - 1;
				System.out.println("The previous channel is  : "+channel);
			}
			else{
				System.out.println("Reached last channel!!!!!");
			}
		}
		else{
			System.out.println("The projector is off");
		}
		
	}
}