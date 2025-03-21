class LinkedInRunner{
	
	public static void main(String args[]){
		
		String emailLogIn = LinkedIn.signIn("Alex@gmail.com" , "Alex1234");
		System.out.println(emailLogIn);
		String phoneNoLoginIn = LinkedIn.signIn(9809879870L , "Alex1234");
		System.out.println(phoneNoLoginIn);
	
	}
}