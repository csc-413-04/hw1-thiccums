package simpleserver;

import com.google.gson.Gson;

public class PostProcessor implements Processor {

    @Override
    public String process(String query) {
        // All logic goes in here
        Response response = new Response();
        Database db = Database.getDatabase();
        int postid = Integer.parseInt(query);
        response.setData(db.getPost(postid)); // response's data gets post data from db
        response.setStatus("OK");  // No error checking :(
        Gson gson = new Gson();
        return gson.toJson(response);
    }

}


