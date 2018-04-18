package Main;

public class exercise_9 
{
	public static void main(String[] args) 
	{
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
   
        System.out.println("Steve" + (names.contains("Steve")?
            " is part of the names variable." :
        	" is not part of the names variable."));
        
        System.out.println("Maria" + (names.contains("Maria")?
                " is part of the names variable." :
            	" is not part of the names variable."));
        
        
    }

}
