class Airport{
	
		static int airportId = 5;
		static String name = "Kempegowda International Airport";
		static int noOfTerminals = 2;
		static String type = "international and domestic airport";
		
	public static void main(String args[]){
		
		System.out.println("Airport Id="+airportId);
		System.out.println("Airport name="+name);
		System.out.println("Airport No Of Terminals="+noOfTerminals);
		System.out.println("Airport type="+type);
		//airportId = 3;
		//name = "Chennai Airport";
		//noOfTerminals = 2;
		//type = "international and domestic airport";
		updatedAirportDetails();
		System.out.println("The Updated Details are :");
		System.out.println("Airport Id="+airportId);
		System.out.println("Airport name="+name);
		System.out.println("Airport No Of Terminals="+noOfTerminals);
		System.out.println("Airport type="+type);
	}
	public static void updatedAirportDetails(){
		airportId = 3;
		name = "Chennai Airport";
		noOfTerminals = 2;
		type = "international and domestic airport";
	}
	
}