class PassportSevaRunner{
	
	public static void main(String a[]){
	//cpvLocation , dcdrLocation , givenName , surName , dob , email , emailLoginSame , loginId , pwd , confirmPwd
		String message = PassportSeva.newUserRegestration("Passport Office" , "Bengaluru" , "Carla" , "Smith" , "21/5/2001" , "carla12@gmail.com" , "carla12@gmail.com" , "carla123" , "12345678" , "12345678");
		System.out.println(message);
	}
}
