package com.sckeedoo.certification;

public class exercise_1 {
	static class Animal {
		String name;
		int numberOfLegs;
		double age;
	}

	
	public static void main(String[] args) {
	
		Animal pet1 = new Animal();
		pet1.name = "'Nick'";
		pet1.numberOfLegs = 4;
		pet1.age = 5;
		
		System.out.println("Animal = { name - " + pet1.name + ',' + " age = " + pet1.age + ',' + 
				" numberOfLegs = " + pet1.numberOfLegs + '}');

	}

}
