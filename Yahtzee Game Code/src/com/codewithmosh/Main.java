package com.codewithmosh;

import HighLow.HIghLow;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Cup myCup = new Cup(); //Created the new cup in the factory

        Scanner scanner = new Scanner(System.in);
        String input;

        myCup.roll();
        System.out.println(myCup.displayCup());
        System.out.println("Select die to rerll  you want to re-roll 1-5?");
        input = scanner.nextLine();
        myCup.roll(myCup.parseSelections(input));









    }
}