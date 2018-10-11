package simpleserver;

import com.google.gson.Gson;

public class PostProcessor implements Processor {

    @Override
    public String process(String query){
        Response response = new Response();
        Database db = Database.getDatabase();
        response.setData(db.getAllUsers());
        response.setStatus("Ok");
        Gson gson = new Gson();
        return gson.toJson(response);
    }

}
