package ru.tasha2k7.mail.library.datamodel;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by Ната on 01.02.2018.
 */
public class Author extends AbstractModel {
    @SerializedName("full_name")
    private String fullName;

    public Author() {
    }

    public Author(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
