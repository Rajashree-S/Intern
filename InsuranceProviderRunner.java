class InsuranceProviderRunner{
	
	public static void main(String a[]){
	
	String insuranceName = "LIC";
	double ref = InsuranceProvider.insurancePrice(insuranceName);
	System.out.println( " The Term Price for " + insuranceName + " is :" + ref);
	
	}

}