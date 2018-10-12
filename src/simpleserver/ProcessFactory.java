package simpleserver;

public class ProcessFactory {

    static Processor getProcessor(String request) {
      Processor processor = null;

      switch (request) {  //    <======  what is "rq" ?
        case "user":
            return UserProcessor.process(request).convertToJson(); // <===== where are the arguments coming from?
            break;
        case "post":
            return PostProcessor.process(request).convertToJson();
            break;
}
      processor = new UserProcessor();

      return processor;
    }
}
