class ThreadsRunner{
	
	public static void main(String args[]){
		
		
		String emailLogIn = Threads.logIn("Harley" , "31/8/2001" ,  "harley@gmail.com" , "harley1234");
		System.out.println(emailLogIn);
		String phoneNoLoginIn = Threads.logIn("Harley" ,"31/8/2001" , 9809879870L , "harley1234");
		System.out.println(phoneNoLoginIn);
	
	}
}