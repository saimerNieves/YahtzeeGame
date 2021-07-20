package com.codewithmosh;

import java.util.ArrayList;
import java.util.List;

public class Cup {

    //Fields
    ArrayList<Die> dieArrayList = new ArrayList<>();


    //Constructors
    public Cup(){
        while(dieArrayList.size() < 5){
            dieArrayList.add(new Die());
        }
    }



    //Methods
    public void roll(){
        for (Die die : dieArrayList){
            die.rollDie();
        }
    }

    public void roll(int selection){
       dieArrayList.get(selection).rollDie();
    }


    public void roll(ArrayList<Integer> selections){
        for (int selection: selections){
            roll(selection);
        }

    }

    public String displayCup(){
        String output= "";

        for(Die die : dieArrayList){
            output += die.face_Up_Value + " ";
        }

        return output.trim();


    }

    public ArrayList<Integer> parseSelections(String input){
        String[] inputArr = input.split(" ");

        ArrayList<Integer> selections = new ArrayList<>();
        for (String number: inputArr){
            selections.add(Integer.parseInt(number) -1);

        }
        return selections;
    }

}
