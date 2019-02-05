package serialization2;

import java.io.*;
import java.util.*;

public class SerializationRead
{
public static void main(String args[])
{
try
{
Currency obj;
FileInputStream fis = new FileInputStream("serial.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
System.out.println("Reading from file using Object Serialization:");
for(int i=1;i<=25;i++)
{
obj = (Currency)ois.readObject();
if((obj.currency).equals("$"))
System.out.println(obj + " = " + obj.dollarToRupee(obj.amount));
else
System.out.println(obj + " = " + obj);

}
ois.close();
}
catch(Exception e)
{
System.out.println("Exception during deserialization." + e);
}
}
} 


