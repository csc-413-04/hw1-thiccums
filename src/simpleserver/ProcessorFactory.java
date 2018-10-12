package simpleserver;

public class ProcessFactory {

    static Processor getProcessor(String request) {
      Processor processor = null;

      switch (request) {  //    <======  what is "rq" ?
        case "user":
            return UserProcessor.response(request).convertToJson(); // <===== where are the arguments coming from?
            break;
        case "post":
            return PostProcessor.response(request).convertToJson();
            break;
}
      processor = new UserProcessor();

      return processor;
    }
}
