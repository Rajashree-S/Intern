class X{
	
	
	public static String userRegister(String name , String emailId , String dateOfBirth){
	
	String ref = null;
	
	boolean registerValidate = validateUserRegister(name , emailId , dateOfBirth);
	if(registerValidate == true){
		ref = "USER REGISTRATION SUCCESSFULL!!";
	}else{
		ref = "USER REGISTRATION UNSUCCESSFULL!!";
	}
	return ref;
	
	}
	
	public static boolean validateUserRegister(String name , String emailId , String dateOfBirth){
		
		boolean userValidate = false;
		boolean isNameValidate = false;
		boolean isEmailIdValidate = false;
		boolean isDateOfBirthValidate = false;
		
		if(name != null && !name.isEmpty() && name.length() >= 3){
			isNameValidate = true;
		} else {
			System.out.println("Invalid Name!!!.. Please Enter a Valid Name..");
		}
		if(emailId != null && !emailId.isEmpty() && emailId.length() >=5 && emailId.length() <= 15 ){
			isEmailIdValidate = true;
		} else {
			System.out.println("Invalid EmailId!!!.. Please Enter a Valid EmailId..");
		}
		if(dateOfBirth != null && !dateOfBirth.isEmpty()){
			isDateOfBirthValidate = true;
		} else {
			System.out.println("Invalid DateOfBirth!!!.. Please Enter a Valid DateOfBirth..");
		}
		if(isNameValidate == true && isEmailIdValidate == true && isDateOfBirthValidate == true){
			userValidate = true;
		}
		return userValidate;
		
	}


}