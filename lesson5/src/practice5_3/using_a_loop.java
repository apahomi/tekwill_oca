package practice5_3;

public class using_a_loop {

	public static void main(String[] args) {
		String custName = "Mark";
	     String message;
	     
	     String[] items = new String[4];
	     items[0] = "Shirt";
	     items[1] = "Belt";
	     items[2] = "Scarf";
	     items[3] = "Skirt";
	     
	message = custName +" wants to purchase " +items.length +" items.";
	     System.out.println(message);
	     System.out.println("Items purchased: ");
	     for (String item : items) {
	    	 System.out.print("|" + item + "| ");
	     }
	     

	}

}
