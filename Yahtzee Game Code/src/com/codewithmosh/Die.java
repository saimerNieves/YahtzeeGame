package com.codewithmosh;

public class Die {

    //fields
    public int number_Of_Sides; // int but less sizes
    public int face_Up_Value; // value of the face Up


    //Overloading is the changes made inside the same object
    //OverRiding is the changes made from one object method to another => toString()
    //gets the location of the reference in the MEMORY and returns it for you
    //constructors
    //Todo Fix Die class
    //default Constructor
    public Die(){
        this.number_Of_Sides = 6;
        this.face_Up_Value = 1;
    }

    public Die(int number_Of_Sides){
        this.number_Of_Sides = number_Of_Sides;
    }




    //Methods

    public void rollDie(){

        //Math.random() * max) + min
        double randomNum = (Math.random() * this.number_Of_Sides) + 1;

        this.face_Up_Value = (int)randomNum; // casts a double to an Int in an integer 6.999 will get cut to a 6
    }

    public byte get_Face_Up_Value(){
        return 1;
    }

}
