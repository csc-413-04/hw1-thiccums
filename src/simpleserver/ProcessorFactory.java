package simpleserver;

public class ProcessFactory {

    static ServerProcessor getProcessor(String url) {
      String endpoint = "/test";
      String query = "?asd=hello";
      ServerProcessor processor = null;

      switch (rq.getEndpoint()) {
        case "user":
            return UserProcess.response(rq, data).convertToJson();
        case "post":
            return PostProcess.response(rq, data).convertToJson();
}
      processor = new UserProcessor();

      return processor;
    }
}