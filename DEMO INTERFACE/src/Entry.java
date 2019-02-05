import com.capgemini.beans.Animal;
import com.capgemini.beans.Cat;
import com.capgemini.beans.Dog;
import com.capgemini.beans.Feline;
import com.capgemini.beans.Pet;

public class Entry {

	public static void main(String[] args) {
		
		Animal animalRef;
		
//		animalRef = new Animal();
		
//		IMPLICIT UP-CASTING
		animalRef = (Animal)new Cat();
		
		animalRef.eat();
		animalRef.sleep();
		animalRef.roam();
		
//		animalRef.meow();
		
//		EXPLICIT DOWN-CASTING
		Cat catRef = (Cat)animalRef;
		
		catRef.meow();
		System.out.println(Feline.MAX++);
		
		
		
		Animal animalRef2 = getAnimal();     // ye naya way cat ka object banane ka
											// bhai dekh agar get animal static na hota to tumhe class name ya class object ki jarrurat padti
		
		boolean flag = (animalRef2 instanceof Pet);// cat implements kar raha h pet ko to ye true return karega

		Pet petRef =null;
		if(flag == true){
			petRef = (Pet)animalRef2;// petRef me humne cat rakh liya h
			
			petRef.beFriendly();// cat.beFriendly call
			petRef.play();
		}
		else{
			System.out.println("We did not find Pet");
		}
		
		
		String petName = new String("Tommy");
		
//		petRef =(Pet) petName;
		
		
		
		System.out.println(Pet.MAX);// interface ke variable ko Directly interface name se call kar sakte h kyunki variable by default public , static ,final hota h 
		
//		System.out.println(Pet.MAX++);// yaha error aayega kyunki pet ke variable final hota h to change nahi hota
		
		Animal animalref3=getDogAnimal();
		
		petRef=(Pet)animalref3;//yaha explicit karna padta kyunki upar se neeche bula rahe h
		petRef.beFriendly();
		petRef.play();
		
		
		
		
		
		
		
	}
	
	
	
	public static Animal getAnimal(){
		
		return new Cat();
	}
	
	public static Animal getDogAnimal() {
		return new Dog();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
