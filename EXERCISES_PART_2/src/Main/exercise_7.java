package Main;

public class exercise_7 
{
	public static void main(String[] args) 
	{
     
    	String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
    	int name1 = names.indexOf("Steve");
    	int name2 = names.indexOf("George")+ "George".length();
         
    	        	 System.out.println(names.substring(name1, name2));	 
        

	}

}
