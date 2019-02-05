package abhishekClass;
abstract class Animal {

	private int weight;
	private int height;

	public Animal(String temp) {
		this(12,24);
		System.out.println("Animal instantiated...");
	}
	
	public Animal() {
		this(12,24);
		System.out.println("Animal instantiated...");
	}

	public Animal(int weight, int height) {
//		this();
		this.weight = weight;
		
		this.height = height;
		
	}

	// abstract methods are subclass' responsibility
	abstract public void roam();

	abstract public void eat();

}