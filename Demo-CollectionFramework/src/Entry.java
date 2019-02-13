import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Entry {
	public static void main(String[] args) {
		
		Collection collection;
		
		collection = new LinkedList<>();
		
		collection.add(10);
		collection.add(30);
		collection.add(50);
		collection.add(20);
		collection.add(40);
		
//		For-Each loop (Enhanced for loop)
		for(Object value: collection){                  // internally it uses iterator 
			System.out.print(value+"\t");
		}


		Iterator itr = collection.iterator();
		System.out.println(itr.getClass().getSimpleName()+ " iterating over "+ collection.getClass().getSimpleName());

		while(itr.hasNext()){
			Object value = itr.next();
			System.out.print(value+ "\t");
		}

		Collection collection2;
		collection2 = new HashSet<>();
		
		collection2.addAll(collection);
		
		System.out.println();
		System.out.println("-----------------");
		for(Object value: collection2){
			System.out.print(value+ "\t");
			
		}
		
		
		itr = collection2.iterator();
		System.out.println(itr.getClass().getSimpleName()+ " iterating over "+ collection2.getClass().getSimpleName());

		while(itr.hasNext()){
			Object value = itr.next();
			System.out.print(value+ "\t");
		}
		
	}
}
