class Frog{
	public static void secondaryConsumer(){
	System.out.println("in secondaryConsumer");
	Hawk.tertiarConsumer();
	System.out.println("out secondaryConsumer");
	}
}