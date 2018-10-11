package simpleserver;

public class User<T>{
    private T userid;
    private String username;


    public void set(T userid){
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public T get(){
        return userid;
    }

    public String getUsername(){
        return username;

    }

    public String toString(){
        return userid.toString();
    }
}
