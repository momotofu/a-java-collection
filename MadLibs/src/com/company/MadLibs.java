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
        return this.noun2;
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

    public void setRandomNums() {

    }

    public void printInstructions() {
        System.out.println("Welcome to the Madlibs game. If you type in words, we'll give you a story.");
    }
}
