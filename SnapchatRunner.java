class SnapchatRunner{
	
	public static void main(String args[]){
		
		
		String emailLogIn = Snapchat.logIn("Harley" , "harley@gmail.com" , "harley1234");
		System.out.println(emailLogIn);
		String phoneNoLoginIn = Snapchat.logIn("harley" , 9809879870L , "harley1234");
		System.out.println(phoneNoLoginIn);
	
	}
}