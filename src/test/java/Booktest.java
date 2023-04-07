package com.glc;
import org.junit.Assert;
import org.junit.Test;

import com.glc.Book;

@Test
public class Booktest{
    public void testaddBook(){
    Book book1 = new Book("haha", "abe", 4322, 2000);
    String result = book1.addBook("The Killer", "25-2-2032", 4);
    }
}
