class DogBreeds{
	
	static String dogBreeds[] = {"Belgian Malinois","Cane Corso","Rhodesian Ridgeback","Pointer","Newfoundland","Irish Setter","English Springer Spaniel","Jack Russell Terrier","West Highland White Terrier","Scottish Terrier","Maltese","Akita","Saint Bernard","Basset Hound","Weimaraner","Vizsla","Cocker Spaniel","Boston Terrier","Bernese Mountain Dog","Border Collie",
							  "Pug","Chihuahua","Shetland Sheepdog","Cavalier King Charles Spaniel","Shih Tzu","Doberman Pinscher","Great Dane",
							  "Australian Shepherd","Siberian Husky","Dachshund","Boxer","Yorkshire Terrier","Rottweiler",
							  "Beagle","Poodle","Bulldog","French Bulldog","Golden Retriever","German Shepherd","Labrador Retriever",};
		
	public static void main(String args[]){
		
		System.out.println("main started");
		
		readBreed();
		
		System.out.println("main ended");
		
		
		}
	public static void readBreed(){
		System.out.println("The total list of DogBreeds are :"+dogBreeds.length);
		
		for(String dogbreed : dogBreeds){
			System.out.println(dogbreed);
	}
	}
}