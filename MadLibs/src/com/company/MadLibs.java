package com.company;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String adverb2;
    String randomNums;
    Random rand = new Random();

    // Getters

    public String getStory() {
        return this.story;
    }

    public String getName() {
        return this.name;
    }

    public String getAdjective1() {
        return this.adjective1;
    }

    public String getAdjective2() {
        return this.adjective2;
    }

    public String getNoun1() {
        return this.noun1;
    }

    public String getNoun2() {
        return this.noun2;
    }

    public String getNoun3() {
        return this.noun3;
    }

    public String getAdverb() {
        return this.adverb;
    }

    public String getAdverb2() {
        return this.adverb2;
    }

    public String getRandomNums() {
        return this.randomNums;
    }

    // Setters

    public void setStory(String story) {
        this.story = story;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setAdverb2(String adverb2) {
        this.adverb2 = adverb2;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 10;
        int index = 0;
        int[] numberHolder = new int[3];

        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }

        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    // print instructions to player
    public void printInstructions() {
        System.out.println("Welcome to the Madlibs game. If you type in words, we'll give you a story."
        + " Start by typing in a name.");
    }

    // get data from player
    public void enterName() {
        setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun.");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun.");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me the last noun.");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Give me an adjective.");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Give me the last adjective.");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Give me an adverb.");
        setAdverb(scanner.nextLine());
    }

    public void enterAdverb2() {
        System.out.println("Enter the last adverb.");
        setAdverb2(scanner.nextLine());
    }


    public void putTogetherStory() {
        String story;
        int num = Math.abs(rand.nextInt()) % 2;

        if (num == 0) {
            story = "Jesse and her best friend " + getName() + " went to Disney World today! "
                    + "They saw a " + getNoun1() + " in a show at the Magic Kingdom. "
                    + "And ate a " + getAdjective1() + " feast for dinner. "
                    + "The next day I ran " + getAdverb() + " to meet Micky Mouse in his "
                    + getNoun2() + ". And then at night I gazed at the " + getRandomNums()
                    + " " + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        } else {
            story = "There was once a kitty named " + getName() + "."
                    + " She was always so " + getAdjective2() +" curious."
                    + " And loved to play with " + getAdjective1() + " " + getNoun2() + "."
                    + " Whenever she saw her owner she would " + getAdverb() + " leap for joy."
                    + " One day she saw a scary " + getNoun1() + " and became frightened."
                    + " " + getAdverb2() + " she ran back to her master and ate " + getRandomNums()
                    + " peaces of " + getNoun3() + ".";
        }

        setStory(story);
    }

    public void play() {
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        enterAdverb2();
        setRandomNums();
        putTogetherStory();
        System.out.println(getStory());
    }
}
