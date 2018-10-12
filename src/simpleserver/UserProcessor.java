package simpleserver;

import com.google.gson.Gson;

public class UserProcessor implements Processor {

    @Override
    public String process(String query){
        Response response = new Response();
        Database db = Database.getDatabase();
        if (query.length() > 5) {
            String[] userid = query.split("=");
            response.setData(db.getUser(Integer.parseInt(userid[1])));
            response.setStatus("OK");
            Gson gson = new Gson();
            return gson.toJson(response);
        }
        else{
        response.setData(db.getAllUsers());
        response.setStatus("OK");
        Gson gson = new Gson();
        return gson.toJson(response);
        }

}
