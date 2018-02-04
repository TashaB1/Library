package ru.tasha2k7.mail.library.jsonserializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ru.tasha2k7.mail.library.datamodel.Genre;

import java.lang.reflect.Type;

/**
 * Created by Ната on 02.02.2018.
 */
public class GenreSerializer implements JsonSerializer<Genre> {
    @Override
    public JsonElement serialize(Genre genre, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject result = new JsonObject();
        result.addProperty("name", genre.getName());
        return result;
    }
}
