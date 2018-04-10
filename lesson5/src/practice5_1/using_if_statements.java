package practice5_1;

public class using_if_statements {
       
	public static void main(String[] args) {
		String custName = "X MEN";
		String itemDesc = "SWORD";
		String message;
		
		int quantity = 1;
		double price = 35.35;
		double tax = 2.50;
		double total;
		
		message = custName+" wants to purchase "+quantity +" "+itemDesc;
		total = quantity * price * tax;

		if (quantity > 1)
		{
			message = message + 's';
		}
           boolean out_of_stock = false;
  
          if (out_of_stock) {
        	   System.out.println(itemDesc +" is out of stock.");
           }
           else {System.out.println(message);
           System.out.println("Total cost with tax: " + total);
         }
	}
}
