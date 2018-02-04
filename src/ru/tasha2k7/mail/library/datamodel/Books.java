package ru.tasha2k7.mail.library.datamodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ната on 01.02.2018.
 */
public class Books extends AbstractModel {

    public enum Accessibility {
        reading_room, // читальный зал
        storage, // хранилище
        open_access // открытый доступ (срок)
    }

    public enum Branch {  //???
        Brest,
        Vitebsk,
        Gomel,
        Grodno,
        Minsk,
        Mogilev
    }

    private String title;
    private List<Author> author;
    @SerializedName("publishing_house")
    private String publishingHouse;
    private int year;
    @SerializedName("number_pages")
    private int numberPages;
    private List<Genre> genre;
    private Branch location;
    private Accessibility accessibility;
    private boolean available;
    private List<Journal> journal;

    public Books() {
    }

    public Books(String title, List<Author> author, String publishingHouse, int year, int numberPages, List<Genre> genre, Branch location, Accessibility accessibility, boolean available, List<Journal> journal) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberPages = numberPages;
        this.genre = genre;
        this.location = location;
        this.accessibility = accessibility;
        this.available = available;
        this.journal = journal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
    }

    public Branch getLocation() {
        return location;
    }

    public void setLocation(Branch location) {
        this.location = location;
    }

    public Accessibility getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<Journal> getJournal() {
        return journal;
    }

    public void setJournal(List<Journal> journal) {
        this.journal = journal;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", numberPages=" + numberPages +
                ", genre=" + genre +
                ", location=" + location +
                ", accessibility=" + accessibility +
                ", available=" + available +
                ", journal=" + journal +
                '}';
    }
}
