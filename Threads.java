class Threads{
	
	public static String logIn(String fullName , String dob ,String emailId , String password){
		
		String message = null;
		if(fullName != null && dob != null && emailId != null && password != null){
			message = "Login successfull";
		}
		else{
			message = "login Unsuccessfull";
		}
		return message;
		
	}
	public static String logIn(String fullName , String dob , long phoneNo , String password){
		
		String message = null;
		if(fullName != null && dob != null && phoneNo > 0 && password != null && password.length() >= 8){
			message = "Login successfull";
		}
		else{
			message = "login Unsuccessfull.. Enter valid details";
		}
		
		return message;
	}
}