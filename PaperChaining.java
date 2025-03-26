class PaperChaining{
	
	PaperChaining(){
		this("2gms" , 10);
	}
		
	PaperChaining(String thickness , int price){
		this( "White" , "Smooth"  );
		this.thickness = thickness;
		this.price = price;
	}
	PaperChaining( String color , String texture ){
		this("Bright white");
		this.color = color;
		this.texture = texture;
	
	}
	
	PaperChaining(String brightness){
		this(1 );
		this.brightness = brightness;
	}
	
	PaperChaining(int id ){
		this.id = id;
	}
	
	int id;
	String thickness;
	String texture;
	String color;
	String brightness;
	int price;

	public void paperDetails(){
		
		System.out.println("The id is : "+id);
		System.out.println("The thickness of paper is : "+thickness);
		System.out.println("The texture of paper is : "+texture);
		System.out.println("The color of paper is : "+color);
		System.out.println("The brightness of paper is : "+brightness);
		System.out.println("The price of paper is : "+price);
	}
}