package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> mapOfBooks = new HashMap<>();
        for(Book bookLibraryA : bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookLibraryB =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bookLibraryA.getAuthor(), bookLibraryA.getTitle(), bookLibraryA.getPublicationYear());
            mapOfBooks.put(new BookSignature(bookLibraryA.getSignature()), bookLibraryB);
        }

        return medianPublicationYear(mapOfBooks);
    }
}
