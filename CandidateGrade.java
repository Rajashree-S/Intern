class CandidateGrade{
	
	
	static char candidateGrade[] = {'A','A','C','D','B','A','B','C','A','A'};
	
	public static void main(String args[]){
		
		System.out.println("Main Started");
		
		getGrade();
		
		System.out.println("Main Ended");
		
	}
	public static void getGrade(){
		
		System.out.println("The Number of student graded are ");
		for(char grade : candidateGrade){
			System.out.println(grade);
			
		}
	}
}