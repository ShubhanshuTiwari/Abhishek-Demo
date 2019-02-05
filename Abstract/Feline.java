package abhishekClass;
abstract class Feline extends Animal{
	
	private static String location;

	public Feline() {
		// TODO Auto-generated constructor stub
		this(location);
	}
	
	public Feline(String location){
		
		//Chaining constructor using 'super'
		
		this.location = "NA";
		location = this.location;
		
		System.out.println("Feline instantiated...");
	}
	
	public void roam(){
		System.out.println("It avoids it's own type!"+ this.location);
	}
	
}