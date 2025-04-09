package com.xworkz.libraryapp;

import com.xworkz.libraryapp.constants.BookGenre;
import com.xworkz.libraryapp.librarydto.LibraryDto;
import com.xworkz.libraryapp.generatelibrary.Library;

public class LibraryRunner {

    public static void main(String[] args) {


        LibraryDto dto = new LibraryDto();
        dto.setBookTitle("The Great Gatsby");
        dto.setAuthorName("F. Scott Fitzgerald");
        dto.setPublisher("Scribner");
        dto.setIsbn("9780743273565");
        dto.setPublishDate("10/04/1925");
        dto.setGenre(BookGenre.FICTION);
        dto.setNumberOfPages(180);


        Library library = new Library();
        library.addBook(dto);
        library.getLibraryDetails();
    }
}
