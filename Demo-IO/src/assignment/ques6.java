package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ques6 {

	public static void main(String[] args) throws FileNotFoundException {
		char ch;
		int res;
		FileInputStream fin = new FileInputStream("input.txt");
		FileOutputStream fop = new FileOutputStream("output3.txt");
	    //PrintWriter out = new PrintWriter("input2.txt"); 
		StringBuffer s=new StringBuffer();
		try {
			while ((res = fin.read()) != -1) {
				ch = (char) res;
				
				if (Character.isUpperCase(ch)) {
					ch = Character.toLowerCase(ch);
					s.append(ch);
				}
				else if (Character.isLowerCase(ch)) {
					ch = Character.toUpperCase(ch);
					s.append(ch);
				}
				
				if (Character.isDigit(ch)) {
					ch = '*';
					s.append(ch);
				}
				fop.write(ch);
			}
		//	out.print(s);
			
		//	fop.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

}
