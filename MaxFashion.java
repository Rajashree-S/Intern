class MaxFashion{


	public static String signUp(String firstName , String lastName , String phoneNumber , String emailId , String dob , String gender){
		
		String ref = null;
		
		//validation
		boolean userIsValidated = validateUserProfile( firstName , lastName , phoneNumber ,  emailId ,  dob ,  gender);
		if(userIsValidated == true){
			ref = "User regestration Successfull";
		}else{
			ref = "User regestration unsuccessfull";
		}
		return ref;
	}
	
	// This is also called as method channing (from one method to another method)
	public static boolean validateUserProfile(String firstName , String lastName , String phoneNumber, String emailId , String dob , String gender ){
		//dummy variables 
		boolean userValid = false;
		boolean isFirstNameValid = false;
		boolean isLastNameValid = false;
		boolean isPhoneNumberValid = false;
		boolean isEmailIdValid = false;
		boolean isDobValid = false;
		boolean isGenderValid = false;
		
		
		if(firstName != null && !firstName.isEmpty() && firstName.length() >= 3){
			isFirstNameValid = true;
		} 
		else {
			System.out.println("The First Name is Invalid.. Please enter a valid First name");
		}
		if(lastName != null && !lastName.isEmpty() && lastName.length() >= 1){
			isLastNameValid = true;
		} 
		else {
			System.out.println("The Last Name is Invalid.. please enter a valid last name ");
		}
		if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() > 0 && phoneNumber.length() == 10){
			isPhoneNumberValid = true;
		} 
		else {
			System.out.println("The Phone Number is Invalid.. Please enter a valid phone number");
		}
		if(emailId != null && !emailId.isEmpty() ){
			isEmailIdValid = true;
		}
		else{
			System.out.println("The EmailId is Invalid.. Please enter a valid EmailId");
		}
		if(dob != null && !dob.isEmpty()){
			isDobValid = true;
		}
		else {
			System.out.println("The DOB is Invalid.. Please enter a valid DOB");
		}
		if(gender != null && !gender.isEmpty()){
			isGenderValid = true;
		}
		else {
			System.out.println("The Gender is Invalid.. Please enter a valid Gender");
		}
		
		if(isFirstNameValid == true && isLastNameValid == true && isPhoneNumberValid == true && isEmailIdValid == true && isDobValid == true && isGenderValid == true){
			userValid = true;
		}
		return userValid;
	}


}