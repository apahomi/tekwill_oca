package practice6_2;

import practice6_1.Item;

public class ShoppingCart {

	public static void main(String[] args) {
		
		Item item1, item2;
		
		item1 = new Item();
		item2 = new Item();
		
		item1.descr = "Shirts";
		item2.descr = "Pants";
		
		item1 = item2;
		
		System.out.println("Item: " + item1.descr);
		System.out.println("Item: " + item2.descr);
	}

}
