class Weapon{
	
	
	Weapon(){
		this("Pistol",false);
	}
	
	Weapon(String type,boolean isEasyToUse){
		this(8070.95);
		this.type = type;
		this.isEasyToUse = isEasyToUse;
	}
	
	Weapon(double price){
		this(true,"5W");
		this.price = price;
	}
	
	Weapon(boolean isDurable,String power){
		this(true);
		this.isDurable = isDurable;
		this.power = power;
	}
	
	Weapon(boolean isPortable){
		this("15m");
		this.isPortable = isPortable;
	}
	
	Weapon(String range){
		this(154);
		this.range = range;
	}
	
	Weapon(int id){
		this.id = id;
	}
	
	
	int id;
	String range;
	String power;
	boolean isPortable;
	boolean isDurable;
	double price;
	String type;
	boolean isEasyToUse;
	
	
	public void getDetails(){
		System.out.println(id);
		System.out.println(range);
		System.out.println(power);
		System.out.println(isPortable);
		System.out.println(isDurable);
		System.out.println(price);
		System.out.println(type);
		System.out.println(isEasyToUse);
	}
}