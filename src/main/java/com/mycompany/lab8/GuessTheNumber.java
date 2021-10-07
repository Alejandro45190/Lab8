package com.mycompany.lab8;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    
    static void guess() {
        int random, guess;
        Random rand = new Random();
        random = rand.nextInt(20) +1 ;
        System.out.println("Guess what number I am thinking of!");
        Scanner sc = new Scanner(System.in);
        guess = sc.nextInt();
        while (guess != random) {
            if (guess > random) {
                System.out.println("Guess lower!");
            }
            else {
            System.out.println("Guess higher!");
            }
            guess = sc.nextInt();
        } 
        System.out.println(random + " is the number, you win!");
    }
}
