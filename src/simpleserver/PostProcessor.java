package simpleserver;

import com.google.gson.Gson;
import com.google.gson.*;
public class PostProcessor implements Processor {

    @Override
    public String process(String query) {
        if (!query.contains("=")) {
            Response response = new Response();
            Database db = Database.getDatabase();
            response.setPostData(db.getAllPosts()); // response's data gets post data from db
            response.setStatus("OK");  // No error checking :(
            Gson gson = new Gson();
            return gson.toJson(response);
        }
        else {
            Response response = new Response();
            Database db = Database.getDatabase();
            String[] post = query.split("=");

            response.setPostData(db.getPost(post[1])); // response's data gets post data from db
            response.setStatus("OK");  // No error checking :(
            Gson gson = new Gson();
            return gson.toJson(response);
        }

    }

}


