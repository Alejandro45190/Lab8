package com.mycompany.lab8;

import java.io.IOException;
import edu.tarleton.logging.Logger;
import java.util.Scanner;

public class AnswerQuestion {
    
    static void question () throws IOException {
        
        Logger logs = new Logger("Answers.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        logs.log(name);
        System.out.println("How old are you?");
        String age = sc.nextLine();
        logs.log(age);
        System.out.println("What is your major?");
        String major = sc.nextLine();
        logs.log(major);
        logs.close();
    }
}
