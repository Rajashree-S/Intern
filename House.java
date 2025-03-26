class House{
	
	
	
	House(){
		this("tiles" , 300);
	}
	
	House(String roofing , int size){
		this("Modern");
		this.roofing = roofing;
		this.size = size;
	}
	House(String style){
		this(true);
		this.style = style;
	}
	House(boolean isDustProof){
		this(120000.00);
		this.isDustProof = isDustProof;
	}
	House(double price){
		this("abi nillam","Rt nagar");
		this.price = price;
	}
	House(String houseName , String location){
		this(1);
		this.houseName = houseName;
		this.location = location;
	}
	House(int id){
		this.id = id;
	}
	
	int id;
	String houseName;
	String location;
	double price;
	boolean isDustProof;
	String style;
	String roofing;
	int size;
	
	public void houseDetails(){
	
	System.out.println(id);
	System.out.println(houseName);
	System.out.println(location);
	System.out.println(price);
	System.out.println(isDustProof);
	System.out.println(style);
	System.out.println(roofing);
	System.out.println(size);
	}


}