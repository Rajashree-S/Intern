class UberEats{
	
	public static String customerDetails(String phoneNo , String mailId , String firstName , String lastName , String location){
	String ref = null;
	
	boolean userIsValidated = customerValidate(phoneNo , mailId , firstName , lastName , location);
	if(userIsValidated == true){
			ref = "User regestration Successfull";
		}else{
			ref = "User regestration unsuccessfull";
		}
		return ref;
	
	}
	public static boolean customerValidate(String phoneNo , String mailId , String firstName , String lastName , String location){
	
		boolean validCustomer = false;
		boolean	isPhoneNoValid = false;
		boolean	isMailIdValid = false;
		boolean	isFirstNameValid = false;
		boolean	isLastNameValid = false;
		boolean	isLocationValid = false;
		
		if(phoneNo != null && !phoneNo.isEmpty() && phoneNo.length() > 0 && phoneNo.length() == 10 ){
			isPhoneNoValid = true;
		}else{
			System.out.println("The PhoneNumber is Invalid.. Please enter a valid PhoneNumber..");
		}
		if(mailId != null && !mailId.isEmpty() && mailId.length() <= 35){
			isMailIdValid = true;
		}else{
			System.out.println("The EmailId is Invalid.. Please enter a valid EmailId");
		}
		if(firstName != null && !firstName.isEmpty() && firstName.length() >= 3){
			isFirstNameValid = true;
		}else{
			System.out.println("The First Name is Invalid.. Please enter a valid First name");
		}
		if(lastName != null && !lastName.isEmpty() && lastName.length() >= 1){
			isLastNameValid = true;
		}else{
			System.out.println("The Last Name is Invalid.. please enter a valid last name ");
		}
		if(location != null && !location.isEmpty()){
			isLocationValid = true;
		}else{
			System.out.println("The Location is Invalid !! enter a valid location..");
		}
		if(isPhoneNoValid == true && isMailIdValid == true && isFirstNameValid == true && isLastNameValid == true && isLocationValid == true){
			validCustomer = true;
		}
		return validCustomer;
	}




}