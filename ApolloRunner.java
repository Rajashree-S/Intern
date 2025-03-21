class ApolloRunner{
	
	
	public static void main(String a[]){
	
	String medName = "Thermometers";
	double med = Apollo.medicine(medName);
	System.out.println( " The Cost of " + medName + " is :" + med);

	int medQuantity = 2;
	double ref = Apollo.medicine(medName , medQuantity);
	System.out.println( " The Cost of " + medQuantity + " " + medName +" is :" + ref);
	
	}

}

