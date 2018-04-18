package Main;

public class exercise_2 
{

	public static void main(String[] args) 
	{
		
		String abracadabra = "abracadabra";
		String letter = "a";
		
		int index = abracadabra.indexOf(letter);
		while (index >= 0)
		
		{
			
			System.out.println(index);
			index = abracadabra.indexOf(letter, index + letter.length());
		}

	}

}
