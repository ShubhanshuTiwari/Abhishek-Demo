package COM.CAPGEMINI.MAP;
public class Person {
	private String name;
	private int age;

	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
	
}
