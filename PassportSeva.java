class PassportSeva{

	public static String newUserRegestration(String cpvLocation , String dcdrLocation , String givenName , String surName , String dob , String email , String emailLoginSame , String loginId , String pwd , String confirmPwd){
	
	String ref = null;
	
	boolean register = validationRegestration(cpvLocation , dcdrLocation , givenName , surName , dob , email , emailLoginSame , loginId , pwd , confirmPwd);
	if(register == true){
		ref = "Registration Successfull";
	} else {
		ref = "Registration UnSuccessfull";
	}
	return ref;
	}
	
	public static boolean validationRegestration(String cpvLocation , String dcdrLocation , String givenName , String surName , String dob , String email , String emailLoginSame , String loginId , String pwd , String confirmPwd){
									
		boolean userValidate = false;
		boolean isCpvLocationValid = false;
		boolean	isDcdrLocationValid = false;
		boolean isGivenNameValid = false;
		boolean isSurNameValid = false;
		boolean isDobValid = false;
		boolean isEmailValid = false;
		boolean isEmailLoginSameValid = false;
		boolean isLoginIdValid = false;
		boolean isPwdValid = false;
		boolean isConfirmPwdValid = false;
		
		if(cpvLocation != null && !cpvLocation.isEmpty() && (cpvLocation == "CPV Delhi" || cpvLocation == "Passport Office")){
			isCpvLocationValid = true;
		}else{
			System.out.println("Invalid Location!!!!");
		}
		if(dcdrLocation != null && !dcdrLocation.isEmpty()){
			isDcdrLocationValid = true;
		}else{
			System.out.println("Invalid Location!!!!");
		}
		if(givenName != null && !givenName.isEmpty() && givenName.length() <= 45){
			isGivenNameValid = true;
		}else{
			System.out.println("Invalid Name!!.. Enter a Valid Name");
		}
		if(surName != null && !surName.isEmpty() && surName.length() <= 45){
			isSurNameValid = true;
		}else{
			System.out.println("Invalid SurName!!.. Enter a Valid SurName");
		}
		if(dob != null && !dob.isEmpty()){
			isDobValid = true;
		}else{
			System.out.println("Invalid DOB!!.. Enter a Valid DOB");
		}
		if(email != null && !email.isEmpty() && email.length() <= 35){
			isEmailValid = true;
		}else{
			System.out.println("Invalid Email!!.. Enter a Valid Email");
		}
		if(emailLoginSame != null && emailLoginSame.length() <= 35 && emailLoginSame == email){
			isEmailLoginSameValid = true;
		}else{
			System.out.println("Enter New EmailId...");
		}
		if(loginId != null && !loginId.isEmpty() && loginId.length() <= 15){
			isLoginIdValid = true;
		}else{
			System.out.println("Invalid LoginId!!.. Enter a Valid LoginId");
		}
		if(pwd != null && !pwd.isEmpty() && pwd.length() >= 8 && pwd.length() <= 12){
			isPwdValid = true;
		}else{
			System.out.println("Invalid Password!!!..Enter a new Password ");
		}
		if(confirmPwd == pwd && !confirmPwd.isEmpty()){
			isConfirmPwdValid = true;
		}else{
			System.out.println("The password doesnt match!!!!");
		}
		if(isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValid == true && isSurNameValid == true && isDobValid == true && isEmailValid == true && isEmailLoginSameValid == true && isLoginIdValid == true && isPwdValid == true && isConfirmPwdValid == true){
			userValidate = true;
		}
		return userValidate;
	
	}


}
