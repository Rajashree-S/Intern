package com.xworkz.inheritance.book;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xworkz.inheritance.book.Novel.Novel;
import com.xworkz.inheritance.book.bookproperties.Book;

public class BookRunner {
    public static void main(String[] args) {

        Book book = new Book();
        book.displayBook();
        book.bookId();
        book.bookname();
        book.bookAuthor();
        book.booktype();

        Book book1 = new Novel();
        book.displayBook();
        book.bookId();
        book.bookname();
        book.bookAuthor();
        book.booktype();

        //Novel novel = (Novel) book; //downcasting
        Novel novel = new Novel();
        novel.writer();
        novel.novelId();
        novel.novelType();
        novel.novelName();
        novel.novelReleaseDate();


    }
}
