package com.gw.sse;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = (int)(Math.random() * 100 + 1);
        Scanner uInput = new Scanner(System.in);
        //System.out.println(num);
        int numGuesses = 0;

        for(numGuesses = 5; numGuesses > 0; numGuesses--){
            System.out.println("Guess a number between 1-100 (" + numGuesses + " guesses left)");
            int uGuess = uInput.nextInt();
            if(!(num - 10 <= uGuess && uGuess <= num + 10)) {
                System.out.println("Not close enough");
            }
            else{
                System.out.println("The correct number was " + num);
                break;
            }
        }

        if(numGuesses == 0){
            System.out.println("Sorry, the correct number was " + num);
        }

    }
}
