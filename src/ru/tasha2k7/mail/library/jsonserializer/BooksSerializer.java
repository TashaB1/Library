package ru.tasha2k7.mail.library.jsonserializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ru.tasha2k7.mail.library.datamodel.Books;

import java.lang.reflect.Type;

/**
 * Created by Ната on 02.02.2018.
 */
public class BooksSerializer implements JsonSerializer<Books> {
    @Override
    public JsonElement serialize(Books books, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject result = new JsonObject();
        result.addProperty("id", books.getId());
        result.addProperty("title", books.getTitle());
        result.add("author", jsonSerializationContext.serialize(books.getAuthor()));
        result.addProperty("publishing_house", books.getPublishingHouse());
        result.addProperty("year", books.getYear());
        result.addProperty("number_pages", books.getNumberPages());
        result.add("genre", jsonSerializationContext.serialize(books.getGenre()));
        result.addProperty("location", String.valueOf(books.getLocation())); //??????
        result.addProperty("accessibility", String.valueOf(books.getAccessibility())); //????
        result.addProperty("available", books.isAvailable());
        result.add("journal", jsonSerializationContext.serialize(books.getJournal()));
        return result;
    }
}
