
//This program randomly generates an integer and prompts the user to guess it

import java.util.Random;

import java.util.Scanner;

public class Number_Guess {

    public static void main(String [] args) {
        int min, max, i, UserInput, trials;
        i = 0;
        trials = 5;
        max = 100;
        min = 0;
        Random GeneratedNum = new Random();
        int RandomNum = min + GeneratedNum.nextInt(max);

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < trials; i++) {
            System.out.println(" ");
            System.out.println("An integer between 0 and 99 inclusive has been generated.");
            try {
            System.out.print("Guess the number: ");
            UserInput = sc.nextInt();
            if (RandomNum == UserInput) {
                System.out.println("WOW You Rock!");
                break;
            } else if (RandomNum > UserInput && i != trials - 1) {
                System.out.println("The number is greater than " + UserInput);
            } else if (RandomNum < UserInput && i != trials - 1) {
                System.out.println("The number is less than " + UserInput);
            }
        } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if (i == trials){
            System.out.println("You Lose! Don't Give Up, Try Again!");
            System.out.println("The number was " + RandomNum);
        }
    }
}