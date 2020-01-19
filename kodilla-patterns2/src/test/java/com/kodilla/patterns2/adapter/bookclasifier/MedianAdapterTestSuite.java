package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookLibraryA = new HashSet<>();
        bookLibraryA.add(new Book("Author1",
                "Title1",
                1991,
                "11111111"));
        bookLibraryA.add(new Book("Author2",
                "Title2",
                1982,
                "2222222"));
        bookLibraryA.add(new Book("Author3",
                "Title3",
                2010,
                "3333333"));
        bookLibraryA.add(new Book("Author4",
                "Title4",
                1927,
                "444444"));
        bookLibraryA.add(new Book("Author5",
                "Title5",
                1953,
                "55555"));

        //When
        int median = medianAdapter.publicationYearMedian(bookLibraryA);

        //Then
        Assert.assertEquals(1982, median);
    }
}
