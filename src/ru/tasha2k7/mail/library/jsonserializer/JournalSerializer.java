package ru.tasha2k7.mail.library.jsonserializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ru.tasha2k7.mail.library.datamodel.Journal;

import java.lang.reflect.Type;

/**
 * Created by Ната on 02.02.2018.
 */
public class JournalSerializer implements JsonSerializer<Journal> {
    @Override
    public JsonElement serialize(Journal journal, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject result = new JsonObject();
        result.add("client", jsonSerializationContext.serialize(journal.getClient()));
        result.addProperty("date_from", String.valueOf(journal.getDateFrom()));
        result.addProperty("date_by", String.valueOf(journal.getDateBy()));
        result.addProperty("date_return", String.valueOf(journal.getDateReturn()));
        return result;

    }
}
