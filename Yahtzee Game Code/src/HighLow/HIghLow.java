package HighLow;

import com.codewithmosh.Die;
import com.codewithmosh.Player;

import java.util.Scanner;

public class HIghLow {


    public static void play(){
        Player saimer = new Player("Saimer");

        Scanner scanner = new Scanner(System.in);

        Die die1 = new Die();
        Die die2 = new Die();

        //First ROll of DIce
        die1.rollDie();
        die2.rollDie();

        int die_Total = die1.face_Up_Value + die2.face_Up_Value;

        System.out.println( die1.face_Up_Value + " + " + die2.face_Up_Value + " = "  + (die_Total) );



    }

}
