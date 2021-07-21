package com.codewithmosh;

public class Player {

    //Fields
    public String name; //Player Name
    public Cup cup = new Cup(); //Player Cup
    public int score = 0;

    //Constructor
    public Player(String name){

        this.name = name;
    }

    public int updateScore() {
        int roundScore = 0;

        for(Die die : cup.dieArrayList){
            score += die.face_Up_Value;
        }

        score += roundScore;
        return roundScore;
    }






    //Methods
}
