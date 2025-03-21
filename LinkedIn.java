class LinkedIn{
	
	public static String signIn(String emailId , String password){
		
		String logIn = null;
		if(emailId != null && password != null){
			logIn = "Login successfull";
		}
		else{
			logIn = "login Unsuccessfull";
		}
		return logIn;
		
	}
	public static String signIn(long phoneNo , String password){
		
		String logIn = null;
		if(phoneNo > 0 && password != null){
			logIn = "Login successfull";
		}
		else{
			logIn = "login Unsuccessfull.. Enter a valid details";
		}
		
		return logIn;
	}
}