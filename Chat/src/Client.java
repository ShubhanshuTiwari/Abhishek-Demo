import java.io.*;
import java.net.*;
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
	    System.out.println("Enter");
		
			Socket s=new Socket("127.0.0.1", 8089);
			DataInputStream din=new DataInputStream(s.getInputStream());
		    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    String msgin="",msgout="";
		    while(!msgin.equals("end"))
		    {
		    	msgout=br.readLine();
		    	dout.writeUTF(msgout);
		    	msgin=din.readUTF();
		    	System.out.println(msgin);
		    	msgin="";
		    	msgout="";
		    }
		    s.close();
			
		
		

}
}
