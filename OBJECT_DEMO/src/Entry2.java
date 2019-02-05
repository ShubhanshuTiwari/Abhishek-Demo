

public class Entry2 {
	public static void main(String[] args) {
		
		Cat catRef = new Cat("Tiger");
		Cat catRef2 = new Cat("Bablo");
		System.out.println(catRef);
		System.out.println(catRef.toString());//WE HAVE OVERRIDE THE toString METHOD
		
		boolean flag = catRef.equals(catRef2);//WE HAVE OVERRIDE THE EQUAL METHOD OF OBJECT CLASS IN CAT CLASS
		
		System.out.println(flag);
		
    	catRef = null;       //WE HAVE OVERRIDE THE THROWABLE METHOD IN CAT CLASS
    						//BEFORE CALLING FINALIZE WE NEED TO MAKE THE OBJECT NULL
//		catRef2 = null;// THIS WILL BE NOT CALLED BY THROWABLE BECAUSE IT IS NOT NULL
		
		System.gc();//TO CALL THE GARBAGE COLLECTOR 
	}
}
