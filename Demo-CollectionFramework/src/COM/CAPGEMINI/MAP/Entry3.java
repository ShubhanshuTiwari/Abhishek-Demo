package COM.CAPGEMINI.MAP;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Entry3 {
	public static void main(String[] args) {
		
		Map<PersonKey, Person> personDetails;
		
		personDetails = new TreeMap<>();
		
		Person p1 = new Person("tushar",22);
		PersonKey k1 = new PersonKey(p1.getName().charAt(0),p1.getAge()*10);
		
		personDetails.put(k1, p1);

		Person p2 = new Person("himanshu",62);
		PersonKey k2 = new PersonKey(p2.getName().charAt(0),p2.getAge()*10);

		personDetails.put(k2, p2);
		
		Person p3 = new Person("rajat",72);
		PersonKey k3 = new PersonKey(p3.getName().charAt(0),p3.getAge()*10);
		
		Person oldValue = personDetails.put(k3, p3);
		System.out.println(oldValue);
		
		Person p4 = new Person("vaibhav",21);
		PersonKey k4 = new PersonKey(p4.getName().charAt(0),p4.getAge()*10);

		oldValue = personDetails.put(k4, p4);//put returns oldvalue that is catching here
		System.out.println(oldValue);
		
		
		
		System.out.println("Size of a map:" + personDetails.size());
		
		System.out.println(personDetails);
		
		
		Map<PersonKey, Person> personDetails2 = new TreeMap<>(
						new CustomComparator()          //customcreator class is created by ourselve below
				);
		
		personDetails2.putAll(personDetails);
		
		System.out.println(personDetails2);
		
	}
}

class CustomComparator implements Comparator<PersonKey>{
	
	@Override
	public int compare(PersonKey o1, PersonKey o2) {
		return o1.getPrefix() - o2.getPrefix();
	}
}











