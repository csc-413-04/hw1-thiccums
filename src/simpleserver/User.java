package simpleserver;

public class User<T>{
    private T username;
    private int userid;


    public void setUserid(int userid){
        this.userid = userid;
    }

    public void set(T username) {
        this.username = username;
    }

    public T get(){
        return username;
    }

    public int getUserid(){
        return userid;

    }

    public String toString(){
        return username.toString();
    }
}
