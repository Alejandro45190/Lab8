package com.mycompany.lab8;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        GuessTheNumber guessNumber = new GuessTheNumber();
        guessNumber.guess();
        AnswerQuestion questions = new AnswerQuestion();
        questions.question();
    }
}
