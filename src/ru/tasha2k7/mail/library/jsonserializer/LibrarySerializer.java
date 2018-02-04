package ru.tasha2k7.mail.library.jsonserializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ru.tasha2k7.mail.library.datamodel.Books;
import ru.tasha2k7.mail.library.datamodel.Library;

import java.lang.reflect.Type;

/**
 * Created by Ната on 02.02.2018.
 */
public class LibrarySerializer implements JsonSerializer<Library> {
    @Override
    public JsonElement serialize(Library library, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject result = new JsonObject();
        for (Books books : library.getBooks()) {
            result.add(books.getTitle(), jsonSerializationContext.serialize(books));
        }
        return result;
    }
}
