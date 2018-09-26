package simpleserver;

public class User<T> {
    private T userid;

    public void set(T userid) {
        this.userid = userid;
    }

    public T get(){
        return userid;
    }

    public String toString(){
        return userid.toString();
    }
}
