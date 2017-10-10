package com.company;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalog {

    // Properties
    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 0.24;

    // Constructor
    public LibraryCatalog(Map<String, Book> bookCollection, int lengthOfCheckOutPeriod, double initialLateFee
    , double feePerLateDay) {
         this.bookCollection = bookCollection;
         this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
         this.initialLateFee = initialLateFee;
         this.feePerLateDay = feePerLateDay;
    }

    public LibraryCatalog(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    // Getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckOutPeriod() {
        return this.getLengthOfCheckOutPeriod;
    }

    public Book getBook(String bookTitle) {
        return bookCollection.get(bookTitle);
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    // Setters
    public int nextDay() {
        return currentDay++;
    }

    public void setDay(int day) {
        this.currentDay = day;
    }

    // Instance methods
    public void checkOutBook (String title) {
        Book book = getBook(title);

        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, getCurrentDay());
            System.out.println("You just checked out " + title + ". " +
            "It is due on " + getCurrentDay() + getLengthOfCheckOutPeriod() + ".");
        }
    }

    public void sorryBookAlreadyCheckedOut(Book book) {

    }

    public void returnBook (String title) {

    }
}
