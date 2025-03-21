class Movies{
	
		static String hindiMovies[] = {"3 Idiots","Dangal","Jigra","Pink","Article 370","Anek","Chennai Express","Laxmii","Sanju","Bharat"};
		static String kannadaMovies[] = {"Dia","KGF","Kantara","Sapta Sagaradaache Ello","777 Charlie","Yuva","Vedha","Love Moctail","U turn","Upendra"};
		static String malayalamMovies[] = {"Dhrishiyam","Pani","Premam","Manjummel Boys","Bangalore Days","Sookshmadarshini","Premalu","Luca","Kolla","Masterpiece"};
		static String englishMovies[] = {"Interstellar","The Godfather","Dune","Joker","The Wild Robot","The Beekeeper","Jurassic Park","John Wick","UP","Frozen"};
		
	public static void main(String mod[]){
		System.out.println("main started");
		
		readMovie();
		
		System.out.println("main ended");
		
		
	}
	public static void readMovie(){
		
		System.out.println("The List of Hindi Movies are:");
		for(String hinMovies : hindiMovies){
			System.out.println(hinMovies);
		}
		
		System.out.println("The List of Kannada Movies are:");
		for(String kanMovies : kannadaMovies){
			System.out.println(kanMovies);
		}
		
		System.out.println("The List of Malayalam Movies are:");
		for(String malMovies : malayalamMovies){
			System.out.println(malMovies);
		}
		
		System.out.println("The List of English Movies are:");
		for(String engMovies : englishMovies){
			System.out.println(engMovies);
		}
	}
}