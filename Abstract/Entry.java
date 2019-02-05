package abhishekClass;
public class Entry {

	public static void main(String[] args) {
		System.out.println("Hello, world!");

		Animal animal;

		animal = getAnimal();

		animal.roam();
		animal.eat();

		// Pet petRef = new Pet();
		Pet petRef;

		// Some of the Animals may be Pet
		boolean flag = (animal instanceof Pet);

		if (!flag) {
			System.out.println("This animal is not a pet");
		} else {

			petRef = (Pet) animal;

			petRef.beFriendly();
			petRef.play();
		}
	}

	public static Animal getAnimal() {
		// All cats are Animal
		return new Cat();

	}

}
