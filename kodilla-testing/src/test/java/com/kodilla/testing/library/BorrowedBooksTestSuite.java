package com.kodilla.testing.library;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class BorrowedBooksTestSuite {

    @Test
    public void testListBooksInHandsOfWhenNoneBorrowed() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultBorrowed0Books = new ArrayList<>();
        LibraryUser libraryUser = new LibraryUser("Adam", "Nowak", "91010111111");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultBorrowed0Books);

        //When
        List<Book> theBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, theBooksList.size());
    }

    @Test
    public void testListBooksInHandsOfWhenOneBorrowed() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> ListOfBorrowedBooks = new ArrayList<>();
        ListOfBorrowedBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));

        LibraryUser libraryUser = new LibraryUser("Adam", "Nowak", "91010111111");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(ListOfBorrowedBooks);

        //When
        List<Book> theBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, theBooksList.size());
    }
    @Test
    public void testListBooksInHandsOfWhenFiveBorrowed() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> ListOfBorrowedBooks = new ArrayList<>();
        ListOfBorrowedBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        ListOfBorrowedBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        ListOfBorrowedBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        ListOfBorrowedBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        ListOfBorrowedBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));

        LibraryUser libraryUser = new LibraryUser("Adam", "Nowak", "91010111111");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(ListOfBorrowedBooks);

        //When
        List<Book> theBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, theBooksList.size());
    }

}
