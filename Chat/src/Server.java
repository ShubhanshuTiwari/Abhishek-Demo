import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) {
		try
		{
			System.out.println("server");

			ServerSocket ss=new ServerSocket(8089);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			//System.out.println("Enter ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ghghg");
			String msgin="",msgout="";
			while(!msgin.equals("end"))
			{
				msgin=din.readUTF();
				System.out.println(msgin);
				msgout=br.readLine();
				dout.writeUTF(msgout);
				dout.flush();
					}
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}

}
