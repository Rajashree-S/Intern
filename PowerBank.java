class PowerBank{
		
		static String connectorType = "USB, USB Type C, USB Type A";
		static String brand = "URBN";
		static int batteryCapacity = 20000; 
		static String color = "Black";
	public static void main(String args[]){
		
		
		System.out.println("PowerBank connectorType = "+connectorType);
		System.out.println("PowerBank brand = "+brand);
		System.out.println("PowerBank batteryCapacity = "+batteryCapacity);
		System.out.println("PowerBank color = "+color);
		connectorType = "USB, USB Type C";
		//brand = "Boat";
		//batteryCapacity = 20000; 
		//color = "Yellow";
		updatedPowerBank();
		System.out.println("Upadted Details are :");
		System.out.println("PowerBank connectorType = "+connectorType);
		System.out.println("PowerBank brand = "+brand);
		System.out.println("PowerBank batteryCapacity = "+batteryCapacity);
		System.out.println("PowerBank color = "+color);
		
	}
	public static void updatedPowerBank(){
		connectorType = "USB, USB Type C";
		brand = "Boat";
		batteryCapacity = 20000; 
		color = "Yellow";
	}
}