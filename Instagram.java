class Instagram{
	
	public static String newUser(String fullName,String dob, String email, String phoneNumber){
	 
	 String msg = null;
	 
	 boolean validated = validate(fullName,dob,email,phoneNumber);
	 if(validated == true){
		 msg = "Successfully created";
	 }else{
		 msg = "SignUp Unsuccessfull";
	 }
	return msg;
	}
	
	public static boolean validate(String fullName, String dob, String email, String phoneNumber){
		
		boolean isValidate = false;
		boolean isFullName = false;
		boolean isDob = false;
		boolean isEmail = false;
		boolean isPhoneNumber = false;
		
		if(fullName != null && !fullName.isEmpty() && fullName.length() >= 3){
			isFullName = true;
		}else{
			System.out.println("Please provide the valid name");
		}
		
		if(dob != null && !dob.isEmpty()){
			isDob = true;
		}else{
			System.out.println("Please provide a valid date of birth..");
		}
		
		if(email != null && !email.isEmpty() && email.length() <= 35){
			isEmail = true;
		}else{
			System.out.println("Please provide the valid mailid");
		}
		
		if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10){
			isPhoneNumber = true;
		}else{
			System.out.println("Please provide the valid phone number");
		}
		
		if(isFullName == true && isDob == true && isEmail == true && isPhoneNumber == true){
			isValidata = true;
		}
		return isValidate;
	}
}