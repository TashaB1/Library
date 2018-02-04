package ru.tasha2k7.mail.library.datamodel;

/**
 * Created by Ната on 02.02.2018.
 */
public class Genre extends AbstractModel {
    private String name;

    public Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                '}';
    }
}
