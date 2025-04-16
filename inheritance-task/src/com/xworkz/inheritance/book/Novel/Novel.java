package com.xworkz.inheritance.book.Novel;

import com.xworkz.inheritance.book.bookproperties.Book;

public class Novel extends Book {

    public void writer(){
        System.out.println("The writer");
    }
    public void novelId(){
        System.out.println("The id");
    }
    public void novelName(){
        System.out.println("The novel name");
    }
    public void novelReleaseDate(){
        System.out.println("The Release date");
    }
    public void novelType(){
        System.out.println("The Type");
    }
}
