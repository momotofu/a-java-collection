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
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries = 7;
    int currentTry = 0;

    ArrayList<String> wordList = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    public HangmanGame() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    // Getters
    public String getFormalCurrentGuess() {
        return "Current Guess: " + currentGuess.toString();
    }

    // Methods
    public String drawCurrentGuesses() {
        int paddingAmount = (19 - (mysteryWord.length() * 2)) / 2;
        String curGuess = currentGuess.toString();

        for (int i = 0; i < paddingAmount; i++) {
            curGuess = " " + curGuess + " ";
        }

        return curGuess + " ";
    }

    public StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if (i % 2 == 0) {
                current.append("_");
            } else {
                current.append(" ");
            }
        }

        return current;
    }

    public void initializeStreams() throws IOException {
        try {
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedReader = new BufferedReader(fileReader);

            // populate dictionary with words
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                wordList.add(currentLine);
                currentLine = bufferedReader.readLine();
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
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < current.length() * 2; i++) {
            if (i % 2 == 0) { current.append("_"); }
            else { current.append(" "); }
        }

        return current;
    }

    public boolean alreadyGuessed(char guess) {
        return previousGuesses.contains(guess);
    }

    public boolean submitGuess(char guess) {
        boolean isGoodGuess = false;

        for (int i = 0; i < mysteryWord.length(); i++) {
            if (guess == mysteryWord.charAt(i)) {
                currentGuess.setCharAt(i * 2, guess);
                isGoodGuess = true;
                previousGuesses.add(guess);
            }
        }

        if (!isGoodGuess) {
            currentTry++;
        }

        return isGoodGuess;
    }

    public boolean gameOver() {
        if (gameWon()) {
            puts();
            puts("Aww yeah. You guessed it. The word is "
            + mysteryWord + "!");
            return true;
        } else if (gameLost()) {
            puts();
            puts("Oh bummer. You lost. The word was "
            + mysteryWord + "...");
            return true;
        } else {
            return false;
        }
    }

    public boolean gameWon() {
       return currentGuess.toString().replaceAll(" ", "").equals(mysteryWord);
    }

    public boolean gameLost() {
        return currentTry >= maxTries;
    }

    public String drawPicture() {
            switch(currentTry) {
                case 0:
                    return initalDraw();
                case 1:
                    return addHeadDraw();
                case 2:
                    return addBodyDraw();
                case 3:
                    return addOneLegDraw();
                case 4:
                    return addLegsDraw();
                case 5:
                    return addOneArmDraw();
                case 6:
                    return addArmsDraw();
                default:
                    return fullPersonDraw();
            }
    }

    private String initalDraw() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||\n" +
                "| |/         ||  \n" +
                "| |          ||_\n" +
                "| |          (  `.\n" +
                "| |           `--'\n" +
                "| |          \n" +
                "| |           \n" +
                "| |           \n" +
                "| |           \n" +
                "| |          \n" +
                "| |        \n" +
                "| |        \n" +
                "| |        \n" +
                "| |        \n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";

    }

    private String addHeadDraw() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |           `--'\n" +
                "| |          \n" +
                "| |           \n" +
                "| |           \n" +
                "| |           \n" +
                "| |          \n" +
                "| |        \n" +
                "| |        \n" +
                "| |        \n" +
                "| |        \n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";
    }

    private String addBodyDraw() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |          .`--'\n" +
                "| |          |. .|\n" +
                "| |          |   | \n" +
                "| |          | . | \n" +
                "| |          |   | \n" +
                "| |          '\"'\"'\n" +
                "| |        \n" +
                "| |        \n" +
                "| |        \n" +
                "| |        \n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";
    }

    private String addOneLegDraw() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |          .`--'\n" +
                "| |          |. .|\n" +
                "| |          |   | \n" +
                "| |          | . | \n" +
                "| |          |   | \n" +
                "| |          ||'\"'\n" +
                "| |          ||\n" +
                "| |          ||\n" +
                "| |        ..||\n" +
                "| |       (___|\n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";
    }

    private String addLegsDraw() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |          .`--'\n" +
                "| |          |. .|\n" +
                "| |          |   | \n" +
                "| |          | . | \n" +
                "| |          |   | \n" +
                "| |          ||'||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |        ..|| ||..\n" +
                "| |       (___| |___)\n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";
    }

    private String addOneArmDraw() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'\n" +
                "| |        /Y . .|\n" +
                "| |       // |   | \n" +
                "| |      //  | . | \n" +
                "| |     ')   |   | \n" +
                "| |          ||'||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |        ..|| ||..\n" +
                "| |       (___| |___)\n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";
    }

    private String addArmsDraw() {
        return "___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'.\n" +
                "| |        /Y . . Y\\\n" +
                "| |       // |   | \\\\\n" +
                "| |      //  | . |  \\\\\n" +
                "| |     ')   |   |   (`\n" +
                "| |          ||'||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |        ..|| ||..\n" +
                "| |       (___| |___)\n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";
    }

    private String lastChance() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'.\n" +
                "| |        /Y . . Y\\\n" +
                "| |       // |   | \\\\\n" +
                "| |      //  | . |  \\\\\n" +
                "| |     ')   |   |   (`\n" +
                "| |          ||'||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |        ..|| ||..\n" +
                "| |       (___| |___)\n" +
                "|\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"||\"|\n" +
                "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\"|\"|\n" +
                "| |                   | |\n" +
                "| |                   | |\n" +
                "| |"+drawCurrentGuesses()+"| |\n" +
                "| |                   | |";
    }

    private String fullPersonDraw() {
        return " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||\n" +
                "| |/         ||.-''.\n" +
                "| |          |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'.\n" +
                "| |        /Y . . Y\\\n" +
                "| |       // | . | \\\\\n" +
                "| |      //  | . |  \\\\\n" +
                "| |     ')   |   |   (`\n" +
                "| |          ||'||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "|\"|\"\"\"\"\"|_  / | | \\  _|\"|\n" +
                "|\"|\"\"\"\"\"\\ \\ `-' `-'   |\"|\n" +
                "| |      \\ \\          | |\n" +
                "| |       \\ \\         | |  \n" +
                "| |        \\ \\        | |\n" +
                "| |         `'";
    }
}
