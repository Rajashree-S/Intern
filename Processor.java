class Processor{
	
		static int processorId = 3;
		static String name = "Intel core i5";
		static String gen = "12th gen";
		static String clockSpeed = "3.3 GHz";
		
	public static void main(String args[]){
		
		System.out.println("Processor Id="+processorId);
		System.out.println("Processor Name="+name);
		System.out.println("Processor Generation="+gen);
		System.out.println("Processor clockSpeed="+clockSpeed);
		//processorId = 5;
		//name = "Intel core i3";
		//gen = "10th gen";
		//clockSpeed = "3.0 GHz";
		updatedProcessor();
		System.out.println("Upadted Details are :");
		System.out.println("Processor Id="+processorId);
		System.out.println("Processor Name="+name);
		System.out.println("Processor Generation="+gen);
		System.out.println("Processor clockSpeed="+clockSpeed);
	
	}
	public static void updatedProcessor(){
		processorId = 5;
		name = "Intel core i3";
		gen = "10th gen";
		clockSpeed = "3.0 GHz";
	}
}