class Flipkartchaining
{
// Constructor chaining---
	// Non - Parameterized constructor
	Flipkartchaining(){
		this("Charles" , "charles@123");
		//Flipkart Non - Parameterized constructor is Invoked
	}
	
	//2 Parameterized constructor with (String, String)
	Flipkartchaining(String name , String password){
		this(8645127390L);
		this.name = name;
		this.password = password;
		//Flipkart 2 Parameterized constructor with (String ,String );
	}
	
	// 1 Parameterized constructor with long
	Flipkartchaining(long phoneNumber){
		this(1);
		this.phoneNumber = phoneNumber;
		//Flipkart 1 Parameterized constructor with long
	}
	
	// 1 Parameterized constructor with int
	Flipkartchaining(int id){
		this.id = id;
		//Flipkart 1 Parameterized constructor with int
	}
	
	// instance variable
	int id;
	String name;
	long phoneNumber;
	String password;
	
	public void displayUserDetails(){
		
		System.out.println("User Id:"+id);
		System.out.println("User Name:"+name);
		System.out.println("User Phone Number:"+phoneNumber);
		System.out.println("User Password:"+password);
	}
}