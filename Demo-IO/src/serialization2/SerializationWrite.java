package serialization2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

import serialization2.Currency;
import serialization2.Dollar;
import serialization2.Rupee;

public class SerializationWrite
{
public static void main(String args[])
{
Random r = new Random();
try
{
Currency currency;
FileOutputStream fos = new FileOutputStream("abc.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
System.out.println("Writing to file using Object Serialization:");
for(int i=1;i<=25;i++)
{
Object[] obj = { new Rupee(r.nextInt(5000)),new Dollar(r.nextInt(5000)) };
currency = (Currency)obj[r.nextInt(2)]; // RANDOM Objects for Rs and $
System.out.println(i+"-->"+currency);
oos.writeObject(currency);
oos.flush();
}
oos.close();
}
catch(Exception e)
{
System.out.println("Exception during Serialization: " + e);
}
}
}