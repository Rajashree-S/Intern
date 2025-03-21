class Myntra{
	
	public static String profile(String fullName , String mobileNumber , String emailId , String location , String alternativeNumber ){
	
	String ref = null;
		
	boolean userIsValidated = validateProfile(fullName , mobileNumber , emailId , location , alternativeNumber);
	if(userIsValidated == true){
			ref = "User regestration Successfull";
		}else{
			ref = "User regestration unsuccessfull";
		}
		return ref;
	}
	public static boolean validateProfile(String fullName , String mobileNumber , String emailId , String location , String alternativeNumber){
		
		boolean userValidate = false;
		boolean isFullNameValidate = false;
		boolean isMobileNumberValidate = false;
		boolean isEmailIdValidate = false;
		boolean isLocationValidate = false;
		boolean isAlternativeNumberValidate = false;
		
		if(fullName != null && !fullName.isEmpty() && fullName.length() <= 15){
			isFullNameValidate = true;
		}else{
			System.out.println("");
		}
		if(mobileNumber != null && !mobileNumber.isEmpty() && mobileNumber.length() > 0 && mobileNumber.length() == 10){
			isMobileNumberValidate = true;
		}else{
			System.out.println("");
		}
		if(emailId != null && !emailId.isEmpty() && emailId.length() <= 35){
			isEmailIdValidate = true;
		}else{
			System.out.println("");
		}
		if(location != null && !location.isEmpty()){
			isLocationValidate = true;
		}else{
			System.out.println("");
		}
		if(alternativeNumber != null && !alternativeNumber.isEmpty() && alternativeNumber.length() > 0 && alternativeNumber.length() == 10){
			isAlternativeNumberValidate = true;
		}else{
			System.out.println("");
		}
		if(isFullNameValidate == true && isMobileNumberValidate == true && isEmailIdValidate == true && isLocationValidate == true && isAlternativeNumberValidate == true){
			userValidate = true;
		}
			
		return userValidate;	
	}
	
}