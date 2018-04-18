package Main;


public class exercise_11 
{

	public static void main(String[] args) 
	{
		String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
		StringBuilder stringB = new StringBuilder();
		int i = 0;
		
		String [] arrNames = names.split(",");
		
		for (String string : arrNames)
		{
			StringBuilder tmp = new StringBuilder(string);
			stringB.append(tmp.reverse());
			
			if(i < arrNames.length-1)
			{
				stringB.append(",");		
				
			}
			i++;		
		}
		System.out.println(stringB);
	}
	
}
