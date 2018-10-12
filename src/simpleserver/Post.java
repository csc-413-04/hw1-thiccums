package simpleserver;

public class Post<T> extends iData{
    private T postid;
    private String data;
    private int maxLength;

    public void set(T postid) {
        this.postid = postid;
    }

    public T get(){
        return postid;
    }

    public void setData(String data){
        this.data = data;
        maxLength = data.length();
    }

    public String getData(){
        return data;
    }

    public int getMaxLength(){
        return maxLength;
    }


}
