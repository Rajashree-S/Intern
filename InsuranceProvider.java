class InsuranceProvider{
	
	public static double insurancePrice(String  insuranceName){
		
		double termPrice = 0.0;
		
		if(insuranceName == "HDFC" && !insuranceName.isEmpty()){
			termPrice = 8999.99;
		}
		else if(insuranceName == "Max Life Insurance" && !insuranceName.isEmpty()){
			termPrice = 7999.99;
		}
		else if(insuranceName == "ICIC Life Insurance" && !insuranceName.isEmpty()){
			termPrice = 10000.00;
		}
		else if(insuranceName == "SBI Life Insurance" && !insuranceName.isEmpty()){
			termPrice = 12999.99;
		}
		else if(insuranceName == "Kotak Life Insurance" && !insuranceName.isEmpty()){
			termPrice = 7599.99;
		}
		else if(insuranceName == "New India Assurance" && !insuranceName.isEmpty()){
			termPrice = 8500.00;
		}
		else if(insuranceName == "Shriram Life Insurance" && !insuranceName.isEmpty()){
			termPrice = 8250.00;
		}
		else if(insuranceName == "LIC" && !insuranceName.isEmpty()){
			termPrice = 10500.00;
		}
		else if(insuranceName == "Star Health Life Insurance" && !insuranceName.isEmpty()){
			termPrice = 6000.00;
		}
		else if(insuranceName == "Reliance General Life Insurance" && !insuranceName.isEmpty()){
			termPrice = 11500.00;
		}
		else {
			System.out.println(insuranceName + " Not found!!! Enter a valid Insurance Name" );
		}

		return termPrice;
	
	}


}