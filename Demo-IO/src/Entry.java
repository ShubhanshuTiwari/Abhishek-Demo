import java.io.IOException;

public class Entry {
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter a message: ");
		String message = IOUtils.readFromKeyboard();
		
		IOUtils.writeIntoFile(message);
	}
}
