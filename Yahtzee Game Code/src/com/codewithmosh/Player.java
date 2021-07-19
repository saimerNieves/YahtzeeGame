package com.codewithmosh;

public class Player {

    public boolean isWrong;
    public int timesCorrect = 0;


    public Player(){

        isWrong = false;
    }

    public void changeisWrong(boolean isWrong){
        this.isWrong = isWrong;
    }

    public void increaseTimesCorrect(){
        this.timesCorrect++;
    }
}
