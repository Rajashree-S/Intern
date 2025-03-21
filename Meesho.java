class Messho{
	
	public static String userLogin(String fullName, String phoneNumber, String dob, String password, String conformPassword){
	String msg = null;
	boolean validated = validateUser(fullName,phoneNumber,dob,password,conformPassword);
	
	if(validated == true){
		msg = "SignUp Successfull";
	}else{
		msg = "SignUp UnSuccessfull";
	}
	return msg;
}
	
	public static boolean validateUser(String fullName, String phoneNumber, String dob, String password, String conformPassword ){
		
		boolean isValidateUser = false;
		boolean isFullName = false;
		boolean isPhoneNumber = false;
		boolean isDob = false;
		boolean isPassword = false;
		boolean isConformPassword = false;
		
		if(fullName != null && !fullName.isEmpty() && fullName.length() <= 23){
			isFullName = true;
		}else{
			System.out.println("Invaild name, Please provide the valid name");
		}
		
		if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10){
			isPhoneNumber = true;
		}else{
			System.out.println("Invaild phoneNumber, Please enter a valid phoneNumber");
		}
		
		if(dob != null && !dob.isEmpty()){
			isDob = true;
		}else{
			System.out.println("Please provide a valid date of birth..");
		}
		
		if(password != null && !password.isEmpty() && password.length() >= 8){
			isPassword = true;
		}else{
			System.out.println("Invaild password, Please enter a valid password");
		}
		
		if(conformPassword != null && !conformPassword.isEmpty() && conformPassword == password){
			isConformPassword = true;
		}else{
			System.out.println("Invaild conformPassword, Please enter a valid conformPassword");
		}
		
		if(isFullName == true && isPhoneNumber == true && isDob == true && isPassword == true && isConformPassword == true){
			isValidateUser = true;
		}
	return isValidateUser;
	}
}