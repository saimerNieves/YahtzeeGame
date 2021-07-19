package com.codewithmosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player saimer = new Player();

        Scanner scanner = new Scanner(System.in);

        Die die1 = new Die();
        Die die2 = new Die();

        //First ROll of DIce
        die1.rollDie();
        die2.rollDie();

        int die_Total = die1.face_Up_Value + die2.face_Up_Value;

        System.out.println( die1.face_Up_Value + " + " + die2.face_Up_Value + " = "  + (die_Total) );



        while (saimer.isWrong == false) {


            //Asking User for input

            System.out.println("Will the next number be (h)igher, (l)ower , or (e)qual");

            String answer = scanner.next();


            //Second Roll of Dice

            die1.rollDie();
            die2.rollDie();

            int die_Total2 = die1.face_Up_Value + die2.face_Up_Value;


            //Determine your answer


            if ((die_Total < die_Total2) && (answer.equals("h"))) {
                System.out.println("you got the right answer");
                saimer.increaseTimesCorrect();
            } else if ((die_Total > die_Total2) && (answer.equals("l"))) {
                System.out.println("you got the right answer");
                saimer.increaseTimesCorrect();
            } else if ((die_Total == die_Total2) && (answer.equals("e"))) {
                System.out.println("you got the right answer");
                saimer.increaseTimesCorrect();
            } else {
                System.out.println("you got the wrong answer");
                saimer.changeisWrong(true);
            }

            System.out.println(die1.face_Up_Value + " + " + die2.face_Up_Value + " = " + (die_Total2));

        }

        System.out.println("\n\n Your score correct is : " + saimer.timesCorrect);
        scanner.close();


    }

}
