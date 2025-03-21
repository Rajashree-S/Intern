class Amazon{
	public static String profileLogin(String firstName, String lastName, String dob, String email, String phoneNumber){
	
	String msg = null;
	boolean validation = validateUser(firstName,lastName,dob,email,phoneNumber);
	if(validation = true){
		msg = "Successfully login";
	}else{
		msg = "Oops!!! something went wrong";
	}
	return msg;
	}
	
	public static boolean validateUser(String firstName, String lastName, String dob, String email, String phoneNumber){
		
		boolean isValidateUser = false;
		boolean isFirstName= false;
		boolean isLastName = false;
		boolean isDob = false;
		boolean isEmail = false;
		boolean isPhoneNumber = false;
		
		if(firstName != null && !firstName.isEmpty() && firstName.length() >= 3){
			isFirstName = true;
		}else{
			System.out.println("Please provide the valid name");
		}
		
		if(lastName != null && !lastName.isEmpty() && lastName.length() >= 3){
			isLastName = true;
		}else{
			System.out.println("Please provide the valid name");
		}
		
		if(dob != null && !dob.isEmpty()){
			isDob = true;
		}
		else{
			System.out.println("Please provide the valid birthday date");
		}
		
		if(email != null && !email.isEmpty()){
			isEmail = true;
		}else{
			System.out.println("Please provide the valid mail id");
		}
		
		if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10){
			isPhoneNumber = true;
		}else{
			System.out.println("Please provide the valid phone number");
		}
		
		if(isFirstName == true && isLastName == true && isDob == true && isEmail == true && isPhoneNumber == true){
			isValidateUser = true;
		}
		return isValidateUser;
	}
}