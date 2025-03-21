class Apollo{
	
	public static double medicine(String medName){
		
		double medPrice = 0.0;
		
		if(medName == "paracetamol" && !medName.isEmpty()){
			medPrice = 20.00;
			return medPrice;
		}
		else if(medName == "bandages" && !medName.isEmpty()){
			medPrice = 50.00;
			return medPrice;
		}
		else if(medName == "antiseptic creams" && !medName.isEmpty()){
			medPrice = 40.00;
			return medPrice;
		}
		else if(medName == " test strips" && !medName.isEmpty()){
			medPrice = 50.00;
			return medPrice;
		}
		else if(medName == "glucose meterss" && !medName.isEmpty()){
			medPrice = 60.00;
			return medPrice;
		}
		else if(medName == "eye drops" && !medName.isEmpty()){
			medPrice = 50.00;
			return medPrice;
		}
		else if(medName == "contact lens solutions" && !medName.isEmpty()){
			medPrice = 60.00;
			return medPrice;
		}
		else if(medName == "colic relief" && !medName.isEmpty()){
			medPrice = 70.00;
			return medPrice;
		}
		else if(medName == "fever reducers" && !medName.isEmpty()){
			medPrice = 120.00;
			return medPrice;
		}
		else if(medName == "Thermometers" && !medName.isEmpty()){
			medPrice = 340.00;
			return medPrice;
		}
		else if(medName == "Glucometers " && !medName.isEmpty()){
			medPrice = 1000.00;
			return medPrice;
		}
		else if(medName == "Hearing Aids" && !medName.isEmpty()){
			medPrice = 670.00;
			return medPrice;
		}
		else if(medName == " sanitary products" && !medName.isEmpty()){
			medPrice = 290.00;
			return medPrice;
		}
		else if(medName == "antacids" && !medName.isEmpty()){
			medPrice = 92.00;
			return medPrice;
		}
		else if(medName == "laxatives" && !medName.isEmpty()){
			medPrice = 92.00;
			return medPrice;
		}
		else if(medName == "Cough Syrup" && !medName.isEmpty()){
			medPrice = 120.00;
			return medPrice;
		}
		else if(medName == "Fish body oil" && !medName.isEmpty()){
			medPrice = 340.00;
			return medPrice;
		}
		else if(medName == "BP monitor" && !medName.isEmpty()){
			medPrice = 1200.00;
			return medPrice;
		}
		else if(medName == "Toothpaste" && !medName.isEmpty()){
			medPrice = 130.00;
			return medPrice;
		}
		else if(medName == "Mouth wash" && !medName.isEmpty()){
			medPrice = 210.00;
			return medPrice;
		}
		else if(medName == "Serum" && !medName.isEmpty()){
			medPrice = 380.00;
			return medPrice;
		}
		else if(medName == "Soaps" && !medName.isEmpty()){
			medPrice = 90.00;
			return medPrice;
		}
		else if(medName == "Moistueriser" && !medName.isEmpty()){
			medPrice = 110.00;
			return medPrice;
		}
		else if(medName == "sunscreen" && !medName.isEmpty()){
			medPrice = 90.00;
			return medPrice;
		}
		else if(medName == "Deodorants " && !medName.isEmpty()){
			medPrice = 56.00;
			return medPrice;
		}
		else if(medName == "Antiperspirants" && !medName.isEmpty()){
			medPrice = 74.00;
			return medPrice;
		}
		else if(medName == "face masks" && !medName.isEmpty()){
			medPrice = 86.00;
			return medPrice;
		}
		else if(medName == "gloves" && !medName.isEmpty()){
			medPrice = 180.00;
			return medPrice;
		}
		else if(medName == "tampons" && !medName.isEmpty()){
			medPrice = 230.00;
			return medPrice;
		}
		else if(medName == "diapers" && !medName.isEmpty()){
			medPrice = 650.00;
			return medPrice;
		}
		else if(medName == "Nebulizers" && !medName.isEmpty()){
			medPrice = 890.00;
			return medPrice;
		}
		else if(medName == "Oxygen Concentrator" && !medName.isEmpty()){
			medPrice = 546.00;
			return medPrice;
		}
		else if(medName == "Body wash" && !medName.isEmpty()){
			medPrice = 89.00;
			return medPrice;
		}
		else if(medName == "shampoo" && !medName.isEmpty()){
			medPrice = 99.00;
			return medPrice;
		}
		else if(medName == "multivitamins" && !medName.isEmpty()){
			medPrice = 86.00;
			return medPrice;
		}
		else if(medName == "Vicks vapourub" && !medName.isEmpty()){
			medPrice = 56.00;
			return medPrice;
		}
		else if(medName == "vicks inhaler" && !medName.isEmpty()){
			medPrice = 77.00;
			return medPrice;
		}
		else if(medName == "Zandu balm" && !medName.isEmpty()){
			medPrice =67.00 ;
			return medPrice;
		}
		else if(medName == "iodex" && !medName.isEmpty()){
			medPrice = 127.00;
			return medPrice;
		}
		else if(medName == "moov" && !medName.isEmpty()){
			medPrice = 269.00 ;
			return medPrice;
		}
		else {
			System.out.println(medName + " Not available.. Enter a different medical Product." );
		}
		return medPrice;
		
	}
	
	public static double medicine(String medName , int medQuantity){
		
		double medPrice = 0.0;
		
		if(medName == "paracetamol" && !medName.isEmpty()){
			medPrice = 20.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "bandages" && !medName.isEmpty()){
			medPrice = 50.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "antiseptic creams" && !medName.isEmpty()){
			medPrice = 40.00 * medQuantity;
			return medPrice;
		}
		else if(medName == " test strips" && !medName.isEmpty()){
			medPrice = 50.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "glucose meterss" && !medName.isEmpty()){
			medPrice = 60.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "eye drops" && !medName.isEmpty()){
			medPrice = 50.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "contact lens solutions" && !medName.isEmpty()){
			medPrice = 60.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "colic relief" && !medName.isEmpty()){
			medPrice = 70.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "fever reducers" && !medName.isEmpty()){
			medPrice = 120.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Thermometers" && !medName.isEmpty()){
			medPrice = 340.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Glucometers " && !medName.isEmpty()){
			medPrice = 1000.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Hearing Aids" && !medName.isEmpty()){
			medPrice = 670.00 * medQuantity;
			return medPrice;
		}
		else if(medName == " sanitary products" && !medName.isEmpty()){
			medPrice = 290.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "antacids" && !medName.isEmpty()){
			medPrice = 92.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "laxatives" && !medName.isEmpty()){
			medPrice = 92.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Cough Syrup" && !medName.isEmpty()){
			medPrice = 120.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Fish body oil" && !medName.isEmpty()){
			medPrice = 340.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "BP monitor" && !medName.isEmpty()){
			medPrice = 1200.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Toothpaste" && !medName.isEmpty()){
			medPrice = 130.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Mouth wash" && !medName.isEmpty()){
			medPrice = 210.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Serum" && !medName.isEmpty()){
			medPrice = 380.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Soaps" && !medName.isEmpty()){
			medPrice = 90.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Moistueriser" && !medName.isEmpty()){
			medPrice = 110.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "sunscreen" && !medName.isEmpty()){
			medPrice = 90.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Deodorants " && !medName.isEmpty()){
			medPrice = 56.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Antiperspirants" && !medName.isEmpty()){
			medPrice = 74.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "face masks" && !medName.isEmpty()){
			medPrice = 86.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "gloves" && !medName.isEmpty()){
			medPrice = 180.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "tampons" && !medName.isEmpty()){
			medPrice = 230.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "diapers" && !medName.isEmpty()){
			medPrice = 650.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Nebulizers" && !medName.isEmpty()){
			medPrice = 890.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Oxygen Concentrator" && !medName.isEmpty()){
			medPrice = 546.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Body wash" && !medName.isEmpty()){
			medPrice = 89.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "shampoo" && !medName.isEmpty()){
			medPrice = 99.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "multivitamins" && !medName.isEmpty()){
			medPrice = 86.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Vicks vapourub" && !medName.isEmpty()){
			medPrice = 56.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "vicks inhaler" && !medName.isEmpty()){
			medPrice = 77.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "Zandu balm" && !medName.isEmpty()){
			medPrice =67.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "iodex" && !medName.isEmpty()){
			medPrice = 127.00 * medQuantity;
			return medPrice;
		}
		else if(medName == "moov" && !medName.isEmpty()){
			medPrice = 269.00 * medQuantity ;
			return medPrice;
		}
		else {
			System.out.println(medName + " Not available.. Enter a different medical Product." );
		}
		return medPrice;
		
	}
}