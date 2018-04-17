package com.sckeedoo.certification;

import java.util.Random;

public class exercise_5 {

    static class Player {
        String name;
        int age;
        int points;
        int incr;
      
       
    }


    public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding Diana
        players[0] = new Player();
        players[0].name = "Diana";
        players[0].age = 17;
        players[0].points = 200;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding John
        players[2] = new Player();
        players[2].name = "John";
        players[2].age = 16;
        players[2].points = 250;

        // Adding Joe
        players[3] = new Player();
        players[3].name = "Joe";
        players[3].age = 15;
        players[3].points = 180;

        // Adding Anna
        players[4] = new Player();
        players[4].name = "Anna";
        players[4].age = 19;
        players[4].points = 270;

        /**
         * Increment the player's score by a random number between 10 and 20
         */
        int rangeValues;
        int sum;
        
        Random incr = new Random();
        rangeValues = incr.nextInt(10) + 11;
        
        for(Player player: players) {
        
        	sum = player.points + rangeValues;	
        	
        	System.out.println(player.name + "'s points after incrementing is equal with " + sum + '.');
        }
    }
}