package IteratorsComparators.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setAuthors(String... authors){
        if (authors.length == 0) {
            this.authors = new ArrayList<String>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }


//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(getTitle() + ", ").append(getYear());
//        sb.append(System.lineSeparator());
//        sb.append(String.format(String.join(", ", authors)));
//        sb.append(System.lineSeparator());
//
//        return sb.toString();
//    }
}
