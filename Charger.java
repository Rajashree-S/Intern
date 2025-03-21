class Charger{
	
		static int chargerId = 1;
		static String	color = "Black";
		static String	power = "230 Volts";
		static String	type = "USB Type C, USB Type A";
		static int price = 4799;
		static boolean	isWashable = false;
	public static void main(String args[]){
		
		System.out.println("Charger Id = "+chargerId);
		System.out.println("Charger color = "+color);
		System.out.println("Charger Power = "+power);
		System.out.println("Charger type = "+type);
		System.out.println("Charger price = "+price);
		System.out.println("Is the Charger Washable = "+isWashable);
		//chargerId = 3;
		//color = "White";
		//power = "300 Volts";
		//type = "USB Type C";
		//price = 3099;
		//isWashable = false;
		updatedChargerDetails();
		System.out.println("Upadted Details are :");
		System.out.println("Charger Id = "+chargerId);
		System.out.println("Charger color = "+color);
		System.out.println("Charger Power = "+power);
		System.out.println("Charger type = "+type);
		System.out.println("Charger price = "+price);
		System.out.println("Is the Charger Washable = "+isWashable);
	}
	public static void updatedChargerDetails(){
		chargerId = 3;
		color = "White";
		power = "300 Volts";
		type = "USB Type C";
		price = 3099;
		isWashable = false;
	}

}