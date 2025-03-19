class Pinterest{
	
	public static String signUp(String emailId , String password , String dob){
		
		String ref = null;
		
	boolean userIsValidated = registrationValidation(emailId , password , dob);
	if(userIsValidated == true){
			ref = "User regestration Successfull";
		}else{
			ref = "User regestration unsuccessfull";
		}
		return ref;
	}
	public static boolean registrationValidation(String emailId , String password , String dob){
	
		boolean userValid = false;
		boolean isEmailIdValid = false;
		boolean isPasswordValid = false;
		boolean isDobValid = false;
		
		if(emailId != null && !emailId.isEmpty() && emailId.length() <= 35){
			isEmailIdValid = true;
		}else{
			System.out.println("Invalid Email!!.. Enter a Valid Email");
		}
		if(password != null && !password.isEmpty() && password.length() >= 8 && password.length() <= 12){
			isPasswordValid = true;
		}else{
			System.out.println("Invalid Password!!!..Enter a new Password ");
		}
		if(dob != null && !dob.isEmpty()){
			isDobValid = true;
		}else{
			System.out.println("Invalid DOB!!.. Enter a Valid DOB");
		}
		if(isEmailIdValid == true && isPasswordValid == true && isDobValid == true){
			userValid = true;
		}
		return userValid;
	}


}