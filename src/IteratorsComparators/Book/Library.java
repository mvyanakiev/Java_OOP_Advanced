package IteratorsComparators.Book;

import java.util.Iterator;

public class Library<T> implements Iterable<T> {
    private T[] books;

    public Library(T ... books) {
        this.books = books;
    }

    @Override
    public Iterator<T> iterator() {
        return new LibraryIterator();
    }




    private final class LibraryIterator implements Iterator<T> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (this.counter < books.length) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            return books[counter++];
        }
    }
}
