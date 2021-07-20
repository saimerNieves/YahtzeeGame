package com.codewithmosh;

public class Player {

    public boolean isWrong;
    public int timesCorrect = 0;


    public Player(){

        isWrong = false;
    }

    //Your eyes looking your answer
    public void changeisWrong(boolean isWrong){
        this.isWrong = isWrong;
    }

    //Your brain
    public void increaseTimesCorrect(){
        this.timesCorrect++;
    }
}
