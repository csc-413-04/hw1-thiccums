package simpleserver;

public class ProcessFactory {

    static Processor getProcessor(String request) {
      Processor processor = null;

      UserProcessor up = new UserProcessor();
      PostProcessor pp = new PostProcessor();
      switch (request) {  //    <======  what is "rq" ?
        case "user":
            return up.process(request).convertToJson(); // <===== where are the arguments coming from?
            break;
        case "post":
            return pp.process(request).convertToJson();
            break;
}
      processor = new UserProcessor();

      return processor;
    }
}
