package com.codewithmosh;

import HighLow.HIghLow;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //ToDO Create a class to hold all this information
    public static void main(String[] args) {
        // write your code here

        Cup myCup = new Cup(); //Created the new cup in the factory

        Scanner scanner = new Scanner(System.in);
        String input;

        myCup.roll();
        System.out.println(myCup.displayCup());
        System.out.println("Select die to rerll  you want to re-roll 1-5?");
        input = scanner.nextLine();
        //TODO finish up this inclass session since is not complete
        myCup.roll(myCup.parseSelections(input));







        //TODO - HOMEWORK > turn code into a yahtzee class and updated the high low a little but a little nicer
        //TODO - Add classes to high low and methods to the highlow game





    }
}
