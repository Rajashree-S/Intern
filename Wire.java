class Wire{
	
	
	Wire(){
		this("Copper" , 3);
	}
	
	Wire(String resistance , int thickness){
		this("PVC" , "210C");
		this.resistance = resistance;
		
	}
	Wire(String insulation , String temperature){
		this("Copper");
		this.insulation =insulation;
		this.temperature = temperature;
	}
	Wire(String material){
		this(true);
		this.material = material;
	}
	Wire(boolean isDuriable){
		this(120.00);
		this.isDuriable = isDuriable;
	}
	Wire(double price){
		this(1);
		this.price = price;
	}
	Wire(int id){
		this.id = id;
	}
	
	int id;
	double price;
	boolean isDuriable;
	String material;
	String insulation;
	String temperature;
	String resistance;
	int thickness;
	
	public void wireDetails(){
		
	System.out.println(id);
	System.out.println(price);
	System.out.println(isDuriable);
	System.out.println(material);
	System.out.println(insulation);
	System.out.println(temperature);
	System.out.println(resistance);
	System.out.println(thickness);

	}

}