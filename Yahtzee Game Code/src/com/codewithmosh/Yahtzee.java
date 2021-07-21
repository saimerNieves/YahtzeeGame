package com.codewithmosh;

import java.util.Scanner;

public class Yahtzee {

    public Cup cup = new Cup(); //Created the new cup in the factory
    public Player player;
    private final Scanner scanner = new Scanner(System.in);
    

    public Yahtzee(){

        System.out.println("Whats your name?");
        String name = scanner.nextLine().trim();
        player = new Player(name);
        
        
    }

    //TODO -> Refactor play method to run 5 turns instead of 1 , then display total score for the game
    public void play(){
        turn();
    }

    public void getSelections(){


            Scanner scanner = new Scanner(System.in);
            System.out.println("Select die to rerll  you want to re-roll 1-5?");
            String input = scanner.nextLine();
            player.cup.roll(player.cup.parseSelections(input));

    }

    //TODO -> rafactor turn to update the score for the player and display round score
    public void turn(){

        player.cup.roll();

        for(int i = 0; i < 2 ; i++){

            System.out.println(player.cup.displayCup());
            getSelections();
        }

        System.out.println(player.cup.displayCup());


    }
    
}
