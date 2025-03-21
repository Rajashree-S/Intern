class Facebook{
	
	public static String register(String firstName)
	{
		String message = null ;
		if(firstName != null ){
			
			message = "Regestration successfull";
		}else{
			
			message = "Regestration unsuccessfull";
		}
		return message;
	
	}


}