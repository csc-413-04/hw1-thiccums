package simpleserver;

public class Posts<T> {
    private T postid;
    
    public void set(T postid) {
        this.postid = postid;
    }

    public T get(){
        return postid;
    }
}
