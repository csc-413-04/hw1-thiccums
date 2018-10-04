package simpleserver;

public class PostProcessor extends Processor {

    String process (int postId){

        // I know this is not right, but this is the idea
        // Have to use database findValue maybe...
        return Post.get();
    }

}
