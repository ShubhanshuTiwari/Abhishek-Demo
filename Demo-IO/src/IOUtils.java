import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.BreakIterator;

public class IOUtils {
	private static Reader reader;
	private static BufferedReader bReader;
	private static FileWriter fWriter;

/*	static {
		try {
			reader = new InputStreamReader(System.in);
			bReader = new BufferedReader(reader);
			fWriter = new FileWriter("test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

	public static boolean writeIntoFile(String message) throws IOException {
		try {
			fWriter.write(message);
			return true;
		} finally {
			fWriter.close();
		}
	}

	public static String readFromKeyboard() throws IOException {
		String message = bReader.readLine();
		char ch[]=message.toCharArray();
		for(int i=0;i<message.length();i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=Character.toUpperCase(ch[i]);
			}
			if(ch[i]>=0&&ch[i]<=9) {
				ch[i]='*';
			}	
		}
		String s=new String(ch);
			
		return s;
	}

}
