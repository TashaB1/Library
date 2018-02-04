package ru.tasha2k7.mail.library.jsonserializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import ru.tasha2k7.mail.library.datamodel.Client;

import java.lang.reflect.Type;

/**
 * Created by Ната on 02.02.2018.
 */
public class ClientSerializer implements JsonSerializer<Client> {
    @Override
    public JsonElement serialize(Client client, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject result = new JsonObject();
        result.addProperty("full_name", client.getFullName());
        result.addProperty("address", client.getAddress());
        result.addProperty("phone_number", client.getPhoneNumber());
        result.addProperty("document", client.getDocument());
        return result;
    }
}
