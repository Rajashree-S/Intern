class Snapchat{
	
	public static String logIn(String fullName ,String emailId , String password){
		
		String message = null;
		if(fullName != null && emailId != null && password != null){
			message = "Login successfull";
		}
		else{
			message = "login Unsuccessfull";
		}
		return message;
		
	}
	public static String logIn(String fullName , long phoneNo , String password){
		
		String message = null;
		if(fullName != null && phoneNo > 0 && password != null && password.length() >= 8){
			message = "Login successfull";
		}
		else{
			message = "login Unsuccessfull.. Enter valid details";
		}
		
		return message;
	}
}