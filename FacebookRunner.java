class FacebookRunner{
	
	public static void main(String args[]){
		
		String emailLogIn = Facebook.logIn("nancy@gmail.com" , "nancy1234");
		System.out.println(emailLogIn);
		String phoneNoLoginIn = Facebook.logIn(9809879870L , "nancy1234");
		System.out.println(phoneNoLoginIn);
	
	}

}