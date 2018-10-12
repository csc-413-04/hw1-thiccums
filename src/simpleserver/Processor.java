package simpleserver;
import com.google.gson.Gson;



public interface Processor {
    String query = null;
    String process(String query);
}


