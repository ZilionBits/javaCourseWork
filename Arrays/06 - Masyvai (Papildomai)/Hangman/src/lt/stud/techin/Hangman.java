package lt.stud.techin;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    private String[] words = {"polymorphism","interface","implement","class","object"};
    private boolean wordGuessStatus;
    private String[] hiddenWordToGuess;
    private String wordToGuess;
    private int miss;
    private int hit;


    public void play(){
        Scanner scan = new Scanner(System.in);
        wordToGuess = randomWord();
        hiddenWordToGuess = new String[wordToGuess.length()];
        Arrays.fill(hiddenWordToGuess, "*");
        wordGuessStatus = false;
        miss = 0;
        hit = 0;

        while(!wordGuessStatus){
            System.out.println(wordToGuess);
            System.out.println("Guess a letter in word " + String.join("", hiddenWordToGuess) + " > ");
            String guessedLetter = scan.nextLine();

            if(checkIfAlreadyGuessed(guessedLetter)){
                System.out.println(guessedLetter + " letter already guessed.");
            } else if (checkForLetterInWord(guessedLetter)){
                hit++;
                System.out.println("Found");
            } else {
                miss++;
                System.out.println("Not found");
            }

            wordGuessStatus = Arrays.equals(hiddenWordToGuess, wordToGuess.split(""));

        }

        System.out.println("The word is " + wordToGuess + ". You missed " + miss + " times");
        System.out.println("Play another game? y/n");

        String answerForAnotherGame = scan.nextLine();

        if(answerForAnotherGame.equals("y")){
            play();
        } else {
            System.out.println("Goodbye!");
        }

    }

    private boolean checkForLetterInWord(String letter){
        boolean wordChanged = false;

        for (int i = 0; i < wordToGuess.length(); i++) {

            if(wordToGuess.charAt(i) == letter.charAt(0)){
                hiddenWordToGuess[i] = letter;
                wordChanged = true;
            }
        }
        return wordChanged;
    }

    private boolean checkIfAlreadyGuessed(String letter){
        for(String c : hiddenWordToGuess){
            if(c.equals(letter)){
                return true;
            };
        }
        return false;
    }

    private String randomWord(){

        return words[(int)(Math.random() * words.length)];

    }

}
