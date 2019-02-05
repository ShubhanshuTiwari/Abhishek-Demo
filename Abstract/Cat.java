package abhishekClass;
public class Cat extends Feline implements Pet{

	@Override
	public void eat() {
		System.out.println("I drink milk");
	}
	
//	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		System.out.println("I'm friendly");
	}
	
//	@Override
	public void play() {
		System.out.println("I'll play with you");
	}
	
	
}
