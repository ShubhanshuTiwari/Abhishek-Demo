package COM.CAPGEMINI.MAP;
public class PersonKey implements Comparable<PersonKey>{
	private char prefix;
	private int id;
	
	
	@Override
	public int compareTo(PersonKey o) {
		// TODO Auto-generated method stub
		System.out.println(this + " comapred with "+ o);
		return this.id - o.id;
	}
	
	public PersonKey() {
		// TODO Auto-generated constructor stub
	}
	
	public char getPrefix() {
		return prefix;
	}

	public PersonKey(char prefix, int id) {
		this.prefix = prefix;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	
	
}
