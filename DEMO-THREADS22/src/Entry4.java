import com.capgemini.beans.Account;
import com.capgemini.beans.TellerDT;
import com.capgemini.beans.TellerWT;

public class Entry4 {

	public static void main(String[] args) throws InterruptedException {

		Account accountRef1 = new Account(5000, 1);
		Runnable target1 = new TellerDT(accountRef1);

		Thread t1 = new Thread(target1);
		t1.start();
		
		Account accountRef2 = new Account(5000, 2);
		Runnable target2 = new TellerWT(accountRef1);

		Thread t2 = new Thread(target2);
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println(accountRef1);
		System.out.println(accountRef2);
	}

}
