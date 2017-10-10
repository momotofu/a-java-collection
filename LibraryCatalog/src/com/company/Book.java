package com.company;

public class Book {

    // Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    // Constructor
    public Book(String title, int pageCount, int ISBN) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckdOut() {
        return this.dayCheckedOut;
    }


    // Setters
    public void setIsCheckedOut(boolean isCheckedOut, int dayCheckedOut) {
        this.isCheckedOut = isCheckedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    public void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
