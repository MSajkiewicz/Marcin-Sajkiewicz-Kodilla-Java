package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2012, 01, 01));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(2013, 01, 01));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(2014, 01, 01));

        Library library = new Library("Library of books");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of object board
        Library clonedLibrary = null;
            try {
                clonedLibrary=library.shallowCopy();
                clonedLibrary.setName("Cloned library of books");
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
            try {
                deepClonedLibrary = library.deepCopy();
                deepClonedLibrary.setName("Deep cloned library of books");
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());






    }
}
