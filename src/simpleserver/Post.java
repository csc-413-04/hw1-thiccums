package simpleserver;

public class Post<T> {
    private T postid;

    public void set(T postid) {
        this.postid = postid;
    }

    public T get(){
        return postid;
    }
}
