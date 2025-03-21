class Patient{
	
		static int patientId = 1;
		static String name = "Alex";
		static String address = "Rt Nagar";
		
	public static void main(String args[]){
		
		System.out.println("The patient id is "+patientId);
		System.out.println("The patient name is "+name);
		System.out.println("The patient address is "+address);
		//patientId = 2;
		//name = "Carla";
		//address = "Yelahanka";
		updatedPatientDetails();
		System.out.println("The Updated Details are :");
		System.out.println("The patient id is "+patientId);
		System.out.println("The patient name is "+name);
		System.out.println("The patient address is "+address);
	
	}
	public static void updatedPatientDetails(){
		patientId = 2;
		name = "Carla";
		address = "Yelahanka";
		
	}
}