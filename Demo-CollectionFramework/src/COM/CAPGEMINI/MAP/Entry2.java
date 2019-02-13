package COM.CAPGEMINI.MAP;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Entry2 {
	public static void main(String[] args) {
		
		Map<Long, String> entries;
		
		entries = new TreeMap<>();

		entries.put(9890098900L, "Airtel");
		entries.put(9820098200L, "Idea");
		entries.put(9823098230L, "Vodafone");
		entries.put(8055080550L, "Jio");
		
		
		Long mobileNo = new Long(9820098201L);
		
		String serviceProvider = entries.get(mobileNo);
		
		System.out.println(serviceProvider);
	
		Set<Long> mobileNos = entries.keySet();
		
		
		for(Long no: mobileNos){
			System.out.print(no + "\t");
		}
		
		
		
		
		
		
		
		
	}
}
