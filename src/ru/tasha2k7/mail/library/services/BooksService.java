package ru.tasha2k7.mail.library.services;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ru.tasha2k7.mail.library.datamodel.Author;
import ru.tasha2k7.mail.library.datamodel.Books;
import ru.tasha2k7.mail.library.datamodel.Genre;
import ru.tasha2k7.mail.library.datamodel.Journal;

import java.util.List;

/**
 * Created by Ната on 02.02.2018.
 */
public interface BooksService {
    void read();

    void write(String strJson, String path);

    void write(String title, List<Author> author, String publishingHouse, int year, int numberPages, List<Genre> genre, Books.Branch location, Books.Accessibility accessibility, boolean available, List<Journal> journal);

    void sort();

    void searchTitle(Gson gson, JsonObject json, String path, String title);

    void searchAuthor(Gson gson, JsonObject json, String path, String author);

    void searchGenre(Gson gson, JsonObject json, String path, String genre);

    void searchYear(Gson gson, JsonObject json, String path, String year);

    void searchPublishing(Gson gson, JsonObject json, String path, String publishing);

    void searchClient(Gson gson, JsonObject json, String path, String client);

    void searchExpired(Gson gson, JsonObject json, String path, String expired);

    void parseToTitle(Gson gson, JsonObject json, String path);

    void parseToAuthor(Gson gson, JsonObject json, String path);

    void parseToGenre(Gson gson, JsonObject json, String path);

    void parseToYear(Gson gson, JsonObject json, String path);

    void parseToPublishing(Gson gson, JsonObject json, String path);

    void parseToClient(Gson gson, JsonObject json, String path);

    void parseToExpired(Gson gson, JsonObject json, String path);
}
