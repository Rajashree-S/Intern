class Road{
	
	
	Road(){
		this(true , true);
	}
	Road(boolean isTraffic , boolean isCrosswalkAvailable){
		this("Concrete" , "80kmh");
		this.isTraffic = isTraffic;
		this.isCrosswalkAvailable = isCrosswalkAvailable;
	}
	Road(String surfaceType , String speedLimit){
		this(3 , 5);
		this.surfaceType = surfaceType;
		this.speedLimit = speedLimit;
	}
	Road(int noOfIntersections , int noOfSigns){
		this("Single-lane");
		this.noOfIntersections = noOfIntersections;
		this.noOfSigns = noOfSigns;
	}
	Road(String width){
		this(true);
		this.width = width;
		
	}
	Road(boolean isInUse){
		this(1);
		this.isInUse = isInUse;
	}
	Road(int id){
		this.id = id;
	}
	
	int id;
	boolean isInUse;
	String width;
	int noOfIntersections;
	String surfaceType;
	int noOfSigns;
	String speedLimit;
	boolean isTraffic;
	boolean isCrosswalkAvailable;
	
	public void roadDetails(){
		
	System.out.println(id);
	System.out.println(isInUse);
	System.out.println(width);
	System.out.println(noOfIntersections);
	System.out.println(surfaceType);
	System.out.println(noOfSigns);
	System.out.println(speedLimit);
	System.out.println(isTraffic);
	System.out.println(isCrosswalkAvailable);
	}
	

}