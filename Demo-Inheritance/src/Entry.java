import com.capgemini.beans.Animal;
import com.capgemini.beans.Cat;
import com.capgemini.beans.Dog;

public class Entry {

	public static void main(String[] args) {
		
		Animal animalRef;
		
//		animalRef = new Animal();
		
//		IMPLICIT UP-CASTING(Upper vali class neche vali class ko apne aap le legi
		
		animalRef = (Animal)new Cat();//yaha animal type casting compulsary nahi kyunki ye by default ho jata h;
		
		animalRef.eat();
		animalRef.sleep();
		animalRef.roam();
		
//		animalRef.meow();
		
//		EXPLICIT DOWN-CASTING
		Cat catRef = (Cat)animalRef;// yaha neeche vali class ko uper vali class me karne ke liye explicitly karna padega
		
		catRef.meow();
		
		
		
		animalRef=new Dog();
		animalRef.eat();
		animalRef.sleep();
		animalRef.roam();
		
		Dog dog=new Dog();
		dog.bark();
		
		
		
	}
	
}
