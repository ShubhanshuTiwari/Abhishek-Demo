package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class entry {

	public static void main(String[] args) throws FileNotFoundException,IOException,SQLException {
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("test.txt");
			// throw raising an exception manually
			if(true)
				throw new SQLException();   // If true isliye lagane pade kyunki throw neeche vala code unreachable ho jayega
			while(true) {
				int ch=fin.read();
				
				if(ch==-1)
					break;
				System.out.println((char)ch);
			}
		}
		/*catch(FileNotFoundException e) {
			System.out.println("Bhaiya agar catch hoga to throws nahi chalega");
			
		}*/
		finally {
			System.out.println("Without catch it can be handled");
		}
		
	}
	
	
}
