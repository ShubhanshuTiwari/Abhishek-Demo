package serialization2;

import java.io.*;
import java.util.*;

class Currency implements Serializable
{
protected String currency;
protected int amount;

public Currency(String cur, int amt)
{
this.currency = cur;
this.amount = amt;
}
public String toString()
{
return currency + amount;
}
public String dollarToRupee(int amt)
{	
return "Rs" + amt * 45;
}
}
