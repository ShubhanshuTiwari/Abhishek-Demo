import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.capgemini.utils.IOUtils;

public class Entry2 {
	public static void main(String[] args) throws IOException {
		
		String fileName = "test.prmt";
		OutputStream out = new FileOutputStream(fileName);
		
		IOUtils.writePrimitives(out);
		
		InputStream in = new FileInputStream(fileName);
		IOUtils.readPrimitives(in);
		
		
		
		System.out.println("end of main()...");
	}
}
