class Fan{
	
	static boolean isOnOrOff = false;
	static int speed;
	static int highSpeed = 5;
	static int lowSpeed;
	
	
	public static void onOrOff(){
		
		if(isOnOrOff == false){
			isOnOrOff = true;
			System.out.println("The Fan is On");
		}
		else{
			isOnOrOff = false;
			System.out.println("The Fan is off");
		}
		
		
	}
	public static void speedIncrease(){
		
		if(isOnOrOff == true){
			if(speed < highSpeed){
				speed = speed + 1;
				System.out.println("The Fan speed is : "+speed);
			}
			else{
				System.out.println("Reached High speed!!!!!");
			}
		}
		else{
			System.out.println("The Fan is Off!!!..");
		}
		
	}
	
	public static void speedDecrease(){
		
		if(isOnOrOff == true){
			if(speed > lowSpeed){
				speed = speed - 1;
				System.out.println("The Fan speed is : "+speed);
			}
			else{
				System.out.println("Reached low speed!!!!!");
			}
		}
		else{
			System.out.println("The Fan is Off!!!..");
		}
		
	} 
}