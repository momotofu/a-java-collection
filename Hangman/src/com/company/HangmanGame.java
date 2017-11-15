package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import static com.company.Main.puts;

public class HangmanGame {

    // Properties
    String mysteryWord;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuess = new ArrayList<>();

    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> wordList = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    public HangmanGame() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    // Methods
    public void initializeStreams() throws IOException {
        try {
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedReader = new BufferedReader(fileReader);

            // populate dictionary with words
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                wordList.add(currentLine);
            }

            // close file readers
            fileReader.close();
            bufferedReader.close();
        } catch (IOException error) {
            puts("Could not init streams with error: " + error.toString());
        }
    }

    public String pickWord() {
        Random rand = new Random();
        return wordList.get(Math.abs(rand.nextInt()) % (wordList.size() - 1));
    }

    public StringBuilder getCurrentGuess() {
        return currentGuess;
    }
}
