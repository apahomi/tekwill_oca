package Main;

public class exercise_10 
{
	public static void main(String[] args) 
	{
        String[] names = {"John", "Steve","Bob", "Anna", "Diana", "George",
        		           "Dodon", "Plahotniuc"};
        
        StringBuilder stringB = new StringBuilder();
        int st = 0;
       
        for(String str : names) 
        {
             stringB.append(str);
             
             if(st == names.length-1)
             break;
             stringB.append(',');
             st++;
       
        }	
            
        System.out.println(stringB);
	}
}
