package com.glc;
import java.util.ArrayList;
import java.util.List;

public class ReadingList {
        private int rating;
        private String dateread;
        private Book book;

        public ReadingList(Book book, String dateread, int rating){
            this.rating = rating;
            this.dateread = dateread;
            this.book = book;
        }

        public ReadingList(){

        }

        List <ReadingList> buks = new ArrayList<>();

        public void addBook(Book book, String dateread, int rating){
            ReadingList r = new ReadingList(book, dateread, rating);
            buks.add(r);
        }
         public int Readbook(){
            return buks.size();
         }

         public List<ReadingList> getbook(){
            return buks;
         }
        public void deleteBook(String title){
            buks.remove(book);
     }


}

