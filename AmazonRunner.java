class AmazonRunner{
	
	public static void main(String args[]){
		
		Amazon ref = new Amazon();
		ref.id = 1;
		ref.yourName = "Alex";
		ref.phoneNumber = "9898980087";
		ref.password = "alex1234";
		
		System.out.println("The id is : "+ref.id);
		System.out.println("The name is :"+ref.yourName);
		System.out.println("The phone number of "+ ref.yourName + " is " +ref.phoneNumber);;
		System.out.println("The password is : "+ref.password);
		System.out.println();
		System.out.println();
		
		Amazon anotherRef = new Amazon();
		anotherRef.id = 2;
		anotherRef.yourName = "Pooja";
		anotherRef.phoneNumber = "9879879870";
		anotherRef.password = "pooja.123";
		
		System.out.println("The id is : "+anotherRef.id);
		System.out.println("The name is :"+anotherRef.yourName);
		System.out.println("The phone number of "+ anotherRef.yourName + " is " +anotherRef.phoneNumber);
		System.out.println("The password is :" +anotherRef.password);
		System.out.println();
		
	}
	
}