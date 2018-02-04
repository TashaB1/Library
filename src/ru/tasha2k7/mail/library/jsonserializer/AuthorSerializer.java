package ru.tasha2k7.mail.library.jsonserializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ru.tasha2k7.mail.library.datamodel.Author;

import java.lang.reflect.Type;

/**
 * Created by Ната on 02.02.2018.
 */
public class AuthorSerializer implements JsonSerializer<Author> {
    @Override
    public JsonElement serialize(Author author, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject result = new JsonObject();
        result.addProperty("full_name", author.getFullName());
        return result;
    }
}
