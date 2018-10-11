package simpleserver;

public class ProcessFactory {

    static ServerProcessor getProcessor(String url) {
      String endpoint = "/test";
      String query = "?asd=hello";
      ServerProcessor processor = null;

      switch (rq.getEndpoint()) {  //    <======  what is "rq" ?
        case "user":
            return UserProcessor.response(rq, data).convertToJson(); // <===== where are the arguments coming from?
            break;
        case "post":
            return PostProcessor.response(rq, data).convertToJson();
            break;
}
      processor = new UserProcessor();

      return processor;
    }
}