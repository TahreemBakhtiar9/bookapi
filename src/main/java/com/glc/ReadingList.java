package com.glc;

import java.util.ArrayList;

public class ReadingList {
    private Book book;
    private String dateread;
    private int rating;
    public ReadingList(Book book, String dateread, int rating){
        this.book = book;
        this.dateread = dateread;
        this.rating = rating;
    }

    public int numbersread(){
        return books.size();
    }

    public ArrayList<ReadingList> books  = new ArrayList<>();
    public void addBook(Book book, String dateRead, int rating) {
        String bookdet = book.toString() + ", read on " + dateread + "," + "*".repeat(rating);
    }

}

