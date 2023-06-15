package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var INPUT=new Scanner(System.in);

        //preset variables
        var password="blue";
        var incorrect=true;

//loop until the correct password is inputted
while (incorrect){
    //Asks users to input password
    System.out.print("Password\n>");
    //saves user's inputted password as userInput
    var userInput=INPUT.nextLine();
    //if user inputted the correct password turn incorrect from true to false
    if(userInput.equalsIgnoreCase(password)){
        incorrect=false;
    }
    //otherwise prompt the user to try again
    else{
        System.out.println("Incorrect password, Please try again.\n");
    }
}


    }
}
