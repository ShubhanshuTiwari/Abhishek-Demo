package abhishekClass;

abstract class Animal{
	Animal(){
		System.out.println("Abstract constructor cannot be directly called");
	}
	
	void eat() {
		System.out.println("Eating in abstract");
		
	}
	public abstract void sleep();//note abstract method cannot be private
	public abstract void roam();
}
//class Feline extends Animal{
	// It is showing error we have not yet declared abstract method see at feline
//}

abstract class Feline extends Animal{
	
		@Override
		public void roam() {
			// TODO Auto-generated method stub
			System.out.println("Enter in group");
		}
		@Override
		public void sleep() {
		// TODO Auto-generated method stub
		
		}
	
}













public class Abstract30 {

}
