package com.glc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Booktest 
{
    @Test 
    public void emptybooktest(){
        ReadingList rd= new ReadingList();
        int finalvalue= rd.Readbook();
        assertEquals(0, finalvalue);
    }
   @Test
    public void testAddingBook(){
        Book book1 = new Book("Abc", "Xyz", 6000, 2020);
        ReadingList rd = new ReadingList();
        rd.addBook(book1, "24-jan-22", 4);
        int finalvalue = rd.Readbook();
        assertEquals(1, finalvalue);
    }

    @Test
    public void numberOfBook(){
        Book book1 = new Book("Abc", "Xyz", 6000, 2020);
        Book book2 = new Book("def", "lmn", 5000, 2021);
        Book book3 = new Book("ghi", "pqr", 4000, 2022);
        ReadingList rd = new ReadingList();
        rd.addBook(book1, "24-jan-22", 4);
        rd.addBook(book2, "25-jan-22", 5);
        rd.addBook(book3, "26-jan-22", 3);
        int finalvalue = rd.Readbook();
        assertEquals(3, finalvalue);
    }
    // 
    // public void testDeleteBook(){

    //     ReadingList rd =new ReadingList();
    //     rd.deleteBook("Abc");
    //     int finalvalue = rd.getbook();
    //     assertEquals(2, finalvalue);   
    // }

    @Test
    public void ReturnBooks(){
        //setup
        //Execute
        Book book4 =new Book("SUV", "rumi", 150, 1999);
        ReadingList rd=new ReadingList();
        rd.addBook(book4,"27-jan-23", 2);
        int finalvalue = rd.Readbook();
        //Assert
        assertEquals(1, finalvalue);
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
