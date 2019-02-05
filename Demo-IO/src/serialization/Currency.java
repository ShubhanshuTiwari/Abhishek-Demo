package serialization;

import java.io.*; 
public class Currency 
{
public static void main(String args[]) 
{
Dollar dr=new Dollar('$',40); 
dr.printDollar(); 
Rupee re=new Rupee("Rs.",50); 
re.printRupee(); 
try 
{
File f=new File("serializablee.txt"); 
FileOutputStream fos=new FileOutputStream(f); 
ObjectOutputStream oos=new ObjectOutputStream(fos); 
oos.writeObject(dr); oos.writeObject(re); 
oos.flush(); oos.close(); 
ObjectInputStream ois=new ObjectInputStream(new FileInputStream("serializablee.txt")); 
Dollar d1; 
d1=(Dollar)ois.readObject(); 
d1.printDollar(); 
                                                                                                  
Rupee r1; 
r1=(Rupee)ois.readObject(); 
r1.printRupee(); 
ois.close(); 
}
catch(Exception e) 
{}
}

}
class Dollar implements Serializable 
{
private float dol; private char sym; 
 
public Dollar(char sm,float doll) 
{
sym=sm; dol=doll; 
}
void printDollar() 
{
System.out.print(sym); System.out.println(dol); 
}
}
class Rupee implements Serializable 
{
private String sym; 
private float rs; 
public Rupee(String sm,float rup) 
{
sym=sm; 
rs=rup; 
}
void printRupee() 
{
System.out.print(sym); System.out.println(rs); 
}

}
