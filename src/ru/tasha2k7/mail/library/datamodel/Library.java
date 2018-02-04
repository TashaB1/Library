package ru.tasha2k7.mail.library.datamodel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ната on 02.02.2018.
 */
public class Library {
    private List<Books> library = new LinkedList<>();

    public List<Books> getBooks() {
        return new LinkedList<>(library);
    }

    public void addBooks(Books books) {
        this.library.add(books);
    }
}
