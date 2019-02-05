import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class Assignment6 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream(args[0]);
		String s=IOUtils.readFromKeyboard();
		
		OutputStream out = new FileOutputStream(args[0]);
		
		IOUtils.writeIntoFile(s);
		
		System.out.println("end of main()...");
	}
}















/*public class Assignment6 {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader(args[0]);
         out = new FileWriter(args[1]);
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}*/