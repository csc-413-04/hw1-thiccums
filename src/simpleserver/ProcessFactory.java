package simpleserver;
import com.google.gson.*;


public class ProcessFactory {

    static Processor getProcessor(String request) {
      Processor processor = null;

      //UserProcessor up = new UserProcessor();
      //PostProcessor pp = new PostProcessor();


        switch (request) {  //    <======  what is "rq" ?
        case "/user":
            return new UserProcessor(); // <===== where are the arguments coming from?

        case "/post":
            return new PostProcessor();

}
      processor = new UserProcessor();

      return null;
    }
}
