package simpleserver;

import com.google.gson.Gson;
import com.google.gson.*;
public class UserProcessor implements Processor {

    @Override
    public String process(String query) {
        Response response = new Response();
        Database db = Database.getDatabase();
        if (!query.contains("=")) {
            response.setUserData(db.getAllUsers());
            response.setStatus("OK");
            Gson gson = new Gson();
            return gson.toJson(response);
        } else {
            String[] userid = query.split("=");
            response.setUserData(db.getUser(userid[1]));
            response.setStatus("OK");
            Gson gson = new Gson();
            return gson.toJson(response);
        }

    }
}