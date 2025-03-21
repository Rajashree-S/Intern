class Dmart{
	
	public static void main(String args[]){
	
		String stationary[] = {"Pens" , "Pencils" , "Markers" , "Tape" , "Files" } ;
		String fruits[] = {"Apple" , "Mango" , "Banana" , "Chikku" , "Avacado" , "Oranges" };
		String alcohols[] = {"Black&White","MH","OldMonk"};
		String vegetables[] = {"Capsicum" , "Onion" , "Carrot" , "Beetroot" , "Potato" , "Beans" , "Chillies" , "Tomato"};
		
		System.out.println("The total number of stationary :"+stationary.length);
		System.out.println("List of Stationary available are ");
		System.out.println(stationary[0] + " " + stationary[1] + " " + stationary[2] + " " + stationary[3] + " " + stationary[4]);
		
		System.out.println("The total number of Fruits :"+fruits.length);
		System.out.println("List of Fruits available are ");
		System.out.println(fruits[0] + " " + fruits[1] + " " + fruits[2] + " " + fruits[3] + " " +fruits[4] + " " +fruits[5]);
		
		System.out.println("The total number of alcohols :"+alcohols.length);
		System.out.println("List of alcohols available are ");
		System.out.println(alcohols[0] + " " + alcohols[1] + " " + alcohols[2]);
		
		System.out.println("The total number of Vegetables :"+vegetables.length);
		System.out.println("List of Vegetables available are ");
		System.out.println(vegetables[0] + " " + vegetables[1] + "" + vegetables[2] + " " + vegetables[3] + " " + vegetables[4] + " " + vegetables[5] + " " + vegetables[6] + " " +  vegetables[7]);
	}

}