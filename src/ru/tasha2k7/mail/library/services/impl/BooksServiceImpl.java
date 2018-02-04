package ru.tasha2k7.mail.library.services.impl;

import com.google.gson.*;
import ru.tasha2k7.mail.library.datamodel.*;
import ru.tasha2k7.mail.library.services.BooksService;
import ru.tasha2k7.mail.library.util.FileUtil;

import java.io.*;
import java.util.List;
/**
 * Created by Ната on 02.02.2018.
 */
public class BooksServiceImpl implements BooksService {
    @Override
    public void read() {

    }

    @Override
    public void write(String strJson, String path) {
        FileUtil fileUtil = new FileUtil();
        if ((new File(path)).exists()) {
            fileUtil.writeFile(strJson, path);
        } else {
            File file = new File(path);
            fileUtil.writeFile(strJson, path);
        }
    }

    @Override
    public void write(String title, List<Author> author, String publishingHouse, int year, int numberPages, List<Genre> genre, Books.Branch location, Books.Accessibility accessibility, boolean available, List<Journal> journal) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void searchTitle(Gson gson, JsonObject json, String path, String title1) {
        FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.clearFile(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {
            String title = book.getAsJsonObject().get("title").getAsString().toLowerCase();
            if (title.contains(title1)) {
                String string = gson.toJson(book);
                booksService.write(string, path);
            }
        }
    }

    @Override
    public void searchAuthor(Gson gson, JsonObject json, String path, String author1) {
        FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.clearFile(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {

            JsonArray authors = book.getAsJsonObject().get("author").getAsJsonArray();

            for (JsonElement author : authors) {

                String author_name = author.getAsJsonObject().get("full_name").getAsString();
                if (author_name.contains(author1)) {

                    String string = gson.toJson(book);
                    booksService.write(string, path);
                }
            }
        }
    }

    @Override
    public void searchGenre(Gson gson, JsonObject json, String path, String genre) {

    }

    @Override
    public void searchYear(Gson gson, JsonObject json, String path, String year) {

    }

    @Override
    public void searchPublishing(Gson gson, JsonObject json, String path, String publishing) {

    }

    @Override
    public void searchClient(Gson gson, JsonObject json, String path, String client) {

    }

    @Override
    public void searchExpired(Gson gson, JsonObject json, String path, String expired) {

    }

    @Override
    public void parseToTitle(Gson gson, JsonObject json, String path) {
        FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.deleteAllFilesFolder(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {
            String title = book.getAsJsonObject().get("title").getAsString();
            String pathTitle = path + title + ".json";
            String string = gson.toJson(book);
            booksService.write(string, pathTitle);
        }
        System.out.println("Готово. Расположение файла: " + path + "*");
    }

    @Override
    public void parseToAuthor(Gson gson, JsonObject json, String path) {
        FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.deleteAllFilesFolder(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {

            JsonArray authors = book.getAsJsonObject().get("author").getAsJsonArray();

            for (JsonElement author : authors) {
                String author_name = author.getAsJsonObject().get("full_name").getAsString();
                String pathAuthor = path + author_name + ".json";
                String string = gson.toJson(book);
                booksService.write(string, pathAuthor);
            }
        }
        System.out.println("Готово. Расположение файла: " + path + "*");
    }

    @Override
    public void parseToGenre(Gson gson, JsonObject json, String path) {
        FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.deleteAllFilesFolder(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {

            JsonArray genres = book.getAsJsonObject().get("genre").getAsJsonArray();

            for (JsonElement genre : genres) {
                String genre_name = genre.getAsJsonObject().get("name").getAsString();
                String pathGenre = path + genre_name + ".json";
                String string = gson.toJson(book);
                booksService.write(string, pathGenre);
            }
        }
        System.out.println("Готово. Расположение файла: " + path + "*");
    }

    @Override
    public void parseToYear(Gson gson, JsonObject json, String path) {
        FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.deleteAllFilesFolder(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {
            String year = book.getAsJsonObject().get("year").getAsString();
            String pathYear = path + year + ".json";
            String string = gson.toJson(book);
            booksService.write(string, pathYear);
        }
        System.out.println("Готово. Расположение файла: " + path + "*");
    }

    @Override
    public void parseToPublishing(Gson gson, JsonObject json, String path) {
        FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.deleteAllFilesFolder(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {
            String publishing = book.getAsJsonObject().get("publishing_house").getAsString();
            String pathPublishing = path + publishing + ".json";
            String string = gson.toJson(book);
            booksService.write(string, pathPublishing);
        }
        System.out.println("Готово. Расположение файла: " + path + "*");
    }

    @Override
    public void parseToClient(Gson gson, JsonObject json, String path) {
      /*  FileUtil fileUtil = new FileUtil();
        BooksServiceImpl booksService = new BooksServiceImpl();
        fileUtil.deleteAllFilesFolder(path);

        JsonArray books = json.getAsJsonArray("books");

        for (JsonElement book : books) {

            JsonArray journals = book.getAsJsonObject().get("journal").getAsJsonArray();

            for (JsonElement journal : journals) {

                JsonArray clients = book.getAsJsonObject().get("client").getAsJsonArray();

                for (JsonElement client : clients) {
                String client_name = client.getAsJsonObject().get("full_name").getAsString();
                if (!client_name.equals("")){
                String pathClient = path + client_name + ".json";
                String string = gson.toJson(book);
                booksService.write(string, pathClient);
            }}}
        }*/
    }

    @Override
    public void parseToExpired(Gson gson, JsonObject json, String path) {

    }


}
