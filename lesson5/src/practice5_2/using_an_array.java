package practice5_2;

public class using_an_array 
{
	public static void main (String[] args)
	{
     String custName = "Mary Smith";
     String message;
     
	 	 String[] items = {"Shirt", "Socks", "Scarf", "Belt"};
	 message = custName +" wants to purchase " +items.length +" items";
	
	 System.out.println(message);
	 System.out.println(items[1]);	 
	 }
}