class Facebook{
	
	public static String logIn(String emailId , String password){
		
		String msg = null;
		if(emailId != null && password != null){
			msg = "Login successfull";
		}
		else{
			msg = "login Unsuccessfull";
		}
		return msg;
		
	}
	public static String logIn(long phoneNo , String password){
		
		String msg = null;
		if(phoneNo > 0 && password != null){
			msg = "Login successfull";
		}
		else{
			msg = "login Unsuccessfull.. Enter a valid details";
		}
		
		return msg;
	}


}