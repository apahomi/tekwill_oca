package Main;



import java.util.*;

public class Bonus_1 {

	static class Player {
		String name;
		int age;
		int points;
		
	public Player(String name, int age,int points)
	
	      {
		     this.name = name;
		     this.age = age;
		     this.points = points;
		  }
     public String toString()
          
          {
    	     return this.name + " " + this.age + " " + this.points;
          }
	
	}
	  static class sortByAge implements Comparator<Player>
	   
	      {
		   public int compare(Player a, Player b) 
		   {
			   
			   return a.age - b.age;
		   }
	      }
	  
	  static class sortByPoints implements Comparator<Player>
	  {
		  public int compare(Player a, Player b)
		  {
			  return a.points - b.points;
		  }
	  }
	  
	  static class sortByName implements Comparator<Player>
	  {
		  public int compare(Player a, Player b)
		  {
			  return (a.name.compareTo(b.name));
		  }
	  }

	  
	public static void main(String[] args) {
		
		Player[] players = new Player[5];
		
		players[0] = new Player("Duke", 17, 200);
		players[1] = new Player("Steven", 14, 150);
		players[2] = new Player("John", 16, 250);
		players[3] = new Player("Joe", 15, 180);
		players[4] = new Player("Anna", 19, 270);
		
		
		List<Player> list = Arrays.asList(players);
		
		System.out.println();
		System.out.println("Sorting by age!");
		
		Arrays.sort(players, new sortByAge());
		
		for (Player player : players)
		{
		
			System.out.println(player.toString());
		}
		
		Arrays.sort(players, new sortByPoints());
		
		System.out.println();
		System.out.println("Sorting by points!");
		
		for (Player player : players)
		{
			System.out.println(player.toString());
		}
		
		Arrays.sort(players, new sortByName());
		System.out.println();
		System.out.println("Sorting by name!");
		
		for (Player player : players)
		{
			System.out.println(player.toString());
			
		}
		
		
		    
	}

}
